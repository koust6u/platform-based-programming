package org.example.week2.Assignment;

import java.util.*;

public class MyJsonParser {

    private static String readJSONStringFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputJson = new StringBuilder();
        int open = 0, close = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.contains("{")) open++;
            if (input.contains("}")) close++;
            inputJson.append(input).append("\n");
            if (open == close) break;
        }
        scanner.close();
        String result = replaceSpace(inputJson.toString());
        return result.replaceAll("\n", "");
    }

    private static String replaceSpace(String json){
        String[] split = json.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String s : split) {
            if(s.equals("\"")) count++;
            if(count %2 ==1 && s.equals(" ")) s = "?";
            sb.append(s);
        }
        return sb.toString().replaceAll(" ", "").replaceAll("\\?", " ");
    }

    /**
     * @param origin: 가장자리 괄호 제거 된 Json 워시 문자열
     * @return 루트 노트의 자손 노드 제외 모든 콤마 , -> ! 변환
     */
    private static String replaceCommas(String origin){
        int squareBrackets = 0;
        int brace = 0;
        String[] split = origin.split("");
        StringBuilder result = new StringBuilder();
        for (String s: split){
            switch (s){
                case "[" -> squareBrackets++;
                case "{" -> brace++;
                case "]" -> squareBrackets--;
                case "}" -> brace--;
            }

            if((squareBrackets != 0 || brace!= 0) && s.equals(",")) s= "!";
            result.append(s);
        }
        return result.toString();
    }

    /**
     * @return Nested struct json 문자열 판별
     */
    private static boolean checkSingle(String postfix){
        String substring = postfix.substring(1);
        return !substring.contains("{") && !substring.contains("[");
    }

    /**
     * description: 문자열 가장 자리 제거 후 root 노드의 자식 파싱
     *  condition: [] ,{} 같이 중첩된 경우 단일 자손인 경우 그냥 String 형태로 value 값 저장
     * @param json 키보드로 입력 받는 문자열 -> 공백 및 \n 등 제거 된 상태의 원시 문자열
     * @return depth by depth HashMap<String, String>: 더 이상 자식 없을 경우 or HashMap<String, Object> Nested 구조
     */

    private static HashMap<String,Object> parseJSONString(String json){
        HashMap<String, Object> map = new LinkedHashMap<>();
        String parseExternal = json.substring(1);
        parseExternal = parseExternal.substring(0, parseExternal.length()-1);

        String replaced = replaceCommas(parseExternal);
        String[] split = replaced.split(",");
        for (String s : split) {
            int index = s.indexOf(":");
            String prefix = s.substring(0, index);
            String postfix = s.substring(index+1);
            if(postfix.charAt(0) == '"' || checkSingle(postfix))
                map.put(prefix, postfix.replaceAll("!", ","));
            else map.put(prefix, parseJSONString(postfix.replaceAll("!", ",")));
        }
        return map;
    }

    /**
     * description: DFS를 통한 HashMap 구조의 트리를 사전 정렬을 한 문자열을 반환한다.
     * conditions: 1. Non-Nested brace or square-bracket 처리
     *             2. Dictionary order 정렬
     *             3. Depth-first-searching
     * @param map: tree 구조의 HashMap<String, Object> type의 변수
     * @return dictionary order sorting 된 json 문자열
     */
    private static String convertHashMapToJsonString(HashMap<String,Object> map){
        StringBuilder result = new StringBuilder();
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for (String key : keyList) {
            result.append(key).append(":");
            if(map.get(key)instanceof HashMap<?,?>){
                result.append(convertHashMapToJsonString((HashMap<String, Object>) map.get(key)));
            }
            else{
                result.append(map.get(key));
            }
        }

        return result.toString();
    }

    private static String convertStringToPrettyJson(String jsonString){
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String convertedJson = sb.append(jsonString).toString();

        convertedJson = convertedJson.replaceAll("]\"", "],\"");
        convertedJson = convertedJson.replaceAll("\"\"", "\",\"");
        convertedJson = convertedJson.replaceAll("}\"", "},\"");

        StringBuilder indent = new StringBuilder();
        convertedJson = replaceCommas(convertedJson);
        convertedJson = "{" + convertedJson + "}";
        String[] split = convertedJson.split("");
        for (String s : split) {
            if(s.equals("{")) {
                indent.append("    ");
                s = "{\n" + indent;
            }
            else if(s.equals("}")) {
                indent = new StringBuilder(indent.substring(4));
                s=   "\n"+indent+"}";
            }
            else if(s.equals(",")) s= ",\n" + indent;
            result.append(s);
        }
        return result.toString().replaceAll("!", ",");
    }

    public static void main(String[] args) {
        String json = readJSONStringFromKeyboard();
        System.out.println(json);
        var map = parseJSONString(json);
        var jsonString = convertHashMapToJsonString(map);
        System.out.println(convertStringToPrettyJson(jsonString));

    }

}




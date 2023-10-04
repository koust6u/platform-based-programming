package org.example.week4.JsonEscapeCharacter;

public class JsonEscapeCharacterHandler {

    public String handleEscapedCharacters(String str){
        StringBuilder result = new StringBuilder();
        boolean isEscaping = false;
        for (int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            try{
                if (c == '\\' && str.charAt(i+1) == '"'){
                    result.append('"');
                    i++;
                }
                else if(c == '\\' && str.charAt(i+1) == 'n'){
                    result.append("\n");
                    i++;
                }
                else if (c == '\\' && str.charAt(i+1) == 'u'){
                    String uni = str.substring(i+2,i+6);
                    int codePoint = Integer.parseInt(uni, 16);
                    String unicode = new String(Character.toChars(codePoint));
                    result.append(unicode);
                    i+=5;
                }
                else{
                    result.append(c);
                }
            }catch (Exception ignored){}
        }

        return result.toString();
    }
}

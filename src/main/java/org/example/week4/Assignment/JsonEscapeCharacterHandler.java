package org.example.week4.Assignment;

import java.util.List;

public class JsonEscapeCharacterHandler {

    //private final List<String> definedEscapeChars = List.of("\\u");

    public String handleEscapedCharacters(String str) {
        return transferUnicode(str);
    }
    


    private static String transferUnicode(String origin){
        StringBuilder result = new StringBuilder(origin);
        
        while (result.toString().contains("\\u")) {
            StringBuilder Constructor = new StringBuilder();
            int index = result.indexOf("\\u");
            String unicode = result.substring(index + 2, index + 6);
            int hex = Integer.parseInt(unicode, 16);
            String changed = new String(Character.toChars(hex));
            result = Constructor.append(result, 0, index).append(changed)
                    .append(result.substring(index + 6));
        }
        return result.toString();
    }

}


package org.example.week4.Assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MyJsonParser {

    private JsonEscapeCharacterHandler escapeHandler;

    public MyJsonParser() {

        this.escapeHandler = new JsonEscapeCharacterHandler();

    }

    public HashMap<String, Object> parse(String jsonString) {
        return parseJSONString(jsonString);
    }


    private HashMap<String, Object> parseJSONString(String jsonString){
        String json = escapeHandler.handleEscapedCharacters(jsonString);
        json = json.replaceAll("\\{", "").replace("}", "").replaceAll("\"", "");
        return new HashMap<>(Arrays.stream(json.split(","))
                .collect(Collectors.toMap(e -> e.split(":")[0].trim(), e ->  e.split(":")[1].trim())));
    }


}


package org.example.week4.JsonEscapeCharacter;

public class JsonEscapeCharacterHandlerTest {
    public static void main(String[] args) {
        JsonEscapeCharacterHandler handler = new JsonEscapeCharacterHandler();

        String jsonString = "Hello, \\\"World\\\"!\\nUnicode: \\u00E9";

        System.out.println("Original JSON String: " + jsonString);
        System.out.println("Parsed String: " + handler.handleEscapedCharacters(jsonString));
    }
}

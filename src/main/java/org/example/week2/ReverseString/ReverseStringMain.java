package org.example.week2.ReverseString;

import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        StringBuilder answer = new StringBuilder();
        for(int i = phrase.length()-1 ; i >= 0; i++){
            answer.append(phrase.charAt(i));
        }

        System.out.println(answer);
    }
}

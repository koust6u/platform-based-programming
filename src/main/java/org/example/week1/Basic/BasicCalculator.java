package org.example.week1.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BasicCalculator {

    private static List<String> oper = Arrays.asList("/", "+", "-", "%", "*", "^");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for(int i = 0 ; i < count; i++){
            String operation = scanner.nextLine();
            if(operation.contains("sqrt")){
                String[] terms = operation.split(" ");
                System.out.printf("Result: %.2f\n", Math.sqrt(Double.parseDouble(terms[0])));
                continue;
            }

            String[] terms = operation.split(" ");
            try{
                int lhs = Integer.parseInt(terms[0]);
                int rhs = Integer.parseInt(terms[1]);
                System.out.println(calculate(lhs, rhs, terms[2]));
            }catch (Exception e){
                System.out.println("Invalid number format.");
            }
        }
    }

    private static String calculate(int lhs, int rhs, String op){
        switch (op){
            case "*":
                return mul(lhs, rhs);
            case "+":
                return add(lhs, rhs);
            case "-":
                return sub(lhs, rhs);
            case "/":
                return div(lhs, rhs);
            case "%":
                return mod(lhs, rhs);
            case "^":
                return square(lhs, rhs);
            default:
                return "Invalid operator.";
        }
    }
    private static String add(int lhs, int rhs){
        return String.format("Result: %.2f", (float)lhs+rhs);
    }

    private static String sub(int lhs, int rhs){
        return String.format("Result: %.2f", (float)lhs-rhs);
    }

    private static String div(int lhs, int rhs){
        if(rhs == 0) return "Division by zero.";
        return String.format("Result: %.2f", (float)lhs/rhs);
    }

    private static String mul(int lhs, int rhs){
        return String.format("Result: %.2f", (float)lhs*rhs);
    }

    private static String mod(int lhs, int rhs){
        return String.format("Result: %.2f", (float)lhs%rhs);
    }

    private static String square(int lhs, int rhs){
        return String.format("Result: %.2f", Math.pow(lhs, rhs));
    }
}

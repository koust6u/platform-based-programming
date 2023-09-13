package org.example.week2.AreaCalculator;

import java.util.Scanner;


public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String cmd = scanner.next();

            Shape shape;
            try{
                shape = Shape.valueOf(cmd.toUpperCase());
            }
            catch (Exception e){
                System.out.println("Invalid");
                continue;
            }
            switch (shape){
                case QUIT:
                    System.out.println("Bye");
                    return;
                case CIRCLE:
                    int radius = scanner.nextInt();
                    System.out.printf("Area of Circle: %.2f\n",(Math.pow(radius,2)*Math.PI));
                    break;
                case RECTANGLE:
                    int width = scanner.nextInt();
                    int height = scanner.nextInt();
                    System.out.printf("Area of Rectangle: %.2f\n",(float)width*height);
                    break;
                case TRIANGLE:
                    int base = scanner.nextInt();
                    int h = scanner.nextInt();
                    System.out.printf("Area of Triangle: %.2f\n", (float)base*h/2);
                    break;
                default:
                    break;
            }
        }
    }

     enum Shape{
         TRIANGLE("triangle"),
         RECTANGLE("rectangle"),
         CIRCLE("circle"),
         QUIT("quit");

         private final String value;

         private Shape(String value){
             this.value = value;
         }

         public String getValue(){
             return this.value;
         }
    }
}

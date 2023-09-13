package org.example.week2.RowColumn;
import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        int count = 1;
        for(int i = 0 ; i < col; i++){
            for(int j = 0 ; j < row; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}


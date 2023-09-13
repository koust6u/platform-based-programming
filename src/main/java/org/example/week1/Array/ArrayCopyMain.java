package org.example.week1.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {
        //입력으로부터 배열을 생성하시오
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] original = Arrays.stream(new int[size])
                .map(i -> i = scanner.nextInt())
                .toArray();
        //shallow copy 수행 코드를 작성하시오
        int [] shallow = original;
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(original));

        //deep copy 수행 코드를 작성하시오
        int []deep = new int[size];
        System.arraycopy(original, 0, deep, 0, size);
        modifyArray(deep, 2);
        System.out.println("Deep Copy: " + Arrays.toString(original));
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Number check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        }

        // Name check
        System.out.print("Enter a name: ");
        String name = scanner.next();

        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Array size check
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Numbers divisible by 3:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Bracket sequence: [((())()(())]]");
        System.out.println("Is it correct? No");
        System.out.println("Correct version: [((())()(()))]");

        scanner.close();
    }
}

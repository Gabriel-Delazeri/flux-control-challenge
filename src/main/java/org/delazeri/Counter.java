package org.delazeri;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter with the first parameter");
        int firstParameter = scanner.nextInt();
        System.out.println("Enter with the second parameter");
        int secondParameter = scanner.nextInt();

        try {
            count(firstParameter, secondParameter);
        } catch (LessParameterException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void count(int firstParameter, int secondParameter) throws LessParameterException {
        if (firstParameter > secondParameter) {
            throw new LessParameterException();
        }

        int countdown = secondParameter - firstParameter;

        for (int i = 1; i <= countdown; i ++) {
            System.out.println("Printing the number: " + i);
        }
    }
}
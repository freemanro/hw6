package com.maktab74.hw6;

import java.util.Scanner;

public class Hw6Application {
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getChoice("Please select: ", 3);
            switch (choice) {
                case 1:
                    Part1.execute();
                    break;
                case 2:
                    //Part2.execute();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println("===============");
        System.out.println("1. Part 1");
        System.out.println("2. Part 2");
        System.out.println("3. Exit");
        System.out.println("===============");
    }

    private static int getChoice(String message, int numOfChoices) {
        if (numOfChoices <= 0)
            return 0;

        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print(message);
            Scanner integerScanner = new Scanner(scanner.nextLine());
            choice = integerScanner.hasNextInt() ? integerScanner.nextInt() : 0;
            if (choice > 0 && choice <= numOfChoices)
                return choice;
        }
    }
}

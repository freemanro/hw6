package com.maktab74.hw6;

import java.util.ArrayList;

public class Part1 {
    public static void execute() {
        ArrayList<Integer> integerList = new ArrayList<>();
        fillArrayList(integerList);

        System.out.println("Original list:");
        showArrayList(integerList);

        System.out.println("After removing unfit pairs:");
        removeUnfitPairs(integerList);
        showArrayList(integerList);
    }

    private static void fillArrayList(ArrayList<Integer> emptyList) {
        int[] numbers = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1, 0};
        for (int i = 0; i < numbers.length; i++)
            emptyList.add(numbers[i]);
    }

    private static void showArrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + (i % 2 == 1 ? " - " : " "));
        }
        System.out.println();
    }

    private static void removeUnfitPairs(ArrayList<Integer> inputList) {
        if (inputList.size() % 2 == 1)
            inputList.remove(inputList.size() - 1);
        int i = 0;
        while (i < inputList.size()) {
            if (inputList.get(i) > inputList.get(i + 1)) {
                inputList.remove(i);
                inputList.remove(i);
            } else
                i += 2;
        }
    }
}

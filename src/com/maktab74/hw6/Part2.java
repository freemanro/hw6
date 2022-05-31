package com.maktab74.hw6;

import com.maktab74.hw6.util.InvalidIndexException;
import com.maktab74.hw6.util.MyLinkedList;

public class Part2 {
    public static void execute() throws InvalidIndexException {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        fillMyLinkedList(myLinkedList);

        System.out.println("Initial filled list:");
        showMyLinkedList(myLinkedList);
        System.out.println("size is : " + myLinkedList.size());
        System.out.println();

        myLinkedList.remove(1);
        System.out.println("After removing element at index 1:");
        showMyLinkedList(myLinkedList);
        System.out.println("size is : " + myLinkedList.size());
        System.out.println();


        myLinkedList.remove((Integer) 9);
        System.out.println("After removing first element equals to 9:");
        showMyLinkedList(myLinkedList);
        System.out.println("size is : " + myLinkedList.size());
        System.out.println();

        int i = myLinkedList.indexOf((Integer) 5);
        System.out.println("Location of first occurrence of 5 is: " + i);


    }

    private static void fillMyLinkedList(MyLinkedList<Integer> emptyList) {
        int[] numbers = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1, 0};
        for (int i = 0; i < numbers.length; i++)
            emptyList.add(numbers[i]);
    }

    private static void showMyLinkedList(MyLinkedList<Integer> myLinkedList) throws InvalidIndexException {
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
    }
}

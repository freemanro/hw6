package com.maktab74.hw6.util;

public class InvalidIndexException extends Exception {
    final int invalidIndex;

    public InvalidIndexException(int invalidIndex) {
        this.invalidIndex = invalidIndex;
    }

    public int getInvalidIndex() {
        return invalidIndex;
    }

    @Override
    public String toString() {
        return "InvalidIndexException{" +
                "invalidIndex=" + invalidIndex +
                '}';
    }
}

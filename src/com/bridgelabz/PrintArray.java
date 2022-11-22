package com.bridgelabz;

public class PrintArray<T> {

    private T[] inputArray;

    public PrintArray(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public void toPrint() {
        PrintArray.toPrint(this.inputArray);

    }


    /*
    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void toPrint(Character[] inputArray) {
        for (char element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }*/

    public static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
//        PrintArray.toPrint(intArray);
        new PrintArray(intArray).toPrint();

        Double[] doubleArray = {1.5, 2.5, 4.5, 4.9, 5.5};
        PrintArray.toPrint(doubleArray);

        Character[] chrArray = {'B','R', 'I', 'D', 'G', 'E', 'L', 'A', 'B', 'Z'};
        PrintArray.toPrint(chrArray);
    }
}

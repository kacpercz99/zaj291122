package zad2;

import java.util.Arrays;

public abstract class ArrayUtils {
    public static <T> T getCentral(T[] array) {
        if (array == null || array.length == 0) return null;
        return array[array.length / 2];
    }

    public static <T> void print(T[] array) {
        if (array == null) System.out.println("Array is null");
        else if (array.length == 0) System.out.println("Array is empty");
        else Arrays.stream(array).forEach(System.out::println);
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T maxe = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(maxe) > 0) maxe = arr[i];
        return maxe;
    }

    public static <T extends Comparable<T>> Integer countGreaterThan(T[] arr) {
        if (arr == null || arr.length < 2) return 0;
        int counter = 0;
        for (T element : arr) {
            if (element.compareTo(arr[1]) > 0) counter++;
        }
        return counter;
    }
}

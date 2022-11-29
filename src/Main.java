import zad1.Pair;
import zad1.Utils;
import zad2.ArrayUtils;
import zad2.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //zad1();
        zad2();

    }

    public static void zad1() {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        System.out.println(p1);
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        System.out.println(p2);
        System.out.println(Utils.compare(p1, p2));
    }

    public static void zad2() {
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Integer[] arr2 = new Integer[]{};
        Integer[] arr3 = null;
        String[] arr4 = new String[]{"heh", "aha", "notenten"};
        Character[] arr5 = new Character[]{'a', 'b', 'c'};

        System.out.println("A");
        Stream.of(arr1, arr2, arr3, arr4, arr5).map(ArrayUtils::getCentral).forEach(System.out::println);
        System.out.println("B");
        Stream.of(arr1, arr2, arr3, arr4, arr5).forEach(ArrayUtils::print);
        System.out.println("C");
        System.out.println(ArrayUtils.max(arr1));
        System.out.println(ArrayUtils.max(arr4));
        System.out.println(ArrayUtils.max(arr5));
        System.out.println("D");
        System.out.println(ArrayUtils.countGreaterThan(arr1));
        Person p1 = new Person("123", "A", "A");
        Person p2 = new Person("124", "A", "A");
        Person p3 = new Person("125", "A", "B");
        Person p4 = new Person("126", "B", "B");
        System.out.println("E");
        System.out.println("p1 compareTo p2:" + p1.compareTo(p2));
        System.out.println("p2 compareTo p3:" + p2.compareTo(p3));
        System.out.println("p3 compareTo p4:" + p3.compareTo(p4));
        System.out.println("p1 compareTo p4:" + p1.compareTo(p4));
        System.out.println("F");
        Person[] persons = new Person[]{p1, p2, p3, p4};
        System.out.println(ArrayUtils.max(persons));
    }
}

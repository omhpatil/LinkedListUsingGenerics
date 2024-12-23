package com.main;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
//        LinkedList<Object> ls = new LinkedList<>();       // For storing all type of values
//        LinkedList<String> ls = new LinkedList<>();

        ls.insetAtStart(12);
        ls.insetAtStart(13);
        ls.insetAtStart(14);

        ls.print();
        System.out.println();

        ls.insertAtEnd(11);

        ls.print();
        System.out.println();

        ls.delete(14);
        ls.delete(11);

        ls.print();
        System.out.println();

        System.out.println("Element Found ? " + ls.search(13));
        System.out.println("Element Found ? " +ls.search(11));

        System.out.println("Size of LL: " +ls.size());

        ls.reverse();
        System.out.print("Reversed LL: ");
        ls.print();

    }
}

package listSolution;

import list.SinglyLinkedList;

public class Main_Uebung_1_12 {
    public static void main(String[] args) {
        System.out.println("***** Test the List ***********************************");
        SinglyLinkedList_1_12<Integer> s1 = new SinglyLinkedList_1_12<Integer>();
        s1.insertFirst(1);
        s1.insertFirst(2);
        s1.insertFirst(3);
        s1.insertFirst(4);
        SinglyLinkedList_1_12<Integer> s2 = new SinglyLinkedList_1_12<>(s1);
        System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");
        System.out.println("S2: " + s2 + "(" + s2.size() + " Elemente)");
        s2.removeFirst();
        System.out.println("S2: " + s2 + "(" + s2.size() + " Elemente)");
        System.out.println(s1.getFirst());
        s1.remove(2);
        System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");
        s1.insertAfter(9, 0);
        System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");
        System.out.println(s1.get(3));
        s1.removeAll();
        System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");

        System.out.println();
    }
}

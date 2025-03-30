package Linkedlist;

import java.util.LinkedList;

public class InbuiltLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.addLast(5);
        list.addFirst(2);

        // Accessing Elements 
        int first = list.getFirst();
        int last = list.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Removing Elements 
        list.removeFirst();  // Removes 2
        list.remove(Integer.valueOf(5));  // Correct way to remove by value

        // Iterating through list
        System.out.println("Final list:");
        for (int item : list) {
            System.out.println(item);
        }
    }
}
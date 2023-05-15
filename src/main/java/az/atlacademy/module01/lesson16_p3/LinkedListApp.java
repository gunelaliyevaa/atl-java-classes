package az.atlacademy.module01.lesson16_p3;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.addFirst("First");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.addLast("Last");
        System.out.println(linkedList);

        System.out.println(linkedList.contains(null));

        linkedList.set(2, null);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(null));

        linkedList.removeFirstOccurrence("c");
        System.out.println(linkedList);
    }

}

package text;

//* @author Jinsun Yu, Jasjot Singh, Tony Kim, Jiyun Woo.


import java.util.Iterator;
import Exercise1.MyAList;
import exercise2.MyDList;
import exercise2.MyNode;

public class Driver {

    public static void main(String[] args) {

        // Testing MyAList implementation
        MyAList<String> aListA = new MyAList<>();
        MyAList<String> aListB = new MyAList<>();

        System.out.println("Size Before Add: " + aListA.size());
        System.out.println("IsEmpty Before Add? " + aListA.isEmpty());

        // Adding elements to ListA
        String[] namesA = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Gina", "Harry", "Irene", "Jack"};
        for (String name : namesA) {
            aListA.add(name);
        }
        
        for (String name : aListA) {
            System.out.println("ListA: " + name);
        }

        // Adding elements to ListB
        String[] namesB = {"John", "Emma", "Liam", "Olivia", "Noah", "Ava", "William", "Sophia", "James", "Mia"};
        for (String name : namesB) {
            aListB.add(name);
        }
        
        for (String name : aListB) {
            System.out.println("ListB: " + name);
        }

        // Testing addAll()
        aListA.addAll(aListB);
        for (String name : aListA) {
            System.out.println("After addAll(): " + name);
        }

        // Testing get(), remove() and set()
        System.out.println("Get 0: " + aListA.get(0));
        aListA.remove(0);
        System.out.println("Get After Remove 0: " + aListA.get(0));
        aListA.set(0, "Bub");
        System.out.println("Get After Set 0: " + aListA.get(0));

        // Size and empty check
        System.out.println("Size After Operations: " + aListA.size());
        System.out.println("IsEmpty After Operations? " + aListA.isEmpty());

        // Testing toArray()
        Object[] newArray = aListA.toArray();
        for (Object obj : newArray) {
            System.out.println("ToArray: " + obj);
        }

        // Testing iterator()
        Iterator<String> it = aListA.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // Clear test
        aListA.clear();
        System.out.println("Size After Clear: " + aListA.size());
        System.out.println("IsEmpty After Clear? " + aListA.isEmpty());

        System.out.println("\n\n");

        // Testing MyDList implementation
        MyDList<Integer> dList = new MyDList<>();

        System.out.println("Size: " + dList.size());
        System.out.println("IsEmpty? " + dList.isEmpty());

        // Adding elements to front
        int[] firstNumbers = {10, 25, 8, 17, 42, 56, 33, 71, 94, 12};
        for (int num : firstNumbers) {
            dList.addFirst(num);
        }

        MyNode<Integer> curr = dList.getHead();
        while (curr != null) {
            System.out.println("Add First: " + curr.getElement());
            curr = curr.getNext();
        }

        // Adding elements to end
        int[] lastNumbers = {5, 18, 30, 47, 22, 14, 36, 59, 41, 13};
        for (int num : lastNumbers) {
            dList.addLast(num);
        }

        curr = dList.getHead();
        while (curr != null) {
            System.out.println("Added Last: " + curr.getElement());
            curr = curr.getNext();
        }

        // Remove first and last
        System.out.println("Removed First: " + dList.removeFirst());
        System.out.println("Removed Last: " + dList.removeLast());

        // Final size and empty check
        System.out.println("Size: " + dList.size());
        System.out.println("IsEmpty? " + dList.isEmpty());
    }
}

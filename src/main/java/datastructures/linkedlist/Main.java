package datastructures.linkedlist;

public class Main {

    public static void main(String[] args){
        LinkedList myLinkedList =  new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

       // myLinkedList.printList();

        myLinkedList.append(1);

        myLinkedList.append(2);

        myLinkedList.printList();

        System.out.println("Last value removed is :" + myLinkedList.removeLast().value);


    }
}

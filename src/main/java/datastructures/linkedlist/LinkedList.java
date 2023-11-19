package datastructures.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //inner class or nested class
    class Node{
        int value;
        Node next;

        //Constructor to intialize node class
        Node(int value){
            this.value = value;
        }
    }

    //Method to intialize the Node
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head :" + head.value);
    }
    public void getTail(){
        System.out.println("Tail :" + tail.value);
    }

    public void getLength(){
        System.out.println("Length :" + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        //Empty LinkedList
        if(length == 0){
            head =  newNode;
            tail = newNode;
        //Items in the LinkedList
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    public void dummyCommit(){
        System.out.println("This is a dummy commit to check");
    }

}

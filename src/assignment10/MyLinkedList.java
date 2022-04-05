package assignment10;

public class MyLinkedList {
    Node head;
    Node tail;

    public void add(int data){
        Node node = new Node(data);
        if (tail == null){
            head=node;
            tail=node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }


}

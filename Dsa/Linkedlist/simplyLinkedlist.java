package Linkedlist;


public class simplyLinkedlist {
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(60);
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.Displayall();
    }

}

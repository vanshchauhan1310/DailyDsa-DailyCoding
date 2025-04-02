package Linkedlist;


public class simplyLinkedlist {
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(70);
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insert(60,5);
        list.Displayall();
        list.DeleteFirst();
        list.Displayall();
        list.DeleteLast();
        list.Displayall();
        list.Delete(2);
        list.Displayall();
    }


}

package Linkedlist;

public class LL {

    private Node Head;
    private int size;
    private Node Tail;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int Data){
        Node node = new Node(Data);
        node.next = Head;
        Head = node;

        
        if (Tail == null){
            Tail = node;
        }

        size++;

    }

    public void Displayall(){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("");
        
    }

    public void insertLast(int Data){
        if(Tail == null){
            insertFirst(Data);
            return ;
        }
       
        Node node = new Node(Data);
        Tail.next = node;
        Tail = node;
        
        size++;

     
    }
    private class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }    
    }
}

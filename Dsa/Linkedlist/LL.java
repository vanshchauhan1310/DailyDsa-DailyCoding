package Linkedlist;

public class LL {

    private Node Head;
    private int size;
    private Node Tail;

    public LL(){
        this.size=0;
    }


    public void Displayall(){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("");
        
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

    public void insert(int Data,int index){
        if (index == 0){
            insertFirst(Data);
        }
        if (index == size) {
            insertLast(Data);            
        }
        Node temp = Head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(Data, temp.next);
        temp.next = node;

        size++;
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

    public void DeleteFirst(){
        if (Head == null){
            Tail = null;
        }

        Head = Head.next;
        size--;

    }

    public void DeleteLast(){
        Node temp = Head;
        // System.out.println(size);
        for(int i = 0;i<size-2;i++){
            temp = temp.next;
        }
        Tail = temp;
        Tail.next = null;

      size--;

    }

    public void Delete(int index){
        if (index == 0) {
            DeleteFirst();       
        }

        if (index == size - 1) {
            DeleteLast();            
        }

        Node Temp = Head;
        for (int i = 0; i < index - 1; i++) {
            Temp = Temp.next;
        }

        Temp.next = Temp.next.next;

        size--;
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

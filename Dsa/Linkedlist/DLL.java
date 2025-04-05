package Linkedlist;

public class DLL {

    Node Head;
    Node Tail;
    int size;

    public void Displayall(){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void InsertFirst(int data){
        Node newNode = new Node(data);

        newNode.next = Head;
        newNode.prev = null;
        
        if(Head != null){
            Head.prev = newNode;
        }

        Head = newNode;
        size++;
 
    }

    
    private class  Node {
        
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
            this.data = data;
        }

        public Node(int data,Node next,Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }
    
}

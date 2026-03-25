//package LinkedList;

public class deletenode {
    public static void delete(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp!= null){
                System.out.print("->");
            }
        }
        
        temp.next = null;
    
        
    }
   
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
       
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        //Node head = n1;
        delete(n1.next);
    }
    
}
class Node{
    String data;
    Node next;
    public Node(String data){
        this.data = data;
        this.next = null;

    }
}

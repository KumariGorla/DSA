public class ReverseLinkedList {
    public static void printlinkelist(Node head){
        Node temp1 = head;
         while(temp1!=null){
            System.out.print(temp1.data);
            temp1 = temp1.next;
            if(temp1 != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    public static void reverse(Node head){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node temp = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = temp;


        }
        head.next = null;
        head = prevNode;


    }
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        
        n1.next = n2;
        n2.next = n3;
        Node head = n1;
        reverse(head);
        printlinkelist(head);

    }
}
class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}
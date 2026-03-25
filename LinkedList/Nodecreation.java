//package LinkedList;
//Print linkedlist

public class Nodecreation {
    public static void printlinkelist(Node head){
        Node temp = head;
         while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    //retrive length of linkedlist
    public static int Llength(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    //Search in linkedlist
    public static int Searchlinkelist(Node head, String key){
        Node temp = head;
        int idx = 0;
        while(temp!=null){
            if(temp.data.equals(key)){
                return idx;

                
                
            }
            idx = idx +1;
            temp = temp.next;
        }
        return -1;
    }
    //update in linkedlist
    public static void update(Node head, int key, String newVal){
        Node temp = head;
        for(int i = 0; i< key;i++){
            temp = temp.next;
        }
        temp.data = newVal;;
    }
    //Add new node at the end of linkedlist
    public static void insert1(Node head,String s){
        Node s1 = new Node(s);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
           
        }
        temp.next = s1;
    }
    //add new node at the beginning of linkedlist
    public static Node insert2(Node head, String s){
        Node s1 = new Node(s);
        s1.next = head;
        head = s1;
        

       
        return s1;
    }
    //adding element at given index 
    public static void insert3(Node head,int idx,String s){
        Node s1 = new Node(s);
        Node temp = head;
        for(int i = 0;i<idx-1;i++){
            temp = temp.next;
        }
        Node s2 = temp.next;
        temp.next = s1;
        s1.next = s2;
    }
    
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        //System.out.println(n2.next.data);
        //System.out.println(n1.next.next.data);

        Node head = n1;
        insert1(head, "E");
        //printlinkelist(head);
        //System.out.println(Llength(head));
        //System.out.println(Searchlinkelist(head, "E"));
        //update(head, 1, "X");
        //printlinkelist(head);
        //insert1(head, "E");
        //printlinkelist(head);
        //head = insert2(head, "Z");
        //printlinkelist(head);
        //head = insert2(head, "Y");
        //printlinkelist(head);
        //insert3(head, 2, "W");
        //printlinkelist(head);

        /*System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);*/

        //Another way of printing

        //Node temp = head;
        //System.out.println(temp.data);
        //temp = temp.next;
        //System.out.println(temp.data);
        //temp = temp.next;
        //System.out.println(temp.data);
//
        //Using for loop
        //for(int i = 0;i<3;i++){
        //    
        //    System.out.println(temp.data);
        //    temp = temp.next;
        //}
        ////Using while loop

        //while(temp!=null){
        //    System.out.println(temp.data);
        //    temp = temp.next;
        //}
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
package trees;

import java.util.Scanner;

public class prob1 {
    private static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    //insert elements
    public void ppopulate(Scanner sc){
        System.out.println("Enter the data for the node (or -1 to stop): ");
        int value = sc.nextInt();
        root = new Node(value);
        ppopulate(sc,root);
    }
    private void ppopulate(Scanner sc,Node node){
        System.out.println("Do you want to enter left");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the data for the left node: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            ppopulate(sc,node.left);
        }
        System.out.println("Do you want to enter right");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the data for the right node: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            ppopulate(sc,node.right);
        }
    }
    public void display(){
        display(this.root, "");
    }
    private void display(Node node,String indent){
        if (node==null) {
           return; 
        }
        System.out.println(indent + node.data);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }    
    public static void main(String[] args) {
        //using array
        Scanner sc = new Scanner(System.in);
        prob1 tree = new prob1();
        tree.ppopulate(sc);
        //tree.display();
        tree.prettyDisplay();
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);


    }
    private void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i = 0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|--------->"+node.data);
        }else{
            System.out.println(node.data);
        }
        prettyDisplay(node.left,level+1);
        
    }
}

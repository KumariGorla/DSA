package queue;
import java.util.*;
public class lecture1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Kumari");
        arr.add("Gorla");
        arr.remove(0);
        System.out.println(arr);
        Queue<String> q = new LinkedList<>();
        q.add("Lovakumari");
        
        q.add("SDE at Google");
        //q.poll();
        q.add("3 years Experienced");
        String s = q.peek();
        System.out.println(s);
        int s1 = q.size();
        System.out.println(s1);
        System.out.println(q);
        //Queue is FIFO
        System.out.println(q.isEmpty());
        for(String s2:q){
            System.out.println(s2);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;
public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        

        //Add elements

        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // Get element

        System.out.println(list.get(0));
        list.add(0,9);
        System.out.println(list);


        //Set element 

        list.set(0,5);
        System.out.println(list);

        //Delet

        list.remove(3);
        System.out.println(list);

        //Size

        int size = list.size();
        System.out.println(size);

        //Loops

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sorting

        Collections.sort(list);
        System.out.println(list);

    }
}

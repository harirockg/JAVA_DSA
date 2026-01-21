// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);  
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        //in ascending order
        Collections.sort(list);
        System.out.println(list);

        //in descending order
        Collections.sort(list,Collections.reverseOrder());//comaparator - fnx logic
        System.out.println(list);
    }
    
}
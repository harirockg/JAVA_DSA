import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //add element 
        list.add(1);  // time complexity O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);  // time O(n)  ye whi rahega baki age wale age push ho jayenge

        System.out.println(list);

        //get element
        int element =list.get(3);
        System.out.println(element);

        System.out.println(list.get(4));

        //remove/delete element, its take linear time 
        list.remove(3);
        System.out.println(list);

        // set element at index
        list.set(0,7);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(4));  // will return true beacause its present
        System.out.println(list.contains(11));  //will return false beacause its not present


    }
}

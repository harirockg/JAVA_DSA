// Question from live session 14
public class Occurences {
    public static void occur(int arr[] ,int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        occur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        int i=0;
        occur(arr, key,i);
    }
}

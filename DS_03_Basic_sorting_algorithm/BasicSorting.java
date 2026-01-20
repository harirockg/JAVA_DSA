//package DS_03_Basic sorting algorithm;
import java.util.Arrays;
import java.util.Collections;
public class BasicSorting {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }

     
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // public static void printArr(Integer arr[]){
    //     for(Integer i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }



    public static void SelectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){  // change > to < and it will print in reverge or decreasing order
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        
    }


    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //find out the correct position to insert
            while(prev>=0 && arr[prev] > curr){    // change > to < for print in descending order
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }        
    }

    //  public static void countingSorted(int[] args) {
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length;i++){
    //         largest=Math.max(largest,arr[i]) ;
    //     }
    //     int count[]=new int[largest+1];
    //  }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2,6}; 
        // for int we can't take revrse order we have to sift to --->  from int to Integer
        //Integer arr[] ={5,4,1,3,2,6};
        bubbleSort(arr);
        // SelectionSort(arr);
        // insertionSort(arr);

        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}

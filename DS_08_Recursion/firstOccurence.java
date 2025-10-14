package DS_08_Recursion;

public class firstOccurence {
    //first occurence
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    //Last Occurence
    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        int isFound=lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

    }
    public static void main(String[] args) {
        int arr[]={1,7,4,6,5,6,7,3,8};
        // System.out.println(firstOccurence(arr, 7, 0));
        System.out.println(lastOccurence(arr, 7, 0));
    }
    
}

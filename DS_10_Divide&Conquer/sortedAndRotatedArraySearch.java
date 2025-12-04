public class sortedAndRotatedArraySearch {

    public static int search(int arr[], int target,int si,int ei){

        //base case
        if(si>ei){
            return -1;
        }

        //work
        int mid=si+(ei-si)/2;  // or can be (si+ei)/2

        //case found
        if(arr[mid]==target){
            return mid;
        }

        //mid on Line 1
        if(arr[si]<=arr[mid]){

            //case a : left search
            if(arr[si]<=target && target <=arr[mid]){
                return search(arr, target, si, mid-1);    //yaha ei ke jagah mid-1 likha
            }else{
                // case b : right search
                return search(arr, target, mid+1, ei);    //yaha si ke jagah mid+1 likha
            }
        }

        //mid on line 2
        else{
            //case c: right search
            if(arr[mid]<=target && target <=arr[ei]){
                return search(arr, target, mid+1 , ei);   //yaha si ke jagah mid+1 likha

            }else{
                //case d: left  search
                return search(arr, target, si, mid-1);     //yaha ei ke jagah mid-1 likha
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;//for output ->4
        int tarIdx=search(arr, target,0,arr.length-1);
        System.out.println(tarIdx);
    }
    
}

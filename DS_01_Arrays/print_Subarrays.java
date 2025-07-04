public class print_Subarrays {
    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays:"+ts);
    }

    public static void printSubarrayssum(int numbers[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    //System.out.print(numbers[k]+" ");
                    //subarrya sum
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
                
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum:"+maxsum);
    }



    // prefix approach for less time complexity
    public static void printSubarrayssum_prefix_Approch(int numbers[]){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        // calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }


        for(int i=0;i<numbers.length;i++){
            int start=i;
            
            for(int j=i;j<numbers.length;j++){
                int end=j;
                // in below there is if statement in --- start==0 ? prefix[end] :
                currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

            
                // for(int k=start;k<=end;k++){
                //     //System.out.print(numbers[k]+" ");
                //     //subarrya sum
                //     currSum+=numbers[k];
                // }
                // System.out.println(currSum);

                if(maxsum<currSum){
                    maxsum=currSum;
                }
                
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum:"+maxsum);
    }



    // kadanes algorithm
    public static void kadanes(int numbers[]){
        int MaxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        for(int i=0;i<numbers.length;i++){
            CurrSum+=numbers[i];
            if(CurrSum<0){
                CurrSum=0;
            }
            MaxSum=Math.max(CurrSum,MaxSum);
        }
        System.out.println("Our MAX sum subarray is :"+MaxSum); 
    }

    public static void main(String[] args) {
        //int numbers[]={2,4,6,8,10};
        //int numbers[]={1,-2,6,-1,3};
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        //printSubarrays(numbers);
        //printSubarrayssum(numbers);
        //printSubarrayssum_prefix_Approch(numbers);
        kadanes(numbers);
    }
    
}

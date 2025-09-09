//package DS_06_Bit Manipulation;

public class BitManipulation {

    public static void oddorEven(int n){
        int bitMask=1;
        if((n & bitMask) ==0){
            //even
            System.out.println("even number");
        }else{
            //odd n&bitmask==1
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            //ith position is 0
            return 0;
        }else{
            //ith position is 1
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }


    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }

        // or new approach detail me 

        // n=clearIthBit(n, i);
        // int bitMask=newBit<<i;
        // return n|bitMask;
    }

    public static int clearIBits(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }

    public static int clearIJrangeBits(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println((5&6));
        // System.out.println((5|6));
        // System.out.println((5^6));
        // System.out.println((~5));
        // System.out.println((5<<2));
        // System.out.println((6>>1));

        // oddorEven(3);
        // oddorEven(11);
        // oddorEven(14);


        // System.out.println(getIthBit(15,2));
        // System.out.println(getIthBit(10,2));
        // System.out.println(getIthBit(10,3));

        // System.out.println(setIthBit(10,2));

        // System.out.println(clearIthBit(10,1));

        // System.out.println(updateIthBit(10,2,1));
        // System.out.println(clearIBits(15,2));
        // System.out.println(clearIJrangeBits(10,2,4));
        System.out.println(countSetBits(16));

        
    }
    
}

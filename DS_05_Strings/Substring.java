public class Substring {
    public static String Sub_string(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str="HelloWorld";
        // si=starting index and ei = ending index
        //System.out.println(Sub_string(str, 0, 5));

        //inbuilt fuction for substring
        System.out.println(str.substring(0,5));

    }
}

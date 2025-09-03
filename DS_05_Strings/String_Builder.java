public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
            // will print abcdefghijklmnopqrstuvwxyz
            //time complexity O(26) loop runs 26 times
            //if taken string anf append += then O(26*n^2)total number of iteration
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}

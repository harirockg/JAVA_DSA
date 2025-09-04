import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char chr1[]=s1.toCharArray();
        Arrays.sort(chr1);

        char chr2[]=s2.toCharArray();
        Arrays.sort(chr2);

        return Arrays.equals(chr1,chr2);
    }
    public static void main(String[] args) {
        String s1="yash";
        String s2="sayh";
        System.out.println(checkAnagram(s1, s2));
    }
    
}

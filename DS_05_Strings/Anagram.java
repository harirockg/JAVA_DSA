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

    public static boolean checkForAnagram(String s1,String s2){
        int count1[]=new int[26];
        int count2[]=new int[26];

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int idx=ch-'a';
            count1[idx]++;
        }

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            int idx=ch-'a';
            count2[idx]++;
        }

        return Arrays.equals(count1,count2);
    }
    public static void main(String[] args) {
        String s1="yash";
        String s2="sayh";
        //System.out.println(checkAnagram(s1, s2));
        System.out.println(checkForAnagram(s1, s2));
    }
    
}

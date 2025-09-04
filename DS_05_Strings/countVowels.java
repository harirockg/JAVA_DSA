public class countVowels {
    public static int Count_vowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        String str="Harivansh Chauhan";
        System.out.println("no vo vowels in "+str+" is : "+Count_vowels(str));
    }
}

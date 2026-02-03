import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //opening
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{ //closing 
                if(s.isEmpty()){ // its check for opening bracket is there or not 
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            //closing
            if(ch==')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate check
                }else{
                    s.pop();  // opening pair
                }
            }else{
                //opening
                s.push(ch);
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        // String str = "({[]})";
        // System.out.println(isValid(str));
        // String str1 = "({[]}";
        // System.out.println(isValid(str1));
        // String str2 = "}])";
        // System.out.println(isValid(str2));


        //isduplicate
        String str = "((a+b))";  // here duplicate present 
        System.out.println(isDuplicate(str));
        String str1 = "(a+b)";   // here duplicate not present
        System.out.println(isDuplicate(str1));
    }
}

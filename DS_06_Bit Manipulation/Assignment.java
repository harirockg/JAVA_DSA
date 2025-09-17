public class Assignment {
    public static void add1(){
        int num;
        num=6;
        System.out.println(num+" + "+1+" is "+(-~num));
        num=-4;
        System.out.println(num+" + "+1+" is "+(-~num));
        num=0;
        System.out.println(num+" + "+1+" is "+(-~num));
    }

    public static void convertUpperCaseToLowerCase(){
        for(char ch='A';ch<='Z';ch++){
            System.out.println((char)(ch|' '));
        }
    }
    public static void main(String[] args) {
        add1();
        convertUpperCaseToLowerCase();
    }
}

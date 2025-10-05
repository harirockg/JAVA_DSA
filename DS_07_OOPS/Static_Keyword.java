public class Static_Keyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="JMV";

        Student s2=new Student();
        System.out.println(s2.schoolName);

        // Student s3=new Student();
        // s3.schoolName="ABC";
        
        // System.out.println(s2.schoolName);
    }
}

class Student{
    static int returnPercentage(int math,int phy,int chem){
        return(math+phy+chem)/3;
    }
    // static lagane se ye ek hi bar create hoga bar bar create nhi hoga aur bhot sari memory use nhi hoti hai

    String name;
    int roll;

    static String schoolName;    // here schoolName is static keyword

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
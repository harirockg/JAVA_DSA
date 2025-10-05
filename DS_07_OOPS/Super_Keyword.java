public class Super_Keyword {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color="brown";
        // super();  // isse directly hum animal class ke constructor ko call kar rhe hai
        System.out.println("Horse constructor is called");
    }
}
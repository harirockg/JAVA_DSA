public class Abastraction {
    public static void main(String[] args) {

        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse=new Mustang();
        //Animal -> Horse -> Mustang
        
    }
    
}

abstract class Animal{
    // now constructor in abstraction
    String color;
    Animal(){
        // color="brown";
        System.out.println("animal constructor called");
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    // yaha walk function karna padega kyoki ham pehle hi animal me implement kae chuke hai so yaha bhi implement karna  hoga 
    Horse(){
        System.out.println("horse contructor called");
    }
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
void changeColor(){
        color="white";
    }

    void walk(){
        System.out.println("walk on 2 legs");
    }
}
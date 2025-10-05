public class inheritence {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        
        // Dog tommy=new Dog();
        // tommy.eat();
        // tommy.legs=4;
        // System.out.println(tommy.legs);

    }
}   

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//derived class / subclass
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }

class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
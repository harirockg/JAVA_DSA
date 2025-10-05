public class Interfaces {
    public static void main(String[] args) {
        // Queen q=new Queen();
        // q.moves();

        Bear b=new Bear();
        b.eatPlants();
        b.eatsMeat();
    }
    
}

interface ChessPlayer{
    void moves();
} 

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 side)");
    }
}

class rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}


interface Herbivore{
    void eatPlants();
}

interface Carnivore{
    void eatsMeat();
}

class Bear implements Herbivore,Carnivore{
    public void eatPlants(){
        System.out.println(" eats berries,grasss,fruits and plants");
    }

    public void eatsMeat(){
        System.out.println(" eats fish and animals");
    }
}
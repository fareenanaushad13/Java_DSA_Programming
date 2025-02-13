interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Lion implements Carnivore {
    public void eatMeat() {
        System.out.println("Lion eats meat.");
    }
}

class Deer implements Herbivore {
    public void eatPlants() {
        System.out.println("Deer eats plants.");
    }
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats plants.");
    }

    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eatMeat();

        Deer deer = new Deer();
        deer.eatPlants();

        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
    }
}

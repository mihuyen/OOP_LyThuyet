class Animal {

    String name;
    boolean canSwim;
    boolean canWalk;

    Animal(String name, boolean canSwim, boolean canWalk) {
        this.name = name;
        this.canSwim = canSwim;
        this.canWalk = canWalk;
    }
}

class Pig extends Animal {

    Pig(String name) {
        super(name, false, true);
    }

}

class Duck extends Animal {

    Duck(String name) {
        super(name, true, true);
    }
}

class Fish extends Animal {
    
    Fish(String name) {
        super(name, true, false);
    }
}


public class Main {

    public static void print(Animal[] animals) {
        for (Animal animal : animals) {

            if (animal.canSwim) {
                System.out.println(animal.name + " can swim");
            }

            if (animal.canWalk) {
                System.out.println(animal.name + " can walk");
            }
        }
    }


    public static void main(String[] args) {
        Animal[] animals = {
                new Pig("Pig"),
                new Duck("Duck"),
                new Fish("Fish")
        };

        print(animals);
    }
}

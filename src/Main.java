public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Fugo");
        fish.setAge("2");
        System.out.println(fish.getName());
        System.out.println(fish.getAge());

        Parrot parrot = new Parrot();
        parrot.setEyes("Bown");
        parrot.setAreEating("fruits and seeds");
        System.out.println(parrot.getEyes());
        System.out.println(parrot.getAreEating());

        Cat cat = new Cat();
        cat.setName("Вormouse");
        cat.setColor("blue");
        cat.setAge("5");
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getAge());

        Dog dog = new Dog();
        dog.setName("Beethoven");
        dog.setAge("3");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());


        
    }
}
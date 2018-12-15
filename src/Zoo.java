public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Dog("Azor");
        animals[2] = new Cat("Filemon");
        animals[3] = new Pig("Prosiaczek");
        animals[4] = new Horse("Gniady");
        animals[5] = new Animal();

        for (Animal animal:animals) {
            animal.introduce();
        }
    }
}

class Animal{
    String name;

    public Animal() {
        this.name = "bezimienne";
    }

    String showName() {
        return "zwierze" + name;
    }
    String makeSound(){
        return "????";
    }
    void introduce(){
        System.out.println("Jestem " + showName() + ":" + makeSound());
    }
}

class Dog extends Animal{
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "kot" + name;
    }

    @Override
    String makeSound() {
        return "miau";
    }
}

class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }


}

class Horse extends Animal{
    public Horse(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "kon" + name;
    }

    @Override
    String makeSound() {
        return "iha";
    }
}
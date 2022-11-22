public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat("Tom");
        myCat.eat();
        myCat.breath();

        Parrot parrot = new Parrot("Ringneck");
        parrot.eat();
        parrot.breath();
        parrot.fly();

        Penguin penguin = new Penguin("Feet");
        penguin.fly();

    }
}
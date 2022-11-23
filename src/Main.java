public class Main {
    public static void main(String[] args) {

        String stringData = "The World Cup Is In Qatar This Year";

        String [] data = stringData.split(" ");
        for(String s : data){
            System.out.println("-->" + s);
        }

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
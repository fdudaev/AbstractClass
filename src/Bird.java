public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is picking");

    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");

    }
    public abstract void fly();

}

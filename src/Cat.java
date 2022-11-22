public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " is eating");
    }
}

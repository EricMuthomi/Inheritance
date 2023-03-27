public class Cat extends Animal{
    //Cat is the subclass/child class. Cat inherits all the public and protected methods and variables
    //of the animal class while still implementing its own
    String meow;
    public Cat(String color, int age, String meow) {
        super(color, age);
        this.meow = meow;
    }
    //The child class can also override the methods of the main class to perform its own implementation
    @Override
    public void eat() {
        System.out.println("My cat loves eating cooked meat.");
    }

}

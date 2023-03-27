public class Animal {
    //Animal is the parent class
    String color;
    int age;

    public Animal(String color, int age){
        this.color = color;
        this.age = age;
    }
    public static void main(String[] args) {
        Cat myCat = new Cat("White", 6, "Meowww!");
        myCat.eat();

        Animal myAnimal = new Animal("Black", 5);
        myAnimal.eat();

    }
    public void eat(){
        System.out.println("The animal is eating");
    }
}

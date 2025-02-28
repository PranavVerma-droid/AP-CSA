public class VoidMethod {
    public static void main(String[] args){
        Dog myDog = new Dog("Jimmy", 12, "Rufflus?? IDK");

        // System.out.println(myDog);
        myDog.bark();
    }
}

@SuppressWarnings("unused")
class Dog {
    private String dogName;
    private int dogAge;
    private String dogBreed;

    public Dog(String name, int age, String breed){
        dogName = name;
        dogAge = age;
        dogBreed = breed;

    }

    public void bark(){
        System.out.println("Woof!");
    }
}
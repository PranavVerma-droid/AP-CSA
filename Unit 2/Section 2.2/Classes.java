public class Classes {
    public static void main(String[] args) {
        Car myCar = new Car("Dodge", true);
        Car myCar2 = new Car("Honda", false);

        System.out.println(myCar);
        System.out.println(myCar2);
    }

}

class Car {
    String make;
    boolean isSports;

    public Car(String manifacturer, boolean sports) {
        make = manifacturer;
        isSports = sports;
    }
}

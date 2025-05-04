public class ThisKeywordInJava {
    public static void main(String[] args) {

    }
}


@SuppressWarnings("unused")
class Car {
    String model;
    int year;

    Car(String model) {
        // Calls the second constructor.
        this(model, 2020);
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
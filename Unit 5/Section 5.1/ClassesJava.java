// Private access is used when an element (such as a variable or method) should only be able to be accessed within the declaring class.
// Public access allows for an element to be accessed by any other class.

class Sample {
    //Data encapsulation is a technique in which the implementation of details of the class are kept hidden from the user. 
    // By using the private level access, instance variables are encapsulated in the class.
    private int value;

    public int getValue(){
        return value; 
    }
}

public class ClassesJava {
    public static void main(String[] args) {

    }
}

/*
 * When designing a class, programmers make decisions about what data to make accessible and modifiable from an external class. 
 * Each piece of data can be either accessible or modifiable, or it can be both or neither. This access is accomplished 
 * through accessor and mutator methods (getters and setters).
 */
public class Sport {
    // Private access is used when an element (such as a variable or method) should only be able to be accessed within the declaring class.
    // Public access allows for an element to be accessed by any other class.

    /* Instance variables (represent the state)
     * 
     * If NO constructor is provided, Java provides a default constructor.
     * All Instance Variables are set to default variables:
     * 
     * int: 0
     * double: 0.0
     * Strings & Other Objects: null
     */
    
    private String name;
    private int numAthletes;

    // Data encapsulation is a technique in which the implementation of details of the class are kept hidden from the user. 
    // By using the private level access, instance variables are encapsulated in the class.

    /*
     * Constructors
     * 
     * Constructors are essentially object creators. 
     * You use constructors to create new objects using a class. When you create new objects using constructors, you also set any initial values of instance variables if necessary. 
     * These initial values of instance variables can be set either with or without the use of parameters.
     * 
     * Only ONE constructor will be used to set the initial state of the object.
    */ 

    public Sport() {
        name = "";
        numAthletes = 0;
    }

    public Sport(String n) {
        name = n;
        numAthletes = 0;
    }

    public Sport(String n, int numAth) {
        name = n;
        numAthletes = numAth;
    }

    // Setter Methods
    // These can set while the instance variables are private.
    public void setName(String newName) {
        name = newName;
    }

    public void setNumAtheletes(int newNumAth) {
        numAthletes = newNumAth;
    }

    // Getter Methods
    // These get set while the instance variables are private.
    public String getName() {
        return name;
    }

    public int getNumAtheletes() {
        return numAthletes;
    }
}

/*
 * When designing a class, programmers make decisions about what data to make accessible and modifiable from an external class. 
 * Each piece of data can be either accessible or modifiable, or it can be both or neither. This access is accomplished 
 * through accessor and mutator methods (getters and setters).
 */



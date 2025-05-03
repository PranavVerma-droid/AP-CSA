/*
 * In Java, the Object class is like the great-grandparent of all classes. Every
 * class you create automatically inherits from Object, even if you don't
 * explicitly say so. It's like everyone getting a starter pack of methods that
 * they can use or customize.
 */

// Java will quietly add 'extends Object', whether you add it or not.
// It is a default class added to everything.
public class Performer extends Object {
    private String name;
    private int age;

    public Performer() {
        name = "A Generic Perfomer";
        age = 18;
    }

    public Performer(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void practice() {
        System.out.println("I'm Practicing Now!");
    }

    public void perform() {
        System.out.println("I'm Performing Now!");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /*
         * An object can take on different forms depending on its implementation. Java
         * can call the correct method even when an object is disguised as a more
         * generic reference type
         */

        Performer myStudent = new BalletDancer();
    }
}

/*
 * Default equals() checks reference equality (same as ==)
 * Default toString() returns className@hashCode
 * You should override these methods to provide meaningful behavior
 * When overriding equals():
 * 
 * Parameter must be Object
 * Check if the parameter is the correct type with instanceof
 * Cast it to your class type
 * Compare the relevant fields
 */

class Book extends Object {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Book) {
            Book otherBook = (Book) other;
            return this.title.equals(otherBook.title) &&
                    this.author.equals(otherBook.author);
        }
        return false;
    }
}

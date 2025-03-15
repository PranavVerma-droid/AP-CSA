public class Nickname {
  private String firstName;
  private String lastName;
  private String nickname;

  public Nickname(String realFirstName, String realLastName, String moniker) {
    firstName = realFirstName;
    lastName = realLastName;
    nickname = moniker;
  }

  public String toString() {
    return firstName + " (" + nickname + ") " + lastName;
  }

  public static void main(String[] args) {
    Nickname karel = new Nickname("Karel", "Dog", "the Dog");
    Nickname dwayne = new Nickname("Dwayne", "Johnson", "the Rock");
    Nickname travis = new Nickname("Travis", "Fish", "Redfinn");

        // By using the name of the object,
        // the toString method is called automatically
        System.out.println(karel);
        System.out.println(dwayne);
        System.out.println(travis);
        
        // Print a blank line
        System.out.println();

        // By using the name of the object,
        // the toString method is called automatically
        System.out.println(karel + " went to a movie with " + travis);
  }
}
public class Plant {
    private String name;
    private String color;
    private String genus;
    private String species;

    public Plant(String theName, String theColor, String theGenus, String theSpecies) {
        name = theName;
        color = theColor;
        genus = theGenus;
        species = theSpecies;
    }
    
    public String toString() {
        return color + " " + name + " (" + 
            genus + " " + species + ")";
    }

    public static void main(String[] args) {
       Plant swissCheesePlant = new Plant("Swiss Cheese Plant", "Green", "Monstera", "deliciosa");
        System.out.println(swissCheesePlant);
    }
}
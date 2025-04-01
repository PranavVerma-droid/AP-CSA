public class ClassesJava {
    public static void main(String[] args) {
        // Sport Class Testing
        // Basketball Sport.
        Sport bb = new Sport("Basketball", 10);;

        System.out.println(bb.getName());
        System.out.println(bb.getNumAtheletes());

        // TBD Sport (Set to VolleyBall).
        Sport TBD = new Sport();

        TBD.setName("VolleyBall"); TBD.setNumAtheletes(3);

        System.out.println(TBD.getName());
        System.out.println(TBD.getNumAtheletes());

        // Cow Class Testing
        Cow bessie = new Cow("holstein", "moo");

        System.out.println(bessie.getSound());
        System.out.println(bessie.getType());
        System.out.println(bessie.getNumMilkings());

        bessie.milkCow();
        System.out.println(bessie.getNumMilkings());

        bessie.milkCow(); bessie.milkCow();
        System.out.println(bessie.getNumMilkings());

        bessie.milkCow(10);
        System.out.println(bessie.getNumMilkings());
    }
}


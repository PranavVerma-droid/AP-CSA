public class ClassesJava {
    public static void main(String[] args) {
        // Basketball Sport.
        Sport bb = new Sport("Basketball", 10);;

        System.out.println(bb.getName());
        System.out.println(bb.getNumAtheletes());

        // TBD Sport (Set to VolleyBall).
        Sport TBD = new Sport();

        TBD.setName("VolleyBall"); TBD.setNumAtheletes(3);

        System.out.println(TBD.getName());
        System.out.println(TBD.getNumAtheletes());
    }
}


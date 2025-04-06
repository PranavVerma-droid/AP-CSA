public class Bowler {
    private int totalPins;
    private int games;

    public Bowler(int pins) {
        totalPins = pins;
        games = 3;
    }

    public void update(int game1, int game2, int game3) {
        int newPins = game1 + game2 + game3;
        totalPins += newPins;
        games += 3;
    }

    public int getAvg() {
        return totalPins / games;
    }

    public static void main(String[] args) {
        Bowler Garry = new Bowler(3);

        Garry.getAvg();
    }
}
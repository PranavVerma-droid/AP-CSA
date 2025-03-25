public class NumUpper {
    public int numUpperCase(String string){
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            String letter = string.substring(i, i+1);
            if(letter.equals(letter.toUpperCase())) {
                counter++;
            }
        }
        return counter;
    }
}

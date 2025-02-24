// Assignment Operator Demonstration

public class Assignment {
    public static void main(String[] args){
        int x = 7;
        double y = 10.0 + 10.6;
        int a = 50;

        // Right to Left for Assignment Operator
        double z = x = a;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

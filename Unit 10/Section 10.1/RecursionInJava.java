public class RecursionInJava {
    public static void main(String[] args) {        
        System.out.print(factorial(3));
    }
    
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int db1Recur(int n) {
        if (n > 0) {
            return n + db1Recur(n / 2) + db1Recur(n / 3);
        } else {
        return 0; }
    }

    public static void simpleRecur(int n) {
        System.out.print(n);
        if (n > 2) {
            simpleRecur(n - 1);
        }
        System.out.println(n);
    }
}

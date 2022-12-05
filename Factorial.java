public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        int res = calcFactorial(n);
        System.out.println(res);
    }

    private static int calcFactorial(int n) {
        if (n > 0) {
            return n * calcFactorial(n - 1);
        } else return 1;

    }
}

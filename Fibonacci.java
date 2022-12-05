public class Fibonacci {

    public static void main(String[] args) {
        int[] series = generateFibonacci(10);
        for (int s : series) {
            System.out.print(s + ",");
        }
    }

    private static int[] generateFibonacci(int n) {
        int[] res = new int[10];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }


}

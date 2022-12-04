import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
    /**
     * Time complexity O(n * m)
     */
    static void printPrimeNumbers(int n) {
//        A number that is divisible by 1 nd itself is called prime number
        // outter loop 4
        // inner loop
        System.out.print("2,");
        for (int i = 3; i <= n; i++) {
            int count = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) {
                System.out.print(i + ",");
            }
        }
    }
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            System.out.println("p value is:"+ p + ". isPrime :" + prime[p]);
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    System.out.println("i value is:"+ i);
                    prime[i] = false;
                }
            }
            System.out.println("=========================");
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }


    public static void main(String[] args) {
//        printPrimeNumbers(30);
        sieveOfEratosthenes(30).stream().map(x -> x + ",").forEach(System.out::print);
    }
}

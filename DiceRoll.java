import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter Number of dices: ");
        int n = Integer.parseInt(sc.nextLine());

        int distincts = getUniqueDiceValues(n);
        System.out.println(distincts);
    }

    private static int getUniqueDiceValues(int n) {
        int maxSum  = 6 * n;
        int distincts = 0;
        while(maxSum >= n){

            distincts++;
            maxSum--;
        }
        return distincts;
    }
}

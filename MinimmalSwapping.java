import java.util.Scanner;

public class MinimmalSwapping {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter string A: ");
        String A = sc.nextLine();
        System.out.print("Enter string B: ");
        String B = sc.nextLine();              //reads string
        System.out.println("A:" + A + ",B:" + B);

        int swappings = getminimalSwappings(A, B);
        System.out.println(swappings);
    }

    private static int getminimalSwappings(String a, String b) {
        char[] achars = a.toCharArray();
        int swappings = 0;

        for (int i = 0; i < b.length(); i++) {
            char curChar = b.charAt(i);
            int targetIndex = a.indexOf(curChar);
            System.out.println(" currentCharacter:" + curChar + ", targetIndex:" + targetIndex);
            while (i != targetIndex) {
                System.out.println("swapping " + achars[targetIndex] + " with " + achars[targetIndex - 1]);
                char temp = achars[targetIndex];
                achars[targetIndex] = achars[targetIndex - 1];
                achars[targetIndex - 1] = temp;
                swappings++;
                targetIndex--;
                System.out.println(achars);
            }
            a = new String(achars);
            System.out.print("After " + i + " iteration ");
            System.out.print(a);
            System.out.print(", B :" + b);
            System.out.println();
        }
        return swappings;
    }
}

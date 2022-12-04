import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctSums {

    // sum denotes the current sum
    // of the subset currindex denotes
    // the index we have reached in
    // the given array

    static void distSumRec(int arr[], int n, int sum,
                           int currindex, HashSet<Integer> s)
    {
        System.out.println(n+","+sum+","+currindex);
        if (currindex > n) {
            System.out.println("Inside currindex > n -> current Index:" + currindex);
            // 0 > 3 -> s = 0
            // 1 > 3 -> s = 1
            // 2 > 3 -> s = 2
            // 3 > 3 -> s = 5
            return;
        }

        if (currindex == n) {
            // 0 == 3 -> s = 0
            // 1 == 3 -> s = 1
            // 2 == 3 -> s = 3

            s.add(sum);
            System.out.println("Inside currindex == n ->  current Index:" + currindex + ",sum :" + sum + ", set: "+ s);
            return;                                             //  |
        }                                                       //  |
                                                                //  |
        distSumRec(arr, n, sum + arr[currindex],           //  |
                currindex + 1, s);
        System.out.println("After First recursion "+n+","+sum+","+currindex);//  |
        // 3, 0 + a[0] | 1 = 1, 0 + 1 = 1, []                   //  |
        // 3, 1 + a[1] | 2 = 3, 1 + 1 = 2, []                   //  |
        // 3, 2 + a[2] | 3 = 5, 2 + 1 = 3, []                   //  |
        distSumRec(arr, n, sum, currindex + 1, s); // <-----
        // 3, 3, 2, []
        System.out.println("After Second recursion "+n+","+sum+","+currindex);
    }

    // This function mainly calls
    // recursive function distSumRec()
    // to generate distinct sum subsets.
    // And finally prints the generated subsets.
    static void printDistSum(int arr[], int n)
    {
        HashSet<Integer> s = new HashSet<>();
        distSumRec(arr, n, 0, 0, s);
        int[] r = s.stream().mapToInt(x -> x).toArray();
        // Print the result
        for (int i : s)
            System.out.print(i + "|");
    }

    //Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3 };
        int n = arr.length;
        printDistSum(arr, n);
    }
}

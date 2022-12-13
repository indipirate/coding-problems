import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternateVowelandConsonantString {


    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();

            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);

            System.out.println(ans);
        }
    }

//    static class Solution {
//        public String rearrange(String S, int N) {
//
//        }
//    }
}

class Solution {
    public String rearrange(String S, int N) {
        return null;
    }
}
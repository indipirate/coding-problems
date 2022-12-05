public class PallindromeString {
    public static void main(String[] args) {
        String s = "blib";
        boolean isPallindrome = checkPallindrome(s);
        System.out.print("Is " + s + " a pallindrome? " + isPallindrome);
    }

    private static boolean checkPallindrome(String s) {
        char[] chars = s.toCharArray();
        int lastIndex = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[lastIndex - i];
            chars[lastIndex - i] = temp;
        }
        String reversed = new String(chars);
        return s.equals(reversed);
    }

}

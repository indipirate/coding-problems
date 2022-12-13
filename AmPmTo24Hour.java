import java.io.IOException;

public class AmPmTo24Hour {
    public static void main(String[] args) throws IOException {


        String result = Result.timeConversion("07:05:45PM");
    }
}

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int len = s.length();
        String amPm = s.substring(len - 2, len);
        String res = "";
        int hour = Integer.parseInt(s.substring(0, 2));
        if (hour == 12) hour = 0;
        if (amPm.equals("PM")) {
            hour += 12;
        }
        res = (hour < 10 ? "0" : "").concat(String.valueOf(hour).concat(s.substring(2, len - 2)));
        System.out.println(res);
        return res;

    }

}
import java.io.*;

public class Solution {

    public static String timeConversion(String s) {

        String[] time = s.substring(0, 8).split(":");

        String hour = time[0];
        String minute = time[1];
        String second = time[2];

        String period = s.substring(8, 10);

        int h = Integer.parseInt(hour);

        if (period.equals("AM")) {
            if (h == 12) {
                h = 0;
            }
        } else {
            if (h != 12) {
                h = h + 12;
            }
        }

        return String.format("%02d:%s:%s", h, minute, second);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}

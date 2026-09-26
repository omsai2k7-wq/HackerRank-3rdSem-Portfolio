import java.io.*;
import java.util.*;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] row = bufferedReader.readLine().trim().split(" ");

            List<Integer> currentRow = new ArrayList<>();

            for (String value : row) {
                currentRow.add(Integer.parseInt(value));
            }

            arr.add(currentRow);
        }

        int result = diagonalDifference(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}

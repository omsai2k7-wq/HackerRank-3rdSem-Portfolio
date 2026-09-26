import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> dynamicArray(
            int n,
            List<List<Integer>> queries) {

        List<List<Integer>> seqList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        List<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {

            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = (x ^ lastAnswer) % n;

            if (type == 1) {
                seqList.get(index).add(y);
            } 
            else if (type == 2) {

                List<Integer> sequence = seqList.get(index);

                int position = y % sequence.size();

                lastAnswer = sequence.get(position);

                answers.add(lastAnswer);
            }
        }

        return answers;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {

            String[] query =
                    bufferedReader.readLine()
                            .replaceAll("\\s+$", "")
                            .split(" ");

            List<Integer> currentQuery = new ArrayList<>();

            for (String value : query) {
                currentQuery.add(Integer.parseInt(value));
            }

            queries.add(currentQuery);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int value : result) {
            System.out.println(value);
        }

        bufferedReader.close();
    }
}

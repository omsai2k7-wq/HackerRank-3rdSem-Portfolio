import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> matchingStrings(
            List<String> stringList,
            List<String> queries) {

        Map<String, Integer> frequency = new HashMap<>();

        // Count the frequency of every string
        for (String str : stringList) {
            frequency.put(
                str,
                frequency.getOrDefault(str, 0) + 1
            );
        }

        List<Integer> result = new ArrayList<>();

        // Find the frequency of every query
        for (String query : queries) {
            result.add(
                frequency.getOrDefault(query, 0)
            );
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int stringListCount =
                Integer.parseInt(bufferedReader.readLine().trim());

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < stringListCount; i++) {
            stringList.add(
                bufferedReader.readLine().trim()
            );
        }

        int queriesCount =
                Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            queries.add(
                bufferedReader.readLine().trim()
            );
        }

        List<Integer> result =
                matchingStrings(stringList, queries);

        for (int value : result) {
            System.out.println(value);
        }

        bufferedReader.close();
    }
}

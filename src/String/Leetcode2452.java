package String;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2452 {
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> matches = new ArrayList<>();
        int maxCount = 2;
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            boolean matched = true;
            System.out.println(queries[i]);
            for (int j = 0; j < queries[i].length(); j++) {
                System.out.println(queries[i].charAt(j));
                if (queries[i].charAt(j) != dictionary[i].charAt(j)) {
                    if (maxCount == count) {
                        matched = false;
                        break;
                    }
                    count++;
                }
            }
            if (matched)
                matches.add(queries[i]);
        }
        return matches;
    }

    public static List<String> twoEditWordsFix(String[] queries, String[] dictionary) {

        List<String> matches = new ArrayList<>();
        for (String query : queries) {
            for (String dict : dictionary) {
                int count = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != dict.charAt(i)) {
                        count++;
                        if (count > 2) break;
                    }

                }
                if (count <= 2) {
                    matches.add(query);
                    break;
                }
            }
        }
        return matches;
    }

    static void main() {
        String[] queries = {"word", "note", "ants", "wood"};
        String[] dictionary = {"wood", "joke", "moat"};
        System.out.println(twoEditWordsFix(queries, dictionary));
    }
}

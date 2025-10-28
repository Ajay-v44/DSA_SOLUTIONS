package String;

import java.util.ArrayList;
import java.util.List;

public class WordCounting {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        for (String word : words) {
            if (word.contains(String.valueOf(x))) {
                lst.add(i);
            }
            i++;
        }
        return lst;
    }
}

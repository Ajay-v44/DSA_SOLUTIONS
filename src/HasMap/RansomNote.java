package HasMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int ransomNoteL = ransomNote.length();
        if (ransomNoteL == 0)
            return false;
        Map<Character, Integer> map = new HashMap<>() {
        };
        int magazineL = magazine.length();

//        add the character and their count
        for (int i = 0; i < magazineL; i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }
//        now check if the character is in magazine if not return false
        for (int i = 0; i < ransomNoteL; i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                int value = map.get(ransomNote.charAt(i));
                if (value == 1) {
                    map.remove(ransomNote.charAt(i));
                } else {
                    map.put(ransomNote.charAt(i), --value);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstructOpt(String ransomNote, String magazine) {
//        if empty we can contruct any thing
        if (ransomNote.isEmpty())
            return true;
        Map<Character, Integer> map = new HashMap<>() {
        };
        for (char c : magazine.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) return false;
            map.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
//        Leet code 383. Ransom Note
        System.out.println(canConstruct("aa", "aab"));
    }
}

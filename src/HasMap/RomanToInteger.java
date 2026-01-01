package HasMap;

import java.util.Map;

public class RomanToInteger {
    public static final Map<Character, Integer> hashMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int romanToInt(String s) {
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            int val = hashMap.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int val2 = hashMap.get(s.charAt(i + 1));
                if (val < val2) {
                    num += (val2 - val);
                    i += 2;
                    continue;
                }
            }
            num += val;
            i++;
        }
        return num;
    }

    static void main() {
        System.out.println(romanToInt("LVIII"));
    }
}

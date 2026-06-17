package String;

public class Leetcode3614 {
    public static char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } else if (ch == '*') {
                if (!sb.isEmpty())
                    sb.deleteCharAt(sb.length() - 1);
            } else if (ch == '#') {
                sb.append(sb);
            } else if (ch == '%') {
                sb.reverse();
            }
        }
        if (k < 0 || k >= sb.length()) {
            return '.';
        }
        return sb.charAt((int) k);
    }
    public char processStrOpt(String s, long k) {
        int n = s.length();
        long len = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '*')
                len = Math.max(len - 1, 0L);
            else if (c == '#')
                len *= 2;
            else if (c != '%')
                len++;
        }

        if (k >= len)
            return '.';

        for (int i = n - 1; ; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    len++;
                    break;
                case '#':
                    if (k >= len / 2)
                        k -= len / 2;
                    len /= 2;
                    break;
                case '%':
                    k = len - 1 - k;
                    break;
                default:
                    if (len == k + 1)
                        return c;
                    len--;
            }
        }
    }

    static void main() {

    }
}

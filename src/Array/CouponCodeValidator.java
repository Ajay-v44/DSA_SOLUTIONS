package Array;

import java.util.*;

public class CouponCodeValidator {
    public static boolean isValid(String input) {
        if (input == null || input.isEmpty()) return false;
        return input.matches("[A-Za-z0-9_]+");
    }

    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> validCoupons = new ArrayList<>();
        Set<String> businessLines = new HashSet<>(Set.of("electronics", "grocery", "pharmacy", "restaurant")
        );
        for (int i = 0; i < businessLine.length; i++) {
            if ( isActive[i] &&
                    isValid(code[i]) &&
                    businessLine[i] != null &&
                    businessLines.contains(businessLine[i].toLowerCase())) {
                validCoupons.add(code[i]);
            }
        }
        Collections.sort(validCoupons);
        return validCoupons;
    }

    static void main() {
        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
        String[] businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isActive = {true, true, true, true};
        System.out.println(validateCoupons(code, businessLine, isActive));
    }
}

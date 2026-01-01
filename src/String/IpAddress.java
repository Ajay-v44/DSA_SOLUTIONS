package String;

public class IpAddress {
    public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(char c:address.toCharArray())
            sb.append(c=='.'?"[.]":c);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}

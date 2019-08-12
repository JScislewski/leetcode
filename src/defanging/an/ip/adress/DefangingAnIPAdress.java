package defanging.an.ip.adress;

public class DefangingAnIPAdress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    private static String defangIPaddr(String address) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newString.append("[.]");
            } else newString.append(address.charAt(i));
        }
        return newString.toString();
    }
}

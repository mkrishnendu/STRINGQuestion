package STRING;

public class minmumindex {
    public static Boolean minindex(String s,String m) {
        String k = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < m.length(); j++) {
                if (s.charAt(i) == m.charAt(j)) {
                    k += s.charAt(i);
                    break;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="codeQuotient";
        String s="eat";
        System.out.println(minindex(str,s));
    }
}

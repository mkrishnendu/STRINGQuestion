package STRING;
import java.util.*;

public class uniquecharacterornot {

    public static boolean unique(String str) {
        //    approach:1
//char ch[]=str.toCharArray();
//Arrays.sort(ch);
//for(int i=0;i<str.length()-1;i++){
//    if(ch[i]==ch[i+1]){
//        return false;
//    }
//}
//return true;
//    approach:2

//    HashSet<Character> mp=new HashSet<>();
//    for(int i=0;i<str.length();i++){
//     mp.add(str.charAt(i));
//
//    }
//return mp.size()==str.length();
//    approach:3

        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < str.length()-1; i++) {
            if (ch[i] == ch[i + 1]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
String str="CodeQuotient";

        System.out.println(unique(str));
    }
}
//2
//CodeQuotient
//        Coding
//yes
//no
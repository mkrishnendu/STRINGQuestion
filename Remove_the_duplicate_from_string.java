package STRING;
import java.util.*;
public class Remove_the_duplicate_from_string {
    public static String Removeduplicate(String str) {
//        LinkedHashSet<Character>hs=new LinkedHashSet<>();
//        for(int i=0;i<str.length();i++){
//            hs.add(str.charAt(i));
//        }
//        String m="";
//        for(char e:hs){
//            m+=e;
//        }
//        return m;

//        LinkedHashSet<Character>hs=new LinkedHashSet<>();
//        for(int i=0;i<str.length();i++){
//            hs.add(str.charAt(i));
//        }
//        String m="";
//        for(char e:hs){
//            m+=e;
//        }
//        return m;
        LinkedHashSet<Character>hs=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));

        }
        String m="";
        for(char e:hs){
            m+=e;
        }
        return m;
    }
    public static void main(String[] args) {
String str="aabbccdef";
        System.out.println(Removeduplicate(str));

    }
}

//output:abcd

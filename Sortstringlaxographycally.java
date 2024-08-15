package STRING;
import java.util.*;
public class Sortstringlaxographycally {
    public static String laxographycally(String str){
//        String ch[]=str.split(" ");
//        Arrays.sort(ch);
//        String a="";
//
//
//        for(int i=0;i<ch.length-1;i++){
//            a=a+ch[i]+" ";
//        }
//        a=a+ch[ch.length-1];
//return a;

        String ch[]=str.split(" ");
        Arrays.sort(ch);
        String s="";
        for(int i=0;i<ch.length-1;i++){
            s+=ch[i]+" ";
        }
        s+=ch[ch.length-1];
        return s;
    }
    public static void main(String[] args) {
String str="code quotient loves coders";
        System.out.println(laxographycally(str));
    }
}

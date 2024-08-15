package STRING;
import java.util.*;
public class ExpandString {
    public static String abc(int a,char ch){
        String s="";
        for(int i=0;i<a;i++)
            s=s+ch;
        return s;
    }
    public static String Expand(String str){
        String s="";
        int a=0;
for(int i=0;i<str.length();i++){
    if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        a=str.charAt(i)-'0';
       s=s+ abc(a,str.charAt(i-1));
    }


}
return s;


    }
    public static void main(String[] args) {
String str="g2k2gd3g4";
        System.out.println(Expand(str));

    }
}

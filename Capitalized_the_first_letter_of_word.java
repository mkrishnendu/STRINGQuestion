package STRING;
import java.util.*;
public class Capitalized_the_first_letter_of_word {
    public static String firstlettercapital(String str){
//        StringBuilder ss=new StringBuilder();
//        ss.append(Character.toUpperCase(str.charAt(0)));
//        for(int i=1;i<str.length()-1;i++){
//            if(str.charAt(i-1)==' ' ){
//                ss.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else{
//                ss.append(str.charAt(i));
//            }
//
//        }
//        return ss.toString();



//        String s="";
//        s+=Character.toUpperCase(str.charAt(0));
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i-1)==' '){
//                s+=Character.toUpperCase(str.charAt(i));
//            }else{
//                s+=str.charAt(i);
//            }
//        }
//        return s;


//        String s="";
//        s+=Character.toUpperCase(str.charAt(0));
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i-1)==' '){
//                s+=Character.toUpperCase(str.charAt(i));
//            }else{
//                s+=str.charAt(i);
//            }
//        }
//        return s.trim();
        String m="";
        m+=Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                m+=Character.toUpperCase(str.charAt(i));
            }else{
                m+=str.charAt(i);
            }
        }
        return m.trim();
    }
    public static void main(String[] args) {
String s="ihgg                    a   krishnenu               ";
        System.out.println(firstlettercapital(s));
    }
}

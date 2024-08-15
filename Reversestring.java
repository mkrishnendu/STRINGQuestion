package STRING;
import java.util.*;
public class Reversestring {
    public static String reverse(String str){
//approach:1
//        StringBuilder mtr=new StringBuilder(str);
//        mtr.reverse();
//        return mtr.toString().trim();


//        approach:2
//        char ch[]=str.toCharArray();
//        int i=0;
//        int j=str.length()-1;
//        while(i<j){
//            char temp=ch[i];
//            ch[i]=ch[j];
//            ch[j]=temp;
//            i++;
//            j--;
//
//        }
//        return new String(ch).trim();

//        approach:3
//String s="";
//for(int i=str.length()-1;i>=0;i--){
//    s+=str.charAt(i);
//}
//return s.trim();

//        approach:4

//        Stack<Character>st1=new Stack<>();
//        for(int i=0;i<str.length();i++){
//            st1.push(str.charAt(i));
//        }
//        Stack<Character>st2=new Stack<>();
//        while(!st1.isEmpty()){
//            st2.push(st1.pop());
//        }
//        return st2.toString();

//        char ch[]=str.toCharArray();
//        int i=0;
//        int j=str.length()-1;
//        while(i<j){
//            char temp=ch[i];
//            ch[i]=ch[j];
//            ch[j]=temp;
//            i++;
//            j--;
//        }
//        return new String(ch).trim();

//        String mtr="";
//        for(int i=str.length()-1;i>=0;i--){
//            mtr+=str.charAt(i);
//        }
//        return mtr.trim();

        char ch[]=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch).trim();
    }
    public static void main(String[] args) {
        String str="chitkara        ";
        System.out.println(reverse(str));
    }
}

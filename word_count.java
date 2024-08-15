package STRING;
import java.util.*;
public class word_count {
    public static void wordcount(String str){
        int count=0;
        String s[]=str.split(" ");


        System.out.println(s.length);
    }
    public static void main(String[] args) {
        String str="i am a student";
        wordcount(str);
    }
}

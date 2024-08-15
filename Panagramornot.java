package STRING;

import java.util.*;

public class Panagramornot {
    public static boolean panagram(String str){
//HashSet<Character>hs=new HashSet<>();
//for(char e:str.toCharArray()){
//    if(e!=' '){//character only push
//        hs.add(e);
//    }
//
//}
//return hs.size()==26;

//        HashSet<Character>hs=new HashSet<>();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!=' '){
//                hs.add(str.charAt(i));
//            }
//        }
//        return  hs.size()==26;
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                hs.add(str.charAt(i));
            }
        }
        return hs.size()==26;
    }
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog";
        System.out.println(panagram(s));
    }

}

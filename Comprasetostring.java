package STRING;

import java.util.HashMap;
import java.util.*;
public class Comprasetostring {

    public static String compress(String str) {


//        approach:1
//        String mtr="";
//        int count=1;
//        for(int i=0;i<str.length()-1;i++){
//            if(str.charAt(i)==str.charAt(i+1)){
//                count++;
//            }
//            else{
//               if(count>1) {
//                   mtr = mtr + str.charAt(i) + count;
//               }
//               else{
//                   mtr = mtr + str.charAt(i);
//
//               }
//                count = 1;
//            }
//        }
//        if(count>1)
//        mtr = mtr + str.charAt(str.length()-1) + count;
//        else mtr = mtr + str.charAt(str.length()-1);
//        return mtr;
//        approach:2

//        String ans=" "+str.charAt(0);
//        int count=1;
//        for(int i=1;i<str.length();i++){
//            char curr=str.charAt(i);
//            char prev=str.charAt(i-1);
//            if(curr==prev){
//                count++;
//            }else{
//                if(count>1)ans+=count;
//                count=1;
//                ans+=curr;
//            }
//        }
//        if(count>1)ans+=count;//prev not found
//        return ans;

//        String ans=""+str.charAt(0);
//        int count=1;
//        for(int i=1;i<str.length();i++){
//            char curr=str.charAt(i);
//            char prev=str.charAt(i-1);
//            if(curr==prev){
//                count++;
//            }else{
//                if(count>1)ans+=count;
//                count=1;
//                ans+=curr;
//            }
//
//        }
//        if(count>1)ans+=count;
//        return ans;

String ans="";
ans+=str.charAt(0);
int count=1;
for(int i=1;i<str.length();i++){
    char curr=str.charAt(i);
    char prev=str.charAt(i-1);
    if(curr==prev){
        count++;
    }else{
        if(count>1)ans+=count;
        count=1;
        ans+=curr;
    }
}
if(count>1)ans+=count;
return ans;


    }

    public static void main(String[] args) {
String str="ggkkgdddgggg";
        System.out.println(compress(str));
    }
}

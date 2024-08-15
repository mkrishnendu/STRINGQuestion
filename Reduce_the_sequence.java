package STRING;

public class Reduce_the_sequence {
    public static String Reduce(String str,char ch) {
//int count=0;
//String s="";
//for(int i=0;i<str.length();i++){
//    if(str.charAt(i)==ch && count==0){
//        s+=str.charAt(i);
//        count++;
//    }else if(str.charAt(i)!=ch){
//        s+=str.charAt(i);
//        count=0;
//    }
//}
//return s;


//        int count=0;
//        String s="";
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch && count==0){
//                s+=str.charAt(i);
//                count++;
//
//            }else if(str.charAt(i)!=ch){
//                s+=str.charAt(i);
//                count=0;
//            }
//        }
//        return s;

        int count=0;
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch && count==0){
                s+=str.charAt(i);
                count++;
            }else{
                if(str.charAt(i)!=ch){
                    s+=str.charAt(i);
                    count=0;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
String str="aabbcdeaaaaaabd";
char ch='a';
        System.out.println(Reduce(str,ch));

    }
}
//output:abbcdeabd
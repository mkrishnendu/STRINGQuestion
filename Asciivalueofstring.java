package STRING;

public class Asciivalueofstring {
    public static String Asciivalue (String str){



//        String gtr="";
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                gtr+=' ';
//            }else{
//                int a=str.charAt(i);
//                gtr+=a;
//            }
//        }
//        return gtr;
        String mtr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                mtr+=' ';
            }
            else{
                int m=str.charAt(i);
                mtr+=m;
            }
        }
        return mtr;

    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(Asciivalue(str));
    }

}

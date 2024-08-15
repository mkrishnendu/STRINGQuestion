package STRING;

public class NextCharacter {
    public static void NextCharacter(String str){

//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int asci=(int)ch+1;
//
//            char dh=(char)asci;
//            System.out.print(dh);
//
//        }
String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int n=(int)ch+1;
            char dh=(char)n;

            if(ch==' '){
                s+=' ';
            }else{
                s+=dh;
            }
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        String str="abcd abc";
        NextCharacter(str);
    }
}

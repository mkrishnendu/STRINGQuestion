package STRING;

public class Jumblestring {
    public static String jumblestring(String str,String gtr){

//int n=str.length();
//int m=gtr.length();
//       String mtr="";
//    if(n<m){
//        for(int i=0;i<n;i++){
//            mtr=mtr+str.charAt(i)+gtr.charAt(i);
//        }
//        for(int i=n;i<m;i++){
//            mtr=mtr+gtr.charAt(i);
//        }
//    }else{
//        for(int i=0;i<m;i++){
//            mtr=mtr+gtr.charAt(i)+str.charAt(i);
//        }
//        for(int i=m;i<n;i++){
//            mtr=mtr+str.charAt(i);
//        }
//    }
//    return mtr;
int n=str.length();
int m=gtr.length();
String mtr="";
if(n<m) {
    for (int i = 0; i < n; i++) {
        mtr = mtr+str.charAt(i) + gtr.charAt(i);
    }
    for (int i = n;i<m;i++){
        mtr=mtr+gtr.charAt(i);
    }
}  else{
    for(int i=0;i<m;i++){
        mtr+=gtr.charAt(i)+str.charAt(i);
    }
    for(int i=m;i<n;i++){
        mtr+=str.charAt(i);
    }
}
return mtr;
    }
    public static void main(String[] args) {
String str="abc";
String gtr="stuvwx";
        System.out.println(jumblestring(str,gtr));

    }
}

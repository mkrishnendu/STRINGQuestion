package STRING;

public class Stringendornot {

    public static boolean ending(String str,String gtr){
//        approach:1
//        int n=str.length();
//        int m=gtr.length();
//        if(m<n)return false;
//        if(str.substring(n-m,n).equals(gtr)){
//            return true;
//        }
//        return false;

//        approach:2
//        int k=n-m+1;
//        for(int i=0;i<m;i++){
//            if(str.charAt(k+i)!=gtr.charAt(i)){
//                return false;
//            }
//        }
//return true;

//        int n=str.length();
//        int m=gtr.length();
//        if(m<n)return false;
//        if(str.substring(n-m,n).equals(gtr)){
//            return true;
//        }
//        return false;
        int n=str.length();
        int m=gtr.length();
        if(str.substring(n-m).equals(gtr)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
String str="CodeQuotient ent";
//String gtr="Coding Code";
            System.out.println(ending(str,str));
    }
}

package STRING;

public class Count_palindrom_word {

    public static boolean palindrom(String gtr){
//        int n=gtr.length();
//        int i=0;
//        int j=gtr.length()-1;
//        while(i<j) {
//            if(gtr.charAt(i)!=gtr.charAt(j)) {
//                return false;
//            }
//               i++;
//               j--;
//
//
//            }
//
//        return true;

//        int n=gtr.length();
//        int i=0;
//        int j=gtr.length()-1;
//        while(i<j){
//            if(gtr.charAt(i)!=gtr.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//return true;

        int n=gtr.length();
        int i=0;
        int j=gtr.length()-1;
        while(i<j){
            if(gtr.charAt(i)!=gtr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int countpalindrom(String str){
//        int count=0;
//        String s[]=str.split(" ");
//        for(String word :s){
//            if(palindrom(word)){
//                count++;
//            }
//        }
//        return count;

//        int count=0;
//        String s[]=str.split(" ");
//        for(String word:s){
//            if(palindrom(word)==true){
//                count++;
//            }
//        }
//        return count;

        int count=0;
        String s[]=str.split(" ");
        for(String e:s){
            if(palindrom(e)==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="mom and dad     ";
        System.out.println(countpalindrom(str));
    }
}

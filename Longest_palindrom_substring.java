package STRING;

public class Longest_palindrom_substring {

    public static boolean isplaindrom(String s,int i,int j){
        i=0;
        j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
    public static String palindrom(String str){
        int max=0,start=0,end=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isplaindrom(str,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }

                }
            }
        }
        return str.substring(start,end+1);
    }

    public static void main(String[] args) {
String str="abc";
        System.out.println(palindrom(str));






    }
}

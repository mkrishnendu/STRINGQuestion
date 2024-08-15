package STRING;

public class how_many_word_push_tomake_plaindrom {
    public static int palindrom(String str){
        int count=0;
int i=0;
int j=str.length()-1;
while(i<j){
    if(str.charAt(i)!=str.charAt(j)){
        count++;
        i++;
    }else{
        i++;
        j--;
    }
}
return count;
    }
    public static void main(String[] args) {
String str="abcda";
        System.out.println(palindrom(str));
    }
}

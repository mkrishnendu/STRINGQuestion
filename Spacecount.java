package STRING;

public class Spacecount {
    public static void spacecont(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str=" krishnendu   is  nice guy  ";
        spacecont(str);
    }
}

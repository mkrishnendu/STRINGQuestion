package STRING;

public class swap_first_last_character_of_string {


    public static String swapfirstlast(String str) {
//        StringBuilder ss=new StringBuilder();
//        String arr[]=str.split(" ");
//        for(int i=0;i<arr.length;i++){
//            String word=arr[i];
//            word=word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(0);
//            ss.append(word).append(" ");
//
//
//        }
//        return ss.toString().trim();
        StringBuilder sb=new StringBuilder();
        String s[]=str.split(" ");
        for(String word:s){
            word=word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(0);
            sb.append(word).append(" ");
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) {
        String word="Give me service";
//        eivG em eervics

        System.out.println(swapfirstlast(word));
    }
}

package STRING;

public class Reverse_Each_word {
    public static String Eachwordreverse(String str){
//String s[]=str.split(" ");
//StringBuilder reverse=new StringBuilder();
//for(String word:s){
//    StringBuilder reverseword=new StringBuilder(word);
//    reverseword.reverse();
//    reverse.append(reverseword).append(" ");



//}
//return reverse.toString().trim();

        String s[]=str.split(" ");
        StringBuilder sb1=new StringBuilder();
        for(String word:s){
            StringBuilder sb2=new StringBuilder(word);
            sb2.reverse();
            sb1.append(sb2).append(" ");
        }
        return sb1.toString().trim();


    }
    public static void main(String[] args) {
        String gtr="Krishnendu maji got job";
        System.out.println(Eachwordreverse(gtr));
    }
}

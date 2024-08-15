package STRING;

public class Keywordcount {
    public static int Keywordcount(String str,String mtr){
        int count=0;
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++){
    String word=arr[i].toString();
    if(word.equals(mtr)){
        count++;
    }

}
return count;
//        return arr.length;

    }
    public static void main(String[] args) {
        String word="abcd abc Xyz abc abc qbx";
        String gtr="abc";
        System.out.println(Keywordcount(word,gtr));
    }
}

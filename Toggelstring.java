package STRING;
import java.util.*;
//a->65;
//A->97;
//0->48

public class Toggelstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       StringBuilder sb=new StringBuilder(sc.nextLine());
//        System.out.println(sb);
        for(int i=0;i<sb.length();i++){

            boolean flag=true;
            char ch=sb.charAt(i);
            if(ch==' ')continue;//space check
            int asci=(int)ch;
            if(asci>=97)flag=false;//small;
            if(flag==true){//capital
                asci+=32;
                char dh=(char)asci;//small
                sb.setCharAt(i,dh);

            }else{//small
                asci-=32;
                char dh=(char)asci;
                sb.setCharAt(i,dh);

            }
        }
        System.out.println(sb);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String string;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        String result="";
        int length=2147483647;
        String s="";

        for (String each : words) {

            if(each.length()<length){
                length=each.length();
               result=each;}
              }
            for (String a : words) {
                if(a.length()==result.length()){
                    s+=a+" ";
                }
        }
        String []longWords= s.split(" ");
        System.out.println(Arrays.toString(longWords));
        }

    }



/*
 String[] words = str.split(", ");

         String result="";
         int length=0;

        for (int i = 0; i < words.length; i++) {
            length=words[0].length();

            if(words[i].length()<length){
              length=words[i].length();
            }}
        for (int i = 0; i < words.length; i++) {
           if(words[i].length()==length){
               result+=words[i]+" ";

           }
        }
   String []shortWords= result.split(" ");
        System.out.println(Arrays.toString(shortWords));



 */






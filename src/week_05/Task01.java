package week_05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a new String");
        String str=scanner.nextLine();

        //check if the given string is less than 4 characters
        //System.out.println(str.length());---how many char
        if(str.length()>4){
            System.out.println(false);
        } else if (str.substring(0,4).equals("good")) {
            System.out.println("true");

        } else if (str.substring(1,5).equals("good")) {
            System.out.println("true");
        }else {
            System.out.println("The word is not valid");
        }
    }
}

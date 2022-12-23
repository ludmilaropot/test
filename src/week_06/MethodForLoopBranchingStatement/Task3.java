package week_06.MethodForLoopBranchingStatement;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(trimSpacesOfString("   Java    is a lovely            coding            language"));
    }

    public static String trimSpacesOfString (String str){
        String result="";   // result is a container that holds output of my code logic
        // logic part
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if(c ==' '){
                continue;  // if char is empty do NOT go below this line
            }
            result += c ;
        }
        return result;
    }
}
/*
 Task 3 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

    			 Input: "  Hello "
        	     Output: Hello



 */
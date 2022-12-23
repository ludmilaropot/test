package week_06.MethodForLoopBranchingStatement;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(in1020(12,35));

        // call the method inside Task08 class


        System.out.println(Task08.firstIndexOfWord("I am calling method inside another class", "method"));
    }

    public static boolean in1020(int n1, int n2){
        boolean result = false;
        // logic  for either of one
        if( ( 10 <= n1 && n1 <= 20) || ( 10 <= n2 && n2 <= 20) ){
            result = true;
        }

        return result;
    }
}
/*
 Task 6: Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
 */
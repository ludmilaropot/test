package week_06.MethodForLoopBranchingStatement;

public class Task08 {
    public static void main(String[] args) {

        System.out.println(firstIndexOfWord("Python compared to Java is Easier","java"));
        System.out.println(firstIndexOfWord("Python compared to Java is Easier","c#"));

    }

    public static int firstIndexOfWord(String sentence, String word){
        int result = -1;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        // logic of code
        if(sentence.contains(word)){
            result = sentence.indexOf(word);
        }

        return result;
    }
}
/*
  Task 8: Write a method that get one sentence and word which is wanted to find as string and returns the index of first character of searched word which is found firstly if it is exist if not return -1.

   input:
       String sentence="Java is a java";
       String searched="java";

       // use contains to find out if sentence contains the word
       // if it is contained use indexOf method to find ---> index of first character

       method signature:  parameter or parameters (2 strings)  --- return type integer

   output: 0
 */
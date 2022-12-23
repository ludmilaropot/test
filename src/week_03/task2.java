package week_03;

public class task2 {
    public static void main(String[] args) {

        System.out.println("25/10 = " + 25/10);//2   ===remaining
        System.out.println("25%10 = " + 25%10);//5 -digit   =======49%10=9
        int number =565;//5=houndreds  6=tens  5=ones
        int digit1s, digit10s, didits100s;
        int remainingNumber;
        remainingNumber=number/10;
        digit1s=number%10;
        System.out.println("digit1s = " + digit1s);//5
        System.out.println("remainingNumber = " + remainingNumber);//56

        digit10s=number%100;
        remainingNumber=remainingNumber/10;//   remainingNumber/=10;
        System.out.println("digit10s = " + digit10s);//6
        System.out.println("remainingNumber = " + remainingNumber);//5
        didits100s=remainingNumber%10;//5
        System.out.println("didits100s = " + didits100s);//5
        int sum=digit1s+digit10s+didits100s;
        System.out.println("sum = " + sum);





    }
}
  /*
        Task 2:
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
An integer is a number that can be written without a fractional component. For example, 23, 6, 0, and −1245 are integers.
Input Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
         */

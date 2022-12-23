package week_03;

public class Task4 {
    public static void main(String[] args) {
       /*
    Task 4:
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Input and Output
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
a , b , c  ----- is c = a + b ;  is a = b + c ; is b = a+ c  : if any of these conditions is true then our result should be true , otherwise false
     */

        int a,b,c;
        a=5;
        b=10;
        c=15;

        boolean isCequalAplusB=(c==(a+b));
        boolean isAequalBplusC=(a==(b+c));
        boolean isBequalAplusC=(b==(a+c));
        System.out.println("isAequalBplusC = " + isAequalBplusC);
        System.out.println("isBequalAplusC = " + isBequalAplusC);
        System.out.println("isCequalAplusB = " + isCequalAplusB);







    }
}

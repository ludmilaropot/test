package week_05;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {


    Scanner input = new Scanner (System.in);

    int x=1;
    String list = "Shopping List: \n";
    double total =0.0;
    String answer="yes";
do{
        System.out.println("Enter the name of item"+x);
        String name = input.next();

        System.out.println("Enter the price of the "+name);
        double price = input.nextDouble();

        System.out.println("How many "+ name+" will you buy?");
        int count = input.nextInt();



        total+= price*count;
        list +=name + " x " + count+ " - $" + (price*count)+ "\n";

        System.out.println("Do you want to add more items to the shopping list?");
        answer = input.next().toLowerCase();
        x++;


    }while (answer.equals("yes"));



            System.out.println(list + "Total cost: $" + total);
}
}
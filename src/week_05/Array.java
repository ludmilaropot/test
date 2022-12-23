package week_05;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
      /*
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int itemN=1;
        String list = "Shopping List: \n";
        double totalAmount =0;

        System.out.println("Enter the name of item"+itemN);
        String item = input.nextLine();
        System.out.println("Enter the price of the "+item);
        double itemPrice = input.nextDouble();
        System.out.println("How many "+ item+" will you buy?");
        double itemAmount = input.nextDouble();
        System.out.println("Do you want to add more items to the shopping list?");
        String yesNo = input.next();

        totalAmount += itemPrice*itemAmount;
        list += item + " x " + itemAmount + " - $" + (itemPrice*itemAmount)+ "\n";

       while (yesNo.equals("yes")||yesNo.equals("YES")){

           System.out.println("Enter the name of item"+ ++itemN);
           input.next();
           item = input.nextLine();
           System.out.println ("Enter the price of the "+item);
           itemPrice = input.nextDouble();
           System.out.println("How many "+ item +" will you buy?");
           itemAmount = input.nextDouble();

           totalAmount += itemPrice*itemAmount;
           list += item + " x " + itemAmount + " - $" + (itemPrice*itemAmount)+ "\n";

           System.out.println("Do you want to add more items to the shopping list?");
           yesNo = input.next();

       }

            if(yesNo.equals("No")||yesNo.equals("no")){
                System.out.println(list + "Total cost: $" + totalAmount);
            }

    }
}
       */
       /* String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = scan.nextLine();
        }
        String[] reverse=new String[5];
        for (int i = arr.length - 1,j=0; i >= 0; i--) {
            reverse[j++]= arr[i];
        }
       System.out.println(Arrays.toString(reverse));*/
        /*int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        nums=Arrays.copyOf(nums,nums.length+3);


        System.out.print(Arrays.toString(nums));*/
        /*
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String each : words) {
            String firstAndLast=each.charAt(0)+""+each.charAt(each.length()-1);
            System.out.println(firstAndLast);
        }*/
/*
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }


            System.out.println(nums[1]);
            System.out.println(nums[nums.length-2]);*/
       /* int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int max=0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>max){
                max=nums[i];
            }

        }
        System.out.println(max);*/

       /* String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]+", "+arr[i+1]);
        }*/

      /*  String sentence = input.nextLine();

       String [] word=sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }*/
      /*  int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

       int result=0;

        for (int n : nums) {
        int nonDup=0;

        for (int each :nums) {
            if(each==n){
                nonDup++;
            }
        }
        if(nonDup==1){
            System.out.println(n);
        }
        }*/
        Scanner sacan = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

       /* String[]word=sentence.split(" ");

        String[] reverse = new String[word.length];
        String w=" ";


        for (int i = word.length - 1,j=0; i >= 0; i--) {
            reverse[j]=word[i];

            w+=reverse[j]+" ";

        }
        System.out.println(w.trim());*/


    }
    }


package week_05;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        float max=0 ;
        float min=score[0];
        float sc=score[0];
        for (int i = 1; i <score.length ; i++) {
         if(score[i]>max){
                max=score[i];
           }
         if(score[i]<min){
             min=score[i];
         }



        }
     System.out.println(max);
        System.out.println(min);
        }
        }


/*int max=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]>max){
        max=nums[i];
      }



 Scanner input = new Scanner(System.in);
    float[] score = new float[7];
    //WRITE YOUR CODE HERE

    int n = 1;
    for(int i = 0; i <= 7;  i++){
      if(n <= 7){
      System.out.println("Enter score for judge "+ n++ + ":");
      score[i] = input.nextInt();
      }
    }

    double max = score[0];
    double min = score[0];
    double scoreTotalSum = 0.0;
    double sum5Scores = 0.0;

    for(int i= 0; i < score.length; i++){

      if(score[i] > max){
         max = score[i];
        }
      if(score[i] < min){
         min = score[i];
        }
      scoreTotalSum += score[i];
    }

    System.out.println("Enter the difficulty rating:");
      double rating = input.nextDouble();

    sum5Scores = (scoreTotalSum - (min + max)) *rating;

     System.out.println("Final Score: " + (sum5Scores * 0.6));
  }
}





public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        double count = 0;
        double finalScore=0;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = input.nextInt();
            }
        Arrays.sort(score);
        for (int j = 1; j <= score.length-2; j++) {
            count+=score[j];
        }

        System.out.println("Difficulty of rating:");
        double rateOfDif =  input.nextDouble();
        if(rateOfDif>=1.2  && rateOfDif<= 3.8){
           finalScore = count* rateOfDif*0.6;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Final score: "+ df.format(finalScore));


    }}
 */
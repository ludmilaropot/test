package week_05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class d {
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


    }
}

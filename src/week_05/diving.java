package week_05;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        for (int i = 0, n = 1; i < score.length; i++, n++) {

            System.out.println("Enter score for judge " + n + ":");
            score[i] = input.nextFloat();
        }
        double count = 0;
        double finalScore=0;

        Arrays.sort(score);
        for (int j = 1; j <= score.length-2; j++) {
            count+=score[j];
        }

        System.out.println("Enter the difficulty of rating:");
        double rateOfDif =  input.nextDouble();
        if(rateOfDif>=1.2  && rateOfDif<= 3.8){
            finalScore = count* rateOfDif*0.6;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Final score: "+ df.format(finalScore));








    }

}



/*
 Create a program for the diving contest to determine the diver's score based on multiple factors. There will be a total of seven judge scores. From the scores the highest and lowest will be discarded and the remaining `five will be added together`. That sum will then be multiplied by a difficulty rating ranging from `1.2` to `3.8`. In the end the final score will be determined by multiplying the value by `0.6`

#### Create the program with this flow:
> - Ask for the seven judges' scores using the following message and store the scores into an `int []`
    - `Enter score for judge 1:`
    - `Enter score for judge 2:`
    - etc for all seven judges
> - Ask for the difficulty rating. `Range of 1.2 - 3.8`
    - `Enter the difficulty rating:`
> - Finish the calculation by multiply the value by `0.6` and print the total score:
    - `Final Score: $score
 */



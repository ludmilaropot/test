package week_03;

public class BodyMassIndex {
    public static void main(String[] args) {
        
        double BMI,weight, height;
        weight=92;
        height=1.70;
        BMI=weight/ (height*height);//presedence of operators
        System.out.println("BMI = " + BMI);
    }
}
/*
    // Write a Java program to compute body mass index (BMI).
        // BMI = weight / height*height (kg/m2)  less than 25: healthy
 */
package project.com;

import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char response;
        do {
            System.out.println("Input your height in cm:");
            double height = sc.nextDouble();
            System.out.println("Input your weight in kg:");
            double weight = sc.nextDouble();
            //Calculating BMI
            double h = height * 0.01;
            double bmi = weight / (h * h);
            System.out.println("Your BMI is:" + bmi);

            //to determine weather the weight is healthy or not

            if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Normal weight");
            } else if (bmi < 16) {
                System.out.println(" Severely Underweight");
            } else if (bmi >= 16 && bmi <= 18.4) {
                System.out.println("Underweight");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Overweight");
            } else if (bmi >= 30 && bmi <= 34.9) {
                System.out.println("Moderately Obese");
            } else if (bmi >= 35 && bmi <= 39.9) {
                System.out.println("Severely Obese");
            } else {
                System.out.println("Morbidly Obese");
            }
            sc.nextLine();
            System.out.println("Do you want to continue? Y or N");
            response = sc.nextLine().charAt(0);
        } while (Character.toLowerCase(response) == 'y');
        System.out.println("Thank you stay healthy");


    }
}
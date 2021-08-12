/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;
/**
 *
 * @author Realg
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        scholarshipAcceptance();
        dayConverter();
        score();
        pi();
        
        Scanner scanner = new Scanner(System.in);
        
        //input of the seconds for subjects
        int math = scanner.nextInt();
        int history = scanner.nextInt();
        int geometry = scanner.nextInt();
        
        // calculate total seconds
        int total = math + history + geometry;
        
        //convert seconds into minutes and seconds
        int minutes = total / 60;
        int seconds = total - (minutes * 60);
        
        //output of the minutes and seconds
        System.out.println("Total time to complete subject: ");
        System.out.print(minutes + " minutes" + "\n" + seconds + " seconds");
    }
    public static void score(){
        Scanner scanner = new Scanner(System.in);
        
        //input of the scores
        int initScore = scanner.nextInt();
        int scoreTom = initScore;
        int scoreBob = initScore;
        
        //output of the scores
        System.out.println("Round 1 results:");
        System.out.println(++scoreTom);
        System.out.println(--scoreBob);
    }
    public static void pi(){
        Scanner scanner = new Scanner(System.in);
        
        //input of the value
        double pi = 3.14;
        double piInput = scanner.nextInt();
        
        //calculate the perimeter of a circle
        double piTotal = 2 * pi * piInput;
        
        //output of the perimeter of a circle
        System.out.println(piTotal);
    }
    public static void dayConverter(){
        Scanner scanner = new Scanner(System.in);
        
        //input the days
        int days = scanner.nextInt();
        
        
        //calculate the days into seconds
        int seconds = 60 * 60 * 24 * days;
        
        //output the seconds in the days
        System.out.println(seconds);
    }
    public static void scholarshipAcceptance(){
        Scanner scanner = new Scanner(System.in);
        
        //input grade point average
        double gradeAverage = scanner.nextDouble();
        
        //+
        if (gradeAverage > 3.5)
        {
           System.out.println("Congratulations");
        }
        else
        {
            System.out.println("Sorry");
        }
    }
}

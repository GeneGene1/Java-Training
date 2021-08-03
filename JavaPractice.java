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
        
        score();
        
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
}

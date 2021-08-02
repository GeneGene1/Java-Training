/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;
/**
 *
 * @author Realg
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int math = scanner.nextInt();
        int history = scanner.nextInt();
        int geometry = scanner.nextInt();
        
        int total = math + history + geometry;
        
        int minutes = total / 60;
        int seconds = total - (minutes * 60);
        
        System.out.print(minutes + "\n" + seconds);
//        System.out.println(seconds);
    }
}

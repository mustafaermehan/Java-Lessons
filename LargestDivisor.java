
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Main {
    
    public static int largestCommonDiv(int sayi1, int sayi2) {
        
        int div = 1;
        
        for(int i = 1 ; i <= sayi1 && i <= sayi2 ; i++){
            
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                
                div = i;
                
            } 
        }
        return div;  
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number : ");
        int first = scanner.nextInt();
        
        System.out.println("Second number : ");
        int second = scanner.nextInt();
        System.out.println("Largest common divisor : " + largestCommonDiv(first, second));
    }
    
}

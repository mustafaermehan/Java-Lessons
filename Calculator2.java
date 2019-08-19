
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
    
    public static int extraction(int a, int b) {
        
        return ( a - b );
        
    }
    public static double division(int a, int b) {
        
        return( (double)a / b );
        
    }
    public static int multiplication(int a, int b) {
        
        return ( a * b );
    }
    public static int multiplication(int a, int b, int c) {
        
        return ( a * b * c);
        
    }
    public static int addition(int a, int b) {
        
        return ( a + b );
        
    }
    public static int addition(int a, int b, int c) {
        
        return ( a + b + c);
        
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String operations = "1. Addition\n"
                            + "2. Extraction\n"
                            + "3. Multiplication\n"
                            + "4. Division"
                            + "enter the q for exit";
        
        System.out.println("**************************************");
        System.out.println(operations);
        System.out.println("**************************************");
        
        while (true) {
            
            System.out.println("Select operation");
            
            String operation = scanner.nextLine();
            
            if(operation.equals("q")){
                
                System.out.println("Quit programme");
                break;
            }
            if(operation.equals("1")){
                
                System.out.println("How many addition of value ? (2 or 3)");
                int manyNumber = scanner.nextInt();
                
                if(manyNumber == 2){
                    
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sum of numbers : "+ addition(a, b));
                    
                }
                else if (manyNumber == 3){
                    
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    System.out.println("c : ");
                    int  c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sum of numbers : "+ addition(a, b, c));
                    
                }
                else{
                    System.out.println("Wrong number");
                }
            }
            else if (operation.equals("2")){
                
                
                
                System.out.println("a : ");
                int a = scanner.nextInt();
                System.out.println("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Extraction of numbers :"+ extraction(a, b));
            }
            else if (operation.equals("3")){
                
                System.out.println("How many multiplication of value ? (2 or 3)");
                int manyNumber = scanner.nextInt();
                
                if(manyNumber == 2){
                
                  System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Multiplication of numbers : "+ multiplication(a, b));
                    
                }
                else if (manyNumber == 3){
                    
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    System.out.println("c : ");
                    int  c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Multiplication of numbers : "+ multiplication(a, b, c));
                    
                }
                else{
                    System.out.println("Wrong number");
                }
                
                
            }
            else if(operation.equals("4")) {
                
                System.out.println("a : ");
                int a = scanner.nextInt();
                System.out.println("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Division of values :"+ division(a, b) );    
            }   
            else{
                System.out.println("invalid operation...");
            }
        }
    }
}


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
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Welcome to training program... ");
            
           String trainings = "Valid tarinings...\n"
                              +"Burpee\n"
                              +"Pushup\n"
                              +"Situp\n"
                              +"Squat";
           
           System.out.println(trainings);
           
           System.out.println("Create a training...");
           
           System.out.println("Burpee number : ");
           int burpee = scanner.nextInt();
           
           System.out.println("Pushup number : ");
           int pushup = scanner.nextInt();
           
           System.out.println("Situp number : ");
           int situp = scanner.nextInt();
           
           System.out.println("Squat number : ");
           int squat = scanner.nextInt();
           
           scanner.nextLine();
           
           Training training = new Training(burpee, pushup, situp, squat);
           
           System.out.println("Training begins");
           
           while (training.TrainingEnd() == false ){
               
               System.out.println("Move type (Burpee, Pushup, Situp, Squat) :");
               
               String type = scanner.nextLine();
               
               System.out.println("How many move would you like to make ? :");
               int howMany = scanner.nextInt();
               scanner.nextLine();
               
               training.move(type, howMany);
               
           }
           
    }
    
}

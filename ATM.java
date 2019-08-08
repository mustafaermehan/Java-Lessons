
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int remainder = 1000 ;
        String operations = "1.operation : Remainder learning\n" +
                             "2.operation : Withdraw money\n"+
                             "3.operation : Lodgement\n"+
                             "For exit enter the Q";
        System.out.println("*******************************");
        System.out.println(operations);
        System.out.println("*******************************");
        
        while (true){
            
            System.out.println("Select operaiton");
            String operation = scanner.nextLine();
            
            if(operation.equals("q"))
            {
                System.out.println("exit ATM");
                break;
            }
            else if (operation.equals("1"))
            {
                System.out.println("Remainder : "+ remainder);
                
            }
             else if (operation.equals("2"))
            {
                System.out.println("Amount you want to withdraw");
                int money = scanner.nextInt();
                scanner.nextLine();
                if (remainder - money < 0){
                    
                    System.out.println("Insufficient remainder. Remainder : "+ remainder);
                }
                else {
                    remainder -= money ;
                    System.out.println("New remainder : "+ remainder);
                }
                
                
            }
             else if (operation.equals("3"))
            {
                System.out.println("Amount you wish to deposit");
                int money = scanner.nextInt();
                scanner.nextLine();
                remainder += money;
                System.out.println("New remainder : "+ remainder);
                
                
            }
             else 
             {
                 System.out.println("invalid operation");
             }
            
        }
                       
    }
   
}
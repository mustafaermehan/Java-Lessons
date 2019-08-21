
import java.util.Scanner;


public class ATM {
    
    public void Run(Account account){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our bank...");
        System.out.println("***********************************");
        System.out.println("User login");
        System.out.println("***********************************");
        int right_of_entry = 3;
        
        while (true) {
            
            if (login.login(account)){
                
                System.out.println("Login successful...");
                break;
            }
            else{
                
                System.out.println("Login failed");
                right_of_entry -= 1;
                System.out.println("Remaining right of entry : "+ right_of_entry);
            }
            if(right_of_entry == 0){
                
                System.out.println("Right of entry is over...");
                return;
                
            }
            
            
        }
        System.out.println("***********************************");
        
        String operations = "1.View Remainder\n"
                           +"2.Lodgement\n"
                           +"3.Withdraw\n"
                           +"Press q to exit";
        
        System.out.println(operations);
        System.out.println("***********************************");
        
        while (true) {
            
            System.out.println("Select operation : ");
            String op = scanner.nextLine();
            
            if (op.equals("q")){
                break;
            }
            else if (op.equals("1")){
                
                System.out.println("Your Remainder : "+account.getRemainder());
            }
            else if (op.equals("2")){
                
                System.out.println("Amount you want to deposit");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.lodgement(amount);
                
            }
            else if (op.equals("3")){
                
                System.out.println("Amount you want to withdraw");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);
            }
            else {
                System.out.println("Invalid operation...");
            }  
        }
    }  
}

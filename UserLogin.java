
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int rightof_entry = 3;
        
        String sys_user_name = "Mustafa" ;
        String sys_password = "123456" ;
        
        System.out.println("****************************");
        System.out.println("Welcome to user login...");
        System.out.println("****************************");
        
        while(true){
            System.out.println("User name : ");
            String user = scanner.nextLine();
            
            System.out.println("Password : ");
            String password = scanner.nextLine();
            
            if(user.equals(sys_user_name) && password.equals(sys_password)){
                System.out.println("Welcome "+ user);
                break;
            } 
            else if(user.equals(sys_user_name) && !password.equals(sys_password)) {
                System.out.println("Password wrong");
                rightof_entry -= 1; 
                System.out.println("Right of entry : "+ rightof_entry);
            }
            else if(!user.equals(sys_user_name) && password.equals(sys_password)) {
                System.out.println("User name wrong");
                rightof_entry -= 1; 
                System.out.println("Right of entry : "+ rightof_entry);
            }
            else{
                System.out.println("User name and password wrong");
                rightof_entry -= 1;
                System.out.println("Right of entry : "+ rightof_entry);
               
                
            }
            
            if (rightof_entry == 0){
                System.out.println("Entry is over");
                break;
            }
   
        }
                      
        }
        
    }
    
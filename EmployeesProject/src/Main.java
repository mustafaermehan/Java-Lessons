
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the employees program...");
        
        String operations = "Operations.. \n"
                            +"1.Programmer operations\n"
                            +"2.Administrator operations\n"
                            +"Press to q for exit.." ;
        System.out.println("*************************************");
        System.out.println(operations);
        System.out.println("*************************************");
        
        while(true){
            
            System.out.print("Select operation ");
            String operation = scanner.nextLine();
            
            if(operation.equals("q")){
                
                System.out.println("Exiting program...");
                break;
            }
            else if (operation.equals("1")){
                
                Programmer programmer = new Programmer("Mustafa", "Ermehan", 868, "Python, C, Java");
                String programmer_operation = "1.Format\n"
                                              +"2.Show information\n"
                                              +"Press to q for exit" ;
                
                       System.out.println(programmer_operation); 
                       
                        while(true){
                            
                            System.out.println("Select operation");
                            
                            String p_operation = scanner.nextLine();
                            
                            if(p_operation.equals("q")){
                                
                                System.out.println("Exiting software operations");
                                break;
                            }
                            else if (p_operation.equals("1")){
                                
                                System.out.println("Operating system : ");
                                String operating_system = scanner.nextLine();
                                programmer.format(operating_system);
                                
                            }
                            else if (p_operation.equals("2")){
                                
                                programmer.showinformation();
                            }
                            else {
                                System.out.println("Invalid programmer operation");
                            }
                            
                        }
                        
            }
            else if (operation.equals("2")){
                
                Manager manager = new Manager("Muhammed", "Ermehan", 001, 15);
                                                  
               
               String administrator_operation = "Administrator operations\n "
                        +"1.Raise\n"
                        +"2.Show informations\n"
                        +"Press to q for exit" ;               
                System.out.println(administrator_operation);
                
                while (true) {
                    
                    System.out.print("Select operation");
                    
                    String p_operation = scanner.nextLine();
                    
                    if(p_operation.equals("q")){
                        
                        System.out.println("Exiting administrator operations");
                        break;
                     }
                    else if(p_operation.equals("1")){
                        
                        System.out.println("How much do you want the administrator to raise ?");
                        
                        int raiseAmount = scanner.nextInt();
                        scanner.nextLine();
                        manager.raise(raiseAmount);
                        
                    }
                    else if (p_operation.equals("2")){
                        
                        manager.showinformation();
                    }
                    else{
                        
                        System.out.println("Invalid administrator operation...");
                    }   
                }            
            }
            else{
                
                System.out.println("Invalid operation");
            }
               
        }
   
    }
    
}
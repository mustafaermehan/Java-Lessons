
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
       
        System.out.println("***********************");
        String operations = "1. Addition\n"
                            + "2. Extraction\n"
                            + "3. Multiplication\n"
                            + "4. Division" ;
        
        System.out.println(operations);
        System.out.println("***********************");
        
        System.out.println("Select operation");
        String operation = scanner.nextLine();
        int a;
        int b;
        
        switch(operation)
        {
            case "1" :
                System.out.println("First number : ");
                 a = scanner.nextInt();
                System.out.println("Second number : ");
                 b = scanner.nextInt();
                System.out.println("Addition : " + (a + b));
                break ;
            case "2" :
                 System.out.println("First number : ");
                 a = scanner.nextInt();
                System.out.println("Second number : ");
                 b = scanner.nextInt();
                System.out.println("Extraction : " + (a - b));
                break ;
            case "3" :
                 System.out.println("First number : ");
                 a = scanner.nextInt();
                System.out.println("Second number : ");
                 b = scanner.nextInt();
                System.out.println("Multiplication : " + (a * b));
                break ;
            case "4" :
                 System.out.println("First number : ");
                 a = scanner.nextInt();
                System.out.println("Second number : ");
                 b = scanner.nextInt();
                System.out.println("Division : " + ((double)a / b));
                break ;
           
            
        }
    }
    
}

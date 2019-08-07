
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Midterm1 : ");
        int midterm1 = scanner.nextInt();
        System.out.println("Midterm2 : ");
        int midterm2 = scanner.nextInt();
        System.out.println("Final exam : ");
        int finalex = scanner.nextInt();
        
        double totalgrade = (midterm1 * 3/10.0) + (midterm2 * 3/10.0) + (finalex * 4/10.0);
        
        if (totalgrade >85){
            System.out.println("grade : AA");
        }
        else if (totalgrade > 75){
            System.out.println("grade : BA");
        }
        else if (totalgrade >65){
            System.out.println("grade : BB");
        }
        else if (totalgrade > 55){
            System.out.println("grade : CB");
        }
        else if (totalgrade > 50){
            System.out.println("grade : CC");
        }
        else if (totalgrade > 45){
            System.out.println("grade : DC");
        }
        else{
            System.out.println("grade : FF");
        }
    }
    
}


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        int total = 0;
        
        do{
            total += number %10 ;
            number /= 10;
            System.out.println("Number : "+ number);
        }
        while(number > 0);
        System.out.println("Sum of figures : "+ total);
    }
    
}

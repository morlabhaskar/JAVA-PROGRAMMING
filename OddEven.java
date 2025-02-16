
import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        }
        else{
            System.out.println(number + " is Odd");
        }
    }
    
}

// Code Execution :
// javac OddEven.java
// java OddEven

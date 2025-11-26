import java.util.Scanner; // Import the Scanner class for user input

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        System.out.println("Enter a number:"); // Prompt user for input
        int n = sc.nextInt(); // Read integer input from user
        int count = 0; // Initialize count of factors to 0
        System.out.println("The factors of " + n + " are:"); // Display message
        sc.close(); // Close the scanner to prevent resource leaks

        // Loop from 1 to n to find all factors
        for(int i = 1; i <= n; i++){
            if(n % i == 0){ // If i divides n with no remainder, it's a factor
                System.out.println(i); // Print the factor
                count++; // Increment the count of factors
            }
        }

        // If the number has exactly 2 factors (1 and itself), it's prime
        if(count == 2){
            System.out.println(n +" is a prime number");
        }
        else{
            System.out.println(n +" is not a prime number");
        }
    }
}
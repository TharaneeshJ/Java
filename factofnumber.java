import java.util.Scanner; // Import the Scanner class for user input
public class factofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        System.out.println("Enter a number:"); // Prompt user for input     
        int n = sc.nextInt(); // Read integer input from user
        sc.close(); // Close the scanner to prevent resource leaks
        int fact=1; // Initialize factorial to 1
        for(int i=1;i<=n;i++){ // Loop from 1 to n
            fact=fact*i; // Multiply fact by i to compute factorial
        }
        System.out.println("The factorial of the number is: " + fact); // Print the final factorial value
        if(n==0 || n==1){ // Check if n is 0 or 1
            System.out.println(n + " is zero or once"); // Special case for 0 and 1
        } else {
            System.out.println(n + " is a positive integer greater than 1"); // General case for n > 1
        }



        // while(n>0){ // Loop until n is non-negative
        //     fact=fact*n; // Multiply fact by n
        //     n--; // Decrement n
        // }
        // System.out.println("The factorial of the number is: " + fact); // Print the final factorial value
    }
}

import java.util.Scanner; // Import Scanner for user input

public class Nnumberofprime {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in); // Create Scanner object
        System.out.println("Enter the number"); // Prompt user for input
        int n=sc.nextInt(); // Read integer input from user
        sc.close(); // Close the scanner
        System.out.println("The factor of "+n+" are:"); // Display message

        // Loop from 2 to n to check each number
        for(int i=2;i<=n;i++){
            int count=0; // Initialize count of factors for i
            // Loop from 1 to i to count factors of i
            for(int j=1;j<=i;j++){ 
                if(i%j==0){ // If j divides i, increment count
                    count++;
                }
            }
            if(count==2){ // If i has exactly 2 factors, it's prime
                System.out.println(i); // Print the prime number
            }
        }
    }
}
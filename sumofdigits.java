import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int sum = 0;

        while (a != 0) {
            sum += a % 10;
            a = a / 10;
        }

        int sum1=0;
        int b=sum;

        if (sum >= 10) {
            while (b != 0) {
                sum1 += b % 10;
                b = b / 10;
            }
            System.out.println(sum1);
        }
        else{
            System.out.println(sum);
        }

        sc.close();
    }
}

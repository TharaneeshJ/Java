import java.util.Scanner;

public class SecondAndThirdLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :"); //78965
        int digit = scanner.nextInt();
        int first = -1;
        int second = -1;
        int third = -1;

        while (digit > 0) {
            int num = digit % 10;   //seperates final digits from the number | 5,6,9,8,7

            if (num > first) {   //  5>-1,6>5
                third = second;   //third=-1
                second = first;   //second=-1,5,6
                first = num;    //first=5,6,9
            } else if (num > second) {
                third = second; //6
                second = num; //8
            } else if (num > third) { 
                third = num;  //7
            }

            digit = digit / 10;   //removes final digit | 7896
            
        }
        System.out.println(second);
        System.out.println(third);
        scanner.close();
    }
}

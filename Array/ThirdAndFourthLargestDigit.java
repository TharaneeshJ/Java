import java.util.Scanner;

public class ThirdAndFourthLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :"); //78965
        int digit = scanner.nextInt();
        int first = -1;
        int second = -1;
        int third = -1;
        int forth = -1;

        while (digit > 0) {
            int num = digit % 10;   //seperates final digits from the number | 5,6,9,8,7

            if (num > first) { 
                forth=third;  //  5>-1,6>5
                third = second;   //third=-1
                second = first;   //second=-1,5,6
                first = num;   //first=5,6,9
            } else if (num > second) {
                forth=third;
                third = second; //6
                second = num; //8
            } else if (num > third) { 
                forth = third;
                third = num;  //7
            }else if(num>forth){
                forth=num;
            }
            digit = digit / 10;   //removes final digit | 7896
        }
        System.out.println(third);
        System.out.println(forth);

        scanner.close();
    }
}

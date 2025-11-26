import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String inputString=scanner.nextLine();
        String reversedString="";
        for(int i=inputString.length()-1;i>=0;i--){
            reversedString+=inputString.charAt(i);
        }
        System.out.println("Reversed String: "+reversedString);
        scanner.close();


        //using While loop
        String anotherReversedString="";
        int index=inputString.length()-1;
        while(index>=0){
            anotherReversedString+=inputString.charAt(index);
            index--;
        }
        System.out.println("Reversed String using while loop: "+anotherReversedString);
    }
}

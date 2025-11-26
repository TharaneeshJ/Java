import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a String to Check Palindrome or Not :");
        String inputstring =scanner.nextLine();
        String reversedString="";
        for(int x=inputstring.length()-1;x>=0;x--){
            reversedString=reversedString+inputstring.charAt(x);
        }
        if(inputstring.equals(reversedString)){
            System.out.println(inputstring+" is a Palindrome String");
        }   
        else{
            System.out.println(inputstring+" is Not a Palindrome String");
        }
        scanner.close();
    }
}
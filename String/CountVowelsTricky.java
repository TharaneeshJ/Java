import java.util.Scanner;

public class CountVowelsTricky {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str = sc.nextLine().toLowerCase();

        int vowels = 0;

        for(int i = 0; i < str.length(); i++) {

            vowels += "aeiou".indexOf(str.charAt(i)) != -1 ? 1 : 0;

        }

        System.out.println("Number of vowels: " + vowels);
        sc.close();
    }
}
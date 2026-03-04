import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a Characters :");
        String str = sc.nextLine().toLowerCase();

        int vowels=0,consonants=0,digits=0,specialchar=0;

        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);

            if(x>='a' && x<='z'){
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if(x>='0' && x<='9'){
                digits++;
            }
            else{
                specialchar++;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonants :"+consonants);
        System.out.println("Digits :"+digits);
        System.out.println("Special Characters :"+specialchar);
        sc.close();
    }
}

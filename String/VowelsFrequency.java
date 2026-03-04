import java.util.Scanner;

public class VowelsFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine().toLowerCase();

        int a=0,e=0,i=0,o=0,u=0;

        for(int r=0;r<str.length();r++){
            char x=str.charAt(r);
            switch (x) {
                case 'a':a++;break;
                case 'e':e++;break;
                case 'i':i++;break;
                case 'o':o++;break;
                case 'u':u++;break;
            }
        }
        System.out.println("Frequency of a: "+a);
        System.out.println("Frequency of e: "+e);
        System.out.println("Frequency of i: "+i);
        System.out.println("Frequency of o: "+o);
        System.out.println("Frequency of u: "+u);
        
        sc.close();
    }
}

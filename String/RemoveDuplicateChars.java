import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();

        String emptystring="";

        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);

            if(emptystring.indexOf(x)==-1){
                emptystring=emptystring+x;
            }

        }
        System.out.println("String Without Duplicates: "+ emptystring);
        sc.close();
    }
}
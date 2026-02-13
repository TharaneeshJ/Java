package HackerRankProblems;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        int y;
        for(y=1;y<=10;y++){
            int a=t*y;
            System.out.println(t +"x"+ y +"="+ a);
        }
        x.close();

    }
}

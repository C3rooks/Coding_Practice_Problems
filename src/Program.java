import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by crookscc2 on 1/3/2017.
 */
public class Program {
    public static void main(String[] args)
    {
        Scanner inScan = new Scanner(System.in);
        System.out.print("-----------------------------");
        System.out.println("Coding Practice Problems by Corey Crooks");
        System.out.println("-----------------------------");
        System.out.println("Enter a Number: ");
        System.out.println("1: Geeks for Geeks: Perimeter Shapes Formed");
        System.out.println("2: Find Unique Characters");
        int input = inScan.nextInt();

        Problems p = new Problems();

        switch(input){
            case 1: p.setupfindPerimeter();
        }




    }




}

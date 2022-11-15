import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
   /*     We want to write a program that asks the user for three values (a0, a1, a2) and displays
        the actual solution (s) z of the third degree equation:
      z3 + a2 z^2 + a1 z + a0 = 0  */

        double a0 , a1 , a2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a0: ");
        a0 = sc.nextDouble();

        System.out.println(a0);
    }
}
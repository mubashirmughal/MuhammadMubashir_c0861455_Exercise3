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
        System.out.println("Enter value for a1: ");
        a1 = sc.nextDouble();
        System.out.println("Enter value for a2: ");
        a2 = sc.nextDouble();

        double a2q = a2 * a2 * a2 ;
        double Q = (3*a1 - a2*a2) / 9;
        double R = (9*a2*a1 - 27*a0 - 2 * a2q) / 54;
        double D = Q * Q * Q + R * R;
        double θ = 0.0;
        double Z1 = 0.0;
        double Z2 = 0.0;
        double Z3 = 0.0;
        double PI = 3.14;

        if (D < 0) {
            θ = Math.acos(R / Math.sqrt(-Q*-Q*-Q));
            Z1 = (2 * Math.sqrt(-Q) * Math.cos(θ/3) - (a2/3));
            Z2 = (2 * Math.sqrt(-Q) * Math.cos((θ + 2*PI) / 3) - (a2/3));
            Z3 = (2 * Math.sqrt(-Q) * Math.cos((θ + 4*PI) / 3) - (a2/3));


    } else {

    }
        double S = Math.pow(R + (Math.sqrt(D)) , 1/3);
        double T = Math.pow(R - (Math.sqrt(D)) , 1/3);

        System.out.println(D + " " + R + " " + Q + " " + θ + " " + Z1 + " " + Z2 + " " + Z3);

    }
}
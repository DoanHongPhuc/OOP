package Lab01;

import java.util.Scanner;

public class Ex226 {
    public static void main(String[] args){
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("(1)first-degree equation (linear equation)  \n");

        System.out.println("Enter 2 coefficients of ax + b: ");
        System.out.print("a = ");
        a = Double.parseDouble(scanner.next());
        System.out.print("b = ");
        b = Double.parseDouble(scanner.next());
        System.out.println("x = -b/a = -" + (int)b + "/" + (int)a + " = " + (- b / a));
        System.out.print("(2) system of first-degree equations \n");
        System.out.println("Enter the coefficients of {a11x1 + a12x2 = b1\n\t\t\t   {a21x1 + a22x2 = b2");

        System.out.print("a11 = ");
        double a11 = Double.parseDouble(scanner.next());
        System.out.print("a12 = ");
        double a12 = Double.parseDouble(scanner.next());
        System.out.print("b1 = ");
        double b1 = Double.parseDouble(scanner.next());
        System.out.print("a21 = ");
        double a21 = Double.parseDouble(scanner.next());
        System.out.print("a22 = ");
        double a22 = Double.parseDouble(scanner.next());
        System.out.print("b2 = ");
        double b2 = Double.parseDouble(scanner.next());

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        System.out.println("D = " + D + "\nD1 = " + D1 + "\nD2 = " + D2);

        if(D != 0) System.out.println("The system has a unique solution (x1, x2) = (" + D1/D + ", " + D2/D + ")");
        else if(D == 0 && D1 == 0 && D2 == 0) System.out.println("The system has infinitely many solutions");
        else System.out.println("No solution");
        System.out.print("(3).second-degree equation \n");

        System.out.println(" Enter the coefficients of Ax^2 + Bx + C = 0 (A != 0): ");

        System.out.print("A = ");
        Double A = Double.parseDouble(scanner.next());
        System.out.print("B = ");
        Double B = Double.parseDouble(scanner.next());
        System.out.print("C = ");
        Double C = Double.parseDouble(scanner.next());

        Double delta = B * B - 4 * A * C;
        System.out.println("Delta = " + delta);

        if(delta == 0) System.out.println("The equation has double root " + (-B / (2 * A)));
        else if(delta > 0) System.out.println("The equation has 2 distinct roots " + ((-B + Math.sqrt(delta)) / (2*A)) + " and " + ((-B - Math.sqrt(delta)) / (2*A)));
        else System.out.println("The equation has no solution");

        scanner.close();
    }

}
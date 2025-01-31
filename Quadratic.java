import java.util.Scanner;
import java.lang.Math;
class QuadraticEquation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a value for a:");
double a = scanner.nextDouble();
System.out.println("Enter a value for b:");
double b = scanner.nextDouble();
System.out.println("Enter a value for c:");
double c = scanner.nextDouble();
double d = b * b - 4.0 * a * c;
System.out.println("Discriminant value:" + d);
if (d > 0) {
double root1 = (-b + Math.sqrt(d)) / (2 * a);
double root2 = (-b - Math.sqrt(d)) / (2 * a);
System.out.println("Roots are real and distinct:");
System.out.println("Root 1: " + root1);
System.out.println("Root 2: " + root2);
} else if (d == 0) {
double root = -b / (2 * a);

System.out.println("Roots are real and equal:");
System.out.println("Root:" + root);
} else {
System.out.println("Roots are imaginary:");
} scanner.close();
}}


import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {

    Scanner objects = new Scanner(System.in);
    final double n = 3.14159;
    double R = objects.nextDouble();
    double area = n * (R * R);
    System.out.println("A=" + String.format("%.4f", area));
 
    }
 
}
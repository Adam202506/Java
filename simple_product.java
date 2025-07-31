import java.util.Scanner;

class simple_product {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int a = number.nextInt();
        int b = number.nextInt();
        int PROD = a * b;
        System.out.println("PROD = " + PROD);
    }
}

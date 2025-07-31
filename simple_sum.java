import java.util.Scanner;

public class simple_sum {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int A = number.nextInt();
        int B = number.nextInt();

        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
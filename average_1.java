import java.util.Scanner;
class average_1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        float A = number.nextFloat();
        float B = number.nextFloat();
        double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));

    }
}

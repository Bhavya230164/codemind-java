import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double av=0.5*(a + b);
    System.out.printf("%.4f",av);
    }
}
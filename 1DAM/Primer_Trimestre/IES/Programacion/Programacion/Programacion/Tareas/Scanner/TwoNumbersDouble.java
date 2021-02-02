import java.util.Scanner;

public class TwoNumbersDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num1 = scanner.nextInt();
        double n1 = (double) num1;
        System.out.println("Escriba un numero mayor que " + n1);
        int num2 = scanner.nextInt();
        double n2 = (double) num2;
        for (int i = 0 ; n2 > n1 ; i++){
            System.out.println("Escriba un numero mayor que:" + n1);
            n2 = scanner.nextDouble();
        }
        System.out.println(n2 + " no es mayor que " + n1);
    }
}

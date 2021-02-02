import java.util.Scanner;

public class TwoNumbers {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num1 = scanner.nextInt();
        System.out.println("Escriba un numero mayor que " + num1);
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            for (int i = 0; num1 > num2; i++) {
                System.out.println(num2 + " no es mayor que " + num1 + ".Intentelo de nuevo:");
                num2 = scanner.nextInt();
            }
        }
        System.out.println("Los numeros que ha escrito son " + num1 + " y " + num2);
    }
}

import java.util.Scanner;

public class bucles7_1 {
    static Scanner scanner = new Scanner(System.in);

    static int pideNumeros (){
        System.out.println("indique el numero n");
        int n = scanner.nextInt();
        while (n <= 0){
            System.out.println("el numero debe ser mayor que 0, introduzca un numero por favor");
            n = scanner.nextInt();
        }
        return n;
    }

    public static void main (String [] args){
        int a = pideNumeros();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a; j++) {
                int num = i + j;
                System.out.print(String.format ("%02d ", num));
            }
            System.out.println();
        }
    }
}

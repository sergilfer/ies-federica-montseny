import java.util.Scanner;

public class IterativePrimeNumbers {
    private static String ArePrime (int a){
        boolean bol = true;
        String  str = "es primo";
        for (int i = 2 ; a!=i && bol; i++){
            if (a%i==0) {
                bol = false;
                str = "no es primo";
            }
        }
        return str;
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        while(num1<=0){
            System.out.println("Introduzca un numero mayor que 1");
            num1 = scanner.nextInt();
        }
        System.out.println("el numero " + num1 + " " + ArePrime(num1));
    }
}

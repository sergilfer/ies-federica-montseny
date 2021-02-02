import java.util.Scanner;

public class Programas1_Calculadora {
    static Scanner scanner = new Scanner(System.in);

    static int suma(int a, int b) {
        return a + b;
    }

    static int resta(int a, int b) {
        return a - b;
    }

    static int multiplicacion(int a, int b) {
        return a * b;
    }
    static int  pideNumero(){
        System.out.println("introduzca 1 numero a operar");
        int n = scanner.nextInt();
        return n;
    }
    static void menu(){
        System.out.println("---M E N U---");
        System.out.println("1) Sumar dos digitos");
        System.out.println("2) Restar dos digitos");
        System.out.println("3) Multiplicar dos digitos");
        System.out.println("4) Salir");
    }
    static void pideOperacion() {
        int op,n,m,result;
        do {
            menu();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    result = suma(n=pideNumero(), m=pideNumero());
                    System.out.println("la suma de "+ n + " y " + m + " es " + result);
                    break;
                case 2:
                    result = resta(n=pideNumero(), m=pideNumero());
                    System.out.println("la resta de "+ n + " y " + m + " es " + result);
                    break;
                case 3:
                    result = multiplicacion(n=pideNumero(), m=pideNumero());
                    System.out.println("la multiplicacion de "+ n + " y " + m + " es " + result);
                    break;
                case 4:
                    System.out.println("ha finalizado con exito");
                    break;
            }
        }while(op<4);
    }


    public static void main (String[] args){
        pideOperacion();
    }
}

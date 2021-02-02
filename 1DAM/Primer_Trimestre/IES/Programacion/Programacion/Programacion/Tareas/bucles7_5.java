import java.util.Scanner;

public class bucles7_5 {
    static Scanner scanner = new Scanner(System.in);
    static int pideNumber (){
        System.out.println("introduzca un numero mayor que 0");
        int n = scanner.nextInt();
        while (n <= 0){
            System.out.println("el numero debe ser mayor que 0 por favor, introduzca el numero");
            n = scanner.nextInt();
        }
        return n;
    }
    public static void main (String [] args){
        int num = pideNumber();
        for (int i = num; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}

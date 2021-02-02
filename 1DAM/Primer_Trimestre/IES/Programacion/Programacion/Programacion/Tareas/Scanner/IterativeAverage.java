import java.util.Scanner;

public class IterativeAverage {
    private static int Average (int [] list){
        int av = 0;
        for (int i = 0 ; i < list.length; i++){
            av = av + list[i];
        }
        return av/ list.length ;
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros va a introducir?");
        int numIterations = scanner.nextInt();
        int [] arrayNum = new int [numIterations];
        for (int i = 0; i < arrayNum.length; i++){
            System.out.println("Introduzca los numeros");
            arrayNum[i] = scanner.nextInt();
        }
        System.out.println("La media de los numeros introducidos es " + Average(arrayNum));
    }
}

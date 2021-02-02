import java.util.Scanner;

public class IterativeNumber {

    private static int factorial (int number){
        int result = 1;
        for (int i = 1; i <= number; i++){
            result = i * result;
        }
        return result;
    }
    public static void main (String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introducir un número");

        String num = myObj.nextLine();
        int number = Integer.parseInt(num);
        System.out.println("el factorial de " + number + " es : "+ factorial(number));
    }
}

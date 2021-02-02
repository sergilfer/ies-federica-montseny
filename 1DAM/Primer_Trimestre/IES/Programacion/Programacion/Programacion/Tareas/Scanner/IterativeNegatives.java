import java.util.Scanner;

public class IterativeNegatives {

    private static int AreNegatives (int [] list){
         int cont = 0;
        for (int i= 0 ; i < list.length;i++){
            if (list[i]<0){
                cont++;
            }
        }
        return cont;
    }
    public static void main (String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("¿Cuantos numeros va a introducir?");
        String text = myObj.nextLine();
        int cont = Integer.parseInt(text);
        int [] listNumbers = new int[cont];
        for (int i = 0 ; i < cont ; i++) {
            System.out.println("Introduzca los numeros");
            listNumbers[i] = myObj.nextInt();
        }
        System.out.println("hay un total de " + AreNegatives(listNumbers) + " numeros negativos");
    }


}


import java.util.Scanner;

public class Bucles6_2 {
    static Scanner scanner = new Scanner(System.in);

    static int [] pideNumeros (){
        System.out.println("¿Cuantos numeros desea introducir?");
        int n = scanner.nextInt();
        int[] arrayNum = new int[n];
        if(n>0) {
            for (int i = 0; i < arrayNum.length; i++) {
                System.out.println("Introduzca " + n + " numeros");
                int m = scanner.nextInt();
                arrayNum[i] = m;
            }
        }else{
            System.out.println("ERROR debe introducir un numero mayor que 0");
            System.exit(-1);
        }
        return arrayNum;
    }
static int recorrerArray (int a , int [] array){
        int result = 0;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] == a){
                result = a;
            }
        }
        return result;
}
    static void buscar (int [] a, int [] b) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            //for (int j = 0; j < b.length; j++) {
              //  if (a[i] == b[j]) {
                    resultado = recorrerArray(a[i],b);
                    System.out.println("el numero " + resultado + " existe en ambos arrays");
                }
            }

    public static void main (String [] args){
        int [] numbers1 =  pideNumeros();
        int [] numbers2 = pideNumeros();
        buscar(numbers1,numbers2);
    }
}

public class MethodyArgs {
    //metodo que divide 2 numeros
    private static double division (double a, double b){
        return a/b;
    }
    //metodo que imprime un double
    private static void print (double a){
        System.out.println("El resultado de la division es: " + a);
    }
    public static void main(String [] args){
        //compruebo que se pasen 2 metodos
        if (args.length == 2){
            //parseo argumentos
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            //compruebo que el segundo no sea 0
            if (num2!=0) {
                double result = division(num1,num2);
                print(result);
            }else{
                System.err.println("ERROR 0 en segundo argumento");
            }
        }else{
            System.err.println("ERROR deben tener 2 metodos");
        }
    }
}

public class FactorialV1V2 {
    //metodo que calcula el factorial de un numero que se pasa por entrada
    static int factorial (int a){
        int result = 1;
        while(a!=0){
            result = result * a;
            a--;
        }
        return result;
    }

    public static void main (String [] args){
        if (args.length==2){
            int result,aux;
            int v1 = Integer.parseInt(args[0]);
            int v2 = Integer.parseInt(args[1]);
          if(v1 > v2){
              aux = v2;
              v2 = v1;
              v1=aux;
          }
            if ( (v1>1) && (v2>1) ){
                for (int i = v1; i<=v2; i++){
                    result = factorial(i);
                    System.out.println("El factorial de "+i+" es " + result);
                }
            }else{
                System.err.println("ERROR los argumentos deben ser mayor de 1");
            }
        }else{
            System.err.println("ERROR debe haber 2 argumentos de entrada");
        }
    }
}

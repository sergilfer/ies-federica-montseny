public class CrossedPoints {
    //se usan las x para saber si se cruza la linea Y
    public static boolean crossY (int a , int b){
        boolean cross = false;
        if((a>0 && b<0)||(a<0 && b>0)){
            cross = true;
        }
        return cross;
    }
    //se usan las y para saber si se cruza la linea x
    public static boolean crossX (int a , int b){
        boolean cross = false;
        if((a>0 && b<0)||(a<0 && b>0)){
            cross = true;
        }
        return cross;
    }
    /*
    se podria haber solo usado 1 metodo tanto para X e Y, para saber si cruzan el eje
    y haber cambiado solo los argumentos, uno seria con (x,x1) y otro con (y,y1)
    System.out.println(crossLine(x,x1)); este caso diria si cruza el eje Y
    System.out.println(crossLine(y,y1)); este diria si se cruza el X
    y seria solo uno de los metodos que tengo arriba, ya que son iguales
    pero el ejercicio dice que tiene que haber 2 metodos uno para X y otro para Y
     */
    public static void main (String [] args){
        //punto 1
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        //punto 2
        int x1 = Integer.parseInt(args[2]);
        int y1= Integer.parseInt(args[3]);
        System.out.println("cruza la linea x = " + crossX(x,x1));
        System.out.println("cruza la linea y = " + crossY(y,y1));
    }
}

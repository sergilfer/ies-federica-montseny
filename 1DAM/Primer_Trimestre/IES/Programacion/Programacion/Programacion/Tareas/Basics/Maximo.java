public class Maximo {
    public static void compareNum (double a , double b , double c){
        if (a>b && a>c){
            System.out.println("el mayor es el a " + a);
        }else if (b>a && b>c){
            System.out.println("el mayor es el b " + b);
        }else if (c>a && c>b){
            System.out.println("el mayor es el c " + c);
        }else{
            System.out.println("no hay ninguno mayor que otro");
        }
    }
    public static void main (String[]args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        compareNum(a,b,c);
    }
}

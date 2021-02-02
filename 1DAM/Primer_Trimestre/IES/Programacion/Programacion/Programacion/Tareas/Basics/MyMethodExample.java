public class MyMethodExample {
    public static boolean myMethod (double a, double b){
        boolean c = false;
        if (a==b){
            c = true;
        }
        return c;
    }
    public static void main (String [] args){
    System.out.println(myMethod(1.0,4.0));
    }
}

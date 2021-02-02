public class MyMethodMedia {
    public static double CalculedMedia (double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void Print(double a, double b){
        if (a > 0){
            System.out.println("Media positiva");
        } else if (a < 0) {
            System.out.println("Media negativa");
        }
        if (a > b) {
            System.out.println("c esta por debajo de la media");
        }
    }
    public static void main (String [] args){
        double a = 1.2;
        double b = 5.6;
        double c = 7.8;
        double average = CalculedMedia(a,b,c);
        Print(average,c);
    }
}

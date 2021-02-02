public class LoopsAverage {
    private static double average (double [] list){
        double result = 0 ;
        for (int i =0 ; i<list.length;i++){
            result = list[i] + result;
        }
        return result/ list.length;
    }
    private static void print (double a){
        System.out.println("La media es: " + a);
    }
    public static void main (String [] args){
        if (args.length>=1){
            double [] listOfNumb = new double[args.length];
            for(int i = 0 ; i < listOfNumb.length;i++){
                listOfNumb[i] = Double.parseDouble(args[i]);
            }
            double num1 = average(listOfNumb);
            print(num1);
        }else{
            System.err.println("ERROR no hay argumentos");
        }
    }
}

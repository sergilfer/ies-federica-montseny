public class SwithExample {
    public static void main (String [] args){
        char c = 'a';
        switch (c){
            case 1:
                if(c == '0'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 2:
                if(c == '1'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 3:
                if(c == '2'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 4:
                if(c == '3'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 5:
                if(c == '4'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 6:
                if(c == '5'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 7: if(c == '6'){
                System.out.println("El valor de c es numérico: " + c);
            }
                break;
            case 8:
                if(c == '7'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 9:
                if(c == '8'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            case 10:
                if (c == '9'){
                    System.out.println("El valor de c es numérico: " + c);
                }
                break;
            default:
                System.out.println("El valor de c no es numérico:" + c);
                break;

        }
    }
}

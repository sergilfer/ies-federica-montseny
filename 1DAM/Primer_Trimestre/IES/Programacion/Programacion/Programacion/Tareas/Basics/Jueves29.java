public class Jueves29 {
    private static boolean search(int [] list, int num){
        boolean result = false;
        for (int i = 0 ; i< list.length;i++){
            if (num == list[i]){
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main (String []args){
        int [] array = {1,3,2,7};
        int n = 3;
        boolean a = search(array,n);
        if (a == true) {
            System.out.println("Encontrado");
        }else{
            System.out.println("No encontrado");
        }
    }
}

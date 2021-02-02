public class TypeOfChar {
    public static void convertChar(char a){
        int ascii = (int) a;
        if ((ascii ==65) || (ascii == 69) || (ascii == 73)
                || (ascii == 79) || (ascii == 85) || (ascii ==97)
                || (ascii ==101) || (ascii==105)||(ascii == 111)
                || (ascii == 117)){
            System.out.println("vocal -> " + a);
        }else if ((ascii>=66) && (ascii<=122)) {
            System.out.println("consonante -> " + a);
        }else{
            System.out.println("otro caracter -> " + a);
        }
    }
    public static void main (String [] args){
        char character = args[0].charAt(0);
        convertChar(character);
    }
}

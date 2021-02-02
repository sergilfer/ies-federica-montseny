public class Media {
	public static void main (String [] args){
		double a = 2.5;
		double b = 5.6;
		double c = 8.9;
		double average = (a+b+c)/3; 
		if (average > 0){
			System.out.println("Media positiva");
		} else if (average< 0){
			System.out.println("Media negativa");
		}
		if (average > c) {
			System.out.println("c esta por debajo de la media");
		}
	}
}
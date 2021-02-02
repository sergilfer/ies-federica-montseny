public class Cuadrado{
	public static void main (String [] args){
		double area; 
		//vertice 1
		double x1 = -1.5;
		double y1 = 1.0;
		//vertice 2 
		double x2 = -3.5;
		double y2 = 5.0;
		area = Math.abs(((x1 - x2) * (y1-y2)));
		System.out.println(area); 
	}
}
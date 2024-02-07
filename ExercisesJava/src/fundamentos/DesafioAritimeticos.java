package fundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		double parte1 = 6 * (3+2);
		double parte2 = Math.pow(parte1, 2)/(3*2);
		double parte3 = (1-5) * (2-7)/2;
		double parte4 = Math.pow(parte3, 2);
		double parte5 = Math.pow((parte2 - parte4), 3);
		double parte6 = parte5 / Math.pow(10, 3);	
		System.out.println(parte6);
	}
}

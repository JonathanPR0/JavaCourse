package controle;
import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digíte um ano e saiba se é bissexto:");
		double year = input.nextDouble();
		if (year % 4 == 0)
			System.out.println("É ano bissexto");
		else
			System.out.println("Não é ano bissexto");
		input.close();
	}
}

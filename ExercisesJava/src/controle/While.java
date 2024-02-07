package controle;
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		String text = "";
		Scanner input = new Scanner(System.in);
		while(!text.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			text = input.next();
		}
		System.out.println("Tchau!");
		input.close();
		
	}
}

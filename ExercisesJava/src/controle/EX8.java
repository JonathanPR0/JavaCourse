package controle;

import java.util.Scanner;

public class EX8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digíte uma palavra:");
		String word = input.nextLine();
		
		for(int i = 0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		input.close();
	}
}

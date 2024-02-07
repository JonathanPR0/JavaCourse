package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Número para string binária... 6 -> "110"
		 * 2. Inverter a string... "110" -> "011"
		 * 3. Converter de volta para inteiro => "011" -> 3
		 */
		
		Function<Integer, String> toBinary = num -> Integer.toBinaryString(num);
		Function<String, String> invert = text -> {
			String reverseString = "";
			for (int i = text.length() - 1; i >= 0; i--) {
				reverseString = reverseString + text.charAt(i);
			};
			return reverseString;
		};
		Function<String, Integer> convert = text -> Integer.parseInt(text, 2);
		nums.stream().map(toBinary).map(invert).map(convert).forEach(print);
	}
}

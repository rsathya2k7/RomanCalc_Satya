import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumbers {
	public static String romanNumerals(int inputValue) {
		String res = "";
		// check the condition for less then or equal to Zero or Grater then
		// 3000
		if (inputValue <= 0 || inputValue > 3000) {
			// if given input value equals to Zero then

			if (inputValue == 0) {
				res = "Zero is not Convert into Roman Numeral value";
			}
			// if given input value less then Zero then

			else if (inputValue < 0) {
				res = "Negative value is not Convert into Roman Numeral value";
			}
			// if given input value Grater then 3000 then

			else if (inputValue > 3000) {
				res = "Please Enter the below 3000";
			}
		}

		// if given condition is true it convert Arabic Number into Numeral

		else {
			LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
			roman_numerals.put("M", 1000);
			roman_numerals.put("CM", 900);
			roman_numerals.put("D", 500);
			roman_numerals.put("CD", 400);
			roman_numerals.put("C", 100);
			roman_numerals.put("XC", 90);
			roman_numerals.put("L", 50);
			roman_numerals.put("XL", 40);
			roman_numerals.put("X", 10);
			roman_numerals.put("IX", 9);
			roman_numerals.put("V", 5);
			roman_numerals.put("IV", 4);
			roman_numerals.put("I", 1);

			for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
				int matches = inputValue / entry.getValue();
				res += repeat(entry.getKey(), matches);
				inputValue = inputValue % entry.getValue();
			}
		}
		return res;
	}

	public static String repeat(String key, int Val) {
		if (key == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Val; i++) {
			sb.append(key);
		}
		return sb.toString();
	}

	public static void main(String[] args){
		RomanNumbers rn = new RomanNumbers();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter Arabic Number:\n");
		if (keyboard.hasNextInt() == true) {

			Integer userInput = Integer.parseInt(keyboard.nextLine());
			System.out.println("Roman Numeral values is   :  " + rn.romanNumerals(userInput));
		} else {
			System.out.println("please enter the valid Arabic Number");
		}
	}
}

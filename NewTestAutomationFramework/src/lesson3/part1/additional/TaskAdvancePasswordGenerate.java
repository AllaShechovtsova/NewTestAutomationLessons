package lesson3.part1.additional;

import java.util.Random;

public class TaskAdvancePasswordGenerate {
	public boolean isSymbolPresent(String symbol, String myString) {
		boolean result = false;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.substring(i, i + 1).equals(symbol)) {
				result = true;
			}
		}
		return result;
	}

	public String passwordGenerator(String passwordTemplate) {
		String myPassword;

		myPassword = "";
		Random randNumber = new Random();
		int iNumber;
		for (int i = 0; i < passwordTemplate.length(); i++) {

			switch (passwordTemplate.charAt(i)) {
			case 'b':

				iNumber = randNumber.nextInt(26) + 65;
				myPassword += Character.toString((char) iNumber);
				break;
			case 's':

				iNumber = randNumber.nextInt(26) + 97;
				myPassword += Character.toString((char) iNumber);
				break;
			case 'n':

				iNumber = randNumber.nextInt(10) + 48;
				myPassword += Character.toString((char) iNumber);
				break;
			}
		}

		return myPassword;

	}

	public String passwordTemplate(int passwordLength) {
		String myTemplate;
		if (passwordLength < 8) {
			passwordLength = 8;
		}
		do {
			myTemplate = "";

			for (int i = 1; i <= passwordLength; i++) {
				Random randNumber = new Random();
				int iNumber = randNumber.nextInt(3) + 1;
				switch (iNumber) {
				case 1:
					myTemplate += "b";
					break;
				case 2:
					myTemplate += "s";
					break;
				case 3:
					myTemplate += "n";
					break;
				}
			}

		} while (!(isSymbolPresent("b", myTemplate) && isSymbolPresent("s", myTemplate)
				&& isSymbolPresent("n", myTemplate)));

		return myTemplate;

	}

	public static void main(String[] args) {
		TaskAdvancePasswordGenerate myInstance = new TaskAdvancePasswordGenerate();
		System.out.println(myInstance.passwordGenerator(myInstance.passwordTemplate(6)));

	}

}

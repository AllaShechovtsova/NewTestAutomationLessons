package lesson_3.part3;

import java.util.ArrayList;

public class Task8 {
	public String getCamelCaseSeparator(String initialString) {
		String resultingString = "";
		for (int i = 0; i < initialString.length(); i++) {
			
			int askiiNumber = (int) initialString.charAt(i);
			
			if (i == 0) {
				resultingString += Character.toString((char) (askiiNumber - 32));
			} else {
				if (askiiNumber >= 65 && askiiNumber <= 90) {
					resultingString += " " + Character.toString((char) (askiiNumber + 32));

				} else {
					resultingString += Character.toString((char) askiiNumber);

				}
				;
			}
		}
		return resultingString;
	}

	public static void main(String args[]) {
		Task8 myInstance = new Task8();

		System.out.println(myInstance.getCamelCaseSeparator("moonCamelCeparText"));
	}
}

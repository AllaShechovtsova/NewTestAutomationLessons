package lesson_3.part2;

public class Task9 {
	public void myResultOfMulty(int firstNumber, int secondNumber) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + i * j);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		myInstance.myResultOfMulty(2, 4);

	}
}
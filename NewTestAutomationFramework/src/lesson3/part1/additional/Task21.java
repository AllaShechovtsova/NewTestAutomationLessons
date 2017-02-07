package lesson3.part1.additional;

public class Task21 {
	public void myResultOfMulty(int firstNumber, int secondNumber) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + i * j);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task21 myInstance = new Task21();
		myInstance.myResultOfMulty(2, 4);

	}
}
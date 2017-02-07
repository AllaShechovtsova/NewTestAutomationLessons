package lesson_3.part1;

public class Task9 {
	public void resultOfDivision(int numberFirst, int numberSecond) {
		double f = 7;
		double t = 2;
		double a = f / t;

		System.out.print(a);
	}

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		myInstance.resultOfDivision(7, 2);
	}

}

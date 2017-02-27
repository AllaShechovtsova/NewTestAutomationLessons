package Test;

public class Task_test_1_1 {
	private static final int[] arrayNumber1 = null;

	public void masOfNewDigits(int[] arrayNumber) {
		int[] arrayNumber1 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = arrayNumber[i] * 3;
		}

	}

	public static void main(String arg[]) {
		Task_test_1_1 myInstance = new Task_test_1_1();
		myInstance.masOfNewDigits(arrayNumber1);
		System.out.println();
	}
}

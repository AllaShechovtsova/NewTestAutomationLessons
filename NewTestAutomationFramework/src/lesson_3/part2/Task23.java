package lesson_3.part2;

public class Task23 {
	public void selectSumMyMassive(String ElementsOfDigits) {
		int k = 347896533;
		int x = k;
		int s = 0;
		while (x != 0) {
			s += x % 10;
			x /= 10;
		}
		System.out.println("Сумма цифр в числе " + k + "=" + s);
	}

	public static void main(String[] args) {
		Task23 myInstance = new Task23();
		myInstance.selectSumMyMassive("k");
		;
	}

}

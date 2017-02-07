package lesson_3.part2;

class Task3 {
	private void selectCombination(int a, int b) {
		if (a * b == 21 || a == 21 || b == 21) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
		myInstance.selectCombination(3, 6);
	}

}

package lesson3.part1.additional;

class Task13 {
	private void selectCombination(int a, int b) {
		if (a * b == 21 || a == 21 || b == 21) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		Task13 myInstance = new Task13();
		myInstance.selectCombination(3, 6);
	}

}

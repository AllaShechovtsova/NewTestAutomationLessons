package lesson_3.part3;

public class Task3_1 {

	public static void main(String args[]) {
		int[] mas = new int[50];
		int b = 1;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = b;
			b++;
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		System.out.println("-------------------");
		for (int i = mas.length - 1; i >= 0; --i) {
			System.out.print(mas[i] + ", ");
		}
	}
}

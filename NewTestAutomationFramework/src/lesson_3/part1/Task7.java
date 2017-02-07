package lesson_3.part1;

public class Task7 {
	public void showMaxNumbersFromArray(int [] elementMas){
		int arrayMaxElement=elementMas[0];
		for(int element: elementMas){
			if (element>arrayMaxElement)
				arrayMaxElement=element;
		}
		System.out.println(arrayMaxElement);
	}
	public static void main(String[] args) {
		Task7 myInstance=new Task7();
		int [] elementMas={2,4,6,8,111,667,-34,0,5,55};
		myInstance.showMaxNumbersFromArray(elementMas);

	}

}

package Test;

import lesson_3.part1.Task7;

public class Task_test_1_7 {
	public void showMaxElementOfArray(int[] myArray) {
		int maxElementOfMas=myArray[0];
		for(int element:myArray){
			if(element>maxElementOfMas)
			maxElementOfMas=element;
		}
		System.out.println(maxElementOfMas);
	}
	
	public static void main(String[] args) {
		Task_test_1_7 myInstance = new Task_test_1_7();
		int[] myArray ={ 2, 4, 6, 8, 1110, 667, -34, 0, 500};
		myInstance.showMaxElementOfArray(myArray);
	}
}
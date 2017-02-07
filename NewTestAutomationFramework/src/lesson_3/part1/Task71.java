package lesson_3.part1;

public class Task71 {
	public void showMinNumbersFromArray (int [] myArray ){
	int elementMinMas= myArray[0];
		for(int element: myArray){
		if (element<elementMinMas)
			elementMinMas=element;
	}
	System.out.println(elementMinMas);
		}
	

	public static void main(String[] args) {
		Task71 myInstance= new Task71();
		int []myArray= {6,7,-11,6,9,0};
		myInstance.showMinNumbersFromArray(myArray);
	}

}

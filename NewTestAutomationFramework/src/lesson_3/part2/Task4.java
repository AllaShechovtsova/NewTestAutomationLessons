package lesson_3.part2;

class Task4 {
	public void showMiddleNumbersFromArray(int element) {
			int [] arrayElement={1,6,8,9,0,9,7,6,9,0,44,67,88,90,23,32,48,78};
						for (int i=arrayElement.length/2; i<arrayElement.length-1 ;i++)
System.out.print(arrayElement[i]+ " ");
	System.out.println(arrayElement[arrayElement.length-1]);}

	public static void main(String[] args) {
		Task4 myInstance = new Task4();
		myInstance.showMiddleNumbersFromArray(2);
	}

}

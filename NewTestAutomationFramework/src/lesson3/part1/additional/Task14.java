package lesson3.part1.additional;

class Task14 {
	public void showMiddleNumbersFromArray(int element) {
			int [] arrayElement={1,6,8,9,0,9,7,6,9,0,44,67,88,90,23,32,48,78};
						for (int i=arrayElement.length/2; i<arrayElement.length-1 ;i++)
System.out.print(arrayElement[i]+ " ");
	System.out.println(arrayElement[arrayElement.length-1]);}

	public static void main(String[] args) {
		Task14 myInstance = new Task14();
		myInstance.showMiddleNumbersFromArray(2);
	}

}

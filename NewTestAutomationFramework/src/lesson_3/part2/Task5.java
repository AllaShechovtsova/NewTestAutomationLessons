package lesson_3.part2;

class Task5 {
	private int i;

	public boolean  showUnlikedNumbersFromArray(int [] arrayElement) {
			boolean result=true;
			for (int i:arrayElement){
				if(i==7|| i==9) {
					result=false;
				}
			}
			return result;}
						

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		int [] arrayElement={1,6,8,9,0,9,7,6,9,0,44,67,88,90,23,32,48,78};
		int [] arrayElement2={1,6,8,0,0,5,7,6,8,0,44,67,88,90,23,32,48,78};
		int [] arrayElement3={1,6,8,9,0,9,6,6,9,0,44,67,88,2,48,78};
		int [] arrayElement4={1,6,8,4,0,2,3,6,4,0,44,67,88,90,23,32,48,78};
		System.out.println(myInstance.showUnlikedNumbersFromArray(arrayElement));
		System.out.println(myInstance.showUnlikedNumbersFromArray(arrayElement2));
		System.out.println(myInstance.showUnlikedNumbersFromArray(arrayElement3));
		System.out.println(myInstance.showUnlikedNumbersFromArray(arrayElement4));
	}

}

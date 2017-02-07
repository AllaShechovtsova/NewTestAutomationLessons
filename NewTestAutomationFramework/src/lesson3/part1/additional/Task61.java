package lesson3.part1.additional;

public class Task61 {
public void showOddNumbersFromRange(int startRange, int endRange){
	for (int i=startRange; i<=endRange;i++){
		if (i%2!=0) {
			System.out.print(i+ " ");
		}
	}
	System.out.println();
}

	public static void main(String[] args) {
		Task61 myInstance=new Task61();
		myInstance.showOddNumbersFromRange(2, 202);
		

	}

}

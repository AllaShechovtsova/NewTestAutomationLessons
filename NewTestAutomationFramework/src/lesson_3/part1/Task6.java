package lesson_3.part1;

public class Task6 {

	public void firstWayPrintEvenNumbersFromRange (int startRangeNumber, int endRangeNumber){
		for(int i=startRangeNumber; i<=endRangeNumber; i++){
			if (i%2==0)
				System.out.print(i+" " );
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Task6 myInstance=new Task6();
		myInstance.firstWayPrintEvenNumbersFromRange(2, 50);
		myInstance.firstWayPrintEvenNumbersFromRange(3, 103);

	}

}

package lesson_3.part2;

public class Task2 {
	public String showCombination (int myWord, int myNumber){
		String myCombination="Cool text";
		String startIndex="t";
		String endIndex="C";
		for (int i=myNumber;i>1; i--){
			myCombination=startIndex+myCombination.substring(1, myCombination.length()-1)+endIndex;
		}
		 return myCombination;
	}
	public static void main(String[] args) {
		Task2 myInstance=new Task2();
		System.out.println(myInstance.showCombination(1,7));
	}
}
package lesson_3.part1;

public class Task8 {
 public String showCombination(String myWord, int myNumber){
	 String myCombination="";
	 for (int i=myNumber;i>=1; i--){
		 myCombination=myCombination+myWord.substring(0,i);
		 
	 }
	 
	 return myCombination;
 }
	public static void main(String[] args) {
	Task8 myInstance=new Task8();
	System.out.println(myInstance.showCombination("Testing", 4));
	System.out.println(myInstance.showCombination("SoftwareTesting", 12));
	}

}

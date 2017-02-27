package Test;

public class Task_test_1_8 {
	public String showCombinationOfEnteredSentence(String myCombination, int myNumberOfWord){
		String combinationOfWord="";
		for(int i=myNumberOfWord; i>=1;i--){
			combinationOfWord=combinationOfWord+myNumberOfWord.substring(1,i);
		}
		return combinationOfWord;
	}

	public static void main(String[] args) {
		Task_test_1_8 myInstance=new Task_test_1_8();
		
System.out.println(myInstance.showCombinationOfEnteredSentence("Programm", 5));
	}

}

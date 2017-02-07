package lesson_3.part2;

public class Task14 {
	
	public void showTextInDiagonal (String textOfSentence){
		String mySpaces="";
		for (int i=0; i<textOfSentence.length(); i++){
			System.out.print(mySpaces+textOfSentence.substring(i, i+1)+"\n");
			mySpaces+=" ";
		}
	}
		
		
	public static void main(String[] args) {
		Task14 myInstance=new Task14();
		myInstance.showTextInDiagonal("Testing");
		
	}


	public void totalAccount(String string) {
		// TODO Auto-generated method stub
		
	}
	}

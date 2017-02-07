package lesson_3.part2;

public class Task14_1 {
	String textOfSentence;
	
	public Task14_1(String textOfSentence) {
		this.textOfSentence=textOfSentence;
	}

	public void textShowDiagonal(){
		String mySpace="";
		for(int i=0; i<textOfSentence.length();i++){
			System.out.println(mySpace+textOfSentence.substring(i, i+1));
		mySpace+="  ";
		}
		
	}

	public static void main(String[] args) {
		Task14_1 myInstance= new Task14_1("Lesson");
		Task14_1 myInstance2= new Task14_1("LessonEnglish");
		
		myInstance.textShowDiagonal();
		myInstance2.textShowDiagonal();

	}

}

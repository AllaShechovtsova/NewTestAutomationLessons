package lesson3.practica;

public class HowManyWordsInSentence {
	public int wordCount (String mySentence, String myWord){
		int wordQuantity=0;
		for(int i=0; i<mySentence.length()-myWord.length(); i++){
			if( mySentence.substring(i, i+myWord.length()).equals(myWord))
				
				{
				wordQuantity++;
				};
		}
		return wordQuantity;
	}

	public static void main(String[] args) {
		String mySentence=" Work is hard but Work is intresting";
		String myWord= "Work";
		HowManyWordsInSentence myInstance=new HowManyWordsInSentence();
		
		System.out.println("В предложении "+mySentence+ " слово "+ myWord+ " встречается " +myInstance.wordCount(mySentence, myWord)+" раз ");

	}

}

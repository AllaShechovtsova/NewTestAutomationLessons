package lesson3.practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
	private  void readFile1(String fileName, String myWord) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
	 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println("В предложении "+line+ " слово "+ myWord+ " встречается " +wordCount(line, myWord)+" раз ");	
		}
	 
		br.close();
	}
	public static void main(String[] args) throws IOException {
		String mySentence=" Work is hard but Work is intresting";
		String myWord= "Work";
		HowManyWordsInSentence myInstance=new HowManyWordsInSentence();
		
	
		myInstance.readFile1("C:\\Users\\Пользователь\\git\\asproject\\NewTestAutomationFramework\\config\\myTextFile.txt","agreement");

	}

}

package lesson_3.part3;

public class Task4 {
	// char to have number from 48-57
	public int getSumOfNumbersFromString (String myString){
		int mySum=0;
		for (int i=0; i<myString.length();i++)
		{char oneChar = myString.charAt(i);
		if ((int)oneChar >=48 &&(int)oneChar <=57 ){
			 mySum+=Character.getNumericValue(oneChar);
		}
		} //char="a"
		return mySum;
	}

	public static void main(String[] args) {
		Task4 myInstance= new Task4();
		System.out.println(myInstance.getSumOfNumbersFromString("yourMethod(\"krm236abw\") 11"));
	}

}

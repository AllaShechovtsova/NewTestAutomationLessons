package lesson3.part1.additional;

public class TaskIntermediate4 {
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
		TaskIntermediate4 myInstance= new TaskIntermediate4();
		System.out.println(myInstance.getSumOfNumbersFromString("yourMethod(\"krm236abw\") 11"));
	}

}

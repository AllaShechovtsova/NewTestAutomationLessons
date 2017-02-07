package lesson_3.part3;

public class Task_Test {
    
    private static final String String = null;
	static boolean isUpper(String word) {
        for(char ch : word.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                return false;
            }
        }
        return true;
    }
	public void textShowDiagonal(java.lang.String wordArray){
		String mySpace="";
		for(int i=0; i<wordArray.length();i++){
			System.out.println(mySpace+wordArray.substring(i, i+1));
		mySpace+="  ";
		}
		
	}
	//public String getSumOfNumbersFromString (String myString){
		//String mySum="checkChangingProfilePicture";
		//for (int i=0; i<myString.length();i++)
		//{char oneChar = myString.charAt(i);
		//if ((int)oneChar >=48 &&(int)oneChar <=57 ){
			 //mySum=" " + (oneChar);
		//}
		//} //char="a"
		//return mySum;
	//}
	//System.out.println();
  

    static String format(String line) {
        String[] wordArray = line.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String word : wordArray) {
            if(!isUpper(word)) {
                word = word.toLowerCase();
            }
            sb.append(word);
            sb.append(" ");
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0))); 
        return sb.toString();
    

    
	
    }
    public static void main(String[] args) {
        
        System.out.println(format("checkChangingProfilePicture"));
        
        
    }
}
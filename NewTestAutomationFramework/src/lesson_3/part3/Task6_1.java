package lesson_3.part3;

public class Task6_1 {
	public void selectWord (String myText){
	
	String text = "Configuring accessibility options for textual editors";
    String words[] = text.split("[^a-zA-Z]");
    int i, size = words.length;
    int iMax = -1, iMaxLength = -1;
    for (i = 0; i < size; ++i)
       if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
          iMax = i;
          iMaxLength = words[i].length();
       }
    if (iMax == -1)
       System.err.println("String has no contains words");
    else
       System.out.println("word = " + words[iMax]);
 }
	
	 
	   public static void main(String[] args) {
		   Task6_1 myInstance=new Task6_1();
		   myInstance.selectWord(null);
	      
	}
}
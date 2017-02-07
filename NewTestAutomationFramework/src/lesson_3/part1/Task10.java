package lesson_3.part1;
public class Task10{
	
public String showAsterics (int astericsQuantity){
	String lineWithAsterics="";
	for(int i=1; i<=astericsQuantity; i++){
		lineWithAsterics+="*";
	}
	return lineWithAsterics;
}	
public void showBigArrow(int arrowLenght){
 for(int i=1;i<=arrowLenght; i++){
	System.out.println(showAsterics(i));
	
 }	
 for(int i=arrowLenght-1;i>=1; i--){
	 System.out.println(showAsterics(i));
	 }	
	
}
public static void main (String [] args){
	Task10 myInstance= new Task10();
	myInstance.showBigArrow(6);
}
}
		
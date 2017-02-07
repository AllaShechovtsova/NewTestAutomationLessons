package lesson_3.part2;

public class Task1_2 {
	public boolean weWiilGoToCinema(boolean heSmile, boolean sheSmile){
		boolean result=true;
		if (heSmile==false||sheSmile==false){
			result=false;
		}
		return result;
	}

	public static void main(String[] args) {
		Task1_2 myIntance=new Task1_2();
		System.out.println(myIntance.weWiilGoToCinema(true, true));
		System.out.println(myIntance.weWiilGoToCinema(true, false));
		System.out.println(myIntance.weWiilGoToCinema(false, true));
		System.out.println(myIntance.weWiilGoToCinema(false, false));
		
	}

}

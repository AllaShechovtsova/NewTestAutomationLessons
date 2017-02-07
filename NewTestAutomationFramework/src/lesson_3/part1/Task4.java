package lesson_3.part1;

public class Task4 {
	public static void main (String arg[]) {
		int Mas [] = {1,5,4,5,7,4,1,2,3,4,5,7,4,8,7,5};
		int y = 4;
		Select(Mas, y);
	}
	public static int Select (int Mass[],int num){
		int x=0;
		for (int i=0; i< Mass.length; i++)
		{
	if (Mass[i]==num){
		x=x+1;
	}
}
 System.out.println(x);
 return x;
	}
}

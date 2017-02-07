package lesson_3.part2;
 public class Task8 {
	 public  double fibonacciRecusion(int number) {
			if (number == 1 || number == 2) {
				return 1;
			}else
	 
			return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
		}
	 public static void main (String [] args){
		 Task8 myInstance= new Task8();
		 for (int i=1; i<=100; i++){
			 System.out.println(i+" = "+myInstance.fibonacciRecusion(i));
	 }
	 }
 }
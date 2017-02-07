package lesson3.part1.additional;
 public class Task18 {
	 public  double fibonacciRecusion(int number) {
			if (number == 1 || number == 2) {
				return 1;
			}else
	 
			return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
		}
	 public static void main (String [] args){
		 Task18 myInstance= new Task18();
		 for (int i=1; i<=100; i++){
			 System.out.println(i+" = "+myInstance.fibonacciRecusion(i));
	 }
	 }
 }
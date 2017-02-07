package lesson3.part1.additional;

	import java.io.*;

	public class proba {

	   public static void main(String args[]) {
	        String Str = new String("text");

	        System.out.println("Возвращаемое значение: ");
	        for (String retval : Str.split("-", 2)) {
	            System.out.println(retval);
	        }
	        System.out.println();
	        System.out.println("Возвращаемое значение: ");
	        for (String retval : Str.split("-", 3)) {
	            System.out.println(retval);
	        }
	        System.out.println();
	        System.out.println("Возвращаемое значение: ");
	        for (String retval : Str.split("-", 0)) {
	            System.out.println(retval);
	        }
	        System.out.println();
	        System.out.println("Возвращаемое значение: ");
	        for (String retval : Str.split(" /n ")) {
	            System.out.println(retval);
	        }
	    }
	}
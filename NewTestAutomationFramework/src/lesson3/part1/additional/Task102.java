package lesson3.part1.additional;

import java.util.Scanner;

public class Task102 {
	
	public static void main(String[] args) {
		Scanner vv=new Scanner (System.in);
		int var;
		String s="";
		System.out.print("Enter the maximum width-");
		var=vv.nextInt();
		for (int i=1, j=var; i<=2*var; i++){
			if(i<=var){
				s=s+"*";
				System.out.println();
			}
			else{
				j=j-1;
			System.out.println(s.substring(0,4));
			}
		}
			vv.close();
		
	}

}

package lesson_3.part2;

public class Task13 {
	public void calculatinQuadranticEquation (double firstNumber, double secondNumber, double thirdNumber ){
		float a = 4,b = 5,c = 1;
		double x1,x2;
		float d;
		d=(b*b)-(4*a*c);
		System.out.println("Дискриминант = "+ d);
	if (d<0)
		System.out.println("Уравнение не имеет решений");
	else
		if (d==0){
			x1=(-b)/(2*a);
			System.out.println("x = " + x1);
			}
		else {
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			if (x1==x2)
				System.out.println("x1=x2" +x1);
			else
				System.out.println("x1= "  +x1+ " x2= " + x2 );
		}
	
		}
	

	public static void main(String[] args) {
		Task13 myInstance= new Task13();
		myInstance.calculatinQuadranticEquation(1, 1, 1);

	}

}

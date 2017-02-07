package lesson3.part1.additional;
class Task16{
	public void countSumElementMas(int sumElement, double arifhmeticAverage){
		int myArray[] = {3,5,7,12,67};
	    int sum1=0;
	    double res=0;
	    for(int i=0; i<myArray.length; i++) {
	        sum1=sum1+myArray[i];
	        res=sum1/myArray.length;
	    }
	    System.out.println(sum1);
	    System.out.println(res);
	}
	public static void main(String[] args) {
   Task16 myInstance=new Task16();
   myInstance.countSumElementMas(0,0);
}
}
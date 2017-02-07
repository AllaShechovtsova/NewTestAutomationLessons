package lesson_3.part2;
class Task6{
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
   Task6 myInstance=new Task6();
   myInstance.countSumElementMas(0,0);
}
}
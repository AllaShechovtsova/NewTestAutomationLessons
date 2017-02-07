package lesson_3.part2;
class Task7{

	public void showMaxMinNumbersFromArray(int MaxElement, int MinElement) {
	int [] arrayElement={1,6,8,9,0,9,7,6,9,0,44,67,88,90,23,32,48,78};
	int max = 0;
    int min = 0;
    for(int i = 0; i<arrayElement.length; i++){
        if(max<arrayElement[i])
            max = arrayElement[i]*2;
        if(min>arrayElement[i])
            min = arrayElement[i]*2;
    }
    System.out.println("Max: "+max);
    System.out.println("Min:"+min);}

public static void main(String[] args) {
	Task7 myInstance = new Task7();
	myInstance.showMaxMinNumbersFromArray(0, 0);
    }
}
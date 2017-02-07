package lesson_3.part2;



public class Task22 {

	public boolean findSubsequenceInSequence(int[] mySequence, int[] mySubSequence) {
		boolean result = false;
		for(int i=0; i<mySequence.length-mySubSequence.length;i++){
			int coincedence=0;
			
			for(int j=0; j<mySubSequence.length; j++){
				
				if(mySequence[i+j]==mySubSequence[j]){
					coincedence++;
				}
			}
			//DEBUG
			System.out.println("coincedence=" +coincedence);
			// end debug
			if (coincedence==mySubSequence.length){
				result=true;
						}
		}
		return result;
	}

	public static void main(String[] args) {
		Task22 myInstance = new Task22();
		int[] mySequence = { 3, 5, 6, 3, 1, 2, 3, 9, 0, 6, 5 };
		int[] mySubSequence = { 1, 2, 3 ,9};
		
System.out.println(myInstance.findSubsequenceInSequence(mySequence, mySubSequence));

	}
	
}

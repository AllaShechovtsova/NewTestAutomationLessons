package lesson3.part1.additional;

public class Task5 {
	public String getMarkName(int markNumber){
		String markName="";
		switch(markNumber) {
	    case 1: 
	    	markName = "The name of mark "+markNumber+ " is Very bad";
			break;
	    case 2: 
	    	markName = "The name of mark "+markNumber+ " is Bad";
			break;
	    case 3: 
	    	markName = "The name of mark "+markNumber+ " is Average";
			break;
	    case 4: 
	    	markName = "The name of mark "+markNumber+ " is Good";
			break;
	    case 5: 
	    	markName = "The name of mark "+markNumber+ " is Excellent";
			break;
		
		default: 
			markName = "I don't know the name of mark "+ markNumber;
		    break;
	}
		return markName;
	}
	public static void main(String[] args) {
		Task5 myInstance=new Task5();
		for (int j=0; j<=6; j++)
			System.out.println(myInstance.getMarkName(j));
		
	}

}

package lesson_3.part3;



public class Task5 {
	public String converterTemp(int temperature, char convertTo) {
	if(convertTo=='C'){
		temperature=temperature+273;
		convertTo='F';
			}else if (convertTo=='F'){
				temperature=temperature-273;
				convertTo='C';
			}else{
			System.out.println("Data error");	
							}
		return converterTemp(temperature,convertTo);
	}
		
	public static void main(String[] args) {
	    	Task5 myInstance=new Task5();
	    	myInstance.converterTemp(67, 'C');
	    		    	System.out.println(); 
	        
	    }
	}



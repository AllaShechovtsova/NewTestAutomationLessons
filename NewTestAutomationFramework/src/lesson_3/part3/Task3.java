package lesson_3.part3;

public class Task3 {
	    public static void main(String[] args) {
	        int[] a = new int[20];
	        
	        for(int i=0; i<a.length; ++i){
	            if(i == 0){
	                a[i] = 1;
	            } else {
	                a[i] = a[i-1] + 1;
	            }
	        }
	        
	        for(int x: a){
	            System.out.print(x+" ");
	        }
	        
	        System.out.println();
	        
	        for(int i=a.length-1; i>=0; --i){
	            System.out.print(a[i]+" ");
	        }
	    }
	}


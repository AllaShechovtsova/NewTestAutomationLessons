package lesson1.part3.customergoodsextension;

public class Turner extends lesson1.part2.Worker {

	private int numberOfRating;
	private int quantityOfWork;
	private int healthOfworker;
	
	public void increaseOnWorker(int newSalary){
		 changeDepartment();
		 setWorkerSalary(newSalary);
		 leaveCompany();
		
	}
}

package lesson1.part3.customergoodsextension;

public class Football extends lesson1.part2.Sport{
	private int numberOfGoal;
	private int quantityOfFootballer;
	private int healthOfTrainer;

	public void haveOnSport(int newCost){
		ratingSport();
		setSportCost(newCost);
		developSport();
	}
	
}



package lesson1.part3.customergoodsextension;

public class NewPaper extends lesson1.part2.Press {

	private int numberOfList;
	private int quantityOfPaper;
	private int quantityOfPicture;

	public void realeseOnPress(int newPrice){
		buyPress();
		setPressPrice(newPrice);
		utilizePress();
	}
}
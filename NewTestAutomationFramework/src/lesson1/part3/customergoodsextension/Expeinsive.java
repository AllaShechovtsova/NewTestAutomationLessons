package lesson1.part3.customergoodsextension;

public class Expeinsive extends lesson1.part2.CustomerGoods{
	private int quantityOfCloth;
	private int avaibilityOfSize;
	private int diversityOfColor;
	
	public void giveOnCustomerGoods(int newCost){
		sellGood();
		setGoodCost(newCost);
		utilizeGood();
		
}

}

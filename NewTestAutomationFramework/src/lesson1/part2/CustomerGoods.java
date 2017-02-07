package lesson1.part2;

public class CustomerGoods {
	private String goodTitle; 
	private int goodCost;
	private String  goodType;
	private int  goodSize;
	private String  goodIssueDate;
	
	public String getGoodTitle() {
		return goodTitle;
	}
	public void setGoodTitle(String goodTitle) {
		this.goodTitle = goodTitle;
	}
	public int getGoodCost() {
		return goodCost;
	}
	public void setGoodCost(int goodCost) {
		this.goodCost = goodCost;
	}
	public String getGoodType() {
		return goodType;
	}
	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}
	public int getGoodSize() {
		return goodSize;
	}
	public void setGoodSize(int goodSize) {
		this.goodSize = goodSize;
	}
	public String getGoodIssueDate() {
		return goodIssueDate;
	}
	public void setGoodIssueDate(String goodIssueDate) {
		this.goodIssueDate = goodIssueDate;
	}
	public void buyGood(){;}
	public void sellGood(){;}
	public void presentGood(){;}
	public void returnGood(){;}
	public void utilizeGood(){;}
}

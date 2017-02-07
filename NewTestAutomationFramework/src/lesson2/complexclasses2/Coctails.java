package lesson2.complexclasses2;

public class Coctails {
	private int coctailId; 
	private String coctailType;
	private String  coctailName;
	private int  coctailCost;
	private String  coctailSturdiness;
	public int getCoctailId() {
		return coctailId;
	}
	public void setCoctailId(int coctailId) {
		this.coctailId = coctailId;
	}
	public String getCoctailType() {
		return coctailType;
	}
	public void setCoctailType(String coctailType) {
		this.coctailType = coctailType;
	}
	public String getCoctailName() {
		return coctailName;
	}
	public void setCoctailName(String coctailName) {
		this.coctailName = coctailName;
	}
	public int getCoctailCost() {
		return coctailCost;
	}
	public void setCoctailCost(int coctailCost) {
		this.coctailCost = coctailCost;
	}
	public String getCoctailSturdiness() {
		return coctailSturdiness;
	}
	public void setCoctailSturdiness(String coctailSturdiness) {
		this.coctailSturdiness = coctailSturdiness;
	}
	public void selectCoctail(){;}
	public void drinkCoctail(){;}
	public void tastyCoctail(){;}
	public void buyCoctail(){;}
	public void madeCoctail(){;}
}

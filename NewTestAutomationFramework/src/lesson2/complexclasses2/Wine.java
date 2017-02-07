package lesson2.complexclasses2;

public class Wine {
	private int wineId; 
	private String wineType;
	private String  wineName;
	private int  wineCost;
	private String  wineCountry;
	
	public int getWineId() {
		return wineId;
	}
	public void setWineId(int wineId) {
		this.wineId = wineId;
	}
	public String getWineType() {
		return wineType;
	}
	public void setWineType(String wineType) {
		this.wineType = wineType;
	}
	public String getWineName() {
		return wineName;
	}
	public void setWineName(String wineName) {
		this.wineName = wineName;
	}
	public int getWineCost() {
		return wineCost;
	}
	public void setWineCost(int wineCost) {
		this.wineCost = wineCost;
	}
	public String getWineCountry() {
		return wineCountry;
	}
	public void setWineCountry(String wineCountry) {
		this.wineCountry = wineCountry;
	}
	public void selectWine(){;}
	public void drinkWine(){;}
	public void tastyWine(){;}
	public void buyWine(){;}
	public void produceWine(){;}
}

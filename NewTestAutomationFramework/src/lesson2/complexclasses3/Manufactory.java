package lesson2.complexclasses3;

public class Manufactory {
	private int manufactoryId; 
	private String manufactoryType;
	private String  manufactoryCategory;
	private String manufactoryGood;
	private String  manufactoryCountry;
	public int getManufactoryId() {
		
		return manufactoryId;
	}
	public void setManufactoryId(int manufactoryId) {
		this.manufactoryId = manufactoryId;
	}
	public String getManufactoryType() {
		return manufactoryType;
	}
	public void setManufactoryType(String manufactoryType) {
		this.manufactoryType = manufactoryType;
	}
	public String getManufactoryCategory() {
		return manufactoryCategory;
	}
	public void setManufactoryCategory(String manufactoryCategory) {
		this.manufactoryCategory = manufactoryCategory;
	}
	public String getManufactoryGood() {
		return manufactoryGood;
	}
	public void setManufactoryGood(String manufactoryGood) {
		this.manufactoryGood = manufactoryGood;
	}
	public String getManufactoryCountry() {
		return manufactoryCountry;
	}
	public void setManufactoryCountry(String manufactoryCountry) {
		this.manufactoryCountry = manufactoryCountry;
	}
	public void selectManufactory(){;}
	public void checkManufactory(){;}
	public void buildManufactory(){;}
	public void recoveryManufactory(){;}
	public void sellManufactory(){;}
}

package lesson2.complexclasses1;

public class MusicInstrument {
	private int musicInstrumentId; 
	private String musicInstrumentType;
	private String  musicInstrumentName;
	private int  musicInstrumentCost;
	private String  musicInstrumentIssueDate;
	public int getMusicInstrumentId() {
		return musicInstrumentId;
	}
	public void setMusicInstrumentId(int musicInstrumentId) {
		this.musicInstrumentId = musicInstrumentId;
	}
	public String getMusicInstrumentType() {
		return musicInstrumentType;
	}
	public void setMusicInstrumentType(String musicInstrumentType) {
		this.musicInstrumentType = musicInstrumentType;
	}
	public String getMusicInstrumentName() {
		return musicInstrumentName;
	}
	public void setMusicInstrumentName(String musicInstrumentName) {
		this.musicInstrumentName = musicInstrumentName;
	}
	public int getMusicInstrumentCost() {
		return musicInstrumentCost;
	}
	public void setMusicInstrumentCost(int musicInstrumentCost) {
		this.musicInstrumentCost = musicInstrumentCost;
	}
	public String getMusicInstrumentIssueDate() {
		return musicInstrumentIssueDate;
	}
	public void setMusicInstrumentIssueDate(String musicInstrumentIssueDate) {
		this.musicInstrumentIssueDate = musicInstrumentIssueDate;
	}
	public void selectMusicInstrument(){;}
	public void changeMusicInstrument(){;}
	public void studyMusicInstrument(){;}
	public void playMusicInstrument(){;}
	public void useMusicInstrument(){;}
	
}

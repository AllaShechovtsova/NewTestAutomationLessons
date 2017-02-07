package lesson1.part3.customergoodsextension;

public class Fortepiano extends lesson1.part2.MusicalInstruments {

	private int numberOfPedals;
	private int quantityOfBlackKeys;
	private int quantityOfWhiteKeys;

	public void bargainOnMusicalInstruments(int newPrice){
		buyInstrument();
		setInstrumentPrice(newPrice);
		sellInstrument();
	}
}

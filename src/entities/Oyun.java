package entities;

public class Oyun {
	private String ad;
	private int fiyat = 0;
	public Oyun(String ad, int fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}
	public Oyun() {
		
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		if(fiyat>0)
			this.fiyat = fiyat;

	}
	
}

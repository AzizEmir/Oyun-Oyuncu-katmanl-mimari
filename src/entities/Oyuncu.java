package entities;

public class Oyuncu {
	private String ad;
	private String soyad;
	private String id;
	private String dogumGunu;
	private long kimlikNo;

	public Oyuncu(String ad, String soyad, String id, String dogumGunu, long kimlikNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
		this.dogumGunu = dogumGunu;
		this.kimlikNo = kimlikNo;
	}

	public Oyuncu() {
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDogumGunu() {
		return dogumGunu;
	}

	public void setDogumGunu(String dogumGunu) {
		this.dogumGunu = dogumGunu;
	}

	public long getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(long kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
}

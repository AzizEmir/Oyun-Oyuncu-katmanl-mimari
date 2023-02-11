package entities;

public class Indirim {
	private int indirimNetMiktar;
	private byte indirimOran;
	
	
	public Indirim() {
		
	}
	public Indirim(int indirim) {
		super();
		this.indirimNetMiktar = indirim;
	}

	public int getIndirim() {
		return indirimNetMiktar;
	}

	public void setIndirim(int kampanya) {
		this.indirimNetMiktar = kampanya;
	}
	
	public byte getIndirimOran() {
		return indirimOran;
	}
	public void setIndirimOran(byte indirimOran) {
		this.indirimOran = indirimOran;
	}
}

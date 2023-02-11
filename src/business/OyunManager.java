package business;

import dataAccsess.IOyunDao;
import entities.Oyun;
import entities.Oyuncu;

public class OyunManager implements IOyunDao{

	@Override
	public void add(Oyuncu oyuncu,Oyun oyun) {
		
		if(oyuncu.getAd() != null) {
			
			System.out.println("'" +oyun.getAd() + "'" + " adindaki oyun, \r"
					+" bu fiyata : " + oyun.getFiyat() + ",\r" +
					" bu oyuncuya : " + oyuncu.getAd() + " " + oyuncu.getSoyad()+ " satilmistir");

		}
				
	}
	
	/* Encapsulation yapılırken fiyatın 0'dan küçük olması engellenmiştir.
	 
	public void add(Oyun oyun) throws Exception{
		if(oyun.getFiyat() < 0) {
			throw new Exception("Fiyat 0'dan kucuk olamaz! ");
		}
	}
	*/
	

}

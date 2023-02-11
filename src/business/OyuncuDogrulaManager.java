package business;

import entities.Oyuncu;

public class OyuncuDogrulaManager implements IOyuncuDogrula {

	@Override
	public boolean dogrula(Oyuncu oyuncu) {
		if (oyuncu.getAd() == "Aziz" 
				&& oyuncu.getSoyad() == "Emir" 
				&& oyuncu.getId() == "1"
				&& oyuncu.getDogumGunu() == "2006" 
				&& oyuncu.getKimlikNo() == 123456789
				|| 
				oyuncu.getAd() == "Asiz" 
				&& oyuncu.getSoyad() == "durden" 
				&& oyuncu.getId() == "1"
				&& oyuncu.getDogumGunu() == "2006" 
				&& oyuncu.getKimlikNo() == 123456789) {
			return true;
		} else {
			return false;
		}
	}

}

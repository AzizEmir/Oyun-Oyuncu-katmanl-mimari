package business;

import dataAccsess.IOyuncuDao;
import entities.Oyuncu;

public class OyuncuManager implements IOyuncuDao {
	OyuncuDogrulaManager oyuncuDogrulaManager;

	public OyuncuManager(OyuncuDogrulaManager oyuncuDogrulaManager) {
		super();
		this.oyuncuDogrulaManager = oyuncuDogrulaManager;
	}

	@Override
	public void add(Oyuncu oyuncu) {
		
		if (oyuncuDogrulaManager.dogrula(oyuncu)) {
			System.out.println("Basariyla eklendi : " + oyuncu.getAd() + " " + oyuncu.getSoyad());
		} else {
			System.out.println("Oyuncu ekleme : Basarisiz");
		}
	}

	@Override
	public void delete(Oyuncu oyuncu) {
		
		if (oyuncuDogrulaManager.dogrula(oyuncu)) {
			System.out.println("Musteri silindi : " + oyuncu.getAd() + " " + oyuncu.getSoyad());
			
			oyuncu.setAd(null);
			oyuncu.setDogumGunu(null);
			oyuncu.setId(null);
			oyuncu.setKimlikNo(0);
			oyuncu.setSoyad(null);
			
		} else {
			System.out.println("Oyuncu silme : Basarisiz");
		}
		
	}

	@Override
	public void update(Oyuncu oyuncu) {
		
		if (oyuncuDogrulaManager.dogrula(oyuncu)) {
			System.out.println("Musteriler listelendi : " + oyuncu.getAd() + " " + oyuncu.getSoyad());
		} else {
			System.out.println("Oyuncu guncelleme : Basarisiz");
		}

	}

	@Override
	public void list(Oyuncu oyuncu2,Oyuncu[] oyuncu) {
		
		if (oyuncuDogrulaManager.dogrula(oyuncu2)) {
			for (Oyuncu oyuncu3 : oyuncu) {
				System.out.println("Oyuncular listelendi : " + oyuncu3.getAd() +" "+ oyuncu3.getSoyad());
			}
		} else {
			System.out.println("Oyuncu listeleme : Basarisiz");
		}
		
		
	}

}

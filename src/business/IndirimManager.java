package business;

import dataAccsess.IIndirimDao;
import entities.Indirim;
import entities.Oyun;
import entities.Oyuncu;

public class IndirimManager implements IIndirimDao {

	@Override
	public void addNet(Oyuncu oyuncu, Oyun oyun, Indirim indirim) {
		String cikti = "Oyuncu : " + oyuncu.getAd() + " " + oyuncu.getSoyad() + ", \rOyun : " + oyun.getAd();
		if (oyuncu.getAd() != null) {
			if (oyun.getFiyat() > indirim.getIndirim())
				System.out.println(cikti + " \r" + indirim.getIndirim() + " TL " + "indirimli fiyat "
						+ (oyun.getFiyat() - indirim.getIndirim()));

			else
				System.out.println(cikti + "\r" + "indirim uygulanmamistir");
		}
	}

	@Override
	public void addOran(Oyuncu oyuncu, Oyun oyun, Indirim indirim) {
		String cikti = "Oyuncu : " + oyuncu.getAd() + " " + oyuncu.getSoyad() + ", \rOyun : " + oyun.getAd();
		
		if (oyuncu.getAd() != null) {
			
			if (oyun.getFiyat() > indirim.getIndirim())
				System.out.println(cikti + " \r" + "Yuzde " + indirim.getIndirim() + " indirimli fiyat "
						+ ((oyun.getFiyat() - (oyun.getFiyat() * indirim.getIndirim()) / 100)));
			else
				System.out.println(cikti + "\r" + "indirim uygulanmamistir");
		}
	}

}

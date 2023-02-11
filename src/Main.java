import business.IndirimManager;
import business.OyunManager;
import business.OyuncuDogrulaManager;
import business.OyuncuManager;
import entities.Indirim;
import entities.Oyun;
import entities.Oyuncu;

public class Main {

	public static void main(String[] args) {
		
		Oyuncu oyuncu = new Oyuncu();
		oyuncu.setAd("Aziz");
		oyuncu.setSoyad("Emir");
		oyuncu.setDogumGunu("2006");
		oyuncu.setId("1");
		oyuncu.setKimlikNo(123456789);
		
		Oyuncu oyuncu2 = new Oyuncu();
		oyuncu2.setAd("Asiz");
		oyuncu2.setSoyad("Durden");
		oyuncu2.setDogumGunu("2006");
		oyuncu2.setId("1");
		oyuncu2.setKimlikNo(123456789);
		
		Oyuncu[] oyuncular = new Oyuncu[] {oyuncu, oyuncu2};
		
		OyuncuManager oyuncumanager = new OyuncuManager(new OyuncuDogrulaManager());
		
		oyuncumanager.add(oyuncu);
		//oyuncumanager.delete(oyuncu);
		oyuncumanager.update(oyuncu);
		oyuncumanager.list(oyuncu,oyuncular);	
		
		System.out.println(" ");
		
		Oyun oyun = new Oyun();
		oyun.setAd("CoD");
		oyun.setFiyat(1000);
		
		OyunManager oyunManager = new OyunManager();
		oyunManager.add(oyuncu,oyun);
		
		Indirim indirim = new Indirim();
		indirim.setIndirim(10); 	
		
		System.out.println(" ");
		
		IndirimManager indirimManager = new IndirimManager();
		indirimManager.addNet(oyuncu,oyun,indirim); System.out.println(" ");
		
		indirimManager.addOran(oyuncu,oyun,indirim);

	}

}

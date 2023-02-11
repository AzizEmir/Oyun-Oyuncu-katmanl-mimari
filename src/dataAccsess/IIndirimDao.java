package dataAccsess;

import entities.Indirim;
import entities.Oyuncu;
import entities.Oyun;

public interface IIndirimDao {
	void addNet(Oyuncu oyuncu,Oyun oyun,Indirim indirim);
	void addOran(Oyuncu oyuncu,Oyun oyun,Indirim indirim);

}

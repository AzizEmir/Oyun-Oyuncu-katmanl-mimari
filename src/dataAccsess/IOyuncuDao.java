package dataAccsess;

import entities.Oyuncu;

public interface IOyuncuDao {
	void add(Oyuncu oyuncu);
	void delete(Oyuncu oyuncu);
	void update(Oyuncu oyuncu);
	void list(Oyuncu oyuncu2,Oyuncu[] oyuncu);
}

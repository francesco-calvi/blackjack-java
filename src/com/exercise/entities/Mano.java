package com.exercise.entities;

import java.util.ArrayList;
import java.util.List;

public class Mano {
	private List<Carta> mano = new ArrayList<>();
	
	public void aggiungi(Carta carta) {
		mano.add(carta);
	}
	
	public String getMano() {
		String ris = "";
		for(int i = 0; i < mano.size(); i++)
			ris += mano.get(i).scheda() + "\n";		
		return ris;
	}

	@Override
	public String toString() {
		String res = "";
		for(Carta c : mano)
			res += c+"\n";
		return res;
	}

	public int getPunteggio() 	{
		int somma = 0;
		for(Carta c : mano) {
			if(c.getValore() > 10)
				somma += 10;
			if(c.getValore() == 1)
				somma += somma + 11 <= 21 ? 11 : 1;
			else
				somma += c.getValore();
		}
		return somma;
	}
}

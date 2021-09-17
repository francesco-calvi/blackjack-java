package com.exercise.entities;

import java.util.ArrayList;
import java.util.List;

public class Mazzo {
	private List<Carta> carte = new ArrayList<>();

	public Mazzo() {
		String[] semi = {"cuori", "fiori", "quadri", "picche"};
		for(int i=0;i<semi.length;i++) {
			for (int j = 1; j <= 13; j++) {
				Carta carta = new Carta();
				switch (j) {
					case 1:
						carta.setNome("asso");
						break;
					case 11:
						carta.setNome("jack");
						break;
					case 12:
						carta.setNome("regina");
						break;
					case 13:
						carta.setNome("re");
						break;
					default:
						carta.setNome(String.valueOf(j));
				}
				carta.setValore(j);
				carta.setSeme(semi[i]);
				carte.add(carta);
			}
		}
	}

	@Override
	public String toString() {
		return "Mazzo{"+
				 carte +
				'}';
	}

	public Carta pesca() {
		int indiceCasuale = (int) (Math.random() * carte.size());
		Carta carta = carte.get(indiceCasuale);
		_eliminaCarta(carta);
		return carta;
	}	

	private void _eliminaCarta(Carta pescata) {
		for(Carta c : carte) {
			if(c.equals(pescata)) {
				carte.remove(c);
				break;
			}
		}
	}

}

	

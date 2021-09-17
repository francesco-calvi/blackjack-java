package com.exercise.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mazzo
{
	private List<Carta> carte = new ArrayList<>();

	/*public Mazzo(String percorso) throws FileNotFoundException {
        Scanner file  = new Scanner(new File(percorso));

        carte = new Carta[Integer.parseInt(file.nextLine())];

        int i= 0;
        while (file.hasNextLine()) {
            String[] riga = file.nextLine().split(",");

            carte[i] = new Carta (
                                Integer.parseInt(riga[0]),
                                riga[1]);
            i++;
        }
        file.close();
    }*/

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
	
	/* Definire i seguenti metodi:
	 * Carta pesca() 
	 * Deve restituire una carta casuale dal mazzo, attenzione, che dovete rimuoverla 
	 * dal mazzo una volta pescata e restituirla */
	
	
	String elenco() {
		String ris = "";
		for(int i = 0; i < carte.size(); i++)
			ris += carte.get(i).scheda();
		return ris;
	}
	
	public Carta pesca() {
		// Attenzione che dovete "rimuovere" dall'array
		// ricreare l'array SENZA elemento
		
		int indiceCasuale = (int) (Math.random() * carte.size());
		/* Invoco il metodo eliminaCarta per toglierla dal mazzo;
		 *  N.B: salvo la carta in una stringa perch� dopo aver invocato
		 *  il metodo eliminaCarta avviene lo scambio con l'ultima carta del mazzo
		 *  e questa prende posizione all'indice passato. Quindi in return avrei sempre l'ultima
		 *  carta del mazzo invece di quella generata. */
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

		// TODO eliminare
		for(Carta c : carte) {
			if(c.equals(pescata)) {
				System.out.println(c);
			}
		}

	}

	/*void eliminaCarta(Carta pescata) {
		boolean corrispondenza = false;
		int indiceCarta = -1;		

		for(int i = 0; i < carte.size(); i++) {
			// confronto
			if(pescata.equals(carte.get(i))) {
				corrispondenza = true;
				indiceCarta = i;
				break;
			} // chiude if
		}// chiude for
		
		if(corrispondenza) {
//			carte = Arrays.copyOf(carte, carte.length);			
			Carta temp = carte.get(carte.size() - 1);
			carte[carte.length - 1] = carte[indiceCarta];
			carte[indiceCarta] = temp;
			carte = Arrays.copyOf(carte, carte.length - 1);	
		}*/
		
}

	

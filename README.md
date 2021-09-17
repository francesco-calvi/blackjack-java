# Blackjack Java
Questo è un Java console program che simula il gioco di carte Blackjack

### Funzionamento
Per prima cosa vengono pescate due carte per il giocatore e due per il banco, queste  sono generate a random partendo da un mazzo completo di 52 carte. 


Viene effettuato un calcolo del punteggio rispettando le seguenti regole

Valore delle carte:
- da 2 a 10 mantengono il loro valore
- le figure (jack,donna,re) valgono 10
- gli assi valgono 1 oppure 11

Viene poi chiesto all'utente se vuole pescare una o più carte, lo stesso farà il computer se dovesse avere un punteggio inferiore.

Il gioco termina quando uno dei giocatori ottiene un punteggio pari a 21 oppure "sballa".

### Esempio di output
```
Premi invio per iniziare
==============================================================
			BLACKJACK JAVA
==============================================================
I giocatori ricevono due carte a testa...

-BANCO
re di quadri
re di fiori

-GIOCATORE
3 di quadri
asso di quadri
==============================================================
                        PUNTEGGIO
-BANCO: 20
-GIOCATORE: 14
==============================================================
-GIOCATORE
Vuoi pescare una carta? S/N
S
Hai pescato: 9 di cuori
==============================================================
                        PUNTEGGIO
-BANCO: 20
-GIOCATORE: 23
==============================================================

HAI SBALLATO...IL BANCO VINCE!
==============================================================


Vuoi giocare ancora? S/N
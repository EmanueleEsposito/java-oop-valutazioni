package jana60.valutazioni;

public class Main {

	public static void main(String[] args) {

		// array di studenti
		Studente rogerFederer = new Studente(1, 25, 4);
		Studente rafaelNadal = new Studente(2, 50, 1);
		Studente novakDjokovic = new Studente(3, 51, 3);
		Studente andyMurray = new Studente(4, 35, 2);
		Studente stanislasWawrinka = new Studente(5, 10, 5);
		Studente[] arrayStudenti = { rogerFederer, rafaelNadal, novakDjokovic, andyMurray, stanislasWawrinka };

		// stampare a video per ogni studente se è stato promosso o bocciato e quanti
		// studenti sono stati promossi in tutto.
		int studentiPromossi = 0;
		for (int i = 0; i < arrayStudenti.length; i++) {
			if (arrayStudenti[i].esitoFinale()) {
				System.out.println(arrayStudenti[i].idStudente + "Promosso");
				studentiPromossi++;

			} else {
				System.out.println(arrayStudenti[i].idStudente + "Bocciato");
			}

		}

		// stampare il numero totale di studenti promossi
		System.out.println("il numero totale di studenti promossi è: " + studentiPromossi);
	}

}

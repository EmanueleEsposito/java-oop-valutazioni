package jana60.valutazioni;

public class Studente {
	// Attributi
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;

	// Costruttore
	public Studente(int idStudente, int percentualeAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}

	// metodo che calcola, in base a percentuale delle assenze e media dei voti, se
	// lo studente è promosso o bocciato
	boolean esitoFinale() {
		boolean promosso = false;
		if (percentualeAssenze > 50) {
			promosso = false;
		}
		if (percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2) {
			promosso = true;
		} else if (percentualeAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		}
		return promosso;
	}
}

package Libreria;

public class Rivista extends BooksElement {
	// public enum Periodicita {
	// WEEK, MONTH, SIXMONTH
	// }

	private Periodicita periodicita;

	public Rivista(long isbn, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Titolo:" + getTitolo() + ". Codice ISBN:" + getIsbn() + ". Anno di Pubblicazione:"
				+ getAnnoPubblicazione() + ". Pagine:" + getNumeroPagine() + ". Periodicita" + getPeriodicita();
	}

}

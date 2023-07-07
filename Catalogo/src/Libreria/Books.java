package Libreria;

public class Books extends BooksElement {
	private String autore;
	private String genere;

	public Books(long isbn, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.setAutore(autore);
		this.setGenere(genere);
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Titolo:" + getTitolo() + ". Codice ISBN:" + getIsbn() + ". Anno di Pubblicazione:"
				+ getAnnoPubblicazione() + ". Pagine:" + getNumeroPagine() + ". Autore:" + autore + ". Genere:"
				+ genere;
	}

}

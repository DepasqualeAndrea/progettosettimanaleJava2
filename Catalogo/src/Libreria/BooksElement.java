package Libreria;

public class BooksElement {

	private long isbn;
	private String titolo;
	private Integer annoPubblicazione;
	private Integer numeroPagine;

	public BooksElement(long isbn, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		this.setIsbn(isbn);
		this.setTitolo(titolo);
		this.setAnnoPubblicazione(annoPubblicazione);
		this.setNumeroPagine(numeroPagine);
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}

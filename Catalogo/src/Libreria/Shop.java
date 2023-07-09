package Libreria;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

	public static void main(String[] args) {
		Set<Books> libreria = new HashSet<>();
		Set<Rivista> cataloghi = new HashSet<>();

		libreria.add(new Books(4, "Il Vecchio e il Mare", 1952, 127, "Hemingway", "Romanzo"));
		libreria.add(new Books(5, "Harry Potter e la Pietra Filosofale", 1997, 223, "Rowling", "Fantasy"));
		libreria.add(new Books(6, "Il Codice Da Vinci", 2003, 689, "Brown", "Thriller"));
		libreria.add(new Books(7, "Il Grande Gatsby", 1925, 180, "Fitzgerald", "Romanzo"));
		libreria.add(new Books(8, "Orgoglio e Pregiudizio", 1813, 279, "Austen", "Romanzo"));

		cataloghi.add(new Rivista(1004, "Cosmopolitan", 2003, 150, Periodicita.WEEK));
		cataloghi.add(new Rivista(1005, "National Geographic", 1888, 1200, Periodicita.MONTH));
		cataloghi.add(new Rivista(1006, "Scientific American", 1845, 1000, Periodicita.MONTH));
		cataloghi.add(new Rivista(1007, "Time", 1923, 3000, Periodicita.SIXMONTH));
		cataloghi.add(new Rivista(1008, "Nature", 1869, 10000, Periodicita.SIXMONTH));

		System.out.println(libreria);
		System.out.println(cataloghi);

		SearchIsbn(libreria, 1004);
		SearchAnnoPub(libreria, 1952);
		searchAuthor(libreria, "Hemingway");
		addElement(libreria, new Books(12, "Il Pianista sull'oceano", 1994, 212, "De Pasquale", "Horror"));
		removeElement(libreria, 8);
		System.out.println(libreria);

	}

	public static void addElement(Set<Books> set, Books libreria) {
		if (set.add(libreria))
			System.out.println("Elemento aggiunto con successo.");
	}

	// remove method
	public static void removeElement(Set<Books> set, long isbn) {
		if (set.removeIf(e -> e.getIsbn() == isbn))
			System.out.println("Elemento eliminato con successo.");
	}

	// metodo search
	private static void SearchIsbn(Set<Books> libreria, long isbn) {
		Optional<Books> book = libreria.stream().filter(e -> e.getIsbn() == isbn).findFirst();
		if (book.isPresent()) {
			System.out.println("Hai selezionato:" + book.get().toString());
		} else {
			System.err.println("Libro non trovato");
		}

	}

	private static void SearchAnnoPub(Set<Books> libreria, int annoPubblicazione) {
		List<Books> yearPubblished = libreria.stream().filter(e -> e.getAnnoPubblicazione() == annoPubblicazione)
				.collect(Collectors.toList());
		System.out.println("Libri pubblicati nell'anno:" + annoPubblicazione);
		yearPubblished.forEach(System.out::println);
	}

	private static void searchAuthor(Set<Books> libreria, String autore) {
		List<Books> author = libreria.stream().filter(e -> e.getAutore() == autore).collect(Collectors.toList());
		System.out.println("Libri pubblicati nell'anno:" + autore);
		author.forEach(System.out::println);
	}

}
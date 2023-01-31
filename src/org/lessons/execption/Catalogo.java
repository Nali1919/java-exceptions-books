package org.lessons.execption;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Quanti libri?");
		int numeroLibri = s.nextInt();
		Libro[] libro = new Libro[numeroLibri];
		
		

		for (int i = 0; i < numeroLibri; i++) {
			System.out.println("Inserisci il nome del libro");
			String titolo = s.nextLine();
			s.nextLine();
			System.out.println("Inserisci pagine");
			int numeroPagine = s.nextInt();
			s.nextLine();
			System.out.println("Inserisci autore");
			String autore = s.nextLine();
			System.out.println("Inserisci editore");
			String editore = s.nextLine();

			try {
				libro[i] = new Libro(titolo, numeroPagine, autore, editore);
			
				if (titolo.equals("")) {
					throw new Exception("non puo' essere vuoto!");
				}
				if (numeroPagine <= 0) {
					throw new Exception("Le pagine non possono essere negative!");
				}
				if (autore.equals("")) {
					throw new Exception("l'autore non puo' essere vuoto!");
				}
				if (editore.equals("")) {
					throw new Exception("l'editore non puo' essere vuoto!");
				}

			} catch (Exception e) {
				System.out.println("C'è un errore: " + e.getMessage());
				i--;
			}

		}
		System.out.println("Ecco i tuoi libri:");
		for (int i = 0; i < numeroLibri; i++) {
			System.out.println("Libro" + (i + 1) + ":");
			System.out.println(libro[i].toString());
		}
	}

}
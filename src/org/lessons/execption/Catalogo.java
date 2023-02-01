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
			String titolo = s.next();
			System.out.println("Inserisci autore");
			String autore = s.next();
			System.out.println("Inserisci editore");
			String editore = s.next();
			System.out.println("Inserisci pagine");
			int numeroPagine = s.nextInt();

			libro[i] = new Libro(titolo, numeroPagine, autore, editore);

		}
		System.out.println("Ecco i tuoi libri:");
		for (int i = 0; i < numeroLibri; i++) {
			System.out.println("Libro" + (i + 1) + ":");
			System.out.println(libro[i].toString());
		}
	}

}
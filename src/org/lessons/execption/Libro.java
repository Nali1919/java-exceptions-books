package org.lessons.execption;

class Libro {
	private String titolo;
	private int pagineLibro;
	private String autore;
	private String editore;
	public Libro(String titolo, int pagineLibro, String autore, String editore) throws Exception {
		super();
		setTitolo(titolo);
		setPagineLibro(pagineLibro);
		setAutore(autore);
		setEditore(editore);
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		if(titolo.isEmpty()) {
			throw new Exception("C'è un errore sul titolo");
		}
		this.titolo = titolo;
	}
	public int getPagineLibro() {
		return pagineLibro;
	}
	public void setPagineLibro(int pagineLibro) throws Exception {
		if(pagineLibro < 0) {
			throw new Exception("Almeno una..");
		}
		this.pagineLibro = pagineLibro;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		if(autore.isEmpty())  {
			throw new Exception("C'è un errore sull'autore");
		}
		this.autore = autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) throws Exception {
		if(editore.isEmpty() ) {
			throw new Exception("C'è un errore sul titolo");
		}
		this.editore = editore;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", pagineLibro=" + pagineLibro + ", autore=" + autore + ", editore=" + editore
				+ "]";
	}
	
	

}
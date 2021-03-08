package model;

import java.time.LocalDate;

// java bean --> classe semplice senza logica
// POJO -  Plain Old  Java Object
// solo contenitore si dati

/**
 * Memorizza risultato di un esame singolo
 * @author matte
 *
 */
public class Voto {
	
	private String nomeCorso; 
	private int voto; 
	private LocalDate data;
	
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}


	public String getNomeCorso() {
		return nomeCorso;
	}


	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Esame " + nomeCorso + " supertato con " + voto + " il " + data;
	} 
	
	
	
	

}

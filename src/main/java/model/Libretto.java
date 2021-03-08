package model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti; 
	
	public Libretto() {
		this.voti = new ArrayList<Voto>(); 
	}
	
	public void add(Voto voto) {
		this.voti.add(voto);
	}
	
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> s =new ArrayList<>(); 
		
		for(Voto v: this.voti)
			if(v.getVoto()==punteggio)
				s.add(v);
		
		return s; 
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto s =new Libretto(); 
		
		for(Voto v: this.voti)
			if(v.getVoto()==punteggio)
				s.add(v);
		
		return s; 
	}
	
	public String toString() {
		String s=""; 
		
		for(Voto v:this.voti)
			s+= v.toString()+"\n";
		
		return s; 
		
	}
  
}

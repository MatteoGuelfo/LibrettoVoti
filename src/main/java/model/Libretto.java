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
	
	public String toString() {
		String s=""; 
		
		for(Voto v:this.voti)
			s+= v.toString()+"\n";
		
		return s; 
		
	}
  
}

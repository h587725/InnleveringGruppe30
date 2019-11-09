package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {
	private String tekst;
	// TODO: objektvariable 
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id,bruker,dato);
		this.tekst=tekst;
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker,dato,likes);
		this.tekst=tekst;
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		return tekst;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		String str;

		str = "TEKST" + "\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() +"\n" + tekst + "\n";
		return str;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

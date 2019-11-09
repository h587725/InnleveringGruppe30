package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		innleggstabell = new Innlegg[20];
		nesteledig =0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		nesteledig =0;

		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		// throw new UnsupportedOperationException(TODO.method());
		
		return nesteledig;

	}

	public Innlegg[] getSamling() {
		// throw new UnsupportedOperationException(TODO.method());
		return innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int p = -1;
		int i = 0;
		while (i < nesteledig && p == -1) {
			if (innleggstabell[i].erLik(innlegg)) {
				p = i;
			} else {
				i++;
			}
		}
		return p;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		if (finnInnlegg(innlegg) >= 0) {
			return true;
		} else {
			return false;
		}
		
		
	}
	

	public boolean ledigPlass() {
		return nesteledig < innleggstabell.length;

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagttil = false;
		if (!finnes(innlegg) && ledigPlass()) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		return lagttil;
	}

	public String toString() {
		String str = "" + nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			str += innleggstabell[i].toString();

		}

		return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}
package ar.edu.unlam;

import java.util.ArrayList;

public class Partido {
	
	private String local;
	private String visitante;
	private ArrayList<Jugador> nominaLocal;
	private ArrayList<Jugador> nominaVisitante;
	
	public Partido(String local, String visitante, ArrayList<Jugador> nominaLocal, ArrayList<Jugador> nominaVisitante) {
		setLocal(local);
		setVisitante(visitante);
		setNominaLocal(nominaLocal);
		setNominaVisitante(nominaVisitante);
		
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public ArrayList<Jugador> getNominaLocal() {
		return nominaLocal;
	}

	public void setNominaLocal(ArrayList<Jugador> nominaLocal2) {
		this.nominaLocal = nominaLocal2;
	}

	public ArrayList<Jugador> getNominaVisitante() {
		return nominaVisitante;
	}

	public void setNominaVisitante(ArrayList<Jugador> nominaVisitante) {
		this.nominaVisitante = nominaVisitante;
	}

}

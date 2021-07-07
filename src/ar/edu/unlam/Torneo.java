package ar.edu.unlam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Torneo {
	
	private ArrayList<Miembro> miembros;
	private HashMap<Integer, Partido> partidos;
	
	public Torneo() {
		this.miembros = new ArrayList<Miembro>();
		this.partidos = new HashMap<Integer, Partido>();
	}

	public void agregarMiembro(Miembro unJugador) {
		this.miembros.add(unJugador);
	}

	public double cantidadMiembros() {
		return this.miembros.size();
	}

	public void crearPartido(Integer idPartido, Partido unPartido) {
		this.partidos.put(idPartido, unPartido);
	}

	public double cantidadPartidos() {
		return this.partidos.size();
	}

	public void registrarGol(Gol unGol) throws Exception {
		if(this.partidos.containsValue(unGol.getIdPartido())) {
			
		}else {
			throw new Exception("Parido No Encontrado");
		}
	
	}

}

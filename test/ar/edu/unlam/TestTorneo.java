package ar.edu.unlam;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestTorneo {
	
	@Test
	public void CrearUnTorneoValido(){
		Torneo unTorneo = new Torneo();
		assertNotNull(unTorneo);
	}
	
	@Test
	public void CrearUnJugadorValido(){
		Jugador unJugador = new Jugador(35141734, 10, "MED", "Mauricio Medina","Argentina");
		assertNotNull(unJugador);
	}
	
	@Test
	public void AgregarUnJugadorAlTorneo(){
		Torneo unTorneo = new Torneo();
		Miembro unJugador = new Jugador(35141734, 10, "MED", "Mauricio Medina","Argentina");
		unTorneo.agregarMiembro(unJugador);
		assertEquals(1, unTorneo.cantidadMiembros(),0.01);
	}
	@Test
	public void CrearUnDtValido(){
		Dt unDt = new Dt(35141734, "Mauricio Medina","Argentina",31);
		assertNotNull(unDt);
	}
	@Test
	public void AgregarUnDtAlTorneo(){
		Torneo unTorneo = new Torneo();
		Miembro unDt = new Dt(35141734, "Mauricio Medina","Argentina",31);
		unTorneo.agregarMiembro(unDt);
		assertEquals(1, unTorneo.cantidadMiembros(),0.01);
	}
	
	@Test
	public void CrearUnPartidoEnTorneo(){
		Torneo unTorneo = new Torneo();
		Miembro pipa = new Jugador(3614179, 9, "DEL", "Gonzalo Higuain","Argentina");
		Miembro ney = new Jugador(35141734, 10, "DEL", "Neymar Junior","Brasil");
		
		ArrayList<Jugador> nominaArgentina = new ArrayList<Jugador>();
		ArrayList<Jugador> nominaBrasil = new ArrayList<Jugador>();
		
		nominaArgentina.add((Jugador) pipa);
		nominaBrasil.add((Jugador) ney);

		Miembro scaloni = new Dt(17352894, "Lionel Scaloni","Argentina",46);
		Miembro tite = new Dt(17352894, "Adenor  Bacchi","Brasil",46);
		
		Partido unPartido = new Partido("Argentina", "Brasil", nominaArgentina, nominaBrasil);
		
		Integer idPartido = unPartido.hashCode();
		
		unTorneo.crearPartido(idPartido, unPartido);
		assertEquals(1, unTorneo.cantidadPartidos(),0.01);
	}
	@Test
	public void RegistrarGolDeUnPartidoEnUnTorneo() throws Exception{
		Torneo unTorneo = new Torneo();
		Miembro pipa = new Jugador(3614179, 9, "DEL", "Gonzalo Higuain","Argentina");
		Miembro ney = new Jugador(35141734, 10, "DEL", "Neymar Junior","Brasil");
		
		ArrayList<Jugador> nominaArgentina = new ArrayList<Jugador>();
		ArrayList<Jugador> nominaBrasil = new ArrayList<Jugador>();
		
		nominaArgentina.add((Jugador) pipa);
		nominaBrasil.add((Jugador) ney);

		Miembro scaloni = new Dt(17352894, "Lionel Scaloni","Argentina",46);
		Miembro tite = new Dt(17352894, "Adenor  Bacchi","Brasil",46);
		
		Partido unPartido = new Partido("Argentina", "Brasil", nominaArgentina, nominaBrasil);
		
		Integer idPartido = unPartido.hashCode();
		
		Gol unGol = new Gol(idPartido, 9, "Local", 15);
		
		
		
		unTorneo.crearPartido(idPartido, unPartido);
		unTorneo.registrarGol(unGol);
		assertEquals(1, unTorneo.cantidadPartidos(),0.01);
	}

}

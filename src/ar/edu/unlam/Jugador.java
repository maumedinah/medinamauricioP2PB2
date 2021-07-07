package ar.edu.unlam;

public class Jugador extends Miembro {
	
	private Integer camiseta;
	private String posicion;
	
	public Jugador(Integer dni, Integer camiseta, String posicion, String nombreApellido, String equipo) {
		super(dni, nombreApellido, equipo);
		setCamiseta(camiseta);
		setPosicion(posicion);
	}

	public Integer getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Integer camiseta) {
		this.camiseta = camiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public String getTipo() {
		return "Jugador";
	}

}

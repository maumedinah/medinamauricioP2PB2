package ar.edu.unlam;

public class Dt extends Miembro {
	
	private Integer edad;

	public Dt(Integer dni, String nombreApellido, String equipo, Integer edad) {
		super(dni, nombreApellido, equipo);
		setEdad(edad);
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public String getTipo() {
		return "DT";
	}

}

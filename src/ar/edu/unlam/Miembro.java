package ar.edu.unlam;

public class Miembro {
	private Integer dni;
	private String nombreApellido;
	private String equipo;
	
	public Miembro(Integer dni, String nombreApellido, String equipo) {
		setDni(dni);
		setNombreApellido(nombreApellido);
		setEquipo(equipo);
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}

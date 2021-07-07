package ar.edu.unlam;

public class Gol {
	
	private Integer idPartido;
	private Integer camiseta;
	private String condicion;
	private Integer minutos;

	public Gol(Integer idPartido, Integer camiseta, String condicion, Integer minutos) {
		setIdPartido(idPartido);
		setCamiseta(camiseta);
		setCondicion(condicion);
		setMinutos(minutos);
	}

	public Integer getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public Integer getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Integer camiseta) {
		this.camiseta = camiseta;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

}

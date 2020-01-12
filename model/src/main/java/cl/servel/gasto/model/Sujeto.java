package cl.servel.gasto.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Sujeto {
	
	public static final String TIPO_PARTIDO = "PARTIDO";
	public static final String TIPO_CANDIDATO = "TIPO_CANDIDATO";
	public static final String TIPO_ADMINISTRADOR = "TIPO_ADMINISTRADOR";
	public static final String TIPO_BANCO = "TIPO_BANCO";
	
	private Integer id;
	private String nombre;
	private String rut;
	private String dv;
	private String tipo;
	private String rutFormateado;
	
	public Sujeto() {
		super();
	}
	
	public Sujeto(Integer id, String nombre, String rut, String tipo, String rutFormateado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.tipo = tipo;
		this.rutFormateado = rutFormateado;
	}
	
	public Sujeto(Integer id, String nombre, String rut, String tipo, String rutFormateado, String dv) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.tipo = tipo;
		this.rutFormateado = rutFormateado;
		this.dv = dv;
	}
	
}

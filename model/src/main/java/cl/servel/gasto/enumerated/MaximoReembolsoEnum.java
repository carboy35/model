package cl.servel.gasto.enumerated;

public enum MaximoReembolsoEnum {
	MAXIMO_REEMBOLSO_PRESIDENTE_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_PRESIDENTE_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_PRESIDENTE_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_PRESIDENTE_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_SENADOR_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_SENADOR_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_SENADOR_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_SENADOR_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_DIPUTADO_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_DIPUTADO_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_DIPUTADO_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_DIPUTADO_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_CORE_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_CORE_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_CORE_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_CORE_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_ALCALDE_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_ALCALDE_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_ALCALDE_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_ALCALDE_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_CONCEJAL_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_CONCEJAL_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_CONCEJAL_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_CONCEJAL_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_GORE_MASCULINO_DEFINITIVA("MAX_REEMBOLSO_GORE_MASCULINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_GORE_FEMENINO_DEFINITIVA("MAX_REEMBOLSO_GORE_FEMENINO_DEFINITIVA"),
	MAXIMO_REEMBOLSO_PRESIDENTE_MASCULINO_2DA_VOTACION("MAX_REEMBOLSO_PRESIDENTE_MASCULINO_2DA_VOTACION"),
	MAXIMO_REEMBOLSO_PRESIDENTE_FEMENINO_2DA_VOTACION("MAX_REEMBOLSO_PRESIDENTE_FEMENINO_2DA_VOTACION"),
	MAXIMO_REEMBOLSO_GORE_MASCULINO_2DA_VOTACION("MAX_REEMBOLSO_GORE_MASCULINO_2DA_VOTACION"),
	MAXIMO_REEMBOLSO_GORE_FEMENINO_2DA_VOTACION("MAX_REEMBOLSO_GORE_FEMENINO_2DA_VOTACION"),
	MAXIMO_REEMBOLSO_PARTIDO("MAX_REEMBOLSO_PARTIDO"),
	MAXIMO_REEMBOLSO_PARTIDO_PRESIDENTE("MAX_REEMBOLSO_PARTIDO_PRESIDENTE");
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private MaximoReembolsoEnum(String nombre) {
		this.nombre=nombre;
	}
}
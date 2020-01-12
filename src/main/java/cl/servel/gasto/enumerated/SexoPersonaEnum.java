package cl.servel.gasto.enumerated;

public enum SexoPersonaEnum {
	INDEFINIDO("INDEFINIDO",-1),
	MASCULINO("MASCULINO",1),
	FEMENINO("FEMENINO",2);

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	String nombre;
	int  codigo;
	SexoPersonaEnum(String nombre,int codigo){
		this.nombre=nombre;
		this.codigo=codigo;
	}
}

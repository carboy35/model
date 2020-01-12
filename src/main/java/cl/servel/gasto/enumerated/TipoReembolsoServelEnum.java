package cl.servel.gasto.enumerated;

public enum TipoReembolsoServelEnum {
	ANTICIPO(1,"ANTICIPO"),
	REEMBOLSO_CANDIDATO(2,"REEMBOLSO CANDIDATO"),
	REEMBOLSO_REMANENTE(4,"REEMBOLSO REMANENTE"),
	REEMBOLSO_INST_FINANCIERA(5, "REEMBOLSO INST.FINANCIERA"),
	REEMBOLSO_PARTIDO(6,"REEMBOLSO PARTIDO"),
	REEMBOLSO_COMPENSATORIO(7,"REEMBOLSO COMPENSATORIO"),
	FINANCIAMIENTO_PERMANENTE_PARTIDOS_POLITICOS(8,"FINANCIAMIENTO PERMANENTE PARTIDOS POLÍTICOS"),
	REEMBOLSO_CANDIDATA_ELECTA(9,"REEMBOLSO CANDIDATA ELECTA");

	int codigo;
	String descripcion;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	TipoReembolsoServelEnum(int codigo,String descripcion){
		this.codigo=codigo;
		this.descripcion=descripcion;
	}
}

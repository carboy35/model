package cl.servel.gasto.enumerated;

public enum TipoCandidatoEnum {
	AFILIADO(1),
	INDEPENDIENTE_ASOCIADO(2),
	INDEPENDIENTE_DE_PACTO(3),
	INDEPENDIENTE_FUERA_PACTO(4);

	private Integer codigo;

	private TipoCandidatoEnum(Integer codigo) 
	{
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}
}

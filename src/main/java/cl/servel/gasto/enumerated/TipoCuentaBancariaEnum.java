package cl.servel.gasto.enumerated;

public enum TipoCuentaBancariaEnum {
    ELECTORAL(1, "Electoral"), 
    PERSONAL(2, "Personal");

    private int id;
    private String descripcion;

    private TipoCuentaBancariaEnum(int id, String descripcion) {
	this.id = id;
	this.descripcion = descripcion;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

}

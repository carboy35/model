package cl.servel.gasto.model;

import java.io.Serializable;

public class EntidadBancaria implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int ebaId;
    private String ebaNombreBanco;
    private String ebaCodSbif;
    private String ebaRut;
	private String ebaNroCuenta;
	private String ebaDireccion;
	private String ebaComuna;
	private String ebaTelefono;
	private String ebaEmail;
   

	public String getEbaCodSbif() {
		return ebaCodSbif;
	}

	public void setEbaCodSbif(String ebaCodSbif) {
		this.ebaCodSbif = ebaCodSbif;
	}

	public int getEbaId() {
	return ebaId;
    }

    public void setEbaId(int ebaId) {
	this.ebaId = ebaId;
    }

    public String getEbaNombreBanco() {
	return ebaNombreBanco;
    }

    public void setEbaNombreBanco(String ebaNombreBanco) {
	this.ebaNombreBanco = ebaNombreBanco;
    }
    
    public String getEbaRut() {
		return ebaRut;
	}

	public void setEbaRut(String ebaRut) {
		this.ebaRut = ebaRut;
	}

	public String getEbaNroCuenta() {
		return ebaNroCuenta;
	}

	public void setEbaNroCuenta(String ebaNroCuenta) {
		this.ebaNroCuenta = ebaNroCuenta;
	}

	public String getEbaDireccion() {
		return ebaDireccion;
	}

	public void setEbaDireccion(String ebaDireccion) {
		this.ebaDireccion = ebaDireccion;
	}

	public String getEbaComuna() {
		return ebaComuna;
	}

	public void setEbaComuna(String ebaComuna) {
		this.ebaComuna = ebaComuna;
	}

	public String getEbaTelefono() {
		return ebaTelefono;
	}

	public void setEbaTelefono(String ebaTelefono) {
		this.ebaTelefono = ebaTelefono;
	}

	public String getEbaEmail() {
		return ebaEmail;
	}

	public void setEbaEmail(String ebaEmail) {
		this.ebaEmail = ebaEmail;
	}

}

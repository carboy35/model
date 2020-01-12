package cl.servel.gasto.model;

import java.io.Serializable;

public class ArchivoBase64 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6879068728194499884L;
	private String nombreArchivo;
	private String fileData;

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}
}

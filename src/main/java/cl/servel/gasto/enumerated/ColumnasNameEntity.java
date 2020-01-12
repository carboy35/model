package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ColumnasNameEntity {

	FUNCIONALIDAD("funId","","FUNCIONALIDAD","","funEliminado"),
	ROLUSUARIO("rolId","","ROLUSUARIO","","rolActivo"),
	USUUSUARIOS("usuId","","USUUSUARIOS","","usuEliminado"),
	DEXDOCUMENTOEXTERNO("dexId","","DEXDOCUMENTOEXTERNO","",""),
	DDEDETALLEDOCUMENTOSEXTERNOS("ddeId","dexId","DDEDETALLEDOCUMENTOSEXTERNOS","dexDocumentoExterno",""),
	EXEXPEDIENTE("exId","","EXEXPEDIENTE","",""),
	EXEXPEDIENTEA("exId","dexId","EXEXPEDIENTEA","dexDocumentoExterno",""),
	EXEXPEDIENTEB("exId","parId","EXEXPEDIENTEB","parPartido",""),
	EXEXPEDIENTEC("exId","canId","EXEXPEDIENTEC","canCandidato",""),
	RLCRELFUNCIONALIDAD("rlcId","funId","RLCRELFUNCIONALIDAD","funFuncionalidadByFunIdPadre",""),
	RLCROLUSUARIOFUNCIONALIDAD("rlcId","rolId","RLCROLUSUARIOFUNCIONALIDAD","rolUsuario",""),
	RLCUSUARIOROLUSUARIO("rlcId","usuId","RLCUSUARIOROLUSUARIO","usuUsuarios",""),
	RLCPERFILROLUSUARIO("rlcId","perId","RLCPERFILROLUSUARIO","perPerfil",""),
	RLCUSUARIOPERFIL("rlcId","usuId","RLCUSUARIOPERFIL","usuUsuarios","eliminado");
	
	private String id;
	private String idRlc;
	private String nombreEntity;
	private String nombreSubEntity;
	private String estado;
	
}

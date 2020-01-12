package cl.servel.gasto.model;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AdmAdministradorElectoralHash {

	private HashMap<String,AdmAdministradorElectoralLiviano> administradores;
}

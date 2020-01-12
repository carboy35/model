package cl.servel.gasto.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import cl.servel.gasto.enumerated.MensajesRespuestaRest;
import cl.servel.gasto.exception.CustomErrorType;
import cl.servel.gasto.model.RestResponse;

public final class ServiceParser {
	private static ObjectMapper mapper = new ObjectMapper();

	public static Date parse(Date fecha) {
		/*
		Date resp = null;

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			SimpleDateFormat auxDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			String strDate = dateFormat.format(fecha);
			resp = auxDateFormat.parse(strDate);
		} catch (Exception e) {
			return null;
		}
		 */
		return fecha;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object parseToObject(Object data, Class outputClass) {
		return mapper.convertValue(data, outputClass);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object parse(ResponseEntity<RestResponse> responseEntity, Class outputClass) {
		if (responseEntity.getStatusCode() != HttpStatus.OK || !responseEntity.hasBody()
				|| !responseEntity.getBody().isResponse()) {
			return null;
		}
		return parseToObject(responseEntity.getBody().getData(), outputClass);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ResponseEntity<RestResponse> getResponse(String mensaje, Object data) {
		if (data == null) {
			return null;
		}
		RestResponse restResponse = new RestResponse(true, mensaje, MensajesRespuestaRest.OK.name(), data);

		return ResponseEntity.ok(restResponse);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ResponseEntity<RestResponse> getResponse(String mensaje, MensajesRespuestaRest tipoMensaje) {
		RestResponse restResponse = null;
		
		if (tipoMensaje != null && tipoMensaje != MensajesRespuestaRest.OK) {
			restResponse = new RestResponse(false, mensaje, tipoMensaje.toString(), null);
		} else {
			return new ResponseEntity(new CustomErrorType(
					"No existen datos suficientes para completar la consulta.",
					HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);			
		}
		
		return ResponseEntity.ok(restResponse);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ResponseEntity<RestResponse> getResponse(String mensaje, MensajesRespuestaRest tipoMensaje, Object data) {
		RestResponse restResponse = null;
		
		if (tipoMensaje != null && tipoMensaje != MensajesRespuestaRest.OK && data != null) {
			restResponse = new RestResponse(false, mensaje, tipoMensaje.toString(), data);
		} else {
			return new ResponseEntity(new CustomErrorType(
					"No existen datos suficientes para completar la consulta.",
					HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);			
		}
		
		return ResponseEntity.ok(restResponse);
	}
}

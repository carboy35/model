package cl.servel.gasto.util;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

import cl.servel.gasto.enumerated.CurrencySymbols;
import cl.servel.gasto.enumerated.InformeEnum;
import cl.servel.gasto.enumerated.MesesEnum;
import cl.servel.gasto.model.RestResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class Utilidades {
	private static final String AUTH_HEADER_KEY = "Authorization";
	private static final String AUTH_HEADER_VALUE_PREFIX = "Bearer ";

	public static HttpHeaders getMyRequestHeaders(HttpServletRequest request) {
		Map<String, String> returnValue = new HashMap<>();
		HttpHeaders headers = new HttpHeaders();

		Enumeration<String> hearderNames = request.getHeaderNames();
		while (hearderNames.hasMoreElements()) {
			String headerName = hearderNames.nextElement();
			returnValue.put(headerName, request.getHeader(headerName));
		}
		headers.setAll(returnValue);
		return headers;
	}

	public static HeaderMapRequestWrapper getHeaderFromToken(ServletRequest request) {
		HeaderMapRequestWrapper requestWrapper = null;
		try {
			HttpServletRequest httpRequest = (HttpServletRequest) request;

			requestWrapper = new HeaderMapRequestWrapper(httpRequest);

			String jwt = getBearerToken(httpRequest);
			if (jwt != null) {
				DecodedJWT jwtdecoded = JWT.decode(jwt);
				Object username = jwtdecoded.getClaim("username");
				String type = username.getClass().getSimpleName();
				log.info("getHeaderFromToken");
				if (type.equals("NullClaim") == false) {
					log.info("type=" + type + " username=(" + jwtdecoded.getClaim("username").asString() + ")");
					requestWrapper.addHeader("X-Consumer-Username", jwtdecoded.getClaim("username").asString());

				} else {
					log.info("NullClaim");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return requestWrapper;
	}

	private static String getBearerToken(HttpServletRequest request) {
		String authHeader = request.getHeader(AUTH_HEADER_KEY);
		if (authHeader != null && authHeader.startsWith(AUTH_HEADER_VALUE_PREFIX)) {
			return authHeader.substring(AUTH_HEADER_VALUE_PREFIX.length());
		}
		return null;
	}

	public static Timestamp addHours(int hours, Timestamp t1, boolean add) {
		if (hours < 0) {
			return t1;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(t1.getTime());
		if (add) {
			calendar.add(Calendar.HOUR_OF_DAY, hours);
			return new Timestamp(calendar.getTimeInMillis());
		} else {
			calendar.add(Calendar.HOUR_OF_DAY, hours * -1);
			return new Timestamp(calendar.getTimeInMillis());
		}
	}

	public static Timestamp addDays(int days, Timestamp t1, boolean add) {
		if (days < 0) {
			return t1;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(t1.getTime());
		if (add) {
			calendar.add(Calendar.DAY_OF_MONTH, days);
			return new Timestamp(calendar.getTimeInMillis());
		} else {
			calendar.add(Calendar.DAY_OF_MONTH, days * -1);
			return new Timestamp(calendar.getTimeInMillis());
		}
	}

	public static boolean isSaturdayOrSunday(Timestamp fechaTemp) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(fechaTemp.getTime());
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY)
			return true;
		return false;
	}

	public static String getMesStr(int month) {
		for (MesesEnum i : MesesEnum.values()) {
			if (i.getId() == month) {
				return i.getDescripcion();
			}
		}
		return "";
	}

	public static Map<String, Map<String, String>> reemplazaValores(
			Map<String, Map<String, String>> mapa, HashMap<String, String> valores) {
		Map<String, Map<String, String>> result = new HashMap<String, Map<String,  String>>();
		for (Map.Entry<String, Map<String, String>> e : mapa.entrySet()) {
			Map<String,  String> map0 = new HashMap<String, String>();
			for (Map.Entry<String,  String> ex : e.getValue().entrySet()) {
				String value2 = ex.getValue();
				for (Map.Entry<String, String> val : valores.entrySet()) {
					if (ex.getValue().contains(val.getKey())) {
						value2 = value2.replace(val.getKey(), val.getValue());
					}
				}
				map0.put(ex.getKey(), value2);
			}
			result.put(e.getKey(), map0);
		}
		return result;
	}

	public static boolean validaEstructuraInforme(ResponseEntity<RestResponse> estruct, InformeEnum informe) {
		if (estruct == null || estruct.getBody() == null || estruct.getStatusCode() != HttpStatus.OK
				|| estruct.getBody().isResponse() == false) {
			return false;
		}
		Map<String, Map<String, String>> mapa = (Map<String, Map<String, String>>) estruct
				.getBody().getData();
		if (informe.getPrefijoParametro().equals(InformeEnum.OBSERVACIONES_CAND.getPrefijoParametro())
				|| informe.getPrefijoParametro().equals(InformeEnum.OBSERVACIONES_PART.getPrefijoParametro())) {
			// 1 nivel
			if (mapa.containsKey("ANT-1") == false) {
				return false;
			} else if (mapa.get("ANT-1").containsKey("ANT-1") == false) {
				return false;
			} else if (mapa.containsKey("MATERIA-1")== false) {
				return false;
			} else if (mapa.get("MATERIA-1").containsKey("MATERIA-1") == false) {
				return false;
			} else if (mapa.containsKey("DIST-1")== false) {
				return false;
			}else if (mapa.get("DIST-1").containsKey("DIST-1") == false) {
				return false;
			}
			// body
			if (mapa.containsKey("INFERIOR") == false) {
				return false;
			} else if (mapa.get("INFERIOR").containsKey("INFERIOR") == false) {
				return false;
			}else if (mapa.containsKey("SUPERIOR") == false) {
				return false;
			} else if (mapa.get("SUPERIOR").containsKey("SUPERIOR") == false) {
				return false;
			}
			// footer no se valida porque puede no estar
		}
		return true;
	}

	public static String separaMiles(Integer numero, boolean moneda) {
		String simbolo = "";
		if (moneda)
			simbolo = "$ ";
		if (numero == null)
			return simbolo + "         -";
		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
		symbols.setGroupingSeparator('.');
		DecimalFormat formatter = new DecimalFormat( "###,###.##", symbols);
		return simbolo + formatter.format(numero.longValue());

	}

	public static String fechaSP(Date fecha) {
		if (fecha == null)
			return "";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return format.format(fecha);
	}
	
	public static String fechaSP(Date fecha,String pattern) {
		if (fecha == null)
			return "";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(fecha);
	}

	private static Locale getClLocale() {
		return new Locale("es", "CL");
	}

	public static String getNumeroEnPalabra(String input) throws Exception {
		if(input==null || input.equals("")) {return "";}
		Locale locale = getClLocale();
		Double d = Double.parseDouble(input.replace("$", "").replace("-", ""));
		NumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
		return formatter.format(d);
	}

	public static HttpEntity<String> autorizacionLocal() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "
				+ "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJydXQiOiIyLWsiLCJzdWIiOiJhZG1pbiIsImlzcyI6ImFkbWluIiwicGVyZmlsZXMiOiJbIHtcbiAgXCJwZXJJZFwiIDogMzA0LFxuICBcInBlck5vbWJyZVBlcmZpbFwiIDogXCJBZG1pbmlzdHJhZG9yICAgICAgIFwiLFxuICBcInBlckVsaW1pbmFkb1wiIDogZmFsc2UsXG4gIFwiY3JlYXRlZFwiIDogMTU2MDk4ODgwMDAwMCxcbiAgXCJtb2RpZmllYWRcIiA6IDE1NjA5ODg4MDAwMDAsXG4gIFwicGVyQ29kaWdvUGVyZmlsXCIgOiBcImFkbWluXCJcbn0gXSIsImV2ZW50b3MiOiJbIHtcbiAgXCJpZFwiIDogMTEyOSxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQWN0dWFsXCIsXG4gIFwiYW5uaW9cIiA6IDIwMjBcbn0sIHtcbiAgXCJpZFwiIDogMTEzMyxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQW50ZXJpb3JcIixcbiAgXCJhbm5pb1wiIDogMjAxNlxufSwge1xuICBcImlkXCIgOiAxMTUzLFxuICBcIm5vbWJyZVwiIDogXCJNdW5pY2lwYWxlc1wiLFxuICBcImFubmlvXCIgOiAyMDIxXG59IF0iLCJpZCI6ImFkbWluIiwiZXhwIjoxNTYyODE5MTU3LCJub21icmUiOiJhZG1pbiIsImp0aSI6ImM0NjBjOGU4LTU5OGUtNGVmYy04ODYzLWRkNTMzNWY3YmY1ZCIsInVzZXJuYW1lIjoiYWRtaW4ifQ.hrm6NFBxKlYXgcXD1CpX6wScpqCUBIWoXy-PTepfGhBWy4_Q5xMElfX81kLuCDQ1YY5XtEZQzr8CJ5o2vlgyjglqrwlgrAZm6-I5S1OYC63U2HCM5Qb1-DpNTRG5BuwoTxFhJ_ZXCbVFq2MWZYbcRYROljWZifVc4Mq15IREV_LEuSl7vk9trDiQI_mPdK8yljMaspiCTIRh9tI4Fp3n3-P1-G-AZzYlsam-kBuGSCCwvf17YKefZ7s7-_f56zn4lhyUnuDUu-SqgJXIHNpg0T_SoXH6X0l8mr1weHzQfMCTCHpzImHZ92TQdzX3ZtvBQ4zXrHg5wy2ypNpqOmnHxw");

		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		return entity;
	}

	public static HttpEntity<String> autorizacionLocal(Integer idEvento) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "
				+ "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJydXQiOiIyLWsiLCJzdWIiOiJhZG1pbiIsImlzcyI6ImFkbWluIiwicGVyZmlsZXMiOiJbIHtcbiAgXCJwZXJJZFwiIDogMzA0LFxuICBcInBlck5vbWJyZVBlcmZpbFwiIDogXCJBZG1pbmlzdHJhZG9yICAgICAgIFwiLFxuICBcInBlckVsaW1pbmFkb1wiIDogZmFsc2UsXG4gIFwiY3JlYXRlZFwiIDogMTU2MDk4ODgwMDAwMCxcbiAgXCJtb2RpZmllYWRcIiA6IDE1NjA5ODg4MDAwMDAsXG4gIFwicGVyQ29kaWdvUGVyZmlsXCIgOiBcImFkbWluXCJcbn0gXSIsImV2ZW50b3MiOiJbIHtcbiAgXCJpZFwiIDogMTEyOSxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQWN0dWFsXCIsXG4gIFwiYW5uaW9cIiA6IDIwMjBcbn0sIHtcbiAgXCJpZFwiIDogMTEzMyxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQW50ZXJpb3JcIixcbiAgXCJhbm5pb1wiIDogMjAxNlxufSwge1xuICBcImlkXCIgOiAxMTUzLFxuICBcIm5vbWJyZVwiIDogXCJNdW5pY2lwYWxlc1wiLFxuICBcImFubmlvXCIgOiAyMDIxXG59IF0iLCJpZCI6ImFkbWluIiwiZXhwIjoxNTYyODE5MTU3LCJub21icmUiOiJhZG1pbiIsImp0aSI6ImM0NjBjOGU4LTU5OGUtNGVmYy04ODYzLWRkNTMzNWY3YmY1ZCIsInVzZXJuYW1lIjoiYWRtaW4ifQ.hrm6NFBxKlYXgcXD1CpX6wScpqCUBIWoXy-PTepfGhBWy4_Q5xMElfX81kLuCDQ1YY5XtEZQzr8CJ5o2vlgyjglqrwlgrAZm6-I5S1OYC63U2HCM5Qb1-DpNTRG5BuwoTxFhJ_ZXCbVFq2MWZYbcRYROljWZifVc4Mq15IREV_LEuSl7vk9trDiQI_mPdK8yljMaspiCTIRh9tI4Fp3n3-P1-G-AZzYlsam-kBuGSCCwvf17YKefZ7s7-_f56zn4lhyUnuDUu-SqgJXIHNpg0T_SoXH6X0l8mr1weHzQfMCTCHpzImHZ92TQdzX3ZtvBQ4zXrHg5wy2ypNpqOmnHxw");

		headers.set("idEvento", String.valueOf(idEvento));

		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		return entity;
	}

	public static HttpHeaders getHeaderAutorizacionLocal(Integer idEvento) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "
				+ "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJydXQiOiIyLWsiLCJzdWIiOiJhZG1pbiIsImlzcyI6ImFkbWluIiwicGVyZmlsZXMiOiJbIHtcbiAgXCJwZXJJZFwiIDogMzA0LFxuICBcInBlck5vbWJyZVBlcmZpbFwiIDogXCJBZG1pbmlzdHJhZG9yICAgICAgIFwiLFxuICBcInBlckVsaW1pbmFkb1wiIDogZmFsc2UsXG4gIFwiY3JlYXRlZFwiIDogMTU2MDk4ODgwMDAwMCxcbiAgXCJtb2RpZmllYWRcIiA6IDE1NjA5ODg4MDAwMDAsXG4gIFwicGVyQ29kaWdvUGVyZmlsXCIgOiBcImFkbWluXCJcbn0gXSIsImV2ZW50b3MiOiJbIHtcbiAgXCJpZFwiIDogMTEyOSxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQWN0dWFsXCIsXG4gIFwiYW5uaW9cIiA6IDIwMjBcbn0sIHtcbiAgXCJpZFwiIDogMTEzMyxcbiAgXCJub21icmVcIiA6IFwiVG9kYXNFbGVjY2lvbmVzQW50ZXJpb3JcIixcbiAgXCJhbm5pb1wiIDogMjAxNlxufSwge1xuICBcImlkXCIgOiAxMTUzLFxuICBcIm5vbWJyZVwiIDogXCJNdW5pY2lwYWxlc1wiLFxuICBcImFubmlvXCIgOiAyMDIxXG59IF0iLCJpZCI6ImFkbWluIiwiZXhwIjoxNTYyODE5MTU3LCJub21icmUiOiJhZG1pbiIsImp0aSI6ImM0NjBjOGU4LTU5OGUtNGVmYy04ODYzLWRkNTMzNWY3YmY1ZCIsInVzZXJuYW1lIjoiYWRtaW4ifQ.hrm6NFBxKlYXgcXD1CpX6wScpqCUBIWoXy-PTepfGhBWy4_Q5xMElfX81kLuCDQ1YY5XtEZQzr8CJ5o2vlgyjglqrwlgrAZm6-I5S1OYC63U2HCM5Qb1-DpNTRG5BuwoTxFhJ_ZXCbVFq2MWZYbcRYROljWZifVc4Mq15IREV_LEuSl7vk9trDiQI_mPdK8yljMaspiCTIRh9tI4Fp3n3-P1-G-AZzYlsam-kBuGSCCwvf17YKefZ7s7-_f56zn4lhyUnuDUu-SqgJXIHNpg0T_SoXH6X0l8mr1weHzQfMCTCHpzImHZ92TQdzX3ZtvBQ4zXrHg5wy2ypNpqOmnHxw");

		headers.set("idEvento", String.valueOf(idEvento));

		return headers;
	}

	public static java.text.NumberFormat localStyleFormatCustomSymbol(Locale locale, String symbol) {
		java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(locale);
		if (format instanceof DecimalFormat) {
			DecimalFormat df = (DecimalFormat) format;
			DecimalFormatSymbols dfs = new DecimalFormat().getDecimalFormatSymbols();
			dfs.setCurrency(df.getCurrency());
			dfs.setCurrencySymbol(symbol);
			dfs.setDecimalSeparator('.');
			// dfs.setMonetaryDecimalSeparator('.');
			df.setDecimalFormatSymbols(dfs);
		}

		return format;

	}

	public static String formatCurrencyNumber(String symbol, Double value) {

		return localStyleFormatCustomSymbol(getClLocale(), symbol).format(value).toString();
	}

	public static String formatCurrencyNumber(String symbol, String value) {
		return localStyleFormatCustomSymbol(getClLocale(), symbol).format(value).toString();
	}

	public static String formatData(String value, int cotaSuperiorNoSimbol) {
		String numeros = null;
		try {
			if (!Double.isNaN(Double.parseDouble(value)) && Double.parseDouble(value) > cotaSuperiorNoSimbol) {
				numeros = formatCurrencyNumber(CurrencySymbols.CL.getSymbol(), Double.parseDouble(value));
				numeros = numeros.replaceAll(",", ".");
				return numeros;
			} else {
				return value;
			}
		} catch (Exception e) {
			return value;
		}

	}

	public static String formatData(String value, int cotaSuperiorNoSimbol, String simbolo) {
		String numeros = null;
		try {
			if (!Double.isNaN(Double.parseDouble(value)) && Double.parseDouble(value) > cotaSuperiorNoSimbol) {
				numeros = formatCurrencyNumber(simbolo, Double.parseDouble(value));
				numeros = numeros.replaceAll(",", ".");
				return numeros;
			} else {
				return value;
			}
		} catch (Exception e) {
			return value;
		}

	}

	public static String parseFecha(Date fecha) {
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
		return d.format(fecha);
	}

	public static String parseFecha(String fecha) {
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return d.format(d.parse(fecha));
		} catch (ParseException e) {
			log.info("Error al parsear fecha", e);
			return d.format(new Date());
		}
	}

	public static String parseFecha(String fecha, String format) {
		SimpleDateFormat d = new SimpleDateFormat(format);
		try {
			return d.format(d.parse(fecha));
		} catch (ParseException e) {
			log.info("Error al parsear fecha", e);
			return d.format(new Date());
		}
	}
	
	public static String parseFechaFormat(Date fecha, String format) {
			SimpleDateFormat fechaFormat = new SimpleDateFormat(format);
			String fechaString = fechaFormat.format(fecha);
			return fechaString;
	}

	public static String parseHora(Date fecha) {
		SimpleDateFormat d = new SimpleDateFormat("HH:mm");
		return d.format(fecha);
	}

	public static java.sql.Date convertDate(java.util.Date uDate) {
		Calendar time = Calendar.getInstance();
		time.setTime(uDate);
		time.add(Calendar.MILLISECOND, -time.getTimeZone().getOffset(time.getTimeInMillis()));
		uDate = time.getTime();
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}

	public static Date addHours(int hours, Date t1, boolean add) {
		if (hours < 0) {
			return t1;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(t1.getTime());
		if (add) {
			calendar.add(Calendar.HOUR_OF_DAY, hours);
			return new Date(calendar.getTimeInMillis());
		} else {
			calendar.add(Calendar.HOUR_OF_DAY, hours * -1);
			return new Date(calendar.getTimeInMillis());
		}
	}

	public static String getPercentNumber(Double number) {
		DecimalFormat df = new DecimalFormat("##.#%");
		return df.format(number);
	}

	public static Date getDateFromString(String fechaString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		try {
			return formatter.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static String formatNroDoc(String valor) {
		return String.format("%04d", (Integer.valueOf(valor)));
	}
	public static InputStreamReader leeArchivo(String ruta) {
		try {
			return new InputStreamReader(new FileInputStream(ruta), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}

	public static XMLGregorianCalendar dateToXMLGregorialCalendar(Date fecha) {
		// get the supported ids for GMT-08:00 (Pacific Standard Time)
		 String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
		// create a Pacific Standard Time time zone
		 SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

		 // set up rules for daylight savings time
		 /*pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		 pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);*/

		 // create a GregorianCalendar with the Pacific Daylight time zone
		 // and the current date and time
		 GregorianCalendar calendar = new GregorianCalendar(pdt);
		
		 calendar.setTime(fecha);
		 try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String quitaUltimoNumero(String cadena) {

		 Matcher m = Pattern.compile("-[\\d]+$")
		     .matcher(cadena);
		 while (m.find()) {
			 cadena=m.replaceFirst("");
		 }
		 return cadena;
	}
}
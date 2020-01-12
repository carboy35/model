package cl.servel.gasto.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = { "/*"})
public class TokenFilter implements Filter {
	private static final java.util.logging.Logger LOG = Logger.getLogger( Utilidades.class.getName() );
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HeaderMapRequestWrapper httpRequest= Utilidades.getHeaderFromToken(request);
		chain.doFilter(httpRequest, response );
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

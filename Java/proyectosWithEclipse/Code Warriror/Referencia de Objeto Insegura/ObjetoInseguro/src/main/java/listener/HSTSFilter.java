package listener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.FilterConfig;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HSTSFilter implements Filter{
	private static final String HEADER_NAME = "Strict-Transport-Security";
	private static final String MAX_AGE_DIRECTIVE = "max-age= %s";
	private static final String INCLUDE_SUB_DOMAINS_DIRECTIVE = "includeSubDomains";
	private static final String HSTS_PRE_LOAD = "preload";

	private int maxAgeSeconds = 315360003;
	private boolean includeSubDomains = false;
	private boolean hstsPreload = false;
	private String directives;

	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setHeader(HEADER_NAME, this.directives);
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig filterConfig)throws ServletException{
		maxAgeSeconds = Integer.parseInt(filterConfig.getInitParameter("maxAgeSeconds"));
		includeSubDomains = "true".equals(filterConfig.getInitParameter("includeSubDomains"));
		hstsPreload = "true".equals(filterConfig.getInitParameter("hstsPreload"));
		
		if(this.maxAgeSeconds <= 0) {
			throw new ServletException("Invalid maxAgeSeconds value :: "+maxAgeSeconds);
		}
		
		this.directives = String.format(MAX_AGE_DIRECTIVE, this.maxAgeSeconds);
		if(this.includeSubDomains) {
			this.directives += (" ; " + INCLUDE_SUB_DOMAINS_DIRECTIVE);
		}
		if(this.hstsPreload) {
			this.directives += (" ; " + HSTS_PRE_LOAD);
		}
	}
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response1 = (HttpServletResponse)response;
		
		response1.setHeader(HEADER_NAME, this.directives);
		chain.doFilter(request, response);
		
	}

}

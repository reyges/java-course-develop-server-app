package ru.parsentev.servlets;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 18.04.2016
 */
public class AuthFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) servletRequest).getSession(false);
		if (session == null || session.getAttribute("login") == null) {
			servletRequest.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(servletRequest, servletResponse);
		}
	}

	public void destroy() {

	}
}

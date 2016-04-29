package ru.parsentev.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 27.03.2016
 */
public class ColorServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("color", req.getParameter("color"));
		cookie.setMaxAge(Integer.MAX_VALUE);
		resp.addCookie(cookie);
		resp.sendRedirect(req.getContextPath() + "/user");
	}
}

package ru.parsentev.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * TODO: comment
 * @author parsentev
 * @since 22.02.2016
 */
public class EchoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String value = req.getParameter("name");
		resp.getWriter().write(String.format(
				"<h1>echo get, %s</h1>" +
				"<form action='/job/echo' method='post'>" +
				"<input type='text' name='name'/>" +
				"</form>", value));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String value = req.getParameter("name");
		resp.getWriter().write(String.format("<h1>echo post, %s</h1>", value));
	}
}
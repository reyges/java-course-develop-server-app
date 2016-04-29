package ru.parsentev.servlets;

import ru.parsentev.models.User;
import ru.parsentev.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 18.03.2016
 */
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("users", UserService.getInstance().getAll());
		req.getRequestDispatcher("/WEB-INF/views/UserView.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		if (id != null && name != null) {
			UserService.getInstance().add(new User(id, name));
		}
		request.setAttribute("role", "role_admin");
		doGet(request, resp);
	}
}

package ru.parsentev.services;


import ru.parsentev.models.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO: comment
 * @author parsentev
 * @since 18.03.2016
 */
public class UserService {

	private static final UserService instance = new UserService();

	private final List<User> users = new CopyOnWriteArrayList<User>();

	private UserService() {
		users.add(new User("1", "Petr"));
		users.add(new User("2", "Make"));
	}

	public static UserService getInstance() {
		return instance;
	}

	public List<User> getAll() {
		return this.users;
	}

	public void add(final User user) {
		this.users.add(user);
	}
}

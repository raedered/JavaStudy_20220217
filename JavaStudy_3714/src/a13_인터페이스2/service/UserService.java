package a13_인터페이스2.service;

import a13_인터페이스2.model.User;

public interface UserService {
	public void addUser();
	public User[] getUsers();
	public User getUser(String username);
	void addUser(User user);
}

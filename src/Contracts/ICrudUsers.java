package Contracts;

import java.util.List;

import Entities.User;

public interface ICrudUsers {

	public List<User> GetAll();
	public boolean Insert(User user);
	public boolean Update(User user);
	public boolean Delete(int id);
}

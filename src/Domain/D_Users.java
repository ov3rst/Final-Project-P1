package Domain;

import java.util.List;

import Contracts.ICrudUsers;
import Data.DT_Users;
import Entities.User;

public class D_Users implements ICrudUsers {

	@Override
	public List<User> GetAll() {
		return DT_Users.UserList();
	}

	@Override
	public boolean Insert(User user) {
		return DT_Users.InsertUser(user);
	}

	@Override
	public boolean Update(User user) {
		return DT_Users.UpdateUser(user);
	}

	@Override
	public boolean Delete(int id) {
		return DT_Users.DeleteUser(id);
	}

}

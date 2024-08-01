package Domain;

import java.util.List;

import Contracts.ICrudUsers;
import Data.DT_Users;
import Entities.User;

public class D_Users implements ICrudUsers {

	@Override
	public List<User> GetAll() {
		// TODO Auto-generated method stub
		return DT_Users.UserList();
	}

	@Override
	public boolean Insert(User user) {
		// TODO Auto-generated method stub
		return DT_Users.InsertUser(user);
	}

	@Override
	public boolean Update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

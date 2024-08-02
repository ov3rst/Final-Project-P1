package Contracts;

import java.util.List;

import Entities.Category;

public interface ICrudCategory {
	public List<Category> GetAll();
	public boolean Insert(Category cat);
	public boolean Update(Category cat);
	public boolean Delete(int id);
}

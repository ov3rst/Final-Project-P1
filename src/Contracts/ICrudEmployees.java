package Contracts;

import java.util.List;

import Entities.Employees;

public interface ICrudEmployees {
	public List<Employees> GetAll();
	public boolean Insert(Employees employee);
	public boolean Update(Employees employee);
	public boolean Delete(int id);
}

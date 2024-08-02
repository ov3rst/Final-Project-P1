package Contracts;

import java.util.List;

import Entities.Supplier;

public interface ICrudProviders {
	public List<Supplier> GetAll();
	public boolean Insert(Supplier supp);
	public boolean Update(Supplier supp);
	public boolean Delete(int id);
}

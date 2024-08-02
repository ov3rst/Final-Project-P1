package Domain;

import java.util.List;

import Contracts.ICrudProviders;
import Data.DT_Suppliers;
import Entities.Supplier;

public class D_Suppliers implements ICrudProviders{

	@Override
	public List<Supplier> GetAll() {
		return DT_Suppliers.SupplierList();
	}

	@Override
	public boolean Insert(Supplier supp) {
		return DT_Suppliers.InsertSupplier(supp);
	}

	@Override
	public boolean Update(Supplier supp) {
		return DT_Suppliers.UpdateSupplier(supp);
	}

	@Override
	public boolean Delete(int id) {
		return DT_Suppliers.DeleteEmployee(id);
	}


}

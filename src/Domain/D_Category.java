package Domain;

import java.util.List;

import Contracts.ICrudCategory;
import Data.DT_Category;
import Entities.Category;

public class D_Category implements ICrudCategory {

	@Override
	public List<Category> GetAll() {
		return DT_Category.CategoryList();
	}

	@Override
	public boolean Insert(Category cat) {
		return DT_Category.InsertSupplier(cat);
	}

	@Override
	public boolean Update(Category cat) {
		return DT_Category.UpdateSupplier(cat);
	}

	@Override
	public boolean Delete(int id) {
		return DT_Category.DeleteEmployee(id);
	}
}

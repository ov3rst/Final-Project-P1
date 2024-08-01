package Domain;

import java.util.ArrayList;
import java.util.List;
import Contracts.ICrudEmployees;
import Data.DT_Employees;
import Entities.Employees;

public class D_Employees implements ICrudEmployees {
	
	@Override
	public List<Employees> GetAll() {
		List<Employees> empl = new ArrayList<>();
		
		empl = DT_Employees.EmployeesList();
		
		return empl;
	}

	@Override
	public boolean Insert(Employees employee) {
		return DT_Employees.InsertEmployee(employee);
	}

	@Override
	public boolean Update(Employees employee) {
		// TODO Auto-generated method stub
		return  DT_Employees.UpdateEmployee(employee);
	}

	@Override
	public boolean Delete(int id) {
		return DT_Employees.DeleteEmployee(id);
	}

}

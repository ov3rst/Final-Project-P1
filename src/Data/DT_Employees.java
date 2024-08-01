package Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Entities.Employees;

public class DT_Employees {
	
		public static ArrayList<Employees> EmployeesList() {
			StringBuilder query = new StringBuilder("Select * from Employees");
			ArrayList<Employees> empList;
			try {
				Connection con = DBConnection.getConnection();
				Statement st = con.createStatement();
				ResultSet result = st.executeQuery(query.toString());
				
				empList = new ArrayList<>();
				
				while(result.next()) {
					empList.add(new Employees(
							result.getInt(1), 
							result.getString(2), 
							result.getDate(3), 
							result.getInt(4), 
							result.getInt(5), 
							result.getString(6), 
							result.getString(7),
							result.getDouble(8), 
							result.getDate(9)));
				}
				
				st.close();
				result.close();
				con.close();
								
				return empList;
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
	}
		
	public static boolean InsertEmployee(Employees employee) {
		
		StringBuilder query = new StringBuilder("Insert into Employees (fullname, birthdate, identificationcard, phone, email, position, salary)");
		query.append("values(?, ?, ?, ?, ?, ?, ?)");
		
		
		Date sqldate = new Date(employee.getBirthdate().getTime());
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
					
			st.setString(1, employee.getFullname());
			st.setDate(2, sqldate);
			st.setInt(3, employee.getIdentificationcard());
			st.setInt(4, employee.getPhone());
			st.setString(5, employee.getEmail());
			st.setString(6, employee.getPosition());
			st.setDouble(7, employee.getSalary());
			
			 st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public static boolean UpdateEmployee(Employees employee) {
		StringBuilder query = new StringBuilder("Update Employees set fullname = ?, birthdate = ?, identificationcard = ?, phone = ?, email = ?, position = ?, salary = ?");
		query.append("where employeeid = ?");		
		
		Date sqldate = new Date(employee.getBirthdate().getTime());
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
					
			st.setString(1, employee.getFullname());
			st.setDate(2, sqldate);
			st.setInt(3, employee.getIdentificationcard());
			st.setInt(4, employee.getPhone());
			st.setString(5, employee.getEmail());
			st.setString(6, employee.getPosition());
			st.setDouble(7, employee.getSalary());
			st.setInt(8, employee.getId());
			
			 st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public static boolean DeleteEmployee(int id) {
		StringBuilder query = new StringBuilder("Delete Employees where employeeid = ?");
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
					
			st.setInt(1, id);
			
			 st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}

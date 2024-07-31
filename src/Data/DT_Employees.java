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
					empList.add(new Employees(result.getInt(1), result.getString(2), result.getDate(3), result.getInt(4), result.getInt(5), result.getString(6), result.getString(7),result.getDouble(8), result.getDate(9)));
				}
				
				st.close();
				result.close();
				con.close();
				
				/*A la tabla Users en la base de datos le falta agregar el campo password, debo hacer que inmediatamente
				 * se comience a ejecutar la aplicacion se ejecute la carga de los datos para mas rapidez a la
				 * hora de abrir la app, debo tambien hacer que los datos se mantengan guardados mientras
				 * se ejecute el programa para no hacer tantas consultas a la base de datos. comenzar por 
				 * agregar el campo que falta.*/
				
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
}

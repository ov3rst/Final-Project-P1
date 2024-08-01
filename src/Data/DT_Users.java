package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Entities.*;

public class DT_Users {

	public static ArrayList<User> UserList() {
		StringBuilder query = new StringBuilder("select u.userid,");
		query.append("r.roleid, r.rolename, r.registrationdate,");
		query.append("e.employeeid, e.fullname, e.birthdate, e.identificationcard, e.phone, e.email, e.position, e.salary, e.registrationdate,");
		query.append("u.username, u.password, u.registrationdate from Users u ");
		query.append("inner join Employees e on e.employeeid = u.employeeid ");
		query.append("inner join Roles r on r.roleid = u.roleid");
				
		ArrayList<User> userList;
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rt = st.executeQuery(query.toString());
			
			userList = new ArrayList<>();
			
			while(rt.next()) {
				userList.add(new User(
						rt.getInt(1),
						new Roles(rt.getInt(2), rt.getString(3), rt.getDate(4)),
						new Employees(rt.getInt(5), rt.getString(6), rt.getDate(7), rt.getInt(8), rt.getInt(9), rt.getString(10), rt.getString(11), rt.getDouble(12), rt.getDate(13)),
						rt.getString(14), rt.getString(15), rt.getDate(16)
						));
			}
			
			st.close();
			rt.close();
			con.close();
			/*A la tabla Users en la base de datos le falta agregar el campo password, debo hacer que inmediatamente
			 * se comience a ejecutar la aplicacion se ejecute la carga de los datos para mas rapidez a la
			 * hora de abrir la app, debo tambien hacer que los datos se mantengan guardados mientras
			 * se ejecute el programa para no hacer tantas consultas a la base de datos. comenzar por 
			 * agregar el campo que falta.*/
			
			return userList;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
	public static boolean InsertUser(User user) {
		
		StringBuilder query = new StringBuilder("Insert into Users (roleid, employeeid, username, password)");
		query.append("values(?, ?, ?, ?)");
				
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
					
			st.setInt(1, user.getRol().getRoleid());
			st.setInt(2, user.getEmployee().getEmployeeid());
			st.setString(3, user.getUsername());
			st.setString(4, user.getPassword());
			
			 st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean UpdateUser(User us) {
		StringBuilder query = new StringBuilder("Update Users set roleid = ?, username = ?, password = ? ");
		query.append("where userid = ?");
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
			
			st.setInt(1, us.getRol().getRoleid());
			st.setString(2, us.getUsername());
			st.setString(3, us.getPassword());
			st.setInt(4, us.getUserid());			
			
			 st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public static boolean DeleteUser(int id) {
		StringBuilder query = new StringBuilder("Delete Users where userid = ?");
		
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

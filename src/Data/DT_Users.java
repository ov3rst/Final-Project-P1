package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import Entities.*;

public class DT_Users {

	public static ArrayList<User> UserList() {
		StringBuilder query = new StringBuilder();
		query.append("select userid, r.roleid, rolename, r.registrationdate, fullname, username, password, birthdate, identificationcard, phone, email, u.registrationdate from Users u ");
		query.append("inner join Roles r on u.roleid = r.roleid");
		ArrayList<User> userList;
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(query.toString());
			
			userList = new ArrayList<>();
			
			while(result.next()) {
				Date roldate = result.getDate(4);
				Date birthdate = result.getDate(8);
				Date userdate = result.getDate(12);
				userList.add(new User(result.getInt(1), new Roles(result.getInt(2), result.getString(3), roldate), result.getString(5),result.getString(6), result.getString(7), birthdate, result.getInt(9), result.getInt(10), result.getString(11), userdate));
			}
			
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
}

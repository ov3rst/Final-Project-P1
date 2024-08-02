package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Entities.Category;

public class DT_Category {
	public static ArrayList<Category> CategoryList() {
		StringBuilder query = new StringBuilder("Select * from Category");
		ArrayList<Category> catList;
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rt = st.executeQuery(query.toString());
			
			catList = new ArrayList<>();
			
			while(rt.next()) {
				catList.add(new Category(
						rt.getInt(1),
						rt.getString(2),
						rt.getDate(3)
						));
			}
			
			st.close();
			rt.close();
			con.close();
							
			return catList;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
}

	public static boolean InsertSupplier(Category cat) {
		
		StringBuilder query = new StringBuilder("Insert into Category(descriptions)");
		query.append("values(?)");
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
			
			st.setString(1, cat.getDescriptions());
			st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public static boolean UpdateSupplier(Category cat) {
		StringBuilder query = new StringBuilder("Update Category set descriptions = ? ");
		query.append("where categoryid = ?");
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
			
			st.setString(1, cat.getDescriptions());
			st.setInt(2, cat.getCategoryid());
			
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
		StringBuilder query = new StringBuilder("Delete Category where categoryid = ?");
	
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

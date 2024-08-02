package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Entities.Supplier;

public class DT_Suppliers {
		public static ArrayList<Supplier> SupplierList() {
			StringBuilder query = new StringBuilder("Select * from Supplier");
			ArrayList<Supplier> empList;
			try {
				Connection con = DBConnection.getConnection();
				Statement st = con.createStatement();
				ResultSet rt = st.executeQuery(query.toString());
				
				empList = new ArrayList<>();
				
				while(rt.next()) {
					empList.add(new Supplier(
							rt.getInt(1),
							rt.getString(2),
							rt.getInt(3),
							rt.getInt(4),
							rt.getString(5),
							rt.getDate(6)
							));
				}
				
				st.close();
				rt.close();
				con.close();
								
				return empList;
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
	}
	
	public static boolean InsertSupplier(Supplier sup) {
		
		StringBuilder query = new StringBuilder("Insert into Supplier (businessname, rnc, phone,email)");
		query.append("values(?, ?, ?, ?)");
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
			
			st.setString(1, sup.getBusinessname());
			st.setInt(2, sup.getRnc());
			st.setInt(3, sup.getPhone());
			st.setString(4, sup.getEmail());
			st.executeUpdate();
			
			st.close();
			con.close();
			
			return true;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean UpdateSupplier(Supplier sup) {
		StringBuilder query = new StringBuilder("Update Supplier set businessname = ?, rnc = ?, phone = ?, email = ?");
		query.append("where supplierid = ?");	

		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(query.toString());
			
			st.setString(1, sup.getBusinessname());
			st.setInt(2, sup.getRnc());
			st.setInt(3, sup.getPhone());
			st.setString(4, sup.getEmail());
			st.setInt(5, sup.getSupplierid());
			
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
		StringBuilder query = new StringBuilder("Delete Supplier where supplierid = ?");
	
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

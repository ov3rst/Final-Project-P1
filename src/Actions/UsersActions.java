package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Domain.D_Users;
import Entities.Employees;
import Entities.Roles;
import Entities.User;
import UserUI.frmUsers;

public class UsersActions implements ActionListener {

	private frmUsers fr;
	private D_Users data;
	private boolean confirm = false;
	
	public UsersActions(frmUsers fr) {
		this.fr = fr;
		data = new D_Users();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == fr.getBtnSave()) InsertUser();
		
		if(e.getSource() == fr.getBtnEdit()) UpdateUser();
		
		if(e.getSource() == fr.getBtnDelete()) DeleteUser();
		
		if(confirm) {
			JOptionPane.showMessageDialog(fr, "Acción realizada correctamente", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
			fr.FillTabUsers();
			fr.UpdateLists();
			fr.ClearFields();
			confirm = false;
		}
	}

	private void InsertUser() {
		if(fr.getCbEmployeesName().getItemCount() <= 0) {
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			return;
		}		
		
		if(ValidateTxt()) {
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		Employees emp = fr.getEmpList().stream()
				.filter(e -> e.getFullname().equals(fr.getCbEmployeesName().getSelectedItem().toString()))
				.findFirst()
				.get();
		
		char[] pass = fr.getPass().getPassword();
		String passS = new String(pass);
		
		if(isPasswordCorrect(fr.getPass().getPassword(), fr.getConfirmPass().getPassword())) {
			User us = new User(
					0,
					new Roles(fr.getCbRole().getSelectedItem().toString().equals("Administrador") ? 1 : 2, fr.getCbRole().getSelectedItem().toString(), null),
					emp,
					fr.getTxtUser().getText(),
					passS,
					null				
					);
			
				confirm = data.Insert(us);
				fr.getUsList().add(us);
		} else {
			JOptionPane.showMessageDialog(fr, "Las contraseñas no coinciden", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	private void UpdateUser() {
		Employees emp = fr.getEmpList().stream()
				.filter(e -> e.getFullname().equals(fr.getCbEmployeesName().getSelectedItem().toString()))
				.findFirst()
				.get();
		
		char[] pass = fr.getPass().getPassword();
		String passS = new String(pass);
		
		if(isPasswordCorrect(fr.getPass().getPassword(), fr.getConfirmPass().getPassword())) {
			User us = new User(
					Integer.parseInt(fr.getTxtId().getText()),
					new Roles(fr.getCbRole().getSelectedItem().toString().equals("Administrador") ? 1 : 2, fr.getCbRole().getSelectedItem().toString(), null),
					emp,
					fr.getTxtUser().getText(),
					passS,
					null				
					);
			
				confirm = data.Update(us);
				fr.getUsList().set(fr.getUsList().indexOf(fr.getUser()), us);
		} else {
			JOptionPane.showMessageDialog(fr, "Las contraseñas no coinciden", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void DeleteUser() {
		int id = Integer.parseInt(fr.getTxtId().getText()), 
			  usconfirm = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);
		
		if(usconfirm == JOptionPane.YES_OPTION) {
			confirm = data.Delete(id);
			fr.getUsList().removeIf(u -> u.getUserid() == id);
		}
	}
	
	private boolean ValidateTxt() {
		if(fr.getTxtUser().getText().isEmpty() || fr.getPass().getPassword().toString().isEmpty()) {
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
		return false;
	}
	
	private boolean isPasswordCorrect(char[] j1,char[] j2) {
		boolean value = false;
		int pointer = 0;
		if (j1.length != j2.length){
		value = false;
		}
		else{
			while((!value)&&(pointer < j1.length)){
				if (j1[pointer] != j2[pointer]){
					value = false;
				}
				else{
					value = true;
				}
			}
		}
		return value;
	}
}

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
	
	public UsersActions(frmUsers fr) {
		this.fr = fr;
		data = new D_Users();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fr.getBtnSave()) InsertUser();
		
		fr.getUser();
		fr.ClearFields();
	}

	private void InsertUser() {
		if(ValidateTxt()) {
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		Employees emp = fr.getEmpList().stream()
				.filter(e -> e.getFullname() == fr.getCbEmployeesName().getSelectedItem().toString())
				.findFirst()
				.get();
		
		if(isPasswordCorrect(fr.getPass().getPassword(), fr.getConfirmPass().getPassword())) {
			User us = new User(
					0,
					new Roles(fr.getCbRole().getSelectedItem().toString().equals("Administrador") ? 1 : 2, "", null),
					emp,
					fr.getTxtUser().getText(),
					fr.getPass().getPassword().toString(),
					null				
					);
			
				data.Insert(us);
				fr.getUsList().add(us);
		} else {
			JOptionPane.showMessageDialog(fr, "Las contraseñas no coinciden", "Advertencia", JOptionPane.WARNING_MESSAGE);
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

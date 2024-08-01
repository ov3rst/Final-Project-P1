package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Domain.D_Employees;
import Entities.Employees;
import UserUI.frmEmployees;

public class EmployeeActions implements ActionListener {

	private frmEmployees fr;
	private D_Employees data;
	
	public EmployeeActions(frmEmployees fr) {
		this.fr = fr;
		data = new D_Employees();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == fr.getBtnSave()) InsertEmployee();
		
		if(e.getSource() == fr.getBtnEdit()) UpdateEmployee();
		
		if(e.getSource() == fr.getBtnDelete()) DeleteEmployee();
		
		JOptionPane.showMessageDialog(fr, "Acción realizada con exito!!!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		fr.getEmployees();
		fr.ClearFields();
	}
	
	private void InsertEmployee() {
		Date date = new Date();
		if(ValidateFields()) {
			Employees emp = new Employees(-1, fr.getTxtFullname().getText().trim(), 
						fr.getdcBirthdate().getDate(), 
						Integer.parseInt(fr.getTxtIdentification().getText().trim()), 
						Integer.parseInt(fr.getTxtPhone().getText().trim()), 
						fr.getTxtEmail().getText().trim(), 
						fr.getTxtPosition().getText().trim(), 
						Double.parseDouble(fr.getTxtSalary().getText().trim()), date);
			data.Insert(emp);
			fr.getEmpList().add(emp);
		}
	}
	
	private void UpdateEmployee() {
		Date date = new Date();
		Employees emp = new Employees(fr.getEmployee().getId(), fr.getTxtFullname().getText().trim(), 
				fr.getdcBirthdate().getDate(),
				Integer.parseInt(fr.getTxtIdentification().getText().trim()), 
				Integer.parseInt(fr.getTxtPhone().getText().trim()), 
				fr.getTxtEmail().getText().trim(), 
				fr.getTxtPosition().getText().trim(), 
				Double.parseDouble(fr.getTxtSalary().getText().trim()), date);
		
		data.Update(emp);
		fr.getEmpList().set(fr.getEmpList().indexOf(fr.getEmployee()), emp);
		
	}
	
	private void DeleteEmployee() {
		int id = Integer.parseInt(fr.getTxtId().getText()), confirm = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a este empleado?", "Confirmación", JOptionPane.YES_NO_OPTION);
		
		if(confirm == JOptionPane.YES_OPTION) {
			data.Delete(id);
			fr.getEmpList().removeIf(e -> e.getId() == id);
		}
	}
	
	private boolean ValidateFields() {
		boolean noEmpty = true;
		
		for(JTextField field : fr.getFields()) {
			if(field.getText().isEmpty()) {
				noEmpty = false;
				break;
			}
		}
		
		if(!noEmpty || fr.getdcBirthdate().getDate() == null)
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		
		return noEmpty;
	}
	
}
package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Domain.D_Suppliers;
import Entities.Supplier;
import UserUI.frmSupplier;

public class SupplierActions implements ActionListener {

	private frmSupplier fr;
	private D_Suppliers data;
	private boolean confirm = false;
	
	public SupplierActions(frmSupplier fr) {
		this.fr = fr;
		data = new D_Suppliers();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == fr.getBtnSave()) InsertSupplier();
		
		if(e.getSource() == fr.getBtnEdit()) UpdateSupplier();
		
		if(e.getSource() == fr.getBtnDelete()) DeleteSupplier();
		
		if(confirm) {
			JOptionPane.showMessageDialog(fr, "Acción realizada con exito!!!", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
			fr.getSupplier();
			fr.ClearFields();
			confirm = false;
		}
	}
	
	private void InsertSupplier() {
		if(ValidateFields()) {
			Supplier sup = new Supplier(
					0,
					fr.getTxtName().getText(),
					Integer.parseInt(fr.getTxtRnc().getText()),
					Integer.parseInt(fr.getTxtPhone().getText()),
					fr.getTxtEmail().getText(),
					null);
			confirm = data.Insert(sup);
			fr.getSuppList().add(sup);
		}
	}
	
	private void UpdateSupplier() {
		Supplier sup = new Supplier(
				Integer.parseInt(fr.getTxtId().getText()),
				fr.getTxtName().getText(),
				Integer.parseInt(fr.getTxtRnc().getText()),
				Integer.parseInt(fr.getTxtPhone().getText()),
				fr.getTxtEmail().getText(),
				null);
		
		confirm = data.Update(sup);
		fr.getSuppList().set(fr.getSuppList().indexOf(fr.getSupp()), sup);
		
	}
	
	private void DeleteSupplier() {
		int id = Integer.parseInt(fr.getTxtId().getText()), usconfirm = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a este empleado?", "Confirmación", JOptionPane.YES_NO_OPTION);
		
		if(usconfirm == JOptionPane.YES_OPTION) {
			confirm = data.Delete(id);
			fr.getSuppList().removeIf(su -> su.getSupplierid() == id);
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
		
		if(!noEmpty)
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		
		return noEmpty;
	}
}

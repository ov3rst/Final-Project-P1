package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Domain.D_Category;
import Entities.Category;
import UserUI.frmCategory;

public class CategoryActions implements ActionListener {

	private frmCategory fr;
	private D_Category data;
	private boolean confirm = false;
	
	
	public CategoryActions(frmCategory fr) {
		this.fr = fr;
		data = new D_Category();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fr.getBtnSave()) InsertCategory();
		
		if(e.getSource() == fr.getBtnEdit()) UpdateCategory();
		
		if(e.getSource() == fr.getBtnDelete()) DeleteCategory();
		
		if(confirm) {
			JOptionPane.showMessageDialog(fr, "Acción realizada con exito!!!", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
			fr.getCategories();
			fr.ClearFields();
			confirm = false;
		}
	}
	
	private void InsertCategory() {
		if(ValidateFields()) {
			Category cat = new Category(
					0,
					fr.getTxtName().getText(),
					null
					);
			confirm = data.Insert(cat);
			fr.getCatList().add(cat);
		}
	}
	
	private void UpdateCategory() {
		Category cat = new Category(
				Integer.parseInt(fr.getTxtId().getText()),
				fr.getTxtName().getText(),
				null
				);
		
		confirm = data.Update(cat);
		fr.getCatList().set(fr.getCatList().indexOf(fr.getCategory()), cat);
		
	}
	
	private void DeleteCategory() {
		int id = Integer.parseInt(fr.getTxtId().getText()), usconfirm = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a este empleado?", "Confirmación", JOptionPane.YES_NO_OPTION);
		
		if(usconfirm == JOptionPane.YES_OPTION) {
			confirm = data.Delete(id);
			fr.getCatList().removeIf(ca -> ca.getCategoryid() == id);
		}
	}
	
	private boolean ValidateFields() {
		boolean noEmpty = true;
		
		if(fr.getTxtName().getText().isEmpty()) {
			noEmpty = false;
		}
		
		if(!noEmpty)
			JOptionPane.showMessageDialog(fr, "No debe haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		
		return noEmpty;
	}
}

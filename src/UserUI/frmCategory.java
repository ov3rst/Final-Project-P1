package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Actions.CategoryActions;
import Domain.D_Category;
import Entities.Category;

import javax.swing.JButton;
import java.awt.Color;

public class frmCategory extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextField txtId;
	private String[] columnNames = {"Categoria"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;
	private D_Category data = new D_Category();
	private List<Category> catList = data.GetAll();
	private Category category;

	/**
	 * Create the panel.
	 */
	public frmCategory() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() != tab || e.getSource() != scl) {
					tab.clearSelection();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {				
			}
			
		});
		
		tab = new JTable(tbm);
		tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tab.setShowHorizontalLines(false);
		tab.setShowVerticalLines(false);
		tab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				EnableBtn();
				ClearFields();
				if(tab.getSelectedRow() != -1) {
					int row = tab.getSelectedRow();
					String desc = tab.getValueAt(row, 0).toString();
					Category cat = catList.stream()
															.filter(ct -> ct.getDescriptions().equals(desc))
															.findFirst()
															.get();
					category = cat;
					if(cat != null) {
						FillFields(cat);
					}
				}
			}
		});
		scl = new JScrollPane(tab);
		scl.setBounds(293, 58, 250, 189);
		add(scl);
		
		CategoryActions actions = new CategoryActions(frmCategory.this);
		
		JLabel lblDetalleCategoria = new JLabel("Detalle Categoria");
		lblDetalleCategoria.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetalleCategoria.setBounds(10, 11, 213, 35);
		add(lblDetalleCategoria);
		
		JLabel lblFullname = new JLabel("Nombre de la Categoria");
		lblFullname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFullname.setBounds(12, 69, 154, 16);
		add(lblFullname);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBackground(SystemColor.window);
		txtName.setBounds(12, 87, 250, 32);
		add(txtName);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setColumns(10);
		txtId.setBounds(233, 37, 30, 32);
		txtId.setVisible(false);
		add(txtId);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(34, 219, 210, 28);
		btnDelete.addActionListener(actions);
		add(btnDelete);
		
		btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(34, 179, 210, 28);
		btnEdit.addActionListener(actions);
		add(btnEdit);
		
		btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setBounds(34, 139, 210, 28);
		btnSave.addActionListener(actions);
		add(btnSave);
		
		JLabel lblCategoryList = new JLabel("Lista de Categorias");
		lblCategoryList.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCategoryList.setBounds(293, 11, 235, 35);
		add(lblCategoryList);
		
		getCategories();

	}
	
	private void EnableBtn() {
		if(tab.getSelectedRow() == -1) {
			btnSave.setEnabled(true);
			btnEdit.setEnabled(false);
			btnDelete.setEnabled(false);
		} else {
			btnSave.setEnabled(false);
			btnEdit.setEnabled(true);
			btnDelete.setEnabled(true);
		}
	}
	
	private void FillFields(Category cat) {
		txtId.setText(String.valueOf(cat.getCategoryid()));
		txtName.setText(cat.getDescriptions());
	}
	
	public void getCategories() {
		
		tbm.setRowCount(0);
		for(Category cat: catList) {
			tbm.addRow(new Object [] {
					cat.getDescriptions()
			});
		}
	}
	
	public void ClearFields() {
		txtName.setText("");		
		txtId.setText("");
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public List<Category> getCatList() {
		return catList;
	}

	public Category getCategory() {
		return category;
	}
	
	
}

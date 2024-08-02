package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Actions.SupplierActions;
import Domain.D_Suppliers;
import Entities.Supplier;

import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import java.awt.Color;

public class frmSupplier extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextField txtRnc;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtId;
	private String[] columnNames = {"Nombre de la Empresa", "RNC", "Teléfono", "Correo Electronico", "Fecha de Ingreso"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private D_Suppliers suppData = new D_Suppliers();
	private List<Supplier> suppList = suppData.GetAll();
	private List<JTextField> fields;
	private Supplier supp;
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;

	/**
	 * Create the panel.
	 */
	public frmSupplier() {
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
		
		JLabel lblFullname = new JLabel("Nombre Completo");
		lblFullname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFullname.setBounds(18, 76, 116, 16);
		add(lblFullname);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBackground(SystemColor.window);
		txtName.setBounds(18, 94, 250, 32);
		add(txtName);
		
		txtRnc = new JTextField();
		txtRnc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtRnc.setColumns(10);
		txtRnc.setBounds(18, 151, 116, 32);
		add(txtRnc);
		
		JLabel lblRnc = new JLabel("RNC");
		lblRnc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRnc.setBounds(16, 134, 47, 16);
		add(lblRnc);
		
		JLabel lblEmail = new JLabel("Correo Electrónico");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(18, 188, 116, 16);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(18, 205, 250, 32);
		add(txtEmail);
		
		JLabel lblPhone = new JLabel("Teléfono");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhone.setBounds(150, 134, 53, 16);
		add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(152, 151, 116, 32);
		add(txtPhone);
		
		SupplierActions actions = new SupplierActions(frmSupplier.this);
		
		btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setBounds(37, 258, 210, 28);
		btnSave.addActionListener(actions);
		add(btnSave);
		
		btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(37, 298, 210, 28);
		btnEdit.addActionListener(actions);
		add(btnEdit);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(37, 338, 210, 28);
		btnDelete.addActionListener(actions);
		add(btnDelete);
		
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
					int row = tab.getSelectedRow(), rnc = Integer.parseInt(tab.getValueAt(row, 1).toString());
					Supplier sup = suppList.stream()
															.filter(su -> su.getRnc() == rnc)
															.findFirst()
															.get();
					supp = sup;
					if(sup != null) {
						FillFields(sup);
					}
				}
			}
		});
		scl = new JScrollPane(tab);
		scl.setBounds(293, 78, 596, 288);
		add(scl);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setColumns(10);
		txtId.setBounds(238, 38, 30, 32);
		txtId.setVisible(false);
		add(txtId);
		
		JLabel lblDetails = new JLabel("Detalle Proveedor");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetails.setBounds(15, 32, 213, 35);
		add(lblDetails);
		
		JLabel lblProviderlist = new JLabel("Lista de Proveedores");
		lblProviderlist.setBounds(293, 32, 247, 35);
		add(lblProviderlist);
		lblProviderlist.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		fields = new ArrayList<>();
		fields.add(txtEmail);
		fields.add(txtRnc);
		fields.add(txtPhone);
		fields.add(txtName);
		
		getSupplier();
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
	
	private void FillFields(Supplier sup) {
		txtId.setText(String.valueOf(sup.getSupplierid()));
		txtRnc.setText(String.valueOf(sup.getRnc()));
		txtPhone.setText(String.valueOf(sup.getPhone()));
		txtEmail.setText(sup.getEmail());
		txtName.setText(sup.getBusinessname());
	}
	
	public void getSupplier () {
		
		tbm.setRowCount(0);
		for(Supplier sup: suppList) {
			tbm.addRow(new Object [] {
					sup.getBusinessname(),
					sup.getRnc(),
					sup.getPhone(),
					sup.getEmail(),
					sup.getRegistrationdate()
			});
		}
	}
	
	public void ClearFields() {
		for(JTextField field : fields) {
			field.setText("");
		}
		
		txtId.setText("");
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public JTextField getTxtRnc() {
		return txtRnc;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JTextField getTxtPhone() {
		return txtPhone;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public List<Supplier> getSuppList() {
		return suppList;
	}

	public List<JTextField> getFields() {
		return fields;
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

	public Supplier getSupp() {
		return supp;
	}
	
	
}

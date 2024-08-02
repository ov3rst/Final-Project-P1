package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Actions.UsersActions;
import Domain.D_Employees;
import Domain.D_Users;
import Entities.Employees;
import Entities.User;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class frmUsers extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtUser;
	private JTextField txtId;
	private String[] columnNames = {"Nombre Completo", "Usuario", "Contraseña", "Rol"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JPasswordField confirmPass;
	private JPasswordField Pass;
	private D_Users  data = new D_Users();
	private D_Employees empData = new D_Employees();
	private List<User> usList = data.GetAll();
	private User user;
	private List<Employees> empList = empData.GetAll(), usempList;
	private Set<Employees> notUser;
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;
	private JComboBox<String> cbEmployeesName;
	private JComboBox<String> cbRole;

	/**
	 * Create the panel.
	 */
	public frmUsers() {
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
		
		UsersActions action = new UsersActions(frmUsers.this);
		
		JLabel lblPass = new JLabel("Contraseña");
		lblPass.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPass.setBounds(141, 122, 69, 16);
		add(lblPass);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtUser.setColumns(10);
		txtUser.setBounds(14, 139, 116, 32);
		add(txtUser);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUser.setBounds(12, 122, 47, 16);
		add(lblUser);
		
		btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.addActionListener(action);
		btnSave.setBounds(34, 248, 210, 28);
		add(btnSave);
		
		btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(34, 288, 210, 28);
		btnEdit.addActionListener(action);
		add(btnEdit);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(34, 328, 210, 28);
		btnDelete.addActionListener(action);
		add(btnDelete);
		
		JLabel lblDetails = new JLabel("Detalle Usuario");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetails.setBounds(12, 28, 192, 39);
		add(lblDetails);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar Contraseña");
		lblConfirmarContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConfirmarContrasea.setBounds(135, 182, 134, 16);
		add(lblConfirmarContrasea);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setColumns(10);
		txtId.setBounds(235, 40, 34, 32);
		add(txtId);
		
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
					String fullname = tab.getValueAt(row, 0).toString();
					User us = usList.stream()
															.filter(u -> u.getEmployee().getFullname().toString() == fullname)
															.findFirst()
															.get();
					user = us;
					if(us != null) {
						FillFields(us);
					}
				}
			}
		});
		scl = new JScrollPane(tab);
		scl.setBounds(289, 76, 606, 280);
		
		add(scl);
		
		JLabel lblList = new JLabel("Lista de Usuarios");
		lblList.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblList.setBounds(289, 28, 205, 39);
		add(lblList);
		
		cbEmployeesName = new JComboBox<String>();
		cbEmployeesName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cbEmployeesName.setBounds(14, 85, 250, 32);
		add(cbEmployeesName);
		
		JLabel lblEmployeeName = new JLabel("Empleado");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmployeeName.setBounds(14, 69, 78, 16);
		add(lblEmployeeName);
		
		confirmPass = new JPasswordField();
		confirmPass.setBounds(142, 199, 123, 32);
		add(confirmPass);
		
		Pass = new JPasswordField();
		Pass.setBounds(141, 139, 123, 32);
		add(Pass);
		
		cbRole = new JComboBox<String>();
		cbRole.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cbRole.setBounds(14, 199, 107, 32);
		add(cbRole);
		
		JLabel lblRole = new JLabel("Rol");
		lblRole.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRole.setBounds(14, 183, 27, 16);
		add(lblRole);
		
		UpdateLists();
		FillTabUsers();
		FillcbRoles();
		FillCbEmployee();

	}
	
	public void FillTabUsers () {
		
		tbm.setRowCount(0);
		for(User us: usList) {
			tbm.addRow(new Object [] {
					us.getEmployee().getFullname(),
					us.getUsername(),
					us.getPassword(),
					us.getRol().getRolename()					
			});
		}
	}
	
	private void FillFields(User user) {
		txtId.setText(String.valueOf(user.getUserid()));
		txtUser.setText(user.getUsername());
		Pass.setText(user.getPassword());
		if(tab.getSelectedRow() != -1 ) {
			cbEmployeesName.addItem(user.getEmployee().getFullname());
			cbEmployeesName.setSelectedItem(user.getEmployee().getFullname());
			cbEmployeesName.setEnabled(false);
		}		
		cbRole.setSelectedItem(user.getRol().getRolename());
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
	
	private void FillCbEmployee() {
				
		for(Employees e: notUser) {
			cbEmployeesName.addItem(e.getFullname());
		}
	}
	
	private void FillcbRoles() {
		cbRole.addItem("Administrador");
		cbRole.addItem("Empleado");
	}
	
	public void ClearFields() {
		txtId.setText("");
		txtUser.setText("");
		Pass.setText("");
		confirmPass.setText("");
		cbEmployeesName.removeAllItems();
		cbEmployeesName.setEnabled(true);
		cbRole.setSelectedIndex(0);		
		FillCbEmployee();
	}
	
	public void UpdateLists() {
		usempList = usList.stream().map(u -> u.getEmployee()).toList();
		notUser = new HashSet<>(empList);
		notUser.removeAll(usempList);
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JPasswordField getConfirmPass() {
		return confirmPass;
	}

	public JPasswordField getPass() {
		return Pass;
	}

	public User getUser() {
		return user;
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

	public JComboBox<String> getCbEmployeesName() {
		return cbEmployeesName;
	}

	public JComboBox<String> getCbRole() {
		return cbRole;
	}

	public List<Employees> getEmpList() {
		return empList;
	}

	public List<User> getUsList() {
		return usList;
	}
	
	
}

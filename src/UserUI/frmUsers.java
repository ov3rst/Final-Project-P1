package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class frmUsers extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDateRegistration;
	private JTextField txtUser;
	private JTextField txtId;
	private String[] columnNames = {"Nombre Completo", "Usuario", "Contraseña", "Rol"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JPasswordField confirmPass;
	private JPasswordField Pass;

	/**
	 * Create the panel.
	 */
	public frmUsers() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblRegistration = new JLabel("Fecha de Ingreso");
		lblRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRegistration.setBounds(14, 182, 129, 16);
		add(lblRegistration);
		
		txtDateRegistration = new JTextField();
		txtDateRegistration.setEnabled(false);
		txtDateRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtDateRegistration.setColumns(10);
		txtDateRegistration.setBounds(16, 199, 114, 32);
		add(txtDateRegistration);
		
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
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setBounds(34, 248, 210, 28);
		add(btnSave);
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(34, 288, 210, 28);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(34, 328, 210, 28);
		add(btnDelete);
		
		JLabel lblDetails = new JLabel("Detalle Usuario");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblDetails.setBounds(12, 28, 178, 39);
		add(lblDetails);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar Contraseña");
		lblConfirmarContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConfirmarContrasea.setBounds(135, 182, 134, 16);
		add(lblConfirmarContrasea);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setColumns(10);
		txtId.setBounds(188, 35, 34, 32);
		add(txtId);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(289, 76, 606, 280);
		
		add(scl);
		
		JLabel lblList = new JLabel("Lista de Usuarios");
		lblList.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblList.setBounds(289, 28, 185, 39);
		add(lblList);
		
		JComboBox<String> cbEmployeesName = new JComboBox<String>();
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

	}
}

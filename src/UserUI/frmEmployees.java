package UserUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.SystemColor;

public class frmEmployees extends JPanel {

	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"Nombre Completo", "Cédula", "Teléfono", "Correo Electronico", "Salario", "Fecha de nacimiento"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtFullname;
	private JTextField txtPhone;
	private JTextField txtBirthdate;
	private JTextField txtIdentification;
	private JTextField txtEmail;
	private JButton btnEdit;
	private JLabel lblEmployeeList;
	private JLabel lblRegistration;
	private JTextField txtRegistration;
	private JButton btnDelete;
	private JTextField txtId;
	private JTextField txtSalary;

	/**
	 * Create the panel.
	 */
	public frmEmployees() {
		setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 970, 498);
		setBorder(null);
		setLayout(null);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(287, 89, 667, 393);
		
		add(scl);
		
		JLabel lblFullname = new JLabel("Nombre Completo");
		lblFullname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFullname.setBounds(19, 98, 116, 16);
		add(lblFullname);
		
		txtFullname = new JTextField();
		txtFullname.setBackground(SystemColor.window);
		txtFullname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtFullname.setBounds(19, 116, 250, 32);
		add(txtFullname);
		txtFullname.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(19, 168, 116, 32);
		add(txtPhone);
		
		JLabel lblPhone = new JLabel("Teléfono");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhone.setBounds(17, 151, 53, 16);
		add(lblPhone);
		
		txtBirthdate = new JTextField();
		txtBirthdate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtBirthdate.setColumns(10);
		txtBirthdate.setBounds(148, 168, 121, 32);
		add(txtBirthdate);
		
		JLabel lblBirthdate = new JLabel("Fecha de Nacimiento");
		lblBirthdate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBirthdate.setBounds(146, 151, 129, 16);
		add(lblBirthdate);
		
		JLabel lblIdentification = new JLabel("Cédula");
		lblIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblIdentification.setBounds(17, 206, 53, 16);
		add(lblIdentification);
		
		txtIdentification = new JTextField();
		txtIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtIdentification.setColumns(10);
		txtIdentification.setBounds(19, 223, 116, 32);
		add(txtIdentification);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(21, 330, 248, 32);
		add(txtEmail);
		
		JLabel lblEmail = new JLabel("Correo Electrónico");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(19, 313, 133, 16);
		add(lblEmail);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBounds(37, 374, 210, 28);
		add(btnSave);
		
		btnEdit = new JButton("Editar");
		btnEdit.setEnabled(false);
		btnEdit.setForeground(new Color(255, 255, 255));
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setBounds(37, 414, 210, 28);
		add(btnEdit);
		
		lblEmployeeList = new JLabel("Lista de Empleados");
		lblEmployeeList.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblEmployeeList.setBounds(287, 34, 231, 42);
		add(lblEmployeeList);
		
		lblRegistration = new JLabel("Fecha de Ingreso");
		lblRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRegistration.setBounds(146, 206, 129, 16);
		add(lblRegistration);
		
		txtRegistration = new JTextField();
		txtRegistration.setEnabled(false);
		txtRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtRegistration.setColumns(10);
		txtRegistration.setBounds(148, 223, 121, 32);
		add(txtRegistration);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setEnabled(false);
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setBounds(37, 454, 210, 28);
		add(btnDelete);
		
		JLabel lblDetails = new JLabel("Detalle Empleado");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetails.setBounds(19, 34, 222, 42);
		add(lblDetails);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setEnabled(false);
		txtId.setColumns(10);
		txtId.setBounds(196, 72, 34, 32);
		add(txtId);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSalary.setColumns(10);
		txtSalary.setBounds(21, 277, 116, 32);
		add(txtSalary);
		
		JLabel lblSalary = new JLabel("Salario");
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSalary.setBounds(19, 260, 53, 16);
		add(lblSalary);
	}
}

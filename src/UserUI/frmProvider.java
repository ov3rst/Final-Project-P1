package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class frmProvider extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextField txtRnc;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtRegistration;
	private String[] columnNames = {"Nombre de la Empresa", "RNC", "Teléfono", "Correo Electronico", "Fecha de Ingreso"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtId;

	/**
	 * Create the panel.
	 */
	public frmProvider() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
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
		
		txtRegistration = new JTextField();
		txtRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtRegistration.setColumns(10);
		txtRegistration.setBounds(18, 262, 250, 32);
		add(txtRegistration);
		
		JLabel lblRegistration = new JLabel("Fecha de ingreso");
		lblRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRegistration.setBounds(18, 241, 129, 16);
		add(lblRegistration);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setBounds(37, 309, 210, 28);
		add(btnSave);
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(37, 349, 210, 28);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(37, 389, 210, 28);
		add(btnDelete);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(293, 78, 596, 342);
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

	}
}

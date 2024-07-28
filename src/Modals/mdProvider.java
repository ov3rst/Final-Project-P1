package Modals;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.ImageIcon;

public class mdProvider extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private String[] columnNames = {"Nombre de la Empresa", "RNC"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the frame.
	 */
	public mdProvider() {
		setTitle("Proveedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 11, 501, 43);
		contentPane.add(panel);
		
		JLabel lblProviderlist = new JLabel("Lista de Proveedores");
		lblProviderlist.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblProviderlist.setBounds(6, 3, 190, 35);
		panel.add(lblProviderlist);
		
		JLabel lblSearch = new JLabel("Buscar por:");
		lblSearch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSearch.setBounds(215, 13, 70, 16);
		panel.add(lblSearch);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(290, 5, 128, 32);
		panel.add(textField);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(429, 7, 34, 28);
		panel.add(btnSearch);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(468, 7, 34, 28);
		panel.add(btnNewButton_1);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(10, 54, 501, 263);
		contentPane.add(scl);
		
		JButton btnSelect = new JButton("Seleccionar Proveedor");
		btnSelect.setEnabled(false);
		btnSelect.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSelect.setBounds(10, 328, 177, 34);
		contentPane.add(btnSelect);
	}
}

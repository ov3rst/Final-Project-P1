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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

public class frmProduct extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtProductName;
	private JTextField txtCode;
	private JTextField txtDesc;
	private JTextField txtProductId;
	private String[] columnNames = {"Producto", "Descripción", "Código", "Stock", "Precio de Compra", "Precio de Venta"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtBPrice;
	private JTextField txtSPrice;

	/**
	 * Create the panel.
	 */
	public frmProduct() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		tab = new JTable(tbm);
//		tab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				EnableBtn();
//				ClearFields();
//				if(tab.getSelectedRow() != -1) {
//					int row = tab.getSelectedRow(), rnc = Integer.parseInt(tab.getValueAt(row, 1).toString());
//					Supplier sup = suppList.stream()
//															.filter(su -> su.getRnc() == rnc)
//															.findFirst()
//															.get();
//					supp = sup;
//					if(sup != null) {
//						FillFields(sup);
//					}
//				}
//			}
//		});
		scl = new JScrollPane(tab);
		scl.setBounds(293, 58, 679, 433);
		add(scl);
		
		JLabel lblDetails = new JLabel("Detalle Producto");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetails.setBounds(12, 13, 213, 35);
		add(lblDetails);
		
		txtProductName = new JTextField();
		txtProductName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtProductName.setColumns(10);
		txtProductName.setBackground(SystemColor.window);
		txtProductName.setBounds(14, 149, 250, 32);
		add(txtProductName);
		
		JLabel lblProductName = new JLabel("Nombre Del producto");
		lblProductName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblProductName.setBounds(14, 131, 141, 16);
		add(lblProductName);
		
		txtProductId = new JTextField();
		txtProductId.setEnabled(false);
		txtProductId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtProductId.setColumns(10);
		txtProductId.setBounds(233, 37, 30, 32);
		txtProductId.setVisible(false);
		add(txtProductId);
		
		txtCode = new JTextField();
		txtCode.setEnabled(false);
		txtCode.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCode.setColumns(10);
		txtCode.setBounds(14, 263, 116, 32);
		add(txtCode);
		
		JLabel lblStock = new JLabel("Cantidad");
		lblStock.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStock.setBounds(146, 246, 60, 16);
		add(lblStock);
		
		JLabel lblCode = new JLabel("Código");
		lblCode.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCode.setBounds(12, 246, 53, 16);
		add(lblCode);
		
		txtDesc = new JTextField();
		txtDesc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtDesc.setColumns(10);
		txtDesc.setBounds(14, 206, 250, 32);
		add(txtDesc);
		
		JLabel lblDesc = new JLabel("Descripción del Producto");
		lblDesc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDesc.setBounds(14, 189, 162, 16);
		add(lblDesc);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setBounds(37, 383, 210, 28);
		add(btnSave);
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setBounds(37, 423, 210, 28);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setBounds(37, 463, 210, 28);
		add(btnDelete);
		
		JLabel lblCategoryList = new JLabel("Lista de Productos");
		lblCategoryList.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCategoryList.setBounds(293, 13, 235, 35);
		add(lblCategoryList);
		
		JSpinner spStock = new JSpinner();
		spStock.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spStock.setFont(new Font("Times New Roman", Font.BOLD, 15));
		spStock.setBounds(148, 263, 116, 32);
		add(spStock);
		
		txtBPrice = new JTextField();
		txtBPrice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtBPrice.setColumns(10);
		txtBPrice.setBounds(14, 320, 116, 32);
		add(txtBPrice);
		
		JLabel lblBPrice = new JLabel("Precio de Compra");
		lblBPrice.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBPrice.setBounds(12, 303, 118, 16);
		add(lblBPrice);
		
		txtSPrice = new JTextField();
		txtSPrice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSPrice.setColumns(10);
		txtSPrice.setBounds(148, 320, 116, 32);
		add(txtSPrice);
		
		JLabel lblSPrice = new JLabel("Precio de Venta");
		lblSPrice.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSPrice.setBounds(146, 303, 118, 16);
		add(lblSPrice);
		
		JComboBox<String> cbCategories = new JComboBox<String>();
		cbCategories.setBounds(14, 92, 250, 32);
		add(cbCategories);
		
		JLabel lblCategory = new JLabel("Categoria");
		lblCategory.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCategory.setBounds(12, 73, 66, 16);
		add(lblCategory);

	}
}

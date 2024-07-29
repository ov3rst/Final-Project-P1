package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SpinnerNumberModel;

public class frmSales extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDate;
	private JTextField txtInvoiceNum;
	private JTextField txtName;
	private JTextField txtIdentification;
	private JTextField txtCodProduct;
	private JTextField txtProductName;
	private JTextField txtPrice;
	private JTextField txtStock;
	private JTextField txtTotal;
	Date date = new Date();
	private String[] columnNames = {"Producto", "Precio Compra", "Precio Venta", "Sub Total"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtChange;
	private JTextField txtPayWith;

	/**
	 * Create the panel.
	 */
	public frmSales() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblregis = new JLabel("Registrar Venta");
		lblregis.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblregis.setBounds(35, 11, 192, 39);
		add(lblregis);
		
		JPanel pnlInformation = new JPanel();
		pnlInformation.setLayout(null);
		pnlInformation.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Venta", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlInformation.setBounds(35, 50, 260, 74);
		add(pnlInformation);
		
		JLabel lblDate = new JLabel("Fecha:");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDate.setBounds(12, 22, 37, 15);
		pnlInformation.add(lblDate);
		
		txtDate = new JTextField();
		txtDate.setText((String) null);
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDate.setEnabled(false);
		txtDate.setColumns(10);
		txtDate.setBounds(12, 42, 114, 24);
		txtDate.setText(String.format("%t/%t/%t", date.getDay(), date.getMonth(), date.getYear()));
		pnlInformation.add(txtDate);
		
		txtInvoiceNum = new JTextField();
		txtInvoiceNum.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtInvoiceNum.setEnabled(false);
		txtInvoiceNum.setColumns(10);
		txtInvoiceNum.setBounds(138, 42, 114, 24);
		pnlInformation.add(txtInvoiceNum);
		
		JLabel lblInvoiceNum = new JLabel("No. factura:");
		lblInvoiceNum.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInvoiceNum.setBounds(138, 22, 76, 15);
		pnlInformation.add(lblInvoiceNum);
		
		JPanel pnlClient = new JPanel();
		pnlClient.setLayout(null);
		pnlClient.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Cliente", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlClient.setBounds(303, 50, 479, 74);
		add(pnlClient);
		
		JLabel lblClient = new JLabel("Nombre Cliente:");
		lblClient.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblClient.setBounds(12, 22, 102, 15);
		pnlClient.add(lblClient);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtName.setEnabled(false);
		txtName.setColumns(10);
		txtName.setBounds(12, 42, 180, 24);
		pnlClient.add(txtName);
		
		txtIdentification = new JTextField();
		txtIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtIdentification.setEnabled(false);
		txtIdentification.setColumns(10);
		txtIdentification.setBounds(264, 42, 200, 24);
		pnlClient.add(txtIdentification);
		
		JLabel lblIdentification = new JLabel("Cédula");
		lblIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdentification.setBounds(264, 22, 76, 15);
		pnlClient.add(lblIdentification);
		
		JButton btnSearchClient = new JButton("");
		btnSearchClient.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchClient.setBounds(204, 41, 30, 26);
		pnlClient.add(btnSearchClient);
		
		JPanel pnlProduct = new JPanel();
		pnlProduct.setLayout(null);
		pnlProduct.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Producto", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlProduct.setBounds(35, 130, 644, 74);
		add(pnlProduct);
		
		JLabel lblCodProduct = new JLabel("Cod. Producto:");
		lblCodProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCodProduct.setBounds(12, 22, 89, 15);
		pnlProduct.add(lblCodProduct);
		
		txtCodProduct = new JTextField();
		txtCodProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtCodProduct.setEnabled(false);
		txtCodProduct.setColumns(10);
		txtCodProduct.setBounds(12, 42, 102, 24);
		pnlProduct.add(txtCodProduct);
		
		txtProductName = new JTextField();
		txtProductName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtProductName.setEnabled(false);
		txtProductName.setColumns(10);
		txtProductName.setBounds(164, 42, 200, 24);
		pnlProduct.add(txtProductName);
		
		JLabel lblProduct = new JLabel("Producto:");
		lblProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProduct.setBounds(164, 22, 76, 15);
		pnlProduct.add(lblProduct);
		
		JButton btnSearchProduct = new JButton("");
		btnSearchProduct.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProduct.setBounds(120, 41, 30, 26);
		pnlProduct.add(btnSearchProduct);
		
		JLabel lblPrice = new JLabel("Precio:");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPrice.setBounds(376, 22, 89, 15);
		pnlProduct.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setText("0");
		txtPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPrice.setColumns(10);
		txtPrice.setBounds(376, 42, 89, 24);
		pnlProduct.add(txtPrice);
		
		txtStock = new JTextField();
		txtStock.setText("0");
		txtStock.setHorizontalAlignment(SwingConstants.RIGHT);
		txtStock.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtStock.setColumns(10);
		txtStock.setBounds(477, 42, 89, 24);
		pnlProduct.add(txtStock);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStock.setBounds(477, 22, 89, 15);
		pnlProduct.add(lblStock);
		
		JLabel lblCount = new JLabel("Cantidad:");
		lblCount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCount.setBounds(578, 22, 62, 15);
		pnlProduct.add(lblCount);
		
		JSpinner spCount = new JSpinner();
		spCount.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spCount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		spCount.setBounds(578, 44, 54, 20);
		pnlProduct.add(spCount);
		
		JButton btnAddProduct = new JButton("Agregar");
		btnAddProduct.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-añadir-40.png"));
		btnAddProduct.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAddProduct.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddProduct.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddProduct.setBounds(691, 130, 91, 74);
		add(btnAddProduct);
		
		JLabel lblTotal = new JLabel("Total a Pagar:");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotal.setBounds(688, 211, 89, 15);
		add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setEnabled(false);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setText("0");
		txtTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTotal.setColumns(10);
		txtTotal.setBounds(688, 231, 89, 24);
		add(txtTotal);
		
		JButton btnRegister = new JButton("Registrar");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRegister.setBounds(688, 404, 100, 47);
		add(btnRegister);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(35, 211, 644, 241);
		add(scl);
		
		txtChange = new JTextField();
		txtChange.setText("0");
		txtChange.setEnabled(false);
		txtChange.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChange.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtChange.setColumns(10);
		txtChange.setBounds(691, 367, 89, 24);
		add(txtChange);
		
		JLabel lblChange = new JLabel("Cambio:");
		lblChange.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblChange.setBounds(691, 347, 89, 15);
		add(lblChange);
		
		txtPayWith = new JTextField();
		txtPayWith.setText("0");
		txtPayWith.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPayWith.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPayWith.setColumns(10);
		txtPayWith.setBounds(688, 315, 89, 24);
		add(txtPayWith);
		
		JLabel lblPayWith = new JLabel("Paga con:");
		lblPayWith.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayWith.setBounds(688, 295, 89, 15);
		add(lblPayWith);

	}
}

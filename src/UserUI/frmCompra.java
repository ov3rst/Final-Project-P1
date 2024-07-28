package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.util.Date;

public class frmCompra extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDate;
	private JTextField txtFac;
	private JTextField txtRnc;
	private JTextField txtProvName;
	private JTextField txtCodProduct;
	private JTextField txtProductName;
	private JTextField txtBuyPrice;
	private JTextField txtSalePrice;
	private String[] columnNames = {"Producto", "Precio Compra", "Precio Venta", "Sub Total"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtTotal;
	Date date = new Date();
	private JSpinner spCount;
	private JButton btnSearchProduct;
	private JButton btnSearchProvider;
	private JButton btnRegister;
	private JButton btnAddProduct;
	

	/**
	 * Create the panel.
	 */
	public frmCompra() {
		setLocation(-23, -85);
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblregis = new JLabel("Registrar Compra");
		lblregis.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblregis.setBounds(23, 8, 192, 39);
		add(lblregis);
		
		JPanel pnlInformation = new JPanel();
		pnlInformation.setBorder(new TitledBorder(null, "Informaci\u00F3n Compra", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), null));
		pnlInformation.setBounds(23, 49, 260, 74);
		add(pnlInformation);
		pnlInformation.setLayout(null);
		
		JLabel lblDate = new JLabel("Fecha:");
		lblDate.setBounds(12, 22, 37, 15);
		pnlInformation.add(lblDate);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDate.setEnabled(false);
		txtDate.setText(String.format("%t/%t/%t", date.getDay(), date.getMonth(), date.getYear()));
		txtDate.setBounds(12, 42, 114, 24);
		pnlInformation.add(txtDate);
		txtDate.setColumns(10);
		
		txtFac = new JTextField();
		txtFac.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtFac.setEnabled(false);
		txtFac.setColumns(10);
		txtFac.setBounds(138, 42, 114, 24);
		pnlInformation.add(txtFac);
		
		JLabel lblFac = new JLabel("No. factura:");
		lblFac.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFac.setBounds(138, 22, 76, 15);
		pnlInformation.add(lblFac);
		
		JPanel pnlProvider = new JPanel();
		pnlProvider.setLayout(null);
		pnlProvider.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Proveedor", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlProvider.setBounds(291, 49, 479, 74);
		add(pnlProvider);
		
		JLabel lblRnc = new JLabel("RNC:");
		lblRnc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRnc.setBounds(12, 22, 37, 15);
		pnlProvider.add(lblRnc);
		
		txtRnc = new JTextField();
		txtRnc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtRnc.setEnabled(false);
		txtRnc.setColumns(10);
		txtRnc.setBounds(12, 42, 180, 24);
		pnlProvider.add(txtRnc);
		
		txtProvName = new JTextField();
		txtProvName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtProvName.setEnabled(false);
		txtProvName.setColumns(10);
		txtProvName.setBounds(264, 42, 200, 24);
		pnlProvider.add(txtProvName);
		
		JLabel lblName = new JLabel("Razón Social:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblName.setBounds(264, 22, 76, 15);
		pnlProvider.add(lblName);
		
		btnSearchProvider = new JButton("");
		btnSearchProvider.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProvider.setBounds(204, 41, 30, 26);
		pnlProvider.add(btnSearchProvider);
		
		JPanel pnlProduct = new JPanel();
		pnlProduct.setLayout(null);
		pnlProduct.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Producto", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlProduct.setBounds(23, 129, 644, 74);
		add(pnlProduct);
		
		JLabel lblCodProduct = new JLabel("Cod. Producto:");
		lblCodProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCodProduct.setBounds(12, 22, 89, 15);
		pnlProduct.add(lblCodProduct);
		
		txtCodProduct = new JTextField();
		txtCodProduct.setEnabled(false);
		txtCodProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtCodProduct.setColumns(10);
		txtCodProduct.setBounds(12, 42, 102, 24);
		pnlProduct.add(txtCodProduct);
		
		txtProductName = new JTextField();
		txtProductName.setEnabled(false);
		txtProductName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtProductName.setColumns(10);
		txtProductName.setBounds(164, 42, 200, 24);
		pnlProduct.add(txtProductName);
		
		JLabel lblProduct = new JLabel("Producto:");
		lblProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProduct.setBounds(164, 22, 76, 15);
		pnlProduct.add(lblProduct);
		
		btnSearchProduct = new JButton("");
		btnSearchProduct.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProduct.setBounds(120, 41, 30, 26);
		pnlProduct.add(btnSearchProduct);
		
		JLabel lblBuyPrice = new JLabel("Precio Compra:");
		lblBuyPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBuyPrice.setBounds(376, 22, 89, 15);
		pnlProduct.add(lblBuyPrice);
		
		txtBuyPrice = new JTextField();
		txtBuyPrice.setText("0");
		txtBuyPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBuyPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBuyPrice.setColumns(10);
		txtBuyPrice.setBounds(376, 42, 89, 24);
		pnlProduct.add(txtBuyPrice);
		
		txtSalePrice = new JTextField();
		txtSalePrice.setText("0");
		txtSalePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSalePrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSalePrice.setColumns(10);
		txtSalePrice.setBounds(477, 42, 89, 24);
		pnlProduct.add(txtSalePrice);
		
		JLabel lblSalePrice = new JLabel("Precio Venta:");
		lblSalePrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSalePrice.setBounds(477, 22, 89, 15);
		pnlProduct.add(lblSalePrice);
		
		JLabel lblCount = new JLabel("Cantidad:");
		lblCount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCount.setBounds(578, 22, 62, 15);
		pnlProduct.add(lblCount);
		
		spCount = new JSpinner();
		spCount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		spCount.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spCount.setBounds(578, 44, 54, 20);
		pnlProduct.add(spCount);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(23, 211, 644, 241);
		add(scl);
		
		btnAddProduct = new JButton("Agregar");
		btnAddProduct.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddProduct.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-añadir-40.png"));
		btnAddProduct.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAddProduct.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddProduct.setBounds(679, 129, 91, 74);
		add(btnAddProduct);
		
		btnRegister = new JButton("Registrar");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRegister.setBounds(675, 405, 101, 47);
		add(btnRegister);
		
		JLabel lblTotal = new JLabel("Total a Pagar:");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotal.setBounds(676, 355, 89, 15);
		add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setText("0");
		txtTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTotal.setColumns(10);
		txtTotal.setBounds(676, 375, 89, 24);
		add(txtTotal);
		
	}
}

package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class frmBuyDetails extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtInvoiceNum;
	private JTextField txtDate;
	private JTextField txtBuyType;
	private JTextField txtUser;
	private JTextField txtRnc;
	private JTextField txtProvName;
	private JTextField txtTotalAmount;
	private String[] columnNames = {"Producto", "Precio", "Cantidad", "Sub Total"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the panel.
	 */
	public frmBuyDetails() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblBuyDetails = new JLabel("Detalle Compra");
		lblBuyDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblBuyDetails.setBounds(20, 11, 213, 35);
		add(lblBuyDetails);
		
		JLabel lblInvoice = new JLabel("Número de Factura:");
		lblInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblInvoice.setBounds(31, 66, 128, 16);
		add(lblInvoice);
		
		txtInvoiceNum = new JTextField();
		txtInvoiceNum.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtInvoiceNum.setColumns(10);
		txtInvoiceNum.setBounds(160, 58, 103, 32);
		add(txtInvoiceNum);
		
		JButton btnSearch = new JButton("Buscar");
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(274, 60, 103, 28);
		add(btnSearch);
		
		JButton btnClear = new JButton("Limpiar");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClear.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-clear-20.png"));
		btnClear.setBounds(385, 60, 107, 28);
		add(btnClear);
		
		JPanel pnlBuyInformation = new JPanel();
		pnlBuyInformation.setLayout(null);
		pnlBuyInformation.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Compra", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlBuyInformation.setBounds(20, 102, 477, 74);
		add(pnlBuyInformation);
		
		JLabel lblDate = new JLabel("Fecha:");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDate.setBounds(12, 22, 89, 15);
		pnlBuyInformation.add(lblDate);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDate.setEnabled(false);
		txtDate.setColumns(10);
		txtDate.setBounds(12, 42, 102, 24);
		pnlBuyInformation.add(txtDate);
		
		txtBuyType = new JTextField();
		txtBuyType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBuyType.setEnabled(false);
		txtBuyType.setColumns(10);
		txtBuyType.setBounds(124, 42, 125, 24);
		pnlBuyInformation.add(txtBuyType);
		
		JLabel lblType = new JLabel("Tipo de Compra");
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblType.setBounds(124, 22, 102, 15);
		pnlBuyInformation.add(lblType);
		
		JLabel lblUser = new JLabel("Realizada Por:");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUser.setBounds(260, 22, 89, 15);
		pnlBuyInformation.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setEnabled(false);
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtUser.setColumns(10);
		txtUser.setBounds(260, 42, 207, 24);
		pnlBuyInformation.add(txtUser);
		
		JPanel pnlProvider = new JPanel();
		pnlProvider.setLayout(null);
		pnlProvider.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Proveedor", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlProvider.setBounds(20, 190, 479, 74);
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
		
		JButton btnSearchProvider = new JButton("");
		btnSearchProvider.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProvider.setBounds(204, 41, 30, 26);
		pnlProvider.add(btnSearchProvider);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(20, 276, 477, 168);
		add(scl);
		
		txtTotalAmount = new JTextField();
		txtTotalAmount.setEnabled(false);
		txtTotalAmount.setText("0");
		txtTotalAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotalAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBounds(107, 452, 89, 24);
		add(txtTotalAmount);
		
		JLabel lblTotal = new JLabel("Monto Total:");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotal.setBounds(21, 456, 81, 15);
		add(lblTotal);
		
		JButton btnExport = new JButton("Exportar PDF");
		btnExport.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-pdf-15.png"));
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBounds(345, 452, 147, 24);
		add(btnExport);

	}
}

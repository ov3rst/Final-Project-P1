package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frmSaleDetails extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtInvoiceNum;
	private JTextField txtDate;
	private JTextField txtSaleType;
	private JTextField txtUser;
	private JTextField txtRnc;
	private JTextField txtName;
	private JTextField txtTotal;
	private String[] columnNames = {"Producto", "Precio", "Cantidad", "Sub Total"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtChange;
	private JTextField txtPayAmount;


	/**
	 * Create the panel.
	 */
	public frmSaleDetails() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblSaleDetails = new JLabel("Detalle Venta");
		lblSaleDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblSaleDetails.setBounds(12, 12, 162, 35);
		add(lblSaleDetails);
		
		JLabel lblInvoice = new JLabel("Número de Factura:");
		lblInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblInvoice.setBounds(23, 67, 128, 16);
		add(lblInvoice);
		
		txtInvoiceNum = new JTextField();
		txtInvoiceNum.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtInvoiceNum.setColumns(10);
		txtInvoiceNum.setBounds(152, 59, 103, 32);
		add(txtInvoiceNum);
		
		JButton btnSearch = new JButton("Buscar");
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(268, 61, 103, 28);
		add(btnSearch);
		
		JButton btnClear = new JButton("Limpiar");
		btnClear.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-clear-20.png"));
		btnClear.setBounds(381, 61, 103, 28);
		add(btnClear);
		
		JPanel pnlSaleInformation = new JPanel();
		pnlSaleInformation.setLayout(null);
		pnlSaleInformation.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Venta", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlSaleInformation.setBounds(12, 103, 592, 74);
		add(pnlSaleInformation);
		
		JLabel lblDate = new JLabel("Fecha:");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDate.setBounds(12, 22, 89, 15);
		pnlSaleInformation.add(lblDate);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDate.setEnabled(false);
		txtDate.setColumns(10);
		txtDate.setBounds(12, 42, 102, 24);
		pnlSaleInformation.add(txtDate);
		
		txtSaleType = new JTextField();
		txtSaleType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSaleType.setEnabled(false);
		txtSaleType.setColumns(10);
		txtSaleType.setBounds(124, 42, 125, 24);
		pnlSaleInformation.add(txtSaleType);
		
		JLabel lblType = new JLabel("Tipo de Compra");
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblType.setBounds(124, 22, 102, 15);
		pnlSaleInformation.add(lblType);
		
		JLabel lblUser = new JLabel("Realizada Por:");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUser.setBounds(260, 22, 89, 15);
		pnlSaleInformation.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtUser.setEnabled(false);
		txtUser.setColumns(10);
		txtUser.setBounds(260, 42, 207, 24);
		pnlSaleInformation.add(txtUser);
		
		JPanel pnlProvider = new JPanel();
		pnlProvider.setLayout(null);
		pnlProvider.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Proveedor", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman", Font.PLAIN, 14), new Color(51, 51, 51)));
		pnlProvider.setBounds(12, 191, 592, 74);
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
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtName.setEnabled(false);
		txtName.setColumns(10);
		txtName.setBounds(264, 42, 316, 24);
		pnlProvider.add(txtName);
		
		JLabel lblName = new JLabel("Razón Social:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblName.setBounds(264, 22, 76, 15);
		pnlProvider.add(lblName);
		
		JButton btnSearchProvider = new JButton("");
		btnSearchProvider.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProvider.setBounds(204, 41, 30, 26);
		pnlProvider.add(btnSearchProvider);
		
		JButton btnExport = new JButton("Exportar PDF");
		btnExport.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-pdf-15.png"));
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBounds(468, 452, 136, 24);
		add(btnExport);
		
		txtTotal = new JTextField();
		txtTotal.setText("0");
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTotal.setColumns(10);
		txtTotal.setBounds(89, 453, 72, 24);
		add(txtTotal);
		
		JLabel lblTotal = new JLabel("Monto Total:");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotal.setBounds(12, 458, 81, 15);
		add(lblTotal);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(12, 274, 592, 168);
		add(scl);
		
		JLabel lblChange = new JLabel("Cambio:");
		lblChange.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblChange.setBounds(332, 458, 53, 15);
		add(lblChange);
		
		txtChange = new JTextField();
		txtChange.setText("0");
		txtChange.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChange.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtChange.setColumns(10);
		txtChange.setBounds(381, 453, 72, 24);
		add(txtChange);
		
		txtPayAmount = new JTextField();
		txtPayAmount.setText("0");
		txtPayAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPayAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPayAmount.setColumns(10);
		txtPayAmount.setBounds(249, 453, 72, 24);
		add(txtPayAmount);
		
		JLabel lblPay = new JLabel("Monto Pago:");
		lblPay.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPay.setBounds(174, 457, 72, 15);
		add(lblPay);

	}

}

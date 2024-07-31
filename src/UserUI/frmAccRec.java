package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmAccRec extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField txtSearch;
	private String[] columnNames = {"Cliente", "Monto Total", "Monto Adeudado", "¿Saldada?"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;


	/**
	 * Create the panel.
	 */
	public frmAccRec() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 51, 514, 94);
		add(panel);
		
		JLabel lblClient = new JLabel("Cliente:");
		lblClient.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblClient.setBounds(10, 24, 51, 15);
		panel.add(lblClient);
		
		JComboBox<String> cbClientPay = new JComboBox<String>();
		cbClientPay.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cbClientPay.setBounds(56, 19, 217, 28);
		panel.add(cbClientPay);
		
		JLabel lblIndebt = new JLabel("Total Adeudado:");
		lblIndebt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIndebt.setBounds(293, 24, 101, 15);
		panel.add(lblIndebt);
		
		JLabel lblAmount = new JLabel("0.00");
		lblAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAmount.setBounds(393, 24, 65, 15);
		panel.add(lblAmount);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(347, 51, 73, 28);
		panel.add(textField);
		
		JLabel lblPayment = new JLabel("Pago:");
		lblPayment.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayment.setBounds(303, 58, 42, 15);
		panel.add(lblPayment);
		
		JButton btnPay = new JButton("");
		btnPay.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-efectivo-en-mano-50.png"));
		btnPay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPay.setEnabled(false);
		btnPay.setBounds(432, 18, 73, 60);
		panel.add(btnPay);
		
		JLabel lblSearch = new JLabel("Buscar:");
		lblSearch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSearch.setBounds(10, 64, 42, 15);
		panel.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSearch.setColumns(10);
		txtSearch.setBounds(56, 56, 155, 28);
		panel.add(txtSearch);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(221, 56, 32, 28);
		panel.add(btnSearch);
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblCollect = new JLabel("Cuentas por cobrar a clientes");
		lblCollect.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCollect.setBounds(10, 11, 379, 29);
		add(lblCollect);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(10, 167, 514, 233);
		add(scl);
		
		JButton btnDetails = new JButton("Ver Detalles");
		btnDetails.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDetails.setEnabled(false);
		btnDetails.setBounds(10, 412, 126, 28);
		add(btnDetails);
	}
}

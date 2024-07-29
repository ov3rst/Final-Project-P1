package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frmAccPay extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblAmount;
	private JTextField textField;
	private String[] columnNames = {"Codigo", "Tipo De Deuda", "Monto", "Restante", "¿Saldada?"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the panel.
	 */
	public frmAccPay() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblPay = new JLabel("Pago de Cuentas de la Empresa");
		lblPay.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblPay.setBounds(10, 11, 379, 42);
		add(lblPay);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 61, 519, 94);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPayType = new JLabel("Cuenta a Pagar:");
		lblPayType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayType.setBounds(10, 24, 88, 15);
		panel.add(lblPayType);
		
		JComboBox<String> cbAccountPay = new JComboBox<String>();
		cbAccountPay.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cbAccountPay.setBounds(107, 19, 166, 28);
		panel.add(cbAccountPay);
		
		JLabel lblIndebt = new JLabel("Total Adeudado:");
		lblIndebt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIndebt.setBounds(293, 24, 101, 15);
		panel.add(lblIndebt);
		
		lblAmount = new JLabel("0.00");
		lblAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAmount.setBounds(393, 24, 65, 15);
		panel.add(lblAmount);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(347, 51, 73, 28);
		panel.add(textField);
		
		JLabel lblPayment = new JLabel("Pago:");
		lblPayment.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayment.setBounds(303, 58, 42, 15);
		panel.add(lblPayment);
		
		JButton btnPay = new JButton("");
		btnPay.setEnabled(false);
		btnPay.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-efectivo-en-mano-50.png"));
		btnPay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPay.setBounds(432, 18, 73, 60);
		panel.add(btnPay);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(10, 167, 519, 233);
		add(scl);
		
		JButton btnDetails = new JButton("Ver Detalles");
		btnDetails.setEnabled(false);
		btnDetails.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDetails.setBounds(10, 412, 126, 28);
		add(btnDetails);
	}

}

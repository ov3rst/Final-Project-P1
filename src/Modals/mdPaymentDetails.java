package Modals;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;

public class mdPaymentDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] columnNames = {"No. Factura", "Monto Pagado", "Fecha de Pago"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the frame.
	 */
	public mdPaymentDetails() {
		setTitle("Detalle de Pagos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 483, 308);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(10, 11, 452, 249);
		getContentPane().add(scl);
	}

}

package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmBuyReport extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtSearchFor;
	private String[] columnNames = {"Cliente", "Monto Total", "Monto Adeudado", "¿Saldada?"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the panel.
	 */
	public frmBuyReport() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JPanel pnl1 = new JPanel();
		pnl1.setBounds(10, 21, 790, 85);
		add(pnl1);
		pnl1.setLayout(null);
		
		JLabel lblBuyReport = new JLabel("Reporte de Compras");
		lblBuyReport.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblBuyReport.setBounds(10, 10, 216, 23);
		pnl1.add(lblBuyReport);
		
		JLabel lblInitDate = new JLabel("Fecha de Inicio:");
		lblInitDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInitDate.setBounds(10, 48, 98, 15);
		pnl1.add(lblInitDate);
		
		JDateChooser dcBeginDate = new JDateChooser();
		dcBeginDate.setBounds(105, 44, 121, 24);
		pnl1.add(dcBeginDate);
		
		JLabel lblFinalDate = new JLabel("Fecha de Final:");
		lblFinalDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFinalDate.setBounds(242, 48, 90, 15);
		pnl1.add(lblFinalDate);
		
		JDateChooser dcFinalDate = new JDateChooser();
		dcFinalDate.setBounds(333, 44, 121, 24);
		pnl1.add(dcFinalDate);
		
		JComboBox<String> cbProvider = new JComboBox<String>();
		cbProvider.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cbProvider.setBounds(550, 44, 191, 24);
		pnl1.add(cbProvider);
		
		JLabel lblProvider = new JLabel("Proveedor:");
		lblProvider.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProvider.setBounds(484, 48, 61, 15);
		pnl1.add(lblProvider);
		
		JButton btnSearchProvider = new JButton("");
		btnSearchProvider.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProvider.setBounds(750, 44, 30, 24);
		pnl1.add(btnSearchProvider);
		
		JPanel pnl2 = new JPanel();
		pnl2.setBounds(10, 117, 956, 354);
		add(pnl2);
		pnl2.setLayout(null);
		
		JButton btnClear = new JButton("Limpiar");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClear.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-clear-20.png"));
		btnClear.setBounds(830, 12, 116, 28);
		pnl2.add(btnClear);
		
		JButton btnSearch = new JButton("Buscar");
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(715, 12, 103, 28);
		pnl2.add(btnSearch);
		
		JLabel lblSearchFor = new JLabel("Buscar Por:");
		lblSearchFor.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSearchFor.setBounds(307, 18, 71, 16);
		pnl2.add(lblSearchFor);
		
		JComboBox<String> cbFilter = new JComboBox<String>();
		cbFilter.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cbFilter.setBounds(389, 12, 146, 28);
		pnl2.add(cbFilter);
		
		JButton btnExport = new JButton("Exportar Excel");
		btnExport.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-microsoft-excel-2019-15.png"));
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBounds(12, 12, 146, 28);
		pnl2.add(btnExport);
		
		txtSearchFor = new JTextField();
		txtSearchFor.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSearchFor.setColumns(10);
		txtSearchFor.setBounds(555, 12, 148, 28);
		pnl2.add(txtSearchFor);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(12, 52, 514, 233);
		pnl2.add(scl);
	}
}

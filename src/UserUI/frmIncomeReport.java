package UserUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmIncomeReport extends JPanel {

	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"Cliente", "Monto Total", "Monto Adeudado", "¿Saldada?"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;

	/**
	 * Create the panel.
	 */
	public frmIncomeReport() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(null);
		pnl1.setBounds(10, 11, 510, 85);
		add(pnl1);
		
		JLabel lblIncomeReport = new JLabel("Reporte de Ingresos");
		lblIncomeReport.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblIncomeReport.setBounds(10, 8, 216, 31);
		pnl1.add(lblIncomeReport);
		
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
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setBounds(466, 44, 30, 24);
		pnl1.add(btnSearch);
		
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(12, 119, 613, 354);
		add(pnl2);
		
		JButton btnExport = new JButton("Exportar Excel");
		btnExport.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-microsoft-excel-2019-15.png"));
		btnExport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExport.setBounds(12, 12, 146, 28);
		pnl2.add(btnExport);
		
		tab = new JTable(tbm);
		scl = new JScrollPane(tab);
		scl.setBounds(12, 52, 514, 233);
		pnl2.add(scl);
	}
}

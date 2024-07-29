package UserUI;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class frmSaleReport extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtFilter;

	/**
	 * Create the panel.
	 */
	public frmSaleReport() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(null);
		pnl1.setBounds(10, 26, 506, 85);
		add(pnl1);
		
		JLabel lblSaleReport = new JLabel("Reporte de Ventas");
		lblSaleReport.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblSaleReport.setBounds(10, 10, 201, 23);
		pnl1.add(lblSaleReport);
		
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
		
		JButton btnSearchProvider = new JButton("");
		btnSearchProvider.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearchProvider.setBounds(466, 44, 30, 24);
		pnl1.add(btnSearchProvider);
		
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(10, 122, 956, 354);
		add(pnl2);
		
		JButton btnClear = new JButton("Limpiar");
		btnClear.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-clear-20.png"));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClear.setBounds(830, 12, 116, 28);
		pnl2.add(btnClear);
		
		JButton btnSearch = new JButton("Buscar");
		btnSearch.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-búsqueda-20.png"));
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
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
		
		txtFilter = new JTextField();
		txtFilter.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtFilter.setColumns(10);
		txtFilter.setBounds(555, 12, 148, 28);
		pnl2.add(txtFilter);

	}

}

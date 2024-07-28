package UserUI;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Actions.StartActions;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class frmStart extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mniMonthReport;
	private JMenuItem mniProvider;
	private JMenuItem mniExit;
	private JMenuItem mniSales;
	private JMenuItem mniBuy;
	private JMenuItem mniUsers;
	private JMenuItem mniExpenses;
	private JMenuItem mniIncome;
	private JMenuItem mniWeekReport;
	private JPanel plInit;
	private JMenuItem mniSaleDetails;
	private JMenuItem mniBuyDetails;
	private JMenu mnRoster;
	private JMenuItem mniRoster;
	private JMenuItem mniUsers_1;
	private JLabel lblShowUser;
	private JLabel lblUserIs;

	/**
	 * Create the frame.
	 */
	public frmStart() {
		setTitle("Sistema de Ventas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 1002, 650);
//		addWindowListener(new WindowAdapter() {
//	            @Override
//	            public void windowClosing(WindowEvent e) {
//	                int option = JOptionPane.showConfirmDialog(frmStart.this, 
//	                        "¿Desea Cerrar sesión?", 
//	                        "Confirmar Cierre de sesion", 
//	                        JOptionPane.YES_NO_OPTION, 
//	                        JOptionPane.QUESTION_MESSAGE);
//	                
//	                if (option == JOptionPane.YES_OPTION) {
//	                    dispose();
//	                    frmLogin login = new frmLogin();
//	                    login.setVisible(true);
//	                }
//	            }
//	        });
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menú");
		mnMenu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnMenu.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-menú-50.png"));
		menuBar.add(mnMenu);
		
		StartActions actions = new StartActions(frmStart.this);
		
		mniProvider = new JMenuItem("Proveedores");
		mniProvider.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniProvider.addActionListener(actions);
		mnMenu.add(mniProvider);
		
		mniExit = new JMenuItem("Cerrar sesión");
		mniExit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniExit.addActionListener(actions);
		mnMenu.add(mniExit);
		
		JMenu mnSales = new JMenu("Ventas");
		mnSales.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnSales.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-ventas-totales-50.png"));
		menuBar.add(mnSales);
		
		mniSales = new JMenuItem("Ventas");
		mniSales.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnSales.add(mniSales);
		
		mniSaleDetails = new JMenuItem("Ver Ventas");
		mniSaleDetails.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnSales.add(mniSaleDetails);
		
		JMenu mnBuy = new JMenu("Compras");
		mnBuy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnBuy.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-comprar-50.png"));
		menuBar.add(mnBuy);
		
		mniBuy = new JMenuItem("Compras");
		mniBuy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnBuy.add(mniBuy);
		
		mniBuyDetails = new JMenuItem("Ver Compras");
		mniBuyDetails.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnBuy.add(mniBuyDetails);
		
		JMenu mnEmployees = new JMenu("Empleados");
		mnEmployees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnEmployees.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-grupo-de-usuario-50.png"));
		menuBar.add(mnEmployees);
		
		mniUsers = new JMenuItem("Gestionar Empleados");
		mniUsers.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniUsers.addActionListener(actions);
		mnEmployees.add(mniUsers);
		
		mniUsers_1 = new JMenuItem("Gestionar Usuarios");
		mniUsers_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnEmployees.add(mniUsers_1);
		
		JMenu mnExpenses = new JMenu("Gastos");
		mnExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnExpenses.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-expenses-50.png"));
		menuBar.add(mnExpenses);
		
		mniExpenses = new JMenuItem("Cuentas por Pagar");
		mniExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnExpenses.add(mniExpenses);
		
		JMenu mnIncome = new JMenu("Ingresos");
		mnIncome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnIncome.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-receive-cash-50.png"));
		menuBar.add(mnIncome);
		
		mniIncome = new JMenuItem("Cuentas por Cobrar");
		mniIncome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnIncome.add(mniIncome);
		
		JMenu mnReports = new JMenu("Reportes");
		mnReports.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnReports.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-archivo-de-informe-50.png"));
		menuBar.add(mnReports);
		
		mniMonthReport = new JMenuItem("Reporte mensual");
		mniMonthReport.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnReports.add(mniMonthReport);
		
		mniWeekReport = new JMenuItem("Reporte semanal");
		mniWeekReport.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnReports.add(mniWeekReport);
		
		mnRoster = new JMenu("Nómina");
		mnRoster.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-employee-rotational-shift-work-procedure-with-loop-arrows-layout-50.png"));
		mnRoster.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(mnRoster);
		
		mniRoster = new JMenuItem("Pagos De Nómina");
		mniRoster.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnRoster.add(mniRoster);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		plInit = new JPanel();
		plInit.setBorder(new LineBorder(new Color(0, 0, 0)));
		plInit.setBackground(SystemColor.activeCaption);
		plInit.setBounds(0, 30, 986, 524);
		contentPane.add(plInit);
		plInit.setLayout(new CardLayout(0, 0));
		
		lblShowUser = new JLabel("Oliver Tejeda");
		lblShowUser.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblShowUser.setBounds(790, 2, 189, 24);
		contentPane.add(lblShowUser);
		
		lblUserIs = new JLabel("Usuario:");
		lblUserIs.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUserIs.setBounds(714, 2, 73, 24);
		contentPane.add(lblUserIs);
		
//		JPanel emptyPanel = new JPanel();
//		Userpanel usp = new Userpanel();
//		plInit.add(emptyPanel);
//		plInit.add(usp, "User Panel");
	}

	public JMenuItem getMniMonthReport() {
		return mniMonthReport;
	}

	public JMenuItem getMniProvider() {
		return mniProvider;
	}

	public JMenuItem getMniExit() {
		return mniExit;
	}

	public JMenuItem getMniSales() {
		return mniSales;
	}

	public JMenuItem getMniBuy() {
		return mniBuy;
	}

	public JMenuItem getMniUsers() {
		return mniUsers;
	}

	public JMenuItem getMniExpenses() {
		return mniExpenses;
	}

	public JMenuItem getMniIncome() {
		return mniIncome;
	}

	public JMenuItem getMniWeekReport() {
		return mniWeekReport;
	}
	
	public JPanel getPlInit() {
		return plInit;
	}
}

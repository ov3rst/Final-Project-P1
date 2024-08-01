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
	private JMenuItem mniBuyReport;
	private JMenuItem mniProvider;
	private JMenuItem mniExit;
	private JMenuItem mniSales;
	private JMenuItem mniBuy;
	private JMenuItem mniEmployees;
	private JMenuItem mniAccPay;
	private JMenuItem mniSaleReport;
	private JPanel plInit;
	private JMenuItem mniSaleDetails;
	private JMenuItem mniBuyDetails;
	private JMenu mnRoster;
	private JMenuItem mniRoster;
	private JMenuItem mniUsers;
	private JLabel lblShowUser;
	private JLabel lblUserIs;
	private JMenuItem mniPayments;
	private JMenuItem mniIncome;
	private JMenuItem mniAccRec;

	/**
	 * Create the frame.
	 */
	public frmStart(frmLogin fr) {
		setTitle("Sistema de Ventas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(fr);
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
		mniSales.addActionListener(actions);
		mnSales.add(mniSales);
		
		mniSaleDetails = new JMenuItem("Ver Ventas");
		mniSaleDetails.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniSaleDetails.addActionListener(actions);
		mnSales.add(mniSaleDetails);
		
		JMenu mnBuy = new JMenu("Compras");
		mnBuy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnBuy.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-comprar-50.png"));
		menuBar.add(mnBuy);
		
		mniBuy = new JMenuItem("Compras");
		mniBuy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniBuy.addActionListener(actions);
		mnBuy.add(mniBuy);
		
		mniBuyDetails = new JMenuItem("Ver Compras");
		mniBuyDetails.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniBuyDetails.addActionListener(actions);
		mnBuy.add(mniBuyDetails);
		
		JMenu mnEmployees = new JMenu("Empleados");
		mnEmployees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnEmployees.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-grupo-de-usuario-50.png"));
		menuBar.add(mnEmployees);
		
		mniEmployees = new JMenuItem("Gestionar Empleados");
		mniEmployees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniEmployees.addActionListener(actions);
		mnEmployees.add(mniEmployees);
		
		mniUsers = new JMenuItem("Gestionar Usuarios");
		mniUsers.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniUsers.addActionListener(actions);
		mnEmployees.add(mniUsers);
		
		JMenu mnFinances = new JMenu("Cuentas");
		mnFinances.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnFinances.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-acumular-50.png"));
		menuBar.add(mnFinances);
		
		mniAccPay = new JMenuItem("Cuentas por Pagar");
		mniAccPay.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniAccPay.addActionListener(actions);
		mnFinances.add(mniAccPay);
		
		mniAccRec = new JMenuItem("Cuentas por Cobrar");
		mniAccRec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniAccRec.addActionListener(actions);
		mnFinances.add(mniAccRec);
		
		JMenu mnReports = new JMenu("Reportes");
		mnReports.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnReports.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-archivo-de-informe-50.png"));
		menuBar.add(mnReports);
		
		mniBuyReport = new JMenuItem("Reporte Compras");
		mniBuyReport.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniBuyReport.addActionListener(actions);
		mnReports.add(mniBuyReport);
		
		mniSaleReport = new JMenuItem("Reporte Ventas");
		mniSaleReport.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniSaleReport.addActionListener(actions);
		mnReports.add(mniSaleReport);
		
		mniPayments = new JMenuItem("Pagos");
		mniPayments.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniPayments.addActionListener(actions);
		mnReports.add(mniPayments);
		
		mniIncome = new JMenuItem("Ingresos");
		mniIncome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniIncome.addActionListener(actions);
		mnReports.add(mniIncome);
		
		mnRoster = new JMenu("Nómina");
		mnRoster.setIcon(new ImageIcon("E:\\Programacion\\Java\\FinalProject-PointSale\\Assets\\icons8-employee-rotational-shift-work-procedure-with-loop-arrows-layout-50.png"));
		mnRoster.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(mnRoster);
		
		mniRoster = new JMenuItem("Pagos De Nómina");
		mniRoster.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mniRoster.addActionListener(actions);
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
	}

	public JMenuItem getMniMonthReport() {
		return mniBuyReport;
	}

	public JMenuItem getMniBuyReport() {
		return mniBuyReport;
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

	public JMenuItem getMniEmployees() {
		return mniEmployees;
	}

	public JMenuItem getMniAccPay() {
		return mniAccPay;
	}

	public JMenuItem getMniSaleReport() {
		return mniSaleReport;
	}

	public JPanel getPlInit() {
		return plInit;
	}

	public JMenuItem getMniSaleDetails() {
		return mniSaleDetails;
	}

	public JMenuItem getMniBuyDetails() {
		return mniBuyDetails;
	}

	public JMenu getMnRoster() {
		return mnRoster;
	}

	public JMenuItem getMniRoster() {
		return mniRoster;
	}

	public JMenuItem getMniUsers() {
		return mniUsers;
	}

	public JMenuItem getMniPayments() {
		return mniPayments;
	}

	public JMenuItem getMniIncome() {
		return mniIncome;
	}

	public JMenuItem getMniAccRec() {
		return mniAccRec;
	}

	
	
	
}

package UserUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;

import Actions.LoginActions;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class frmLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private JButton btnCancel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin window = new frmLogin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmLogin() {
		getContentPane().setBackground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("LOGIN");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 470, 248);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		LoginActions ac = new LoginActions(frmLogin.this);
		
		txtUser = new JTextField();
		txtUser.setBounds(155, 56, 190, 32);
		getContentPane().add(txtUser);
		txtUser.setForeground(SystemColor.desktop);
		txtUser.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		txtUser.setBackground(SystemColor.window);
		txtUser.setColumns(10);
		
		JLabel lblLogin = new JLabel("Inicio de sesión");
		lblLogin.setBounds(109, 5, 240, 48);
		getContentPane().add(lblLogin);
		lblLogin.setForeground(SystemColor.text);
		lblLogin.setFont(new Font("Cascadia Mono", Font.PLAIN, 25));
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(73, 63, 78, 16);
		getContentPane().add(lblUser);
		lblUser.setForeground(SystemColor.text);
		lblUser.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(SystemColor.text);
		lblContrasea.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblContrasea.setBounds(46, 110, 104, 16);
		getContentPane().add(lblContrasea);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(SystemColor.window);
		txtPassword.setBounds(155, 103, 190, 32);
		getContentPane().add(txtPassword);
		
		btnLogin = new JButton("Iniciar Sesión");
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
		btnLogin.setBounds(73, 159, 160, 32);
		btnLogin.addActionListener(ac);
		getContentPane().add(btnLogin);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
		btnCancel.setBackground(SystemColor.inactiveCaption);
		btnCancel.setBounds(244, 159, 160, 32);
		getContentPane().add(btnCancel);
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public JPasswordField getTxtPassword() {
		return txtPassword;
	}
}

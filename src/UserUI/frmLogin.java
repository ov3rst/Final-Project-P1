package UserUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;

import Data.DBConnection;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUser;
	private JPasswordField passwordField;


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
		getContentPane().setBackground(SystemColor.textHighlight);
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
		
		txtUser = new JTextField();
		txtUser.setBounds(155, 56, 190, 32);
		getContentPane().add(txtUser);
		txtUser.setForeground(SystemColor.desktop);
		txtUser.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		txtUser.setBackground(SystemColor.inactiveCaption);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inicio de sesión");
		lblNewLabel.setBounds(149, 91, 240, 48);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 25));
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(73, 63, 78, 16);
		getContentPane().add(lblUser);
		lblUser.setForeground(SystemColor.text);
		lblUser.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(SystemColor.text);
		lblContrasea.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblContrasea.setBounds(52, 110, 99, 16);
		getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaption);
		passwordField.setBounds(155, 103, 190, 32);
		getContentPane().add(passwordField);
		
		JLabel lblPrueba = new JLabel("Probando");
		lblPrueba.setBounds(26, 6, 395, 38);
		getContentPane().add(lblPrueba);
		
		JButton btnLogin = new JButton("Iniciar Sesión");
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
		btnLogin.setBounds(73, 159, 160, 32);
		getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
		btnCancel.setBackground(SystemColor.inactiveCaption);
		btnCancel.setBounds(244, 159, 160, 32);
		getContentPane().add(btnCancel);
		
		
	}
}

package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Data.DT_Users;
import Entities.*;
import UserUI.frmLogin;
import UserUI.frmStart;

public class LoginActions implements ActionListener {
	
	private frmLogin fr;
	
	public LoginActions(frmLogin fr) {
		this.fr = fr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fr.getBtnLogin()) Login(fr.getTxtUser().getText(), fr.getTxtPassword().getText());
		
		if(e.getSource() == fr.getBtnCancel()) System.exit(0);
	}

	private void Login (String user, String password) {
//		if(user.length() == 0 || password.length() == 0) {
//			JOptionPane.showMessageDialog(fr, "No debe dejar ningun campo vacio", "Error", JOptionPane.INFORMATION_MESSAGE);
//			return;
//		}		
//		
//		for (User us : DT_Users.UserList()) {			
//			if(us.getUsername().equals(user) && us.getPassword().equals(password)) {
//				
//			}
//		}
//		
//		JOptionPane.showMessageDialog(fr, "Usuario y/o contraseña incorrectos", "Error", JOptionPane.INFORMATION_MESSAGE);
		
		fr.dispose();
		frmStart frm = new frmStart();
		frm.setVisible(true);
		return;
	}
}

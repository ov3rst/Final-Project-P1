package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import UserUI.frmEmployees;
import UserUI.frmLogin;
import UserUI.frmProvider;
import UserUI.frmStart;

public class StartActions implements ActionListener{
	
	private frmStart fr;
	
	public StartActions(frmStart fr) {
		this.fr = fr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fr.getMniExit()) {
			Logout();
			return;
		}
		
		fr.getPlInit().removeAll();
		
		if(e.getSource() == fr.getMniUsers()) OpenEmployeePane();
		
		if(e.getSource() == fr.getMniProvider()) OpenProviderPane();
		
		
			
		fr.getPlInit().revalidate();
		fr.getPlInit().repaint();
	}

	public void Logout() {
		fr.dispose();
		frmLogin fr = new frmLogin();
		fr.setVisible(true);
	}
	
	public void OpenEmployeePane() {
		frmEmployees usp = new frmEmployees();
		fr.getPlInit().add(usp);
	}
	
	public void OpenProviderPane() {
		frmProvider prov = new frmProvider();
		fr.getPlInit().add(prov);
	}
	
}

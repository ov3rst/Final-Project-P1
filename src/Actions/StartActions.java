package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UserUI.*;

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
		
		if(e.getSource() == fr.getMniEmployees()) OpenEmployeePane();
		
		if(e.getSource() == fr.getMniUsers()) OpenUsersPane();
		
		if(e.getSource() == fr.getMniProvider()) OpenProviderPane();
		
		if(e.getSource() == fr.getMniSales()) OpenSalePane();
		
		if(e.getSource() == fr.getMniSaleDetails()) OpenSaleDetailsPane();
		
		if(e.getSource() == fr.getMniBuy()) OpenBuyPane();
		
		if(e.getSource() == fr.getMniBuyDetails()) OpenBuyDetailsPane();
		
		if(e.getSource() == fr.getMniAccPay()) OpenAccPayPane();
		
		if(e.getSource() == fr.getMniAccRec()) OpenAccRecPane();
		
		if(e.getSource() == fr.getMniBuyReport()) OpenBuyReportPane();
		
		if(e.getSource() == fr.getMniSaleReport()) OpenSaleReportPane();
		
		if(e.getSource() == fr.getMniPayments()) OpenBillsReportPane();
		
		if(e.getSource() == fr.getMniIncome()) OpenIncomeReportPane();
		
		fr.getPlInit().revalidate();
		fr.getPlInit().repaint();
	}

	private void Logout() {
		fr.dispose();
		frmLogin fr = new frmLogin();
		fr.setVisible(true);
	}
	
	private void OpenSalePane() {
		frmSales frm = new frmSales();
		fr.getPlInit().add(frm);
	}
	
	private void OpenSaleDetailsPane() {
		frmSaleDetails frm = new frmSaleDetails();
		fr.getPlInit().add(frm);
	}
	
	private void OpenBuyPane() {
		frmBuy frm = new frmBuy();
		fr.getPlInit().add(frm);
	}
	
	private void OpenBuyDetailsPane() {
		frmBuyDetails frm = new frmBuyDetails();
		fr.getPlInit().add(frm);
	}
	
	private void OpenAccRecPane() {
		frmAccRec frm = new frmAccRec();
		fr.getPlInit().add(frm);
	}
	
	private void OpenAccPayPane() {
		frmAccPay frm = new frmAccPay();
		fr.getPlInit().add(frm);
	}
	
	private void OpenSaleReportPane() {
		frmSaleReport frm = new frmSaleReport();
		fr.getPlInit().add(frm);
	}
	
	private void OpenBuyReportPane() {
		frmBuyReport frm = new frmBuyReport();
		fr.getPlInit().add(frm);
	}
	
	private void OpenIncomeReportPane() {
		frmIncomeReport frm = new frmIncomeReport();
		fr.getPlInit().add(frm);
	}
	
	private void OpenBillsReportPane() {
		frmBillsReport frm = new frmBillsReport();
		fr.getPlInit().add(frm);
	}
	
	private void OpenEmployeePane() {
		frmEmployees frm = new frmEmployees();
		fr.getPlInit().add(frm);
	}
	
	private void OpenUsersPane() {
		frmUsers frm = new frmUsers();
		fr.getPlInit().add(frm);
	}
	
	private void OpenProviderPane() {
		frmProvider frm = new frmProvider();
		fr.getPlInit().add(frm);
	}
	
}

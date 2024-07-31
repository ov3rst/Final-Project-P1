package UserUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import Domain.D_Employees;
import Entities.Employees;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;
import com.toedter.calendar.JDateChooser;

import Actions.EmployeeActions;

public class frmEmployees extends JPanel {

	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"Nombre Completo", "Cédula", "Teléfono", "Correo Electronico", "Salario", "Posición", "Fecha de Nacimiento", "Fecha de Ingreso"};
	private DefaultTableModel tbm = new DefaultTableModel(columnNames, 0);
	private JTable tab;
	private JScrollPane scl;
	private JTextField txtFullname;
	private JTextField txtPhone;
	private JTextField txtIdentification;
	private JTextField txtEmail;
	private JButton btnEdit;
	private JLabel lblEmployeeList;
	private JButton btnDelete;
	private JTextField txtId;
	private JTextField txtSalary;
	private JTextField txtPosition;
	private D_Employees empData = new D_Employees();
	private List<Employees> empList = empData.GetAll();
	private List<JTextField> fields;
	private JDateChooser dcBirthdate;
	private JButton btnSave;
	private EmployeeActions actions;

	/**
	 * Create the panel.
	 */
	public frmEmployees() {
		setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 970, 498);
		setBorder(null);
		setLayout(null);
		
		tab = new JTable(tbm);
		tab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				EnableBtn();
				int row = tab.getSelectedRow(), identification = Integer.parseInt(tab.getValueAt(row, 1).toString());
				Employees emp = empList.stream()
														.filter(em -> em.getIdentificationcard() == identification)
														.findFirst()
														.get();
				if(emp != null) {
					FillFields(emp);
				}
				
			}
			
		});
		scl = new JScrollPane(tab);
		scl.setBounds(287, 89, 667, 393);		
		add(scl);
		
		actions = new EmployeeActions(frmEmployees.this);
		
		JLabel lblFullname = new JLabel("Nombre Completo");
		lblFullname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFullname.setBounds(19, 98, 116, 16);
		add(lblFullname);
		
		txtFullname = new JTextField();
		txtFullname.setBackground(SystemColor.window);
		txtFullname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtFullname.setBounds(19, 116, 250, 32);
		add(txtFullname);
		txtFullname.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPhone.setColumns(10);
		txtPhone.setBounds(19, 168, 116, 32);
		add(txtPhone);
		
		JLabel lblPhone = new JLabel("Teléfono");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhone.setBounds(17, 151, 53, 16);
		add(lblPhone);
		
		JLabel lblBirthdate = new JLabel("Fecha de Nacimiento");
		lblBirthdate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBirthdate.setBounds(146, 151, 129, 16);
		add(lblBirthdate);
		
		JLabel lblIdentification = new JLabel("Cédula");
		lblIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblIdentification.setBounds(17, 206, 53, 16);
		add(lblIdentification);
		
		txtIdentification = new JTextField();
		txtIdentification.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtIdentification.setColumns(10);
		txtIdentification.setBounds(19, 223, 116, 32);
		add(txtIdentification);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(21, 330, 248, 32);
		add(txtEmail);
		
		JLabel lblEmail = new JLabel("Correo Electrónico");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(19, 313, 133, 16);
		add(lblEmail);
		
		btnSave = new JButton("Guardar");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(46, 139, 87));
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.addActionListener(actions);
		btnSave.setBounds(37, 374, 210, 28);
		add(btnSave);
		
		btnEdit = new JButton("Editar");
		btnEdit.setEnabled(false);
		btnEdit.setForeground(new Color(255, 255, 255));
		btnEdit.setBackground(new Color(30, 144, 255));
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnEdit.setBounds(37, 414, 210, 28);
		add(btnEdit);
		
		lblEmployeeList = new JLabel("Lista de Empleados");
		lblEmployeeList.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblEmployeeList.setBounds(287, 34, 242, 42);
		add(lblEmployeeList);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setEnabled(false);
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setBounds(37, 454, 210, 28);
		add(btnDelete);
		
		JLabel lblDetails = new JLabel("Detalle Empleado");
		lblDetails.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDetails.setBounds(19, 34, 222, 42);
		add(lblDetails);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtId.setEnabled(false);
		txtId.setColumns(10);
		txtId.setBounds(196, 72, 34, 32);
		add(txtId);
		
		txtSalary = new JTextField();
		txtSalary.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtSalary.setColumns(10);
		txtSalary.setBounds(21, 277, 116, 32);
		add(txtSalary);
		
		dcBirthdate = new JDateChooser();
		dcBirthdate.setBounds(147, 168, 121, 31);
		add(dcBirthdate);
		
		JLabel lblSalary = new JLabel("Salario");
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSalary.setBounds(19, 260, 53, 16);
		add(lblSalary);
		
		txtPosition = new JTextField();
		txtPosition.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPosition.setColumns(10);
		txtPosition.setBounds(148, 223, 121, 32);
		add(txtPosition);
		
		JLabel lblPosition = new JLabel("Posición");
		lblPosition.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPosition.setBounds(148, 206, 53, 16);
		add(lblPosition);
		
		getEmployees();
		adjustColumnWidths(tab);
		
		fields = new ArrayList<>();
		fields.add(txtEmail);
		fields.add(txtPosition);
		fields.add(txtSalary);
		fields.add(txtPhone);
		fields.add(txtIdentification);
		fields.add(txtFullname);
	}
	
	public void getEmployees () {
				
		tbm.setRowCount(0);
		for(Employees emp: empList) {
			tbm.addRow(new Object [] {
					emp.getFullname(),
					emp.getIdentificationcard(),
					emp.getPhone(),
					emp.getEmail(),
					emp.getSalary(),
					emp.getPosition(),
					emp.getBirthdate(),
					emp.getRegistrationdate()
			});
		}
	}
	
	private void FillFields(Employees emp) {
		txtId.setText(String.valueOf(emp.getId()));
		txtFullname.setText(emp.getFullname());
		txtIdentification.setText(String.valueOf(emp.getIdentificationcard()));
		txtPhone.setText(String.valueOf(emp.getPhone()));
		txtEmail.setText(emp.getEmail());
		txtPosition.setText(emp.getPosition());
		txtSalary.setText(String.valueOf(emp.getSalary()));
	}
	
	private void EnableBtn() {
		if(tab.getSelectedRow() == -1) {
			btnSave.setEnabled(true);
			btnEdit.setEnabled(false);
			btnDelete.setEnabled(false);
		} else {
			btnSave.setEnabled(false);
			btnEdit.setEnabled(true);
			btnDelete.setEnabled(true);
		}
	}
		
	private void adjustColumnWidths(JTable table) {
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component c = table.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

                //  Verificar si el ancho preferido no supera el ancho máximo
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
    }
	
	public void ClearFields() {
		for(JTextField field : fields) {
			field.setText("");
		}
		
		dcBirthdate.setDate(null);
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public List<Employees> getEmpList() {
		return empList;
	}

	public JTextField getTxtFullname() {
		return txtFullname;
	}

	public JTextField getTxtPhone() {
		return txtPhone;
	}

	public JDateChooser getdcBirthdate() {
		return dcBirthdate;
	}

	public JTextField getTxtIdentification() {
		return txtIdentification;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JTextField getTxtSalary() {
		return txtSalary;
	}

	public JTextField getTxtPosition() {
		return txtPosition;
	}

	public List<JTextField> getFields() {
		return fields;
	}

	public JButton getBtnSave() {
		return btnSave;
	}
	
	
}

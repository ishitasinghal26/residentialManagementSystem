package residencialmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contactspage extends JFrame {

	private JPanel contentPane;
	private JTextField txtImportantContacts;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contactspage frame = new contactspage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public contactspage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtImportantContacts = new JTextField();
		txtImportantContacts.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtImportantContacts.setEditable(false);
		txtImportantContacts.setHorizontalAlignment(SwingConstants.CENTER);
		txtImportantContacts.setText("IMPORTANT CONTACTS");
		txtImportantContacts.setBounds(199, 11, 292, 34);
		contentPane.add(txtImportantContacts);
		txtImportantContacts.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(145, 80, 404, 280);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "EMERGENCY NO", "112"},
				{new Integer(2), "POLICE", "100"},
				{new Integer(3), "FIRE", "101"},
				{new Integer(4), "AMBULANCE", "102"},
				{new Integer(5), "WOMEN HELPLINE", "1091"},
				{new Integer(6), "SOCIETY HEAD", "9998887773"},
				{new Integer(7), "RATION SHOP", "9842637462"},
				{new Integer(8), "STATIONARY", "8274672247"},
				{new Integer(9), "RESTAURANT", "9323487743"},
				{new Integer(10), "ELECTRICITY", "8735625418"},
				{new Integer(11), "CARPENTER", "8289371839"},
				{new Integer(12), "PLUMBER", "7839274928"},
				{new Integer(13), "GARDENER", "8933783927"},
				{new Integer(14), "SALON", "8978833638"},
				{new Integer(15), "MASON", "9280389389"},
				{new Integer(16), "BAKERY", "8908193018"},
			},
			new String[] {
				"S.NO.", "NAME", "CONTACT NO."
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frontpage info = new frontpage();
				frontpage.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(543, 371, 89, 23);
		contentPane.add(btnNewButton);
	}

}

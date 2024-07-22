package residencialmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userhome extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userhome frame = new userhome();
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
	public userhome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcome = new JTextField();
		txtWelcome.setEditable(false);
		txtWelcome.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setText("Welcome!");
		txtWelcome.setBounds(271, 11, 171, 37);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton btnNewButton = new JButton("VIEW: Residents Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userviewdata info = new userviewdata();
				userviewdata.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(247, 155, 220, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COMPLAINT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newcomplaint info = new newcomplaint();
				newcomplaint.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(247, 233, 220, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"LOGOUT SUCCESSFUL!", null, JOptionPane.INFORMATION_MESSAGE);
				frontpage info = new frontpage();
				frontpage.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(247, 276, 220, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("NEW REGISTRATION FORM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nesresgisterform info = new nesresgisterform();
				nesresgisterform.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(247, 189, 220, 23);
		contentPane.add(btnNewButton_2);
	}
}

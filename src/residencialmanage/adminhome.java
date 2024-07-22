package residencialmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminhome extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminhome frame = new adminhome();
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
	public adminhome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcome = new JTextField();
		txtWelcome.setBackground(new Color(211, 160, 199));
		txtWelcome.setEditable(false);
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setFont(new Font("Lucida Handwriting", Font.BOLD, 25));
		txtWelcome.setText("Welcome!");
		txtWelcome.setBounds(284, 11, 151, 44);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton btnNewButton = new JButton("VIEW: Residents Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminviewdata info = new adminviewdata();
				adminviewdata.main(null);
			}
		});
		btnNewButton.setFont(new Font("Bell MT", Font.BOLD, 17));
		btnNewButton.setBounds(196, 147, 329, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("LOGOUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"LOGOUT SUCCESSFUL!",null,JOptionPane.INFORMATION_MESSAGE);
				frontpage info = new frontpage();
				frontpage.main(null);
			}
			
		});
		btnNewButton_4.setFont(new Font("Bell MT", Font.BOLD, 16));
		btnNewButton_4.setBounds(196, 270, 329, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("COMPLAINTS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admincomplaint info = new admincomplaint();
				admincomplaint.main(null);
			}
		});
		btnNewButton_5.setFont(new Font("Bell MT", Font.BOLD, 17));
		btnNewButton_5.setBounds(196, 211, 329, 23);
		contentPane.add(btnNewButton_5);
	}

}

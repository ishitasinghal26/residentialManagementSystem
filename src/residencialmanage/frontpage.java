package residencialmanage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class frontpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtDandelion;
	private JTextField txtHeights;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage frame = new frontpage();
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
	public frontpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 465);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(19, 10));
		contentPane.setLocation(new Point(10, 10));
		contentPane.setBounds(new Rectangle(10, 10, 10, 10));
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.setSize(new Dimension(10, 10));
		contentPane.setBorder(null);
		getContentPane().setBackground(new Color(222, 160, 211));
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDandelion = new JTextField();
		txtDandelion.setForeground(Color.WHITE);
		txtDandelion.setBackground(new Color(255, 255, 255));
		txtDandelion.setEnabled(false);
		txtDandelion.setEditable(false);
		txtDandelion.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtDandelion.setHorizontalAlignment(SwingConstants.CENTER);
		txtDandelion.setText("AURORA");
		txtDandelion.setBounds(218, 11, 242, 47);
		contentPane.add(txtDandelion);
		txtDandelion.setColumns(10);
		
		txtHeights = new JTextField();
		txtHeights.setBackground(Color.WHITE);
		txtHeights.setForeground(Color.WHITE);
		txtHeights.setEnabled(false);
		txtHeights.setEditable(false);
		txtHeights.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtHeights.setHorizontalAlignment(SwingConstants.CENTER);
		txtHeights.setText("HEIGHTS");
		txtHeights.setBounds(254, 59, 173, 47);
		contentPane.add(txtHeights);
		txtHeights.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userlogin info = new userlogin();
				userlogin.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(238, 188, 222, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("IMPORTANT CONTACTS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactspage info = new contactspage();
				contactspage.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(238, 294, 222, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("NEW LOGIN");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newlogin info = new newlogin();
				newlogin.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(238, 241, 222, 23);
		contentPane.add(btnNewButton_3);
	}
}	

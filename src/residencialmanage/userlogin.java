package residencialmanage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class userlogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserLogin;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userlogin frame = new userlogin();
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
	public userlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserLogin = new JTextField();
		txtUserLogin.setEditable(false);
		txtUserLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtUserLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserLogin.setText("USER LOGIN");
		txtUserLogin.setBounds(258, 24, 167, 33);
		contentPane.add(txtUserLogin);
		txtUserLogin.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setEditable(false);
		txtUsername.setText("USERNAME");
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setBounds(201, 100, 114, 23);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setText("PASSWORD");
		txtPassword.setEditable(false);
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setBounds(201, 155, 114, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(405, 100, 104, 20);
		contentPane.add(textPane);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(405, 155, 104, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textPane.getText();
				String password = passwordField.getText();
				
				try {
					if (username.equals("anshita") && password.equals("11111111")) {
					    adminhome info = new adminhome();
					    adminhome.main(null);
					    return;
					}

				
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/residency","root","artika$2004");
					String query = "select * from login where idname =" + "'" + username + "'" + "and password ="+ "'" + password + "'";					
					Statement sta = connection.createStatement();
					ResultSet x = sta.executeQuery(query);
					 if (x.next()) {
						 userhome info = new userhome();
						 userhome.main(null);
			                } else {
			                	
								JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
								passwordField.setText(null);
								textPane.setText(null);

			                }
			            
					connection.close();
					}
				catch (Exception exception) {
					exception.printStackTrace();
				
			}
				
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(148, 224, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(311, 224, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frontpage info = new frontpage();
				frontpage.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(494, 224, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}

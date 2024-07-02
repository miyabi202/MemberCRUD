package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.addMemberUI;
import dao.impl.memberDaoImpl;
import model.member;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JPasswordField;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	//private JTextField password2;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 27));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 184, 450, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("username ");
		lblNewLabel_1.setForeground(new Color(251, 247, 255));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(139, 47, 145, 36);
		panel.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setForeground(new Color(0, 0, 0));
		username.setBounds(114, 76, 193, 39);
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("password");
		lblNewLabel_1_1.setForeground(new Color(251, 247, 255));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(139, 127, 145, 36);
		panel.add(lblNewLabel_1_1);
		
		/*password2 = new JTextField();
		password2.setForeground(Color.BLACK);
		password2.setColumns(10);
		password2.setBounds(114, 179, 193, 36);
		panel.add(password2);*/
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addMemberUI add=new addMemberUI();
				add.setVisible(true);
				dispose();
			
				
			}
		});
		btnNewButton.setBounds(36, 299, 161, 40);
		panel.add(btnNewButton);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				 * 1.擷取 username, password
				 * 2.執行-->queryMember
				 * 3.!null -->loginSuccessUI
				 * // 取得密碼的方式改為 getPassword()，這將返回一個 char[]，需要轉換為字串
				 */
				
				String USERNAME=username.getText();
				
				// String PASSWORD=password.getText();
				 // 擷取並轉換 password
		        char[] passwordChars = password.getPassword();
		        String PASSWORD = new String(passwordChars);

		        // 清除 char[] 中的敏感資料
		        Arrays.fill(passwordChars, '*');
				
				//member m=new memberDaoImpl().queyMember(USERNAME,PASSWORD);
				member m=new memberDaoImpl().queyMember(USERNAME,PASSWORD);
				
				if (m!=null)
				{
					LoginSuccessUI success=new LoginSuccessUI();
					success.setVisible(true);
					dispose();
				}
				else
				{
					LoginErrorUI error=new LoginErrorUI();
					error.setVisible(true);
					dispose();
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignIn.setBounds(209, 299, 161, 40);
		panel.add(btnSignIn);
		
		JLabel lblNewLabel_2 = new JLabel("NINI Rainbow Coffee");
		lblNewLabel_2.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setForeground(new Color(224, 220, 227));
		lblNewLabel_2.setBounds(46, 369, 419, 98);
		panel.add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBounds(114, 159, 193, 40);
		panel.add(password);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 136, 76));
		panel_1.setBounds(0, 0, 390, 182);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(104, 6, 175, 168);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(LoginUI.class.getResource("/image/nini5.png")));
		
		JLabel lblNewLabel_2_1 = new JLabel("Rainbow ");
		lblNewLabel_2_1.setForeground(new Color(224, 220, 227));
		lblNewLabel_2_1.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(270, 44, 419, 98);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("NINI ");
		lblNewLabel_2_1_1.setForeground(new Color(224, 220, 227));
		lblNewLabel_2_1_1.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1.setBounds(6, 44, 419, 98);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
	          // dispose();
				LoginUI.this.dispose();
				
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("/Users/yana/Downloads/VerySmallXWhite.png"));
		lblNewLabel_3.setBounds(362, 6, 22, 38);
		panel_1.add(lblNewLabel_3);
	}
}

package controller.member;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dao.impl.memberDaoImpl;
import model.member;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
public class addMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 29));
		panel.setBounds(0, 0, 444, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sing Up");
		lblNewLabel_1.setForeground(new Color(237, 238, 237));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(22, 24, 243, 72);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(addMemberUI.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_2.setBounds(416, 6, 28, 22);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 136, 76));
		panel_1.setBounds(0, 125, 444, 459);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblNewLabel.setBounds(23, 47, 61, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblUsername.setBounds(23, 85, 83, 16);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblPassword.setBounds(23, 125, 83, 22);
		panel_1.add(lblPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblAddress.setBounds(23, 159, 83, 16);
		panel_1.add(lblAddress);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblMobile.setBounds(23, 197, 61, 16);
		panel_1.add(lblMobile);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblEmail.setBounds(23, 242, 61, 16);
		panel_1.add(lblEmail);
		
		name = new JTextField();
		name.setBounds(118, 43, 130, 26);
		panel_1.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(118, 81, 130, 26);
		panel_1.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(118, 117, 130, 26);
		panel_1.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(118, 155, 281, 26);
		panel_1.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(118, 193, 130, 26);
		panel_1.add(mobile);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(118, 238, 281, 26);
		panel_1.add(email);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					/*
					 * 1.擷取 --> username
					 * 2.是否重複-->queryUsername
					 * 3.true -->addMemberErrorUI
					 * 4.false -->擷取其他項目 ---> new member -->add-->addMemberSuccessUI
					 */
					
					String Username=username.getText();
					if(new memberDaoImpl().queryUsername(Username))
					{
						addMemberErrorUI error=new addMemberErrorUI();
						error.setVisible(true);
						dispose();
					}
					else
					{
						String Name=name.getText();
						String Password=password.getText();
						String Address=address.getText();
						String Mobile=mobile.getText();
						String Email=email.getText();
						
						member m=new member(Name,Username,Password,Address,Mobile,Email);
						new  memberDaoImpl().add(m);
						
						addMemberSuccessUI success=new addMemberSuccessUI();
						success.setVisible(true);
						dispose();
					}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(addMemberUI.class.getResource("/image/OK_small_final.png")));
		btnNewButton.setBounds(146, 324, 136, 32);
		panel_1.add(btnNewButton);
		
		
	}
}

package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import util.buttonUI;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;

public class memberUpdate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField address;
	private JTextField mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberUpdate frame = new memberUpdate();
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
	public memberUpdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 29));
		panel.setBounds(0, 0, 390, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member Update");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(114, 36, 166, 46);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("/Users/yana/eclipse-workspace/homework4/src/image/SmallXWhite.png"));
		lblNewLabel_2.setBounds(360, 6, 24, 31);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(49, 48, 27));
		panel_1.setBounds(0, 113, 390, 154);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(224, 220, 227));
		lblNewLabel_1.setBounds(16, 17, 95, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setForeground(new Color(224, 220, 227));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(16, 60, 95, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1_1.setForeground(new Color(224, 220, 227));
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(209, 17, 95, 31);
		panel_1.add(lblNewLabel_1_1_1);
		
		username = new JTextField();
		username.setBounds(89, 20, 108, 26);
		panel_1.add(username);
		username.setColumns(10);
		
		address = new JTextField();
		address.setBounds(89, 63, 285, 26);
		panel_1.add(address);
		address.setColumns(10);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(266, 20, 108, 26);
		panel_1.add(mobile);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 136, 76));
		panel_2.setBounds(0, 269, 390, 795);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 372, 366);
		panel_2.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setBackground(new Color(139, 136, 76));
		
		JButton btnNewButton_1 = new JButton(" Member Manager");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				buttonUI.memberManager();
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/Users/yana/eclipse-workspace/homework4/src/image/middleback.png"));
		btnNewButton_1.setBounds(231, 384, 147, 40);
		panel_2.add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("Queery All Members");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<member>l= new  memberDaoImpl().queryAll();
				String show="";
				for(member m:l)
				{
					show=show+"id:" +m.getId()+
							"/t名:" +m.getName()+
							"/t帳號:" +m.getUsername()+
							"/t密碼:" +m.getPassword()+
							"/t地址:" +m.getAddress()+
							"/t行動:" +m.getMobile()+
							"/temail:" +m.getEmail()+"\n";
				}
				output.setText(show);
				
			}
		});
		btnNewButton.setBounds(75, 103, 170, 29);
		panel_1.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ADDress=address.getText();
				String MObile=mobile.getText();
				String Username=username.getText();
                member m=new memberDaoImpl().queryUser(Username);
				m.setAddress(ADDress);
				m.setMobile(MObile);
			
				new memberDaoImpl().update(m);
				
				
			}
		});
		btnUpdate.setBounds(257, 103, 117, 29);
		panel_1.add(btnUpdate);
	}
}

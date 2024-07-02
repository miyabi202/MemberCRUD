package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.buttonUI;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessUI frame = new LoginSuccessUI();
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
	public LoginSuccessUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 136, 76));
		panel_1.setBounds(6, 0, 438, 516);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LogIn Success!");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 44));
		lblNewLabel.setForeground(new Color(49, 48, 29));
		lblNewLabel.setBounds(55, 47, 405, 89);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginSuccessUI.class.getResource("/image/nini5.png")));
		lblNewLabel_1.setBounds(130, 150, 175, 191);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter into Member Manager Page");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				buttonUI.memberManager();
				dispose();
				
				
				
				
			}
		});
		lblNewLabel_2.setForeground(new Color(250, 247, 254));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(64, 353, 396, 32);
		panel_1.add(lblNewLabel_2);
		
		/*JLabel lblNewLabel_2_1 = new JLabel("Enter into Member Manager Page");
		lblNewLabel_2_1.setForeground(new Color(250, 247, 254));
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(55, 397, 396, 32);
		panel_1.add(lblNewLabel_2_1);*/
	}
}

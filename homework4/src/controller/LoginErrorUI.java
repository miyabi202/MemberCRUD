package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginErrorUI frame = new LoginErrorUI();
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
	public LoginErrorUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 135, 76));
		panel.setBounds(6, 6, 438, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login failed");
		lblNewLabel.setBackground(new Color(255, 0, 53));
		lblNewLabel.setForeground(new Color(49, 48, 29));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 44));
		lblNewLabel.setBounds(93, 45, 245, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please sign up again !");
		lblNewLabel_1.setForeground(new Color(250, 246, 254));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(118, 303, 236, 38);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(134, 365, 144, 48);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LoginErrorUI.class.getResource("/image/nini5.png")));
		lblNewLabel_2.setBounds(124, 120, 214, 171);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("/Users/yana/eclipse-workspace/homework4/image/SmallXWhite.png"));
		lblNewLabel_3.setBounds(402, 6, 30, 22);
		panel.add(lblNewLabel_3);
	}
}

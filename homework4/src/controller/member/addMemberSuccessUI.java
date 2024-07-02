package controller.member;

import java.awt.EventQueue;
import util.buttonUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberSuccessUI frame = new addMemberSuccessUI();
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
	public addMemberSuccessUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 136, 76));
		panel.setForeground(new Color(250, 246, 255));
		panel.setBounds(0, 6, 444, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(addMemberSuccessUI.class.getResource("/image/nini5.png")));
		lblNewLabel.setBounds(111, 32, 191, 189);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sing up successful.  Please log in again.");
		lblNewLabel_1.setForeground(new Color(236, 235, 236));
		lblNewLabel_1.setBounds(55, 218, 341, 71);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonUI.login() ;
				dispose();
				
				
				
				
			}
		});
		btnNewButton.setBounds(147, 326, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(addMemberSuccessUI.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_2.setBounds(360, 6, 27, 36);
		panel.add(lblNewLabel_2);
	}

}

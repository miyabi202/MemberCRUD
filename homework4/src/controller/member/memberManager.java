package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.buttonUI;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class memberManager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberManager frame = new memberManager();
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
	public memberManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(49, 48, 29));
		panel_1.setBounds(0, 0, 407, 97);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member Management");
		lblNewLabel.setForeground(new Color(238, 238, 238));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel.setBounds(97, 25, 286, 54);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(memberManager.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_1.setBounds(359, 6, 24, 32);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(49, 48, 29));
		panel_3.setBounds(0, 99, 412, 346);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(99, 0, 187, 321);
		panel_3.add(panel_2);
		panel_2.setBackground(new Color(139, 136, 76));
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Query Member");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 buttonUI.backtoSelectManager();
				 dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(32, 118, 126, 29);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Member");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.backtoDeleteManager();
				dispose();
				
			}
		});
		btnNewButton_2.setForeground(new Color(28, 28, 28));
		btnNewButton_2.setBounds(32, 182, 126, 29);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setForeground(new Color(28, 28, 28));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//frame.dispose();
				//system.exit(0)
				memberManager.this.dispose();
				
			}
		});
		btnNewButton_3.setBounds(32, 246, 126, 29);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Member Update");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 buttonUI.backtoUpdateManager();
				 dispose();
		
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1_1.setBounds(32, 60, 126, 29);
		panel_2.add(btnNewButton_1_1);
	}
}

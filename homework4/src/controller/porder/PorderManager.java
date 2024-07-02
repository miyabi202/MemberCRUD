package controller.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.memberManager;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PorderManager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderManager frame = new PorderManager();
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
	public PorderManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 27));
		panel.setBounds(0, 6, 404, 85);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Manager");
		lblNewLabel.setForeground(new Color(251, 246, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel.setBounds(116, 23, 236, 38);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(49, 48, 27));
		panel_2.setBounds(0, 93, 441, 339);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(109, 0, 176, 339);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(139, 136, 76));
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(28, 28, 28));
		btnNewButton.setBounds(28, 30, 117, 29);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Revise");
		btnNewButton_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1.setBounds(28, 84, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Query");
		btnNewButton_1_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1_1.setBounds(28, 138, 117, 29);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1_1_1.setBounds(28, 198, 117, 29);
		panel_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Exit");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				//frame.dispose();
				//system.exit(0)
				PorderManager.this.dispose();
				
			}
		});
		btnNewButton_1_1_1_1.setForeground(new Color(28, 28, 28));
		btnNewButton_1_1_1_1.setBounds(28, 249, 117, 29);
		panel_1.add(btnNewButton_1_1_1_1);
	}
}

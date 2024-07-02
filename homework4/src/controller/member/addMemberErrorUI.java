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
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberErrorUI frame = new addMemberErrorUI();
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
	public addMemberErrorUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 136, 76));
		panel_1.setBounds(-11, -11, 534, 550);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username already exists. ");
		lblNewLabel.setForeground(new Color(237, 238, 237));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblNewLabel.setBounds(32, 233, 373, 28);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose a different username for sign up.");
		lblNewLabel_1.setForeground(new Color(237, 238, 237));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(32, 273, 384, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(addMemberErrorUI.class.getResource("/image/nini5.png")));
		lblNewLabel_2.setBounds(114, 48, 179, 173);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sing Up");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				util.buttonUI.add();
				dispose();
				
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("/Users/yana/eclipse-workspace/homework4/src/image/OK_small_final.png"));
		btnNewButton.setBounds(157, 377, 117, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			
		});
		lblNewLabel_3.setIcon(new ImageIcon(addMemberErrorUI.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_3.setBounds(388, 18, 28, 28);
		panel_1.add(lblNewLabel_3);
	}
}

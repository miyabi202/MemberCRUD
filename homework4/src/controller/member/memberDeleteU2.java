package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import util.buttonUI;

import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class memberDeleteU2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberDeleteU2 frame = new memberDeleteU2();
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
	public memberDeleteU2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 29));
		panel.setBounds(6, 6, 438, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member Delete");
		lblNewLabel.setForeground(new Color(246, 242, 250));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel.setBounds(137, 36, 154, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
			
		});
		lblNewLabel_1.setIcon(new ImageIcon(memberDeleteU2.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_1.setBounds(402, 6, 30, 27);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(49, 48, 29));
		panel_1.setBounds(6, 108, 438, 112);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setForeground(new Color(246, 242, 250));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(37, 45, 45, 16);
		panel_1.add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBounds(69, 41, 130, 26);
		panel_1.add(id);
		id.setColumns(10);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 135, 77));
		panel_2.setBounds(6, 221, 438, 413);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 426, 354);
		panel_2.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setBackground(new Color(139, 135, 77));
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new memberDaoImpl().delete(Integer.parseInt(id.getText()));
				   //使用者輸入ID的文本框中的內容被讀取為字串，然後透過 Integer.parseInt() 轉換為整數。
				   //這是因為 getText() 方法返回的是字串，而在某些情況下，我們可能需要將其轉換為整數
			}
		});
		btnNewButton.setBounds(211, 41, 84, 29);
		panel_1.add(btnNewButton);
		
		JButton btnQueryAll = new JButton(" Query All ID");
		btnQueryAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				List<member>l= new memberDaoImpl().queryAll();
				//public static String show()可以做成方法
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
		btnQueryAll.setBounds(307, 41, 113, 29);
		panel_1.add(btnQueryAll);
		

		
		JButton btnNewButton_1 = new JButton("Back to Member Manager");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				buttonUI.memberManager();
				dispose();
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(memberDeleteU2.class.getResource("/image/middleback.png")));
		btnNewButton_1.setBounds(250, 369, 182, 35);
		panel_2.add(btnNewButton_1);
	}
}

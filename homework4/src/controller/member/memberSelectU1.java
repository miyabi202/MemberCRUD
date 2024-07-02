package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import util.buttonUI;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;

public class memberSelectU1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField endId;
	private JTextField startId;
	private JTextField address;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberSelectU1 frame = new memberSelectU1();
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
	public memberSelectU1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 29));
		panel.setBounds(0, 0, 464, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Query Member");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(238, 237, 237));
		lblNewLabel.setBounds(137, 18, 223, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(memberSelectU1.class.getResource("/image/SmallXWhite.png")));
		lblNewLabel_2.setBounds(421, 6, 24, 22);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(49, 48, 29));
		panel_1.setBounds(0, 112, 464, 195);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1. from ID");
		lblNewLabel_1.setForeground(new Color(238, 237, 237));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(18, 26, 76, 16);
		panel_1.add(lblNewLabel_1);
		
		endId = new JTextField();
		endId.setBounds(227, 22, 68, 26);
		panel_1.add(endId);
		endId.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("to");
		lblNewLabel_1_1.setForeground(new Color(238, 237, 237));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(194, 26, 27, 16);
		panel_1.add(lblNewLabel_1_1);
		
		startId = new JTextField();
		startId.setColumns(10);
		startId.setBounds(114, 22, 68, 26);
		panel_1.add(startId);
		
		JLabel lblNewLabel_1_2 = new JLabel("2. Address");
		lblNewLabel_1_2.setForeground(new Color(238, 237, 237));
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(18, 68, 84, 16);
		panel_1.add(lblNewLabel_1_2);
		
		address = new JTextField();
		address.setBounds(114, 64, 220, 26);
		panel_1.add(address);
		address.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("3. Username");
		lblNewLabel_1_2_1.setForeground(new Color(238, 237, 237));
		lblNewLabel_1_2_1.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_1_2_1.setBounds(18, 114, 90, 16);
		panel_1.add(lblNewLabel_1_2_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(114, 110, 82, 26);
		panel_1.add(username);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 135, 77));
		panel_2.setBounds(0, 311, 464, 377);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 432, 286);
		panel_2.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setBackground(new Color(139, 135, 77));
		
		JButton btnNewButton = new JButton("Serch1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				 * 1.擷取 startId , endId-->轉型int
				 * 2.List<member>-->queryId-->?
				 * 3.show="-->for
				 * 4.output
				 */
				int S=Integer.parseInt(startId.getText());
				int E=Integer.parseInt(endId.getText());
				
				List<member> l=new memberDaoImpl().queryID(S, E);
				
				String show="";
				for(member m:l)
				{
					show=show+"ID:"+m.getId()+
							"\t姓名："+m.getName()+
							"\t帳號："+m.getUsername()+
							"\t密碼："+m.getPassword()+
							"\t地址："+m.getAddress()+
							"\t行動： "+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				output.setText(show);
				 // 清空文字框的內容
		        startId.setText("");
		        endId.setText("");
		        address.setText("");
		        username.setText("");
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(348, 22, 90, 29);
		panel_1.add(btnNewButton);
		
		JButton btnSerch = new JButton("Serch2");
		btnSerch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1擷取address
				 * 2.List<member>-->queryAddress
				 * 3.for 
				 * 
				 */
				String Address=address.getText();
				List<member> l=new memberDaoImpl().queryAddress(Address);
				String show="";
				for (member m:l)
				{
					show=show+"ID:"+m.getId()+
							"\t姓名："+m.getName()+
							"\t帳號："+m.getUsername()+
							"\t密碼："+m.getPassword()+
							"\t地址："+m.getAddress()+
							"\t行動： "+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				output.setText(show);
				 // 清空文字框的內容
		        startId.setText("");
		        endId.setText("");
		        address.setText("");
		        username.setText("");
				
				}
		});
		btnSerch.setBounds(348, 64, 90, 29);
		panel_1.add(btnSerch);
		
		JButton btnNewButton_1_1 = new JButton("Serch3");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(348, 107, 90, 29);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Query All Members");
		btnNewButton_1_1_2.addMouseListener(new MouseAdapter() {
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
		btnNewButton_1_1_2.setBounds(18, 148, 146, 26);
		panel_1.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1 = new JButton("back to Member Manager");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				buttonUI.memberManager();
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(memberSelectU1.class.getResource("/image/middleback.png")));
		btnNewButton_1.setBounds(254, 304, 184, 46);
		panel_2.add(btnNewButton_1);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

package controller.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.porderDaoImpl;
import model.porder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addPorderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField ninicoffee;
	private JTextField latte;
	private JTextField tea;
	private JTextField milktea;
	private JTextField bubbletea;
	private JTextField juice;
	private JTextField cake;
	private JTextField pancake;
	private JTextField icecream;
	private JTextField hotdog;
	private JTextField cornsoup;
	private JTextField dumpling;
	private JTextField coffeebean;
	private JTextField teabagset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addPorderUI frame = new addPorderUI();
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
	public addPorderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 48, 29));
		panel.setBounds(6, 6, 444, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add new order");
		lblNewLabel.setForeground(new Color(238, 238, 238));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel.setBounds(119, 29, 251, 62);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 136, 76));
		panel_1.setBounds(6, 115, 448, 557);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Customer username");
		lblNewLabel_1.setBounds(22, 42, 114, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nini Coffee");
		lblNewLabel_1_1.setBounds(22, 75, 114, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Latte");
		lblNewLabel_1_1_1.setBounds(22, 107, 114, 16);
		panel_1.add(lblNewLabel_1_1_1);
		
		username = new JTextField();
		username.setBounds(148, 37, 130, 26);
		panel_1.add(username);
		username.setColumns(10);
		
		ninicoffee = new JTextField();
		ninicoffee.setColumns(10);
		ninicoffee.setBounds(148, 70, 130, 26);
		panel_1.add(ninicoffee);
		
		latte = new JTextField();
		latte.setColumns(10);
		latte.setBounds(148, 102, 130, 26);
		panel_1.add(latte);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tea");
		lblNewLabel_1_1_1_1.setBounds(22, 135, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("MilkTea");
		lblNewLabel_1_1_1_1_1.setBounds(22, 163, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Bubble Tea");
		lblNewLabel_1_1_1_1_1_1.setBounds(22, 191, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		tea = new JTextField();
		tea.setColumns(10);
		tea.setBounds(148, 130, 130, 26);
		panel_1.add(tea);
		
		milktea = new JTextField();
		milktea.setColumns(10);
		milktea.setBounds(148, 158, 130, 26);
		panel_1.add(milktea);
		
		bubbletea = new JTextField();
		bubbletea.setColumns(10);
		bubbletea.setBounds(148, 186, 130, 26);
		panel_1.add(bubbletea);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Juice");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(22, 219, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		juice = new JTextField();
		juice.setColumns(10);
		juice.setBounds(148, 214, 130, 26);
		panel_1.add(juice);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Cake");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(22, 249, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		cake = new JTextField();
		cake.setColumns(10);
		cake.setBounds(148, 244, 130, 26);
		panel_1.add(cake);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("PanCake");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(22, 277, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		pancake = new JTextField();
		pancake.setColumns(10);
		pancake.setBounds(148, 272, 130, 26);
		panel_1.add(pancake);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Ice Cream");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(22, 305, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		icecream = new JTextField();
		icecream.setColumns(10);
		icecream.setBounds(148, 300, 130, 26);
		panel_1.add(icecream);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Hot Dog");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(22, 335, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		hotdog = new JTextField();
		hotdog.setColumns(10);
		hotdog.setBounds(148, 330, 130, 26);
		panel_1.add(hotdog);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Corn Soup");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(22, 363, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1);
		
		cornsoup = new JTextField();
		cornsoup.setColumns(10);
		cornsoup.setBounds(148, 358, 130, 26);
		panel_1.add(cornsoup);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Dumpling");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(22, 391, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		dumpling = new JTextField();
		dumpling.setColumns(10);
		dumpling.setBounds(148, 386, 130, 26);
		panel_1.add(dumpling);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Coffee Bean");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(22, 419, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_2 = new JLabel("Tea bag set");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_2.setBounds(22, 448, 114, 16);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_2);
		
		coffeebean = new JTextField();
		coffeebean.setColumns(10);
		coffeebean.setBounds(148, 414, 130, 26);
		panel_1.add(coffeebean);
		
		teabagset = new JTextField();
		teabagset.setColumns(10);
		teabagset.setBounds(148, 443, 130, 26);
		panel_1.add(teabagset);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				 
				porder p= new porder(
						username.getText(),
						Integer.parseInt(ninicoffee.getText()),
						Integer.parseInt(latte.getText()),
						Integer.parseInt(tea.getText()),
						Integer.parseInt(milktea.getText()),
						Integer.parseInt(bubbletea.getText()),
						Integer.parseInt(juice.getText()),
						Integer.parseInt(cake.getText()),
						Integer.parseInt(pancake.getText()),
						Integer.parseInt(icecream.getText()),
						Integer.parseInt(hotdog.getText()),
						Integer.parseInt(cornsoup.getText()),
						Integer.parseInt(dumpling.getText()),
						Integer.parseInt(coffeebean.getText()),
			            Integer.parseInt(teabagset.getText()));
						
			
				new porderDaoImpl().add(p); 
		
                }

				
			
		});
		btnNewButton.setBounds(312, 497, 117, 29);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 611, 438, 55);
		contentPane.add(panel_2);
	}

}

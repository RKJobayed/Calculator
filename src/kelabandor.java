import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kelabandor {

	private JFrame frame;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kelabandor window = new kelabandor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kelabandor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GREEN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 494, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(10, 11, 375, 136);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = 
				new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textArea.getText()+btnNewButton.getText();
				textArea.setText(number);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton.setBounds(10, 158, 60, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_1.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_1.setBounds(10, 209, 60, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_2.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(10, 260, 60, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_3.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_3.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setForeground(Color.GREEN);
		btnNewButton_3.setBounds(80, 260, 60, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_4.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_4.setForeground(Color.GRAY);
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_4.setBounds(80, 209, 60, 40);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_5.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_5.setBounds(80, 158, 60, 40);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_6.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.setForeground(Color.DARK_GRAY);
		btnNewButton_6.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_6.setBounds(150, 260, 60, 50);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_7.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_7.setForeground(Color.RED);
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_7.setBounds(150, 209, 60, 40);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_8.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_8.setForeground(Color.GREEN);
		btnNewButton_8.setBackground(Color.ORANGE);
		btnNewButton_8.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_8.setBounds(150, 158, 60, 40);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_9.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_9.setForeground(Color.CYAN);
		btnNewButton_9.setBackground(Color.ORANGE);
		btnNewButton_9.setFont(new Font("Imprint MT Shadow", Font.BOLD, 26));
		btnNewButton_9.setBounds(221, 158, 48, 152);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="+";
			}
		});
		btnNewButton_10.setBackground(Color.ORANGE);
		btnNewButton_10.setForeground(Color.RED);
		btnNewButton_10.setFont(new Font("Imprint MT Shadow", Font.BOLD, 35));
		btnNewButton_10.setBounds(279, 159, 106, 39);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u00D7");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="*";
			}
		});
		btnNewButton_11.setFont(new Font("Imprint MT Shadow", Font.BOLD, 23));
		btnNewButton_11.setForeground(Color.BLUE);
		btnNewButton_11.setBackground(Color.ORANGE);
		btnNewButton_11.setBounds(279, 209, 48, 40);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_10_1 = new JButton("=");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second=Double.parseDouble(textArea.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textArea.setText(answer);
				}
				else if (operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textArea.setText(answer);
				}
				else if (operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textArea.setText(answer);
				}
				else if (operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textArea.setText(answer);
				}
				else if (operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textArea.setText(answer);
				}
				
				
				
			}
		});
		btnNewButton_10_1.setForeground(Color.BLACK);
		btnNewButton_10_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 99));
		btnNewButton_10_1.setBackground(Color.ORANGE);
		btnNewButton_10_1.setBounds(279, 260, 106, 50);
		frame.getContentPane().add(btnNewButton_10_1);
		
		JButton btnNewButton_11_1 = new JButton("\u00F7");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="/";
			}
		});
		btnNewButton_11_1.setForeground(Color.BLUE);
		btnNewButton_11_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 24));
		btnNewButton_11_1.setBackground(Color.ORANGE);
		btnNewButton_11_1.setBounds(337, 209, 48, 40);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_5_1 = new JButton("-");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="-";
			}
		});
		btnNewButton_5_1.setForeground(Color.BLACK);
		btnNewButton_5_1.setFont(new Font("Impact", Font.BOLD, 30));
		btnNewButton_5_1.setBackground(Color.ORANGE);
		btnNewButton_5_1.setBounds(395, 158, 73, 40);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("%");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="%";
			}
		});
		btnNewButton_5_2.setForeground(Color.MAGENTA);
		btnNewButton_5_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_5_2.setBackground(Color.ORANGE);
		btnNewButton_5_2.setBounds(395, 209, 73, 40);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton(".");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+btnNewButton_5_3.getText();
				textArea.setText(number);
			}
		});
		btnNewButton_5_3.setForeground(Color.RED);
		btnNewButton_5_3.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_5_3.setBackground(Color.ORANGE);
		btnNewButton_5_3.setBounds(395, 260, 73, 50);
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("C");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnNewButton_5_4.setForeground(Color.DARK_GRAY);
		btnNewButton_5_4.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		btnNewButton_5_4.setBackground(Color.ORANGE);
		btnNewButton_5_4.setBounds(395, 109, 73, 38);
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("\uF0e7");
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textArea.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textArea.getText());
					str.deleteCharAt(textArea.getText().length()-1);
					backSpace=str.toString();
					textArea.setText(backSpace);
				}
			}
		});
		btnNewButton_5_5.setForeground(Color.GREEN);
		btnNewButton_5_5.setFont(new Font("wingdings", Font.BOLD, 30));
		btnNewButton_5_5.setBackground(Color.ORANGE);
		btnNewButton_5_5.setBounds(395, 58, 73, 40);
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("WN");
		btnNewButton_5_6.setForeground(Color.CYAN);
		btnNewButton_5_6.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		btnNewButton_5_6.setBackground(Color.ORANGE);
		btnNewButton_5_6.setBounds(395, 11, 73, 40);
		frame.getContentPane().add(btnNewButton_5_6);
	}
}

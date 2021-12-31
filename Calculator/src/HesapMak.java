import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HesapMak extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMak frame = new HesapMak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	
	public void calculate() {
		switch(operation) {
		case 1:   // Toplama
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:		//
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
		
	}
	
	/**
	 * Create the frame.
	 */
	public HesapMak() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 364, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBounds(0, 26, 364, 34);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 11, 364, 14);
		screen.add(lbl);
		
		JPanel keypad = new JPanel();
		keypad.setBounds(10, 82, 364, 368);
		contentPane.add(keypad);
		keypad.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btn7_1 = new JButton("7");
		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn7_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn7_1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn9);
		
		JButton btnToplama = new JButton("+");
		btnToplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnToplama.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnToplama);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn6);
		
		JButton btnCarpma = new JButton("x");
		btnCarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnCarpma.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnCarpma);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn3);
		
		JButton btnCikartma = new JButton("-");
		btnCikartma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnCikartma.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnCikartma);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				lbl.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput (e.getActionCommand());
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btn0);
		
		JButton btnEsittir = new JButton("=");
		btnEsittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("");
				calculate();
			}
		});
		btnEsittir.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnEsittir);
		
		JButton btnBolme = new JButton("/");
		btnBolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnBolme.setFont(new Font("Tahoma", Font.BOLD, 23));
		keypad.add(btnBolme);
	}
}

package calc;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import javax.swing.JOptionPane;

public class Calculator extends JFrame implements ActionListener {
		
	JTextField jftResult;
	JButton btnDivide;
	JButton btnMultiply;
	JButton btnSubtract;
	JButton btnAdd;
	JButton btnEquals;
	JButton btnClear;
	JButton btnPercentage;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn0;
	double temp;
	double solveTemp;
	boolean divide;
	boolean multiply;
	boolean subtract;
	boolean add;
	boolean percentage;
	
	String display = "";
	
	public Calculator() {
		
		JPanel panelText = new JPanel(new FlowLayout());
		jftResult = new JTextField(10);
		panelText.add(jftResult);
		
		JPanel panelCalculation = new JPanel (new GridLayout(3,3,5,5));
		
		btn1 = new JButton("  1  ");
		btn1.addActionListener(this);
		panelCalculation.add(btn1);
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panelCalculation.add(btn2);
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panelCalculation.add(btn3);
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		panelCalculation.add(btn4);
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		panelCalculation.add(btn5);
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		panelCalculation.add(btn6);
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		panelCalculation.add(btn7);
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		panelCalculation.add(btn8);
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		panelCalculation.add(btn9);
		
		JPanel panelRightButtons = new JPanel (new GridLayout(5,1,5,5));
		btnDivide = new JButton("/");
		btnDivide.addActionListener(this);
		panelRightButtons.add(btnDivide);
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(this);
		panelRightButtons.add(btnMultiply);
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(this);
		panelRightButtons.add(btnSubtract);
		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		panelRightButtons.add(btnAdd);
		btnEquals = new JButton("=");
		btnEquals.addActionListener(this);
		panelRightButtons.add(btnEquals);
		
		JPanel panelBottomButtons = new JPanel (new FlowLayout());
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		panelBottomButtons.add(btnClear);
		btn0 = new JButton("0");
		btn0.addActionListener(this);
		panelBottomButtons.add(btn0);
		btnPercentage = new JButton("%");
		btnPercentage.addActionListener(this);
		panelBottomButtons.add(btnPercentage);
		

		FlowLayout layout = new FlowLayout();
		JPanel panelParent = new JPanel(layout);
		panelParent.add(panelText);
		panelParent.add(panelCalculation);
		panelParent.add(panelRightButtons);
		panelParent.add(panelBottomButtons);
		
		add(panelParent);
	}
	
	public static void main(String[] args) {
		Calculator frame = new Calculator();
		
		frame.setTitle("Calculator");
		frame.setSize(250,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnClear) {
			jftResult.setText("");
			temp = 0;
			solveTemp =0;
		}
		if(e.getSource()==btn1) {
			display = jftResult.getText();
			jftResult.setText(display + "1");
			
		}
		if(e.getSource()==btn2) {
			display = jftResult.getText();
			jftResult.setText(display + "2");
		}
		if(e.getSource()==btn3) {
			display = jftResult.getText();
			jftResult.setText(display + "3");
		}
		if(e.getSource()==btn4) {
			display = jftResult.getText();
			jftResult.setText(display + "4");
		}
		if(e.getSource()==btn5) {
			display = jftResult.getText();
			jftResult.setText(display + "5");
		}
		if(e.getSource()==btn6) {
			display = jftResult.getText();
			jftResult.setText(display + "6");
		}
		if(e.getSource()==btn7) {
			display = jftResult.getText();
			jftResult.setText(display + "7");
		}
		if(e.getSource()==btn8) {
			display = jftResult.getText();
			jftResult.setText(display + "8");
		}
		if(e.getSource()==btn9) {
			display = jftResult.getText();
			jftResult.setText(display + "9");
		}
		if(e.getSource()==btn0) {
			display = jftResult.getText();
			jftResult.setText(display + "0");
		}
		if(e.getSource()==btnDivide) {
			solveTemp = Double.parseDouble(jftResult.getText());
			divide = true;
			jftResult.setText("");
		}
		if(e.getSource()==btnEquals) {
			if(divide==true) { 
				temp = Double.parseDouble(jftResult.getText());
				solveTemp /= temp; 
				jftResult.setText("" + solveTemp);
			}
		}
	}
}

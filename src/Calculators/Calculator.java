package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 378, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 25, 338, 55);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//==============================================================================================================
		//1st row of arrow, Cancel,  Addition +
		
		//**This is button is for the "Backspace" (arrow)
		JButton button_BS = new JButton("\u2190");
		button_BS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {								//Working of BackSpace
				String backspace=null;													//This backspace removes one character to the left with the help of
																						//StringBuilder Class. It firsts check the length of the textField
				if(textField.getText().length() > 0) {									//if it is greater than 0 it means it can delete the characters 
					StringBuilder strB=new StringBuilder(textField.getText());			//otherwise why would he do that.
					strB.deleteCharAt(textField.getText().length()-1);					//it deletes the character and then converts it to String and paste it
					backspace=strB.toString();											//to the textField.
					textField.setText(backspace);
				}
			}
		});
		button_BS.setBounds(12, 96, 80, 80);
		button_BS.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_BS);
		
		//**This button is for the "Cancel" option
		JButton btnC = new JButton("C");												//the working of the cancel button is simple.
		btnC.addActionListener(new ActionListener() {									//We just the set the textField to null
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(98, 96, 80, 80);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btnC);
		
		//**This button is for the "%" option
		JButton button_Percent = new JButton("%");
		button_Percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		button_Percent.setBounds(184, 96, 80, 80);
		button_Percent.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Percent);
		
		//**This button is for the "Addition" button
		JButton button_Plus = new JButton("+");
		button_Plus.addActionListener(new ActionListener() {							//On clicking this button it gets the content of the textField and
			public void actionPerformed(ActionEvent e) {								//set it to the firstNum and then sets the operations variable with the
				firstNum=Double.parseDouble(textField.getText());						//addition operation.and also sets the textField to just a space
				textField.setText("");
				operations="+";
			}
		});
		button_Plus.setBounds(270, 96, 80, 80);
		button_Plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Plus);
		
		//===========================================================================================================
		
		//2nd row for the 7, 8, 9, -
		
		//**This button is for the numeric "7"
		JButton btnButton7 = new JButton("7");												//here we check the contents of textField and add with the 
		btnButton7.addActionListener(new ActionListener() {									//digit which we want to click. In this it gets the content
			public void actionPerformed(ActionEvent e) {									//of the textField, and then adds the character to it.
				String EnterNumber = textField.getText() + btnButton7.getText();			
				textField.setText(EnterNumber);
			}
		});
		btnButton7.setBounds(12, 181, 80, 80);
		btnButton7.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btnButton7);
		
		//**This button is for the numeric "8"
		JButton button8 = new JButton("8");													//Working same as for numeric 7
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button8.getText();
				textField.setText(enterNumber);
			}
		});
		button8.setBounds(98, 181, 80, 80);
		button8.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button8);
		
		//**This button is for the numeric "9"
		JButton button_9 = new JButton("9");												//Working same as for numeric 7
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_9.getText();
				textField.setText(enterNumber);
			}
		});
		button_9.setBounds(184, 181, 80, 80);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_9);
		
		//**This button is for the Subtraction "-"
		JButton button_Minus = new JButton("-");											//On clicking this button it gets the content of the textField and
		button_Minus.addActionListener(new ActionListener() {								//set it to the firstNum and then sets the operations variable with the
			public void actionPerformed(ActionEvent e) {									//subtraction operation.and also sets the textField to just a space
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		button_Minus.setBounds(270, 181, 80, 80);
		button_Minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Minus);
		
		//==================================================================================================================
		
		//3rd row for the 4, 5, 6, *
		
		//**This button is for the numeric "4"
		JButton button_4 = new JButton("4");													//Working same as for numeric 7
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_4.getText();
				textField.setText(enterNumber);
			}
		});
		button_4.setBounds(12, 268, 80, 80);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_4);
		
		//**This button is for the numeric "5"
		JButton button_5 = new JButton("5");													//Working same as for numeric 7
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_5.getText();
				textField.setText(enterNumber);
			}
		});
		button_5.setBounds(98, 268, 80, 80);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_5);
		
		//**This button is for the numeric "6".
		JButton button_6 = new JButton("6");													//Working same as for numeric 7
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_6.getText();
				textField.setText(enterNumber);
			}
		});
		button_6.setBounds(184, 268, 80, 80);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_6);
		
		//**This button is for Multiplication "*"
		JButton button_Mult = new JButton("*");											//On clicking this button it gets the content of the textField and
		button_Mult.addActionListener(new ActionListener() {							//set it to the firstNum and then sets the operations variable with the
			public void actionPerformed(ActionEvent e) {								//multiplication operation.and also sets the textField to just a space
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		button_Mult.setBounds(270, 268, 80, 80);
		button_Mult.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Mult);
		
		//================================================================================================================
		
		//4th row for the 1, 2, 3, /
		
		//**This button is for the numeric "1"
		JButton button_1 = new JButton("1");													//Working same as for numeric 7
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_1.getText();
				textField.setText(enterNumber);
			}
		});
		button_1.setBounds(12, 355, 80, 80);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_1);
		
		//**This button is for the numeric "2"
		JButton button_2 = new JButton("2");													//Working same as for numeric 7
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_2.getText();
				textField.setText(enterNumber);
			}
		});
		button_2.setBounds(98, 355, 80, 80);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_2);
		
		//**This button is for the numeric "3"
		JButton button_3 = new JButton("3");														//Working same as for numeric 7
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_3.getText();
				textField.setText(enterNumber);
			}
		});
		button_3.setBounds(184, 355, 80, 80);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_3);
		
		//**This button is for Division "/"
		JButton button_Divide = new JButton("/");										//On clicking this button it gets the content of the textField and
		button_Divide.addActionListener(new ActionListener() {							//set it to the firstNum and then sets the operations variable with the
			public void actionPerformed(ActionEvent e) {								//division operation.and also sets the textField to just a space
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		button_Divide.setBounds(270, 355, 80, 80);
		button_Divide.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Divide);
		
		//==================================================================================================================
		
		//5th row is for the 0, ., +-, =
		
		//**This button is for the numeric "0"
		JButton button_0 = new JButton("0");														//Working same as for numeric 7
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + button_0.getText();
				textField.setText(enterNumber);
			}
		});
		button_0.setBounds(12, 441, 80, 80);
		button_0.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_0);
		
		//**This button is for the symbol "."
		JButton button_Dot = new JButton(".");
		button_Dot.setBounds(98, 441, 80, 80);
		button_Dot.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Dot);
		
		//**This button is for the symbol "+-"
		JButton button_PM = new JButton("+-");
		button_PM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		button_PM.setBounds(184, 441, 80, 80);
		button_PM.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_PM);
		
		//**This button is for the equals operator "="
		JButton button_Equal = new JButton("=");									//when the equals button is pressed then the operations variable is checked
		button_Equal.addActionListener(new ActionListener() {						//for the respective operation. And then the result is calculated and printed 
			public void actionPerformed(ActionEvent e) {							//in the textField with 2 places of decimal.
				
				String answer;
				secondNum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstNum+secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstNum-secondNum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstNum*secondNum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstNum/secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstNum%secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		button_Equal.setBounds(270, 441, 80, 80);
		button_Equal.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(button_Equal);
		
		//================================================================================================================
		
		//Working of The Whole Calculator
		/* the working is given step by step in the following codes. */
	}
}

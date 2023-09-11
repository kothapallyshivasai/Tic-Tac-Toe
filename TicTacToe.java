package tictactoe;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TempWindow extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JTextField textField1;
	JTextField textField2;
	JLabel label1;
	JLabel label2;
	JButton button;
	public TempWindow()
	{
		super("Set Names");
		setLayout(new FlowLayout());
		label1 = new JLabel("Enter Player 1 Name : ");
		add(label1);
		textField1 = new JTextField(10);
		add(textField1);
		label2 = new JLabel("Enter Player 2 Name : ");
		add(label2);
		textField2 = new JTextField(10);
		add(textField2);
		button = new JButton("OK");
		add(button);
		button.setFocusPainted(false);
		button.addActionListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (textField1.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter name for Player 1");
		
		else if(textField2.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter name for Player 2");
		
		else if(textField2.getText().equals(textField1.getText()))
		{
			JOptionPane.showMessageDialog(this, "Please enter different names for each players");
			textField1.setText("");
			textField2.setText("");
		}
		else
			this.setVisible(false);
	}
}
class Window5 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	String name1, name2;
	JButton button1, button2, button3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	int ab[] = new int[9];
	int count = 0;
	public Window5(String title, String name1, String name2)
	{
		super(title);
		setLayout(new GridLayout(3, 4));
		this.name1 = name1;
		this.name2 = name2;
		b1 = new JButton("");
		b1.setFocusPainted(false); 
		b1.addActionListener(this); 
		add(b1); 
		b2 = new JButton(""); 
		b2.setFocusPainted(false); 
		b2.addActionListener(this);
		add(b2); 
		b3 = new JButton("");
		b3.setFocusPainted(false);
		b3.addActionListener(this);
		add(b3); 
		button1 = new JButton(this.name1 + "'s turn");
		button1.setFocusPainted(false);
		button1.setFont(new Font("OK", Font.BOLD, 16));
		button1.setText(this.name1 + "'s turn");
		add(button1);
		b4 = new JButton("");
		b4.setFocusPainted(false);
		b4.addActionListener(this);
		add(b4);
		b5 = new JButton("");
		b5.setFocusPainted(false);
		b5.addActionListener(this);
		add(b5);
		b6 = new JButton("");
		b6.setFocusPainted(false);
		b6.addActionListener(this);
		add(b6);
		button2 = new JButton(this.name2 + "'s turn"); 
		button2.setFocusPainted(false); 
		button2.setFont(new Font("OK", Font.BOLD, 16));
		button2.setText("");
		add(button2);
		b7 = new JButton("");
		b7.setFocusPainted(false);
		b7.addActionListener(this);
		add(b7); 
		b8 = new JButton("");
		b8.setFocusPainted(false);
		b8.addActionListener(this);
		add(b8); 
		b9 = new JButton("");
		b9.setFocusPainted(false);
		b9.addActionListener(this);
		add(b9); 
		button3 = new JButton("Reset");
		button3.setFont(new Font("OK", Font.BOLD, 26));
		button3.setFocusPainted(false); 
		button3.addActionListener(this);
		add(button3);
		for (int i = 1; i < 10; i ++)
			ab[i - 1] = 1;
	}
	public void reset()
	{
		b1.setText(""); 
		b2.setText(""); 
		b3.setText(""); 
		b4.setText(""); 
		b5.setText(""); 
		b6.setText(""); 
		b7.setText(""); 
		b8.setText("");
		b9.setText(""); 
		b1.setBackground(null);
		b2.setBackground(null);
		b3.setBackground(null);
		b4.setBackground(null);
		b5.setBackground(null);
		b6.setBackground(null);
		b7.setBackground(null);
		b8.setBackground(null);
		b9.setBackground(null);
		for (int i = 1; i < 10; i ++)
			ab[i - 1] = 1;		
		button1.setText(this.name1 + "'s turn");
		button2.setText("");
		count = 0;
	}
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == button3)
		{	
			reset();
			count = 0;
			return;
		}	
		//Player1 chance
		if (count == 0)
		{
			button1.setText("");
			button2.setText(this.name2 + "'s turn");
			if(e.getSource() == b1)
			{
				if(ab[0] == 1)
				{
					b1.setFont(new Font("OK", Font.BOLD, 90));
					b1.setForeground(Color.blue);
					b1.setText("X");
					ab[0] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b2)
			{
				if(ab[1] == 1)
				{
					b2.setFont(new Font("OK", Font.BOLD, 90));
					b2.setForeground(Color.blue);
					b2.setText("X");
					ab[1] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b3)
			{
				if(ab[2] == 1)
				{
					b3.setFont(new Font("OK", Font.BOLD, 90));
					b3.setForeground(Color.blue);
					b3.setText("X");
					ab[2] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b4)
			{
				if(ab[3] == 1)
				{
					b4.setFont(new Font("OK", Font.BOLD, 90));
					b4.setForeground(Color.blue);
					b4.setText("X");
					ab[3] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b5)
			{
				if(ab[4] == 1)
				{
					b5.setFont(new Font("OK", Font.BOLD, 90));
					b5.setForeground(Color.blue);
					b5.setText("X");
					ab[4] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b6)
			{
				if(ab[5] == 1)
				{
					b6.setFont(new Font("OK", Font.BOLD, 90));
					b6.setForeground(Color.blue);
					b6.setText("X");
					ab[5] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b7)
			{
				if(ab[6] == 1)
				{
					b7.setFont(new Font("OK", Font.BOLD, 90));
					b7.setForeground(Color.blue);
					b7.setText("X");
					ab[6] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b8)
			{
				if(ab[7] == 1)
				{
					b8.setFont(new Font("OK", Font.BOLD, 90));
					b8.setForeground(Color.blue);
					b8.setText("X");
					ab[7] = 0;
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else if(e.getSource() == b9)
			{
				if(ab[8] == 1)
				{
					b9.setFont(new Font("OK", Font.BOLD, 90));
					b9.setForeground(Color.blue);
					b9.setText("X");
					ab[8] = 0; 
					count++;
				}
				else
				{
					button1.setText(this.name1 + "'s turn");
					button2.setText("");
				}
			}
			else
			{
				button1.setText(this.name1 + "'s turn");
				button2.setText("");
			}
		}
		
		//player2 chance
		else
		{
			button1.setText(this.name1 + "'s turn");
			button2.setText("");
			if(e.getSource() == b1)
			{
				if(ab[0] == 1)
				{
					b1.setFont(new Font("NO", Font.BOLD, 90));
					b1.setForeground(Color.red);
					b1.setText("O");
					ab[0] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b2)
			{
				if(ab[1] == 1)
				{
					b2.setFont(new Font("NO", Font.BOLD, 90));
					b2.setForeground(Color.red);
					b2.setText("O");
					ab[1] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b3)
			{
				if(ab[2] == 1)
				{
					b3.setFont(new Font("NO", Font.BOLD, 90));
					b3.setForeground(Color.red);
					b3.setText("O");
					ab[2] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b4)
			{
				if(ab[3] == 1)
				{
					b4.setFont(new Font("NO", Font.BOLD, 90));
					b4.setForeground(Color.red);
					b4.setText("O");
					ab[3] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b5)
			{
				if(ab[4] == 1)
				{
					b5.setFont(new Font("NO", Font.BOLD, 90));
					b5.setForeground(Color.red);
					b5.setText("O");
					ab[4] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b6)
			{
				if(ab[5] == 1)
				{
					b6.setFont(new Font("NO", Font.BOLD, 90));
					b6.setForeground(Color.red);
					b6.setText("O");
					ab[5] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b7)
			{
				if(ab[6] == 1)
				{
					b7.setFont(new Font("NO", Font.BOLD, 90));
					b7.setForeground(Color.red);
					b7.setText("O");
					ab[6] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b8)
			{
				if(ab[7] == 1)
				{
					b8.setFont(new Font("NO", Font.BOLD, 90));
					b8.setForeground(Color.red);
					b8.setText("O");
					ab[7] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else if(e.getSource() == b9)
			{
				if(ab[8] == 1)
				{
					b9.setFont(new Font("NO", Font.BOLD, 90));
					b9.setForeground(Color.red);
					b9.setText("O");
					ab[8] = 0;
					count = 0;
				}
				else
				{
					button1.setText("");
					button2.setText(this.name2 + "'s turn");
				}
			}
			else
			{
				button1.setText("");
				button2.setText(this.name2 + "'s turn");
			}
		}
		
		//winner check
			if((b1.getText() == "X") && (b2.getText() == "X") && (b3.getText() == "X"))
			{
				b1.setBackground(Color.green);
				b2.setBackground(Color.green);
				b3.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b1.getText() == "O") && (b2.getText() == "O") && (b3.getText() == "O"))
			{
				b1.setBackground(Color.green);
				b2.setBackground(Color.green);
				b3.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b4.getText() == "X") && (b5.getText() == "X") && (b6.getText() == "X"))
			{
				b4.setBackground(Color.green);
				b5.setBackground(Color.green);
				b6.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b4.getText() == "O") && (b5.getText() == "O") && (b6.getText() == "O"))
			{
				b4.setBackground(Color.green);
				b5.setBackground(Color.green);
				b6.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b7.getText() == "X") && (b8.getText() == "X") && (b9.getText() == "X"))
			{
				b7.setBackground(Color.green);
				b8.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b7.getText() == "O") && (b8.getText() == "O") && (b9.getText() == "O"))
			{
				b7.setBackground(Color.green);
				b8.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b1.getText() == "X") && (b4.getText() == "X") && (b7.getText() == "X"))
			{
				b1.setBackground(Color.green);
				b4.setBackground(Color.green);
				b7.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b1.getText() == "O") && (b4.getText() == "O") && (b7.getText() == "O"))
			{
				b1.setBackground(Color.green);
				b4.setBackground(Color.green);
				b7.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b2.getText() == "X") && (b5.getText() == "X") && (b8.getText() == "X"))
			{
				b2.setBackground(Color.green);
				b5.setBackground(Color.green);
				b8.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b2.getText() == "O") && (b5.getText() == "O") && (b8.getText() == "O"))
			{
				b2.setBackground(Color.green);
				b5.setBackground(Color.green);
				b8.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b3.getText() == "X") && (b6.getText() == "X") && (b9.getText() == "X"))
			{
				b3.setBackground(Color.green);
				b6.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b3.getText() == "O") && (b6.getText() == "O") && (b9.getText() == "O"))
			{
				b3.setBackground(Color.green);
				b6.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b1.getText() == "X") && (b5.getText() == "X") && (b9.getText() == "X"))
			{
				b1.setBackground(Color.green);
				b5.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b1.getText() == "O") && (b5.getText() == "O") && (b9.getText() == "O"))
			{
				b1.setBackground(Color.green);
				b5.setBackground(Color.green);
				b9.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			else if((b7.getText() == "X") && (b5.getText() == "X") && (b3.getText() == "X"))
			{
				b7.setBackground(Color.green);
				b5.setBackground(Color.green);
				b3.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name1 + " Wins");
				reset();
				count = 0;
			}
			else if((b7.getText() == "O") && (b5.getText() == "O") && (b3.getText() == "O"))
			{
				b7.setBackground(Color.green);
				b5.setBackground(Color.green);
				b3.setBackground(Color.green);
				JOptionPane.showMessageDialog(this, this.name2 + " Wins");
				reset();
			}
			
			//Auto-Reset
			if((ab[0] == 0) && (ab[1] == 0) && (ab[2] == 0) && (ab[3] == 0) && (ab[4] == 0)&& (ab[5] == 0) && (ab[6] == 0)
					&& (ab[7] == 0) && (ab[8] == 0))
			{
				JOptionPane.showMessageDialog(this, "Auto-Reset due to no options");
				reset();
			}
	}
}
public class TicTacToe
{
	public static void main(String[] args) 
	{
		TempWindow w1 = new TempWindow();
		w1.setBounds(660, 350, 320, 150);
		w1.setVisible(true);
		while (true)
		{
			if(w1.isVisible() == false)
			{
				String name1 = w1.textField1.getText();
				String name2 = w1.textField2.getText();
				Window5 w = new Window5("Tic-Tac-Toe", name1, name2);
				w.setSize(600, 500);
				w.setVisible(true);
				w.setIconImage(null);
				break;
			}
		}
	}
}
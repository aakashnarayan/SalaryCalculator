import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator 
{
	public static void main(String[] args)
	{
		//frame
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400,300,400,250);
		myFrame.setLayout(null);

		//Rate Label + TextField
		JLabel label1 = new JLabel("Hourly Rate: ");
		label1.setBounds(50,50,100,20);
		myFrame.add(label1);
		
		JTextField rateEntry = new JTextField();
		rateEntry.setBounds(125,50,100,20);
		myFrame.add(rateEntry);
		
		//Hours Label + TextField
		JLabel label2 = new JLabel("Hours/Week: ");
		label2.setBounds(50,75,100,20);
		myFrame.add(label2);
		
		JTextField hoursEntry = new JTextField();
		hoursEntry.setBounds(125,75,100,20);
		myFrame.add(hoursEntry);
		
		//CheckBox Stuff
		JLabel label3 = new JLabel("Full Time");
		label3.setBounds(70,105,100,20);
		myFrame.add(label3);
		
		JCheckBox checkBox = new JCheckBox();
		checkBox.setBounds(45,105,20,20);
		myFrame.add(checkBox);
		
		//Final Label
				JLabel label4 = new JLabel("Annual Salary: $");
				label4.setBounds(160,145,200,20);
				myFrame.add(label4);
		
		//Button Stuff
		JButton button = new JButton("Calculate");
		button.setBounds(50,145,100,20);
		myFrame.add(button);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double hours = Double.parseDouble(hoursEntry.getText());
				double rate = Double.parseDouble(rateEntry.getText());
				
				if(checkBox.isSelected())
				{
					hours = 40;
				}
				
				label4.setText("Annual Salary: $" + hours*rate*52 + "0");
			}
		});
		
		//Final Stuff
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}

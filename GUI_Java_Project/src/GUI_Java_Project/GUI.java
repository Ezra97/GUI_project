package GUI_Java_Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JFrame;

public class GUI {
	List StudentList = new List();
	public void init(){
JFrame frame = new JFrame();
frame.setSize(700, 700);
frame.setLayout(null);
Button bl = new Button("delete");
bl.setSize(50, 50);
JLabel label = new JLabel("label");
label.setSize(50,50);
label.setLocation(100,350);
frame.add(label);
//label.(StudentList.getSelectedIndex());
Button Add = new Button("Add");
Add.setSize(50, 50);
Add.setLocation(frame.getWidth()/2-260, frame.getHeight()/2+170);
JTextField text = new JTextField();
text.setSize(100,40);
text.setLocation(frame.getWidth()/2-260, frame.getHeight()/2+100);
frame.add(text);
bl.setLocation(frame.getWidth()/2-50, frame.getHeight()/2-50);
ButtonListener bListener = new 	ButtonListener();
bListener.setFrame(frame);
bl.addActionListener(bListener);
bl.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e)
	{
		 if(StudentList.getSelectedIndex()>=0)
             StudentList.remove(StudentList.getSelectedIndex());
	}
});
frame.add(bl);

Add.addActionListener(bListener);
Add.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e)
	{
		 String input = text.getText();
		 StudentList.add(input);
		 text.setText(null);
	}
});
frame.add(Add);

StudentList.setSize(100,100);
StudentList.setLocation(50,50);
StudentList.add("Ben");
StudentList.add("Firas");
StudentList.add("Ron");
StudentList.add("Roi");
frame.add(StudentList);
frame.setLocationRelativeTo(null);
frame.setVisible(true);


StudentList.addActionListener(new ActionListener()
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(StudentList.getSelectedIndex()>=0)
            label.setText(StudentList.getSelectedItem());
	}
});

	}
}

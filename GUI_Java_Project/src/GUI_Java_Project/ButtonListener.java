package GUI_Java_Project;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonListener implements ActionListener{
Frame frame1;
@Override
public void actionPerformed(ActionEvent e)
{
System.out.println("Button was clicked");

Button frame2 = new Button();
frame2.setSize(150,150);
frame2.setBackground(Color.BLUE);

frame1.add(frame2);
}
public void setFrame(Frame f){
	frame1=f;
}
}

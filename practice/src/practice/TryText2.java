package practice;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TryText2 extends Applet
{
	private static final long serialVersionUID = 1L;
	TextField name=new TextField(30);
	TextField pw=new TextField(30);
	TextField pw1=new TextField(30);
	Label la1=new Label("name",Label.CENTER);
	Label la2=new Label("password",Label.CENTER);
	Label la3=new Label("show password",Label.CENTER);
	class PasswordHandle implements ActionListener
	{		
		public void actionPerformed(ActionEvent e)
		{
			pw1.setText(pw.getText());
		}
	}
	public void init()
	{
		this.setLayout(new FlowLayout());
		this.add(la1);
		this.add(name);
		this.add(pw);
		pw.setEchoChar('*');
		this.add(pw);
		pw.addActionListener(new PasswordHandle());
		this.add(la3);
		this.add(pw1);		
	}
}

package cho6;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThisEx2 extends MFrame implements ActionListener{

	Button btn;
	
	public ThisEx2()
	{
		super(500,350,Color.green,true);
		btn=new Button("I am Button");
		add(btn, "South");
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		//System.out.println("Can u see?");
		MDialog md=new MDialog(this, "Can u see?");
	}
	
	class MDialog extends Dialog implements ActionListener
	{
		Button mbtn;
		ThisEx2 f;
		public MDialog(ThisEx2 f, String title)
		{
			super(f, title, true);
			this.f=f;//최적화 위한 대입
			setLayout(new FlowLayout());
			setSize(150, 100);
			mbtn=new Button("Click");
			mbtn.addActionListener(this);
			add(mbtn);
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			f.btn.setBackground(Color.red);
			dispose();
		}
		
	}
	
	public static void main(String[] args) {
		new ThisEx2();
	}

}

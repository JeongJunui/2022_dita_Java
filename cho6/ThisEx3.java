package cho6;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ThisEx3 extends MFrame implements ActionListener {
	Button btn;
	Random r;
	public ThisEx3(Color c)
	{
		super(500,350,c,true);
		r=new Random();
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
		ThisEx3 f;
		public MDialog(ThisEx3 f, String title)
		{
			super(f, title, true);
			this.f=f;//최적화 위한 대입
			setLayout(new FlowLayout());
			setSize(150, 100);
			mbtn=new Button("Click");
			mbtn.addActionListener(this);
			mbtn.setBackground(rColor());
			add(mbtn);
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			f.btn.setBackground(rColor());
			dispose();
		}
		
	}
	public Color rColor()
	{
		int rr,gg,bb;
		rr=r.nextInt(256);
		gg=r.nextInt(256);
		bb=r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	public static void main(String[] args) {
		Color c;
		Random rr = new Random();
		c=new Color(rr.nextInt(256),rr.nextInt(256),rr.nextInt(256));
		new ThisEx3(c);
	}
}

import java.awt.*;  
import java.lang.Math.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{  
	Frame f;
	int c,n;
	String s1,s2,s3,s4,s5;
	double b;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	TextField tf;
	Panel p;
	GridLayout g;
	Calculator()
	{  
		f=new Frame("CALCULATOR");
		p=new Panel();
		int i;
		f.setLayout(new FlowLayout());
		b1 = new Button("7");
		b1.addActionListener(this);
		b2 = new Button("8");
		b2.addActionListener(this);
		b3 = new Button("9");
		b3.addActionListener(this);
		b4 = new Button("*");
		b4.addActionListener(this);
		b5 = new Button("/");
		b5.addActionListener(this);
		b6 = new Button("sin");
		b6.addActionListener(this);
		b7 = new Button("4");
		b7.addActionListener(this);
		b8 = new Button("5");
		b8.addActionListener(this);
		b9 = new Button("6");
		b9.addActionListener(this);
		b10 = new Button("-");
		b10.addActionListener(this);
		b11 = new Button("%");
		b11.addActionListener(this);
		b12 = new Button("cos");
		b12.addActionListener(this);
		b13 = new Button("1");
		b13.addActionListener(this);
		b14 = new Button("2");
		b14.addActionListener(this);
		b15 = new Button("3");
		b15.addActionListener(this);
		b16 = new Button("+");
		b16.addActionListener(this);
		b17 = new Button("^");
		b17.addActionListener(this);
		b18 = new Button("tan");
		b18.addActionListener(this);
		b19 = new Button(".");
		b19.addActionListener(this);
		b20 = new Button("0");
		b20.addActionListener(this);
		b21 = new Button("DEL");
		b21.addActionListener(this);
		b22 = new Button("=");
		b22.addActionListener(this);
		b23 = new Button("log");
		b23.addActionListener(this);
		b24 = new Button("ln");
		b24.addActionListener(this);
		tf = new TextField(40);
		f.add(tf);
		g = new GridLayout(4,6,10,10);
		p.setLayout(g);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);
		p.add(b21);
		p.add(b22);
		p.add(b23);
		p.add(b24);
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b4)
        {  
			s1 = tf.getText();
            tf.setText("");
            c=3;
        }
        if(e.getSource()==b5)
        {
			 s1 = tf.getText();
            tf.setText("");
            c=4;
        }
        if(e.getSource()==b6)
        {
			tf.setText("");
            c=6;
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b10)
        {
			s1 = tf.getText();
            tf.setText("");
            c=2;
        }
        if(e.getSource()==b11)
        {
            s1 = tf.getText();
            tf.setText("");
            c=5;
 
        }
        if(e.getSource()==b12)
        {
			tf.setText("");
            c=7;
 
        }
        if(e.getSource()==b13)
        {
			s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
 
        }
        if(e.getSource()==b14)
        {
			s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
 
        }
        if(e.getSource()==b15)
        {
			s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        }
		if(e.getSource()==b16)
        {
			s1 = tf.getText();
            tf.setText(s1+"+");
            c=1;
        }
		if(e.getSource()==b17)
        {
			s1 = tf.getText();
            tf.setText("");
            c=8;
        }
		if(e.getSource()==b18)
        {
			tf.setText("");
            c=9;
 
        }
		if(e.getSource()==b19)
        {
			s3 = tf.getText();
            s4 = ".";
            s5 = s3+s4;
            tf.setText(s5);
        }
		if(e.getSource()==b20)
        {
			s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
		if(e.getSource()==b21)
        {
            tf.setText("");
        }
		if(e.getSource()==b23)
        {
			tf.setText(" log");
            c=10;
 
        }
		
        if(e.getSource()==b22)
        {
            s2 = tf.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
						tf.setText(String.valueOf(n));
                    }
                     else
                        tf.setText("infinite");
 
                }
                catch(Exception i){}
            }
            if(c==5)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
			if(c==6)
			{
				double d=Double.parseDouble(s2);  
				b = Math.toRadians(d); 
				System.out.println(Math.sin(b)); 
			}
			if(c==7)
			{
				double d=Double.parseDouble(s2);  
				b = Math.toRadians(d); 
				System.out.println(Math.cos(b)); 
			}
			if(c==8)
			{
				int base = Integer.parseInt(s1);
				int temp=base;
				int pow = Integer.parseInt(s2);
				for (int i=1; i<pow; i++)
					temp = temp*temp;
				tf.setText(String.valueOf(temp));
			}
			if(c==9)
			{
				double d=Double.parseDouble(s2);  
				b = Math.toRadians(d); 
				System.out.println(Math.tan(b));
			}
			if(c==10)
			{
				double d=Double.parseDouble(s2);  
				b = Math.toRadians(d); 
				System.out.println(Math.log(b));
			}
			
        }
        
    }
 
 
	public static void main(String args[])
	{  
		Calculator c = new Calculator();  
	}
}  

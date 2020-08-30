import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dkassign2 implements ActionListener{

	static int a1=0,a2=0,a3=0,a4=0;

	JFrame jf;
	JLabel head,cand1,cand2,cand3,cand4;
	JButton b1,b2,b3,b4,b5;
	Dkassign2(){

		jf = new JFrame("DANIAL");

		head= new JLabel("VOTING MACHINE");
		head.setBounds(180,30,500,80);
		Font F= new Font("Arial",Font.BOLD,40);
		head.setFont(F);

		cand1 = new JLabel("DANIAL");
		cand1.setBounds(50,200,200,50);
		cand2 = new JLabel("USMAN");
		cand2.setBounds(50,250,200,50);
		cand3 = new JLabel("ABDUL REHMAN");
		cand3.setBounds(50,300,200,50);
		cand4= new JLabel("FARHAN");
		cand4.setBounds(50,350,200,50);

		Font F2= new Font("Arial",Font.BOLD,20);
		cand1.setFont(F2);
		cand2.setFont(F2);
		cand3.setFont(F2);
		cand4.setFont(F2);
		
		

		b1= new JButton("VOTE");
		b1.setBounds(300,210,100,30);
		b1.addActionListener(this);
		b2= new JButton("VOTE");
		b2.setBounds(300,260,100,30);
		b2.addActionListener(this);
		b3= new JButton("VOTE");
		b3.setBounds(300,310,100,30);
		b3.addActionListener(this);
		b4= new JButton("VOTE");
		b4.setBounds(300,360,100,30);
		b4.addActionListener(this);

		b5= new JButton("END VOTING");
		b5.setBounds(400,500,200,50);
		b5.addActionListener(this);

		jf.add(head);  jf.add(cand1); jf.add(cand2);  jf.add(cand3);  jf.add(cand4);
		jf.add(b1);  jf.add(b2);  jf.add(b3);  jf.add(b4);	jf.add(b5);
		jf.setSize(750,750);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b5)
		{
			JFrame jf2 = new JFrame("RESULTS");
			JLabel lb1 = new JLabel("DANIAL -->   "+a1+"  VOTES");
			JLabel lb2 = new JLabel("USMAN GOT -->   "+a2+"  VOTES");
			JLabel lb3 = new JLabel("ABDUL REHMAN -->    "+a3+"  VOTES");
			JLabel lb4 = new JLabel("FARHAN -->   "+a4+"  VOTES");

			Font F3= new Font("Arial",Font.BOLD,20);
			lb1.setFont(F3);
			lb2.setFont(F3);
			lb3.setFont(F3);
			lb4.setFont(F3);
			
			jf2.setLayout(null);
			lb1.setBounds(100,50,400,100);
			lb2.setBounds(100,100,400,100);
			lb3.setBounds(100,150,400,100);
			lb4.setBounds(100,200,400,100);
			jf2.setSize(500,500);
			jf2.setVisible(true);
			
			jf2.add(lb1);
			jf2.add(lb2);
			jf2.add(lb3);
			jf2.add(lb4);
		}
		else
		{
		 	int p=JOptionPane.showConfirmDialog(jf,"SURE TO GIVE VOTE TO THIS CANDIDATE");
		  		if(p== JOptionPane.YES_OPTION){
					if(e.getSource()==b1)
					{	a1++;	}
					else if(e.getSource()==b2)
					{	a2++;	}
					else if(e.getSource()==b3)
					{	a3++;	}
					else if(e.getSource()==b4)
					{	a4++;	}
				}			
		}
	}

	public static void main(String [] args)
	{
		new Dkassign2();
	}

}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Poling{
	static int res1=0,res2=0,res3=0,res4=0;
	JButton b1;

	Poling(){

		JFrame jf = new JFrame("POLING MACHINE");
	 	b1= new JButton("FINISH VOTING");
		b1.setBounds(100,400,450,130);

		JRadioButton r1 = new JRadioButton("CANDIDATE 1");
		r1.setBounds(200,150,150,50);
		r1.addActionListener(new Myhandler());
		JRadioButton r2 = new JRadioButton("CANDIDATE 2");
		r2.setBounds(200,200,150,50);
		r2.addActionListener(new Myhandler());
		JRadioButton r3 = new JRadioButton("CANDIDATE 3");
		r3.setBounds(200,250,150,50);
		r3.addActionListener(new Myhandler());
		JRadioButton r4 = new JRadioButton("CANDIDATE 4");
		r4.setBounds(200,300,150,50);
		r4.addActionListener(new Myhandler());

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);		bg.add(r2);		bg.add(r3);		bg.add(r4);

		b1.addActionListener(new Myhandler());
		

		
		jf.add(r1);  jf.add(r2);  jf.add(r3);  jf.add(r4);	jf.add(b1);
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class Myhandler implements ActionListener{

			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==b1)
				{
					JFrame f2 = new JFrame("RESULT");
					JLabel l1 = new JLabel("FOR 1st CANDIDATE  	"+res1+" VOTES");
					JLabel l2 = new JLabel("FOR 2nd CANDIDATE 		"+res2+" VOTES");
					JLabel l3 = new JLabel("FOR 3rd CANDIDATE 		"+res3+" VOTES");
					JLabel l4 = new JLabel("FOR 4th CANDIDATE  	"+res4+" VOTES");

					f2.setLayout(null);
					l1.setBounds(100,50,300,100);
					l2.setBounds(100,100,300,100);
					l3.setBounds(100,150,300,100);
					l4.setBounds(100,200,300,100);
					f2.setSize(500,500);
					f2.setVisible(true);
			
					f2.add(l1);
					f2.add(l2);
					f2.add(l3);
					f2.add(l4);

				}
				else
				{
				 	int p=JOptionPane.showConfirmDialog(null,"CONFIRM ? ");
				  		if(p== JOptionPane.YES_OPTION){
							if(e.getActionCommand()=="CANDIDATE 1")
							{	res1++;	}
							else if(e.getActionCommand()=="CANDIDATE 2")
							{	res2++;	}
							else if(e.getActionCommand()=="CANDIDATE 3")
							{	res3++;	}
							else if(e.getActionCommand()=="CANDIDATE 4")
							{	res4++;	}
						}			
				}
					}

		}


	public static void main(String [] args)
	{
		new Poling();
	}

}
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class HcHome extends JFrame implements ActionListener

{
   
   JButton mts,register,drugStore,exit;
   
   JLabel svcHc,homePage,image;

   public HcHome()
    
     {
     
        setLayout(null);
	
	setTitle("Home Page");
	
                    setBounds(0,0,1020, 729);
	 
                    //setMinimumSize(new java.awt.Dimension(1020, 720));

	svcHc=new JLabel("Child Care System");

	svcHc.setFont(new Font("Arial Narrow",Font.BOLD,45));

        svcHc.setHorizontalAlignment(SwingConstants.CENTER);

        svcHc.setBounds(120,20,780,70);

        getContentPane().add(svcHc);
 
	
	homePage=new JLabel("Home");

	homePage.setFont(new Font("Arial Narrow",Font.BOLD,35));

	homePage.setForeground(new Color(102,102,255));

                  homePage.setHorizontalAlignment(SwingConstants.CENTER);

                  homePage.setBounds(450,100,170,50);
 
                  getContentPane().add(homePage);


	image=new JLabel("");

	image.setFont(new Font("Arial Narrow",Font.BOLD,35));

	image.setForeground(new Color(102,102,255));

                  image.setHorizontalAlignment(SwingConstants.CENTER);

                  image.setIcon(new ImageIcon("Child-Meeting-Doctor.jpg"));

                  image.setBounds(250,170,770,500);
 
                  getContentPane().add(image);
 
 
       
                     

                    mts=new JButton("Case Records");
 
                   mts.setFont(new Font("Arial Narrow",Font.BOLD,22));

                     mts.setForeground(new Color(255, 0, 0));
 
                     mts.setBounds(20,440,170,40);

                     mts.setMnemonic(KeyEvent.VK_C);

                    mts.addActionListener(this);
 
        mts.setToolTipText("Press it to know About Medical Treat.");

        getContentPane().add(mts);
       
	register=new JButton("Registration");

        register.setFont(new Font("Arial Narrow",Font.BOLD,22));

	register.setForeground(new Color(255, 0, 0));
 
        register.setBounds(20,280,170,40);

        register.setMnemonic(KeyEvent.VK_O);

        register.addActionListener(this);
 
        register.setToolTipText("Press it to know About register");

        getContentPane().add(register);
           
        
	drugStore=new JButton("Drug Store");

        drugStore.setFont(new Font("Arial Narrow",Font.BOLD,22));

	drugStore.setForeground(new Color(255, 0, 0));
 
        drugStore.setBounds(20,360,170,40);

        drugStore.setMnemonic(KeyEvent.VK_S);

        drugStore.addActionListener(this);

    //  principal.addKeyListener(this);
 
        drugStore.setToolTipText("Press it to know About Drug");

        getContentPane().add(drugStore);
        
                                                                                       
	exit=new JButton("Exit");

        exit.setFont(new Font("Arial Narrow",Font.BOLD,22));

	exit.setForeground(new Color(255, 0, 0));
 
 	exit.setBounds(20,520,170,40);

        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(this);

    //  principal.addKeyListener(this);
 
        exit.setToolTipText("Press it to Exit ");

        getContentPane().add(exit);
       
	setVisible(true);

        addWindowListener(new WindowAdapter()

           {

                  public void windowClosing(WindowEvent we)

	           {

	            dispose();

	           }

           });

 }
 
      
       public void actionPerformed(ActionEvent ae)

          {

	      if(ae.getActionCommand().equals("Exit"))

	       {

 	        dispose();

	       }


	      else if(ae.getActionCommand().equals("Case Records"))

	       {

	                  Mts m=new Mts();

	        }

                         else if(ae.getActionCommand().equals("Registration"))

	       {
	
                               	 ReHo r=new ReHo();

	       }

                         else if(ae.getActionCommand().equals("Drug Store"))

	       {
	
	                DrugStore o=new DrugStore();

	       }
          }


     public static  void main(String args[])

	{

		HcHome h=new HcHome();

        }
}

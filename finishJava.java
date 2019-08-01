
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class finishJava implements ActionListener
{
	public finishJava()
    {
    byte MainLoop = 1;
    while (MainLoop>=1)
        {
        String password = JOptionPane.showInputDialog("Please enter Password to start the program");
            if(password.equalsIgnoreCase("tom")){
        			JFrame frame = new JFrame("JAVA Tomasz Sobkow");
        			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
        			frame.setVisible(true);
              frame.setSize(800,730);
              frame.setResizable(false);
              frame.setLocationRelativeTo(null);
             			
              JPanel panel = new JPanel();
        			panel.setBackground(Color.gray);
        			frame.add(panel);
              panel.setLayout(null);
  			            
  			      Font buttons = new Font("SansSerif",Font.BOLD,14);
              Font TextArea = new Font("Monospaced",Font.ITALIC+Font.PLAIN,14);
              Font labelWelcome = new Font("DialogInput",Font.ITALIC,15);
              Font college = new Font("Dialog",Font.PLAIN,13);
              
              JLabel wstep = new JLabel("<html><b><i>This Software calculate the area, volume, surface area and " +
                      "perimeter of 2D and 3D shapes and e five other programs which i did during this cours</i></b></html>");
              panel.add(wstep);
              wstep.setBounds(20,20,500,55);
              wstep.setFont(labelWelcome);
           
 // settings for label bellow 
            int XpositionLabelFinish = 470;
                JLabel finishLabel = new JLabel("MADE by : Tomasz SOBKÓW");
                panel.add(finishLabel);
                finishLabel.setFont(college);
                finishLabel.setBounds(400,630,180,20);
            
            JLabel finishLabel6 = new JLabel("* Mallow  College  Further  Education  2017 / 2018 *");
            panel.add(finishLabel6);
            finishLabel6.setFont(college);
            finishLabel6.setBounds(XpositionLabelFinish-70,650,400,20);
 				// buttons settings
			int possitionY = 130;   // for start possition for button corner
			int buttonHeight = 40;  
			int buttonLenght = 140;

        JButton button1 = new JButton("Area");
			panel.add(button1);
            button1.setBounds(120,possitionY,buttonLenght,buttonHeight);
            button1.setBackground(Color.yellow);
			button1.setFont(buttons);
            // settings for labels under button1
            int possitionX = 125; // x position for button1Label
                JLabel button1Label = new JLabel(" * Of Square");
                panel.add(button1Label);
                button1Label.setBounds(possitionX,possitionY + 45,buttonLenght,buttonHeight);
                button1Label.setFont(TextArea);
            
                JLabel button1Label2 = new JLabel(" * Of Circle");
                panel.add(button1Label2);
                button1Label2.setBounds(possitionX,possitionY + 45 + 20,buttonLenght,buttonHeight);
                button1Label2.setFont(TextArea);
            
                JLabel button1Label3 = new JLabel(" * Of Rectangle");
                panel.add(button1Label3);
                button1Label3.setBounds(possitionX,possitionY + 65 + 20,buttonLenght,buttonHeight);
                button1Label3.setFont(TextArea);
            
        JButton button2 = new JButton("Permiter");
            panel.add(button2);
            button2.setBounds(280,possitionY,buttonLenght,buttonHeight);
            button2.setBackground(Color.yellow);
            button2.setFont(buttons);
            // settings for labels under button2
            int button2LabelX = 285; // X possition for button2Label
                JLabel button2Label = new JLabel(" * Of Square");
                panel.add(button2Label);
                button2Label.setBounds(button2LabelX,possitionY + 45,buttonLenght,buttonHeight);
                button2Label.setFont(TextArea);
           
                JLabel button2Label2 = new JLabel(" * Of Circle");
                panel.add(button2Label2);
                button2Label2.setBounds(button2LabelX,possitionY + 45 + 20,buttonLenght,buttonHeight);
                button2Label2.setFont(TextArea);
            
                JLabel button2Label3 = new JLabel(" * Of Rectangle");
                panel.add(button2Label3);
                button2Label3.setBounds(button2LabelX,possitionY + 45 + 20 + 20,buttonLenght,buttonHeight);
                button2Label3.setFont(TextArea);

      JButton button3 = new JButton("Surface Area");
            panel.add(button3);
            button3.setBounds(440,possitionY,buttonLenght,buttonHeight);
            button3.setBackground(Color.yellow);
            button3.setFont(buttons);
            // settings for labels under button3
            int button3LabelX = 445; // X possition for  button3LabelX
                JLabel button3Label = new JLabel(" * Of Cylinder");
                    panel.add(button3Label);
                    button3Label.setBounds(button3LabelX ,possitionY + 45,buttonLenght,buttonHeight);
                    button3Label.setFont(TextArea);
            
                    JLabel button3Label2 = new JLabel(" * Of Cone");
                        panel.add(button3Label2);
                        button3Label2.setBounds(button3LabelX,possitionY + 45 + 20,buttonLenght,buttonHeight);
                        button3Label2.setFont(TextArea);
            
                        JLabel button3Label3 = new JLabel(" * Of Sphere");
                            panel.add(button3Label3);
                            button3Label3.setBounds(button3LabelX,possitionY + 45 + 20 + 20,buttonLenght,buttonHeight);
                            button3Label3.setFont(TextArea);

      JButton button4 = new JButton("Volume");
            panel.add(button4);
            button4.setBounds(600,possitionY,buttonLenght,buttonHeight);
            button4.setBackground(Color.yellow);
            button4.setFont(buttons);
            // settings for labels under button4
            int button4LabelX = 605; // X possition for  button4LabelX
                JLabel button4Label = new JLabel(" * Of Cylinder");
                    panel.add(button4Label);
                    button4Label.setBounds(button4LabelX ,possitionY + 45,buttonLenght,buttonHeight);
                    button4Label.setFont(TextArea);
            
                    JLabel button4Label2 = new JLabel(" * Of Cone");
                        panel.add(button4Label2);
                        button4Label2.setBounds(button4LabelX,possitionY + 45 + 20,buttonLenght,buttonHeight);
                        button4Label2.setFont(TextArea);
            
                            JLabel button4Label3 = new JLabel(" * Of Sphere");
                                panel.add(button4Label3);
                                button4Label3.setBounds(button4LabelX,possitionY + 45 + 20 + 20,buttonLenght,buttonHeight);
                                button4Label3.setFont(TextArea);

      JButton button5 = new JButton("Tax calculator");
        panel.add(button5);
        button5.setBounds(possitionX,possitionY + 125 + 20,buttonLenght,buttonHeight);
        button5.setBackground(Color.yellow);
        button5.setFont(buttons);

      JButton button6 = new JButton("Call counter");
        panel.add(button6);
        button6.setBounds(possitionX,possitionY + 175 + 20,buttonLenght,buttonHeight);
        button6.setBackground(Color.yellow);
        button6.setFont(buttons);

      JButton button7 = new JButton("Body ratio");
        panel.add(button7);
        button7.setBounds(possitionX,possitionY + 225 + 20,buttonLenght,buttonHeight);
        button7.setBackground(Color.green);
        button7.setFont(buttons);

       JButton button8 = new JButton("NASA");
        panel.add(button8);
        button8.setBounds(280,possitionY + 225 + 20,buttonLenght,buttonHeight);
        button8.setBackground(Color.green);
        button8.setFont(buttons);


            button1.addActionListener(this);
			button2.addActionListener(this);
            button3.addActionListener(this);
            button4.addActionListener(this);
            button5.addActionListener(this);
            button6.addActionListener(this);
            button7.addActionListener(this);
            button8.addActionListener(this);
                MainLoop = 0;
            }// last bracket for first if with password
            else
                JOptionPane.showMessageDialog(null,"Wrong Password","",JOptionPane.ERROR_MESSAGE);
        }// last bracket for loop MainLoop
   }
	// functions calculations for Area
public static double AreaOfSquare(double a) // calculation for Area of Square
    {
	double AreaOfSquare = Math.pow(a,2);
	return AreaOfSquare;
	}
	public static double AreaOfCircle(double a) // calculation for Area of circle
		{
		double AreaOfCircle =  Math.PI * Math.pow(a,2);
		return AreaOfCircle;
		}
	public static double AreaOfrectangle(double a, double b) // calculation for Area of Rectangle
		{
		double AreaOfrectangle =  2.0 * (a + b);
		return AreaOfrectangle;
		}

		// functions calculations for Permiter
public static double PermiterOfSquare(double a) // calculation for Permiter of Square
			{
			double PermiterOfSquare = (a * 4.0);
			return PermiterOfSquare;
			}
			public static double PermiterOfCircle(double a) // calculation for Permiter of Circle
				{
				double PermiterOfCircle = (2.0 * Math.PI * a);
				return PermiterOfCircle;
				}
				public static double PermiterOfrectangle(double a, double b) // calculation for Permiter of Rectangle
				    {
					double PermiterOfrectangle =  2.0 * (a + b);
					return PermiterOfrectangle ;
					}

		// functions calculations for Surface Area
public static double SurfaceAreaOfCylinder(double a, double b) // calculation for surface area of Cilinder
					{
					double SurfaceAreaOfCylinder =  2.0 * Math.PI * (a * b) + 2 * (Math.PI * Math.pow(a,2));
					return SurfaceAreaOfCylinder;
					}
					public static double SurfaceAreaOfCone(double a, double b) // calculation for surface area of Cone
						{
						double SurfaceAreaOfCone = Math.PI * a * (a + Math.sqrt(Math.pow(b,2) + Math.pow(a,2)));
						return SurfaceAreaOfCone;
						}
						public static double SurfaceAreaOfSphere(double a) // calculation for surface area of Sphere
						{
						double SurfaceAreaOfSphere = 4.0 * Math.PI * Math.pow(a,2);
						return SurfaceAreaOfSphere;
						}

		// functions calculations for Volume
public static double VolumeOfCylinder(double a, double b) // calculation for surface Volume of Cilinder
    {
	double VolumeOfCylinder = Math.PI * Math.pow(a,2) * b;
	return VolumeOfCylinder;
	}
		public static double VolumeOfCone(double a, double b) // calculation for surface Volume of Cone
           {
	    	double VolumeOfCone = Math.PI * Math.pow(a,2) * b/3;
			return VolumeOfCone;
			}
			public static double VolumeOfSphere(double a) // calculation for Volume of Sphere
			    {
				double VolumeOfSphere = 4.0 / 3.0 * Math.PI * (Math.pow(a,3));
				return VolumeOfSphere;
				}

public void actionPerformed(ActionEvent e)
       {
        String btn = e.getActionCommand();
          if (btn.equals("Area"))
            {
             byte x = 1;
             while(x == 1)
              {
               String typeOfUser = JOptionPane.showInputDialog(" Please choose one option\n\n 	1. Area of Square \n 	2. Area of Circle \n"+
                                                        " 	3. Area of Rectangle \n ");
               char choice = typeOfUser.charAt(0);
						
               switch (choice)
                {
                 case '1':
                  String lenght = JOptionPane.showInputDialog("Please enter the side length of the square ( cm )?");
                  double lenghtAsFloat = Float.parseFloat(lenght);
                  JOptionPane.showMessageDialog(null,"The  Area of square side lenght "+String.format("%.2f",lenghtAsFloat)+ " cm = "+
																	AreaOfSquare(lenghtAsFloat)+" cm2","Area"+" of Square",JOptionPane.INFORMATION_MESSAGE);
                  x = 0;
                  break;
						
                 case '2':
                   
                   String radious = JOptionPane.showInputDialog("Please enter the radious of the Circle ( cm )?");
                   float radiousAsFloat = Float.parseFloat(radious);
                   JOptionPane.showMessageDialog(null,"The Area of circe radious lenght "+String.format("%.2f",radiousAsFloat)+ " cm = "+
                                                              String.format("%.2f",AreaOfCircle(radiousAsFloat))+" cm","Area of Circle",JOptionPane.INFORMATION_MESSAGE);
                   x = 0;
                   break;
                 case '3':
                  
                  String hight = JOptionPane.showInputDialog("Please enter the hight of the Rectangle ( cm )?");
                  String weight = JOptionPane.showInputDialog("Please enter the width of the Rectangle ( cm )?");
                  float hightAsFloat = Float.parseFloat(hight);
                  float weightAsFloat = Float.parseFloat(weight);                              
                  JOptionPane.showMessageDialog(null,"The Area of Rectangle \n\nheight "+hightAsFloat+" cm \nwidth  "+weightAsFloat+" cm \n                          = "+
                                            String.format("%.2f",AreaOfrectangle(hightAsFloat,weightAsFloat))+" cm","Area of Rectangle",JOptionPane.INFORMATION_MESSAGE);
                  x = 0;
                  break;
                 default:
                                JOptionPane.showMessageDialog(null, "Try again ","Wrong choice",JOptionPane.ERROR_MESSAGE);
								}        // last bracket for switch (choice)
					    }          //  last bracket loop while x
 			     }           // last bracket for if (btn.equals("Area"))
				
         if (btn.equals("Permiter"))
            {
            byte x = 1;
            while(x == 1)
             {
               String typeOfUserPermiters = JOptionPane.showInputDialog(" Please choose one option\n\n 	1. Permiter of Square \n 	2. Permiter of Circel \n"+
                                                               " 	3. Permiter of Rectangle \n ");
               char choicePermiter;
               choicePermiter = typeOfUserPermiters.charAt(0);
              switch (choicePermiter)
                {
                 case '1':
                   String lenght = JOptionPane.showInputDialog("Please enter the side length of the square ( cm )?");
                   float lenghtAsFloat = Float.parseFloat(lenght);
                   JOptionPane.showMessageDialog(null,"The Perimeter of square side lenght "+String.format("%.2f",lenghtAsFloat)+ " cm = "+
																		String.format("%.2f",PermiterOfSquare(lenghtAsFloat))+" cm","Permiter of Square",JOptionPane.INFORMATION_MESSAGE);
                                x = 0;
                                break;              
                 case '2':
									
                   String radious = JOptionPane.showInputDialog("Please enter the radious of the Circle ( cm )?");
                   float radiousAsFloat = Float.parseFloat(radious);
                   double permiterCircle = 2 * Math.PI * radiousAsFloat;
                   JOptionPane.showMessageDialog(null,"The Permiter of circe radious lenght "+String.format("%.2f",radiousAsFloat)+ " cm = "+
                                                              String.format("%.2f",PermiterOfCircle(radiousAsFloat))+" cm","Permiter of Circle",JOptionPane.INFORMATION_MESSAGE);
											x = 0;
                      break;	
                 case '3':
                 	
                  String hight = JOptionPane.showInputDialog("Please enter the hight of the Rectangle ( cm )?");
                  String weight = JOptionPane.showInputDialog("Please enter the width of the Rectangle ( cm )?");
                  float hightAsFloat = Float.parseFloat(hight);
                  float weightAsFloat = Float.parseFloat(weight);                              
                  JOptionPane.showMessageDialog(null,"The Permiter of Rectangle \n\nheight "+hightAsFloat+" cm \nwidth   "+weightAsFloat+" cm \n                          = "+
                                           String.format("%.2f",PermiterOfrectangle(hightAsFloat,weightAsFloat))+" cm","Permiter of Rectangle",JOptionPane.INFORMATION_MESSAGE);   
											x = 0;
                      break;            
                  default:
                                JOptionPane.showMessageDialog(null, "Try again ","Wrong choice",JOptionPane.ERROR_MESSAGE);
                   }     // last bracket for switch (choicePermiter)
               }        //  last bracket loop while y
           }            // last bracket for if (btn.equals("Permiter"))
                if (btn.equals("Surface Area"))
						{
          	  byte x = 1;
           	  while(x == 1)
                    {
                    String typeOfUserPermiters = JOptionPane.showInputDialog(" Please choose one option\n\n 	1. Surface Area of Cylinder \n 	2. Surface Area of Cone \n"+
                                                                        " 	3. Surface Area of Sphere \n ");
                  char choicePermiter = typeOfUserPermiters.charAt(0);
	              switch (choicePermiter)
                        {
                    case '1':
                        String radious = JOptionPane.showInputDialog(" Please enter the radious of the Base?");
                        String hight = JOptionPane.showInputDialog(" Please enter the side hight of the Cylinder ?");
                        float hightAsFloat = Float.parseFloat(hight);
                        float radiousAsFloat = Float.parseFloat(radious);
                        //double SurfaceCylinder = 2 * Math.PI * Math.pow(radiousAsFloat,2)+(2 * Math.PI * radiousAsFloat) * hightAsFloat;
                        JOptionPane.showMessageDialog(null,"The Surface Are of Cylinder\n\nSide hight            "+String.format("%.2f",hightAsFloat)+ " cm "+
                                                    "\nRadious of Base   "+String.format("%.2f",radiousAsFloat)+
                                                    " cm \n                                  = "+String.format("%.2f",SurfaceAreaOfCylinder(radiousAsFloat,hightAsFloat))+
                                                    " cm2","Surface Area of Cylinder",JOptionPane.INFORMATION_MESSAGE);
                            x = 0;
                            break;
                    case '2':
                            String radiousCone = JOptionPane.showInputDialog("Please enter the radious of the Base ?");
                            String hightCone = JOptionPane.showInputDialog("Please enter the side hight of the Cone ?");
                            float radiousConeAsFloat = Float.parseFloat(radiousCone);
                            float hightConeAsFloat = Float.parseFloat(hightCone);
                            double surfaceAreCone = 2 * Math.PI * radiousConeAsFloat; // calculation for surface area of cone
                            JOptionPane.showMessageDialog(null,"The Surface Are of Cone \n\nSide  lenght       "+String.format("%.2f",hightConeAsFloat)+ " cm "+
                                                          "\nRadious of Base "+String.format("%.2f",radiousConeAsFloat)+
																														" cm\n                                      =    "+String.format("%.2f",SurfaceAreaOfCone(radiousConeAsFloat,hightConeAsFloat))+
                                                          " cm2","Surface Area of Cone",JOptionPane.INFORMATION_MESSAGE);
                                x = 0;
                                break;	
                    case '3':
                            String lenght = JOptionPane.showInputDialog("Please enter the Radious of the Sphere ?");
                            float lenghtAsFloatSphere = Float.parseFloat(lenght);
                            JOptionPane.showMessageDialog(null,"The Surface Are of Sphere radious "+String.format("%.2f",lenghtAsFloatSphere)+ " cm = "+
                                                              String.format("%.2f",SurfaceAreaOfSphere(lenghtAsFloatSphere))+" cm2","Surface Area of the Sphere",JOptionPane.INFORMATION_MESSAGE);
                                x = 0;
                                break;
								default:
										JOptionPane.showMessageDialog(null, "Try again ","Wrong choice",JOptionPane.ERROR_MESSAGE);
                            }   	// last bracket for swith choicePermiter Surface Area
                        }        // last bracket loop while x
                    }           // last bracket for if (btn.equals("Surface"))
           if (btn.equals("Volume"))
           {
               byte x = 1;
               while(x == 1)
               {
                   String typeOfUserPermiters = JOptionPane.showInputDialog(" Please choose one option\n\n 	1. Volume of Cylinder \n 	2. Volume of Cone \n"+
                                                                            " 	3. Volume of Sphere \n ");
                   char choicePermiter = typeOfUserPermiters.charAt(0);
                   switch (choicePermiter)
                   {
                       case '1':
                           String hight = JOptionPane.showInputDialog("Please enter the side hight of the Cylinder ?");
                           String radious = JOptionPane.showInputDialog("Please enter the radious of the Base ?");
                           float hightAsFloat = Float.parseFloat(hight);
                           float radiousAsFloat = Float.parseFloat(radious);
                           JOptionPane.showMessageDialog(null,"The Volume of Cylinder\n\nSide hight          "+String.format("%.2f",hightAsFloat)+ " cm "+
                                                         "\nRadious of Base "+String.format("%.2f",radiousAsFloat)+
                                                         " cm \n                                  = "+String.format("%.2f",VolumeOfCylinder(radiousAsFloat,hightAsFloat))+
                                                         " cm3","Volume of Cylinder",JOptionPane.INFORMATION_MESSAGE);
                           x = 0;
                           break;
                           
                        case '2':
                           String radiousCone = JOptionPane.showInputDialog("Please enter the radious of the Base ?");
                           String hightCone = JOptionPane.showInputDialog("Please enter the side hight of the Cone ?");
                           float radiousConeAsFloat = Float.parseFloat(radiousCone);
                           float hightConeAsFloat = Float.parseFloat(hightCone);
                           JOptionPane.showMessageDialog(null,"The Volume of Cone \n\nSide  lenght       "+String.format("%.2f",hightConeAsFloat)+ " cm "+
                                                         "\nRadious of Base "+String.format("%.2f",radiousConeAsFloat)+" cm\n                                      =    "+
																													String.format("%.2f",VolumeOfCone(radiousConeAsFloat,hightConeAsFloat))+
                                                         " cm3","Volume of Cone",JOptionPane.INFORMATION_MESSAGE);
                           x = 0;
                           break;
                        case '3':
                           String radiousSphere = JOptionPane.showInputDialog("Please enter the Radious of the Sphere ?");
                           double radiousAsFloatSphere = Float.parseFloat(radiousSphere);
                           JOptionPane.showMessageDialog(null,"The Volume of Sphere radious "+String.format("%.2f",radiousAsFloatSphere)+ " cm = "+
                                                         String.format("%.2f",VolumeOfSphere(radiousAsFloatSphere))+" cm3","Surface Area of the Sphere",JOptionPane.INFORMATION_MESSAGE);
                           x = 0;
                           break;
                       default:
                           JOptionPane.showMessageDialog(null, "Try again ","Wrong choice",JOptionPane.ERROR_MESSAGE);
                    }// last bracket for while volume
                } // last bracket for while x button Volume
           } // last bracket for if Volume button
           if (btn.equals("Tax calculator"))
           {
                // Declartion and initalisation of variables
               String GrossIncom, typeOfUser ;
               String welcome = "Your income is:                            ";
               float  GrossIncomFloat;
               final float single = 34550.00f, MarriedOneIncome = 43550.00f, Married = 69100.00f, OneParentFamily = 38550.00f;
               final float taxLow = 0.20f, taxHight = 0.40f;
               float baseHight, tax, netto;
               float lowTax=0, hightTax=0;

               byte x = 1;
               byte k = 1;

               while (x <= 4)
               {
                   typeOfUser = JOptionPane.showInputDialog( "This Program Count Tax on the base annual revenue"+
                           "  \n\n - Please let me know who you are -"+
                           "\n\n       1. Single Person"+
                           "\n       2. Married One Income"+
                           "\n       3. Married"+
                           "\n       4. One Parent Family"+
                           "\n\n				-->  5. STOP The Program"+
                           "\n\n");
                   // conversion variables for switch
                   char choice;
                   choice = typeOfUser.charAt(0);

                   switch(choice) // programm is start here
                   {
                       case '5':
                           String shureString;
                           shureString = JOptionPane.showInputDialog( "          Are you Sure.. \n***  STOP the program ?   ***\n\n\"Y\" Yes      \"N\" No"+"\n ");
                           char shure;
                           shure = shureString.charAt(0);
                           if (shure == 'y' || shure == 'Y')
                           {
                               x=5;
                               k=3;
                               break;
                           }
                           k=10;
                           x = 1;
                           break;


                       case '1':
                           GrossIncom = JOptionPane.showInputDialog( "Please enter your GROSS Income   ' € ' ");
                           GrossIncomFloat = Float.parseFloat(GrossIncom);
                           if (GrossIncomFloat <= single) // checking the level income
                           {
                               tax    = GrossIncomFloat * taxLow;  // count tax
                               netto  = GrossIncomFloat - tax;     // count net
                               lowTax = tax;
                               x = 6;
                               k=1;
                           }
                           else // statment if income is higher than cut-OFF point for this person
                           {
                               baseHight = (GrossIncomFloat - single);    // base for tax 40%
                               hightTax  = (baseHight * taxHight);        // count for tax 40%
                               lowTax    =  single * taxLow;                 //count for tax 20%
                               tax       = lowTax  + hightTax ;               // sumarry of taxes
                               netto     = GrossIncomFloat - tax;            // incom netto
                               x = 6;
                               k =1;
                           }
                           JOptionPane.showMessageDialog(null,welcome + String.format("%.2f",GrossIncomFloat )+
                                   " €\nYour CUT-OFF point for \n        --> Single <-- is:                    " + single+
                                   " €\n\n* Your TAX  20%       =  " + String.format("%.2f",lowTax)+
                                   " €\n* Your TAX 40%        =  " +String.format("%.2f",hightTax) +
                                   " €\n\n* Your Sum of taxes       =  "+String.format("%.2f",tax)+
                                   " €\n\n* And your NET Income  =  "+String.format("%.2f",netto)+
                                   " €","TAX calculation FOR Single",JOptionPane.INFORMATION_MESSAGE);

                           break;
                       case '2':
                           GrossIncom = JOptionPane.showInputDialog( "Please enter your GROSS Income   ' € ' ");
                           GrossIncomFloat = Float.parseFloat(GrossIncom);
                           if (GrossIncomFloat <= MarriedOneIncome)
                           {
                               tax    = GrossIncomFloat * taxLow;
                               netto  = GrossIncomFloat - tax;
                               lowTax = tax;
                               x = 6;
                               k =1;
                           }
                           else    // statment if income is higher than cut-OFF point for this person
                           {
                               baseHight = (GrossIncomFloat - MarriedOneIncome);    // base for tax 40%
                               hightTax  = (baseHight * taxHight);        // count for tax 40%
                               lowTax    = single * taxLow;                 //count for tax 20%
                               tax       = lowTax  + hightTax ;               // summary of taxes
                               netto    = GrossIncomFloat - tax;            // income netto
                               x = 6;
                               k =1;
                           }
                           JOptionPane.showMessageDialog(null,welcome + String.format("%.2f",GrossIncomFloat )+
                                   " €\nYour CUT-OFF point for \n--> Married One Income <-- is:    " + MarriedOneIncome+
                                   " €\n\n* Your TAX  20%       =  " + String.format("%.2f",lowTax) +
                                   " €\n* Your TAX 40%        =  " +String.format("%.2f",hightTax) +
                                   " €\n\n* Your Sum of taxes       =  "+String.format("%.2f",tax)+
                                   " €\n\n* And your NET Income  =  "+String.format("%.2f",netto)+
                                   " €","TAX calculation FOR Married One Income",JOptionPane.INFORMATION_MESSAGE);
                           break;
                       case'3':
                           String wifeAsString, husbandAsString;
                           float wifeFloat, husbandFloat;
                           wifeAsString = JOptionPane.showInputDialog(" Please enter first ( wife ) income : "+"\n\n" );
                           wifeFloat = Float.parseFloat(wifeAsString);

                           husbandAsString = JOptionPane.showInputDialog(" Please enter second ( Husband ) income : "+"\n\n" );
                           husbandFloat = Float.parseFloat(husbandAsString);

                           GrossIncomFloat = wifeFloat + husbandFloat;
                           if (GrossIncomFloat <= Married)
                           {
                               tax     = GrossIncomFloat * taxLow;
                               netto   = GrossIncomFloat - tax;
                               lowTax  = tax;
                               x = 6;
                               k =1;
                           }
                           else                   // statment if income is higher than cut-OFF point for this person
                           {
                               baseHight = (GrossIncomFloat - Married);     // base for tax 40%
                               hightTax  = (baseHight * taxHight);          // count for tax 40%
                               lowTax    = single * taxLow;                 //count for tax 20%
                               tax       = lowTax  + hightTax ;             // summary of taxes
                               netto     = GrossIncomFloat - tax;           // income netto
                               x = 6;
                               k =1;
                           }
                           JOptionPane.showMessageDialog(null,"Your both Gross income = "+ String.format("%.2f",GrossIncomFloat )+
                                   " €\n\n        Wife income      = "+String.format("%.2f",wifeFloat)+"€"+"\nHusband Income       = "+
                                   String.format("%.2f",husbandFloat)+
                                   " €\n\nYour CUT-OFF point for \n   --> Married <--      =   " + Married+
                                   " €\n\n* Your TAX  20%       =  "+String.format("%.2f",lowTax)+ " €\n* Your TAX 40%        =  "+
                                   String.format("%.2f",hightTax) +
                                   " €\n\n* Your Sum of taxes       =  "+String.format("%.2f",tax)+
                                   " €\n\n* And your NET Income  =  "+String.format("%.2f",netto)+
                                   " €","TAX calculation FOR Married",JOptionPane.INFORMATION_MESSAGE);
                           break;
                       case'4':
                           GrossIncom = JOptionPane.showInputDialog( "Please enter your GROSS Income for OneParentFamily   ' € ' ");
                           GrossIncomFloat = Float.parseFloat(GrossIncom);
                           if (GrossIncomFloat <= OneParentFamily)
                           {
                               tax    = GrossIncomFloat * taxLow;
                               netto  = GrossIncomFloat - tax;
                               lowTax = tax;
                               x = 6;
                               k =1;
                           }
                           else      // statment if income is higher than cut-OFF point for this person
                           {
                               baseHight = (GrossIncomFloat - OneParentFamily);    // base for tax 40%
                               hightTax  = (baseHight * taxHight);        // count for tax 40%
                               lowTax    = single * taxLow;                 //count for tax 20%
                               tax       = lowTax  + hightTax ;               // sumarry of taxes
                               netto     = GrossIncomFloat - tax;            // income netto
                               x = 6;
                               k =1;
                           }
                           JOptionPane.showMessageDialog(null,welcome + String.format("%.2f",GrossIncomFloat )+
                                   " €\nYour CUT-OFF point for \n       --> OneParentFamily <-- is:   " + OneParentFamily+
                                   " €\n\n* Your TAX  20%       =  " + String.format("%.2f",lowTax) +
                                   " €\n* Your TAX 40%          =  " +String.format("%.2f",hightTax) +
                                   " €\n\n* Your Sum of taxes       =  "+String.format("%.2f",tax)+
                                   " €\n\n* And your NET Income  =  "+ String.format("%.2f",netto)
                                   +" €","TAX calculationFOR OneParentFamily",JOptionPane.INFORMATION_MESSAGE);
                           break;
                       default:    // it is for preven wrong enter number inside top MENU
                           JOptionPane.showMessageDialog(null, "Try again ","Wrong choice",JOptionPane.ERROR_MESSAGE);
                           break;
                   }

                   while (k <=2)
                   {
                       String finishAsString;
                       finishAsString = JOptionPane.showInputDialog(null,"\nDo you want to restart the program?\n\n\"Y\" Yes"+
                               "     \"N\" No ","Make desysion",JOptionPane.ERROR_MESSAGE);
                       char over;
                       over = finishAsString.charAt(0);

                       if (over =='y' || over == 'Y')
                       {
                           x = 1;
                           k = 3;
                       }
                       else if (over == 'N' || over == 'n')
                       {
                           x = 5;
                           k = 3;
                       }
                       else
                           JOptionPane.showMessageDialog(null, "Again next your mistake ?! ","Wrong choice",JOptionPane.ERROR_MESSAGE);
                   } // last bracket for swith k
               }// last bracket for loop while x
           } //last bracket for if btn tax calculator

         if (btn.equals("Call counter"))
         {
                 String ChiceVertex = ("You choice is service VERTEC");
                 String ChoiceErcom = ("You choice is service EIRCOM");
                 String TOTALCall = ("The total number of calls : ");
                 String vertec = ("Vartec  "), eircom=("Eircom ");
                 String Nmin = ("Number minutes to ");
                 String total = ("\nThe TOTAL cost of using the ");
                 String SERVICE = (" service for the month is : ");
                 String average = ("\nThe AVERAGE cost per minute  is ");
                 String minutes = ("\n\nPlease enter the number of minutes spent calling the");

                 String serviceString, callsUSA, callsAustralia, callsRussia;

                 final double Vusa= 0.6,  Vaus= 0.8,  Vruss= 0.24;      //Vartec Rate
                 final double Eusa= 0.19, Eaus= 0.85, Eruss= 0.92;    //Eircome Rate

                 double call_USA, call_Australia, call_Russia, totalCostVertex, totalCostEircom;
                 double averageCost, totalTime=0;
                 char service;
                 //  start program input  variable
                 serviceString = JOptionPane.showInputDialog("\nWhich service did you use for the calls? "+"\n\n   V - " +vertec +"\n   E - "+ eircom +"\n ");
                 service = serviceString.charAt(0);

                 if (service == 'V' || service == 'v')
                 {

                     callsUSA = JOptionPane.showInputDialog(ChiceVertex + minutes + " USA");

                     callsAustralia = JOptionPane.showInputDialog(ChiceVertex +"\n\n" +Nmin+ "USA is : " +callsUSA +" min  cost is "+Vusa+ " cents\\min\n"+ minutes + " Australia");

                     callsRussia = JOptionPane.showInputDialog(ChiceVertex + "\n\n"+Nmin+"USA is : "+callsUSA +" min  cost is "+Vusa+ " cents\\min\n"+Nmin+ "Australia is : "+callsAustralia +
                             " min  cost is "+Vaus+ " cents\\min\n"+ minutes+ " Russia");
                     // conversion input String to for math calculation
                     call_USA = Float.parseFloat(callsUSA);
                     call_Australia = Float.parseFloat(callsAustralia);
                     call_Russia = Float.parseFloat(callsRussia);
                     // calculation for all costs
                     totalCostVertex = (call_USA * Vaus) + (call_Australia * Vaus) + (call_Russia * Vruss);
                     averageCost = totalCostVertex / 60;
                     totalTime = (call_USA + call_Australia + call_Russia);

                     JOptionPane.showMessageDialog(null,ChiceVertex + "\n\n"+Nmin+ " USA         is : " +
                             callsUSA+ "\n" +Nmin+ " Australia is : " +callsAustralia +"\n"+Nmin + " Russia     is : " +callsRussia+
                             "\n" +total + String.format("%.2f",totalTime) +" min ' VERTEC '" + SERVICE + String.format("%.2f",totalCostVertex)+
                             " EUR"+ average + String.format("%.2f",averageCost)+" EUR","TOTAL and AVERAGE cost",JOptionPane.INFORMATION_MESSAGE);
                 }

                 else if (service == 'e' || service == 'E')

                 {
                     callsUSA = JOptionPane.showInputDialog(ChoiceErcom + "\n" + minutes + " USA");

                     callsAustralia = JOptionPane.showInputDialog(ChoiceErcom + "\n\n" +Nmin+"USA is : "+callsUSA +" min  cost is "+Eusa+ " cents\\min\n"+ minutes + " Australia");
                     callsRussia = JOptionPane.showInputDialog( ChoiceErcom + "\n"+"\n\n        "+ Nmin+"USA is : "+callsUSA +
                             " min  cost is "+Eusa+ " cents\\min\n" +Nmin+ "Australia is : "+callsAustralia+" min  cost is "+Eaus+
                             " cents\\min\n"+ minutes+ " Russia");
                     // conversion input String to for math calculation
                     call_USA = Float.parseFloat(callsUSA);
                     call_Australia = Float.parseFloat(callsAustralia);
                     call_Russia = Float.parseFloat(callsRussia);

                     totalCostEircom = ((call_USA * Eusa) + (call_Australia * Eaus) + (call_Russia * Eruss));
                     averageCost = totalCostEircom / 60;
                     totalTime = (call_USA + call_Australia + call_Russia);

                     JOptionPane.showMessageDialog(null,ChiceVertex + "\n\n"+Nmin+" USA         is : " + callsUSA+
                             "\n" +Nmin+ " Australia is : " +callsAustralia +"\n"+Nmin + " Russia     is : " +callsRussia+"\n" +total +
                             String.format("%.2f",totalTime) +" min ' EIRCOM '" + SERVICE + String.format("%.2f",totalCostEircom)+" EUR"+ average +
                             String.format("%.2f",averageCost)+" EUR","TOTAL and AVERAGE cost",JOptionPane.INFORMATION_MESSAGE);

                 }
                 else
                     JOptionPane.showMessageDialog(null," Sorry - incorrect choice, it must by  \n   V - Vartec  \n   E - Eircom "," WRONG DATA",JOptionPane.ERROR_MESSAGE);
         } // last bracket for btn call calculator

         if (btn.equals("NASA"))
         {
             byte i = 10;
             while (i>=1)
             {
                 if (i==8)
                     JOptionPane.showMessageDialog(null,"---> Ignition Sequence start \n","Counting down",JOptionPane.INFORMATION_MESSAGE);
                 else
                     JOptionPane.showMessageDialog(null,i + "  ...","Counting down",JOptionPane.INFORMATION_MESSAGE);
                 i --;
             }
             JOptionPane.showMessageDialog(null," \n    Engines are ready !! "+"\n\n        LIFTOFF"+"\n\n","",JOptionPane.INFORMATION_MESSAGE);
         } // last bracket for btn NASA
        if (btn.equals("Body ratio"))
        {
            // Declared variables
            String valuesWOM = "\nValue criterion: \n\t\tLOW:             0.80 or lower\nModerate:    0.81 - 0.85\nHIGH:            0.86 or higher";
            String labelWOM = "************************************\n        Health Risk for WOMEN\n************************************";
            String valuesMEN = "\nValue criterion:\nLOW:            0.95 or lower\nModerate:     0.96 - 1.0\nHIGH:           1.01 or higher";
            String labelMEN = "************************************\n        Health Risk for MEN\n************************************";
            String wast, hip, gender;
            float wastFlo, hipFlo, genderFlo;
            // Input  date from user variables
            wast = JOptionPane.showInputDialog("What is circumference your WAIST (cm): ");// Talia,pass
            hip = JOptionPane.showInputDialog("What is circumference your HIP (cm):: "); // Biodro
            gender = JOptionPane.showInputDialog(" -- Are You WOMEN or MEN? --\n========================\n\n 1. WOMEN"+"\n 2. MEN\n"+" "); // Plec,gender

            // Convertion string to float
            wastFlo = Float.parseFloat(wast);
            hipFlo =  Float.parseFloat(hip);
            genderFlo = Float.parseFloat(gender);

            // Calculation of Ratio
            float calculation = (wastFlo / hipFlo);

            if (genderFlo==1) // Output for women
                if (calculation >= 0.86 && genderFlo==1)
                    JOptionPane.showMessageDialog(null, labelWOM + "\n Your RATIO is; " +String.format("%.2f",calculation) + valuesWOM ,
                            " TOO HIGH !!!",JOptionPane.ERROR_MESSAGE);
            if (calculation >= 0.81 && calculation <= 0.85 && genderFlo==1)
                JOptionPane.showMessageDialog(null,labelWOM+ "\n Your RATIO is; " +String.format("%.2f",calculation) + ""+valuesWOM,
                        "VERY GOOD Bravo (-; ",JOptionPane.INFORMATION_MESSAGE);
            if (calculation <= 0.80 && genderFlo==1)
                JOptionPane.showMessageDialog(null,labelWOM +"\n Your RATIO is; " +String.format("%.2f",calculation) +
                        "\nEat more potatoes with rapeseed oil"+ valuesWOM,"TOO LOW !!!",JOptionPane.ERROR_MESSAGE);
            else if (genderFlo==2) // Output for men
                if (calculation >= 1.1 && genderFlo == 2)
                    JOptionPane.showMessageDialog(null,labelMEN+"\n Your RATIO is; " +String.format("%.2f",calculation) +
                            "\n\n"+valuesMEN,"TOO HIGH !!!",JOptionPane.ERROR_MESSAGE);
            if (calculation >= 0.96 && calculation <= 1.0 && genderFlo==2)
                JOptionPane.showMessageDialog(null,labelMEN + "\n Your RATIO is; " +String.format("%.2f",calculation) +
                        "\n\n"+ valuesMEN,"VERY GOOD Bravo (-; ",JOptionPane.INFORMATION_MESSAGE);
            if (calculation <= 0.95 && genderFlo==2)
                JOptionPane.showMessageDialog(null,labelMEN +"\n Your RATIO is; "+ String.format("%.2f",calculation) +
                        " \nEat more potatoes with rapeseed oil\n"+
                        valuesMEN,"TOO LOW !!!",JOptionPane.ERROR_MESSAGE);
        }  // last bracket for btn body ratio
       }   // last bracket for actionPerformed(ActionEvent e)

    }// class bracket

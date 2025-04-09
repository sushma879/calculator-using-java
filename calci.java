import java.awt.*;
import java.awt.event.*;
import java.util.*;
class A2  extends Frame implements ActionListener
{
       Button b1,b2,b3,b4;
       TextField t1,t2,t3;
       Label l1,l2,l3;
          
          
        
        
          A2(){
           b1=new Button("+");     
         b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        
        
        
       l1=new Label("Number1: ");
         l2=new Label("Number2: ");
         l3=new Label("result:");
        t1=new TextField();
       t2=new TextField();
           t3=new TextField();
          
         b1.addActionListener(this);
         b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        
        
        
        t1.setBounds(90,50,40,20);
        t2.setBounds(90,70,40,20);
        t3.setBounds(90,200,40,20);
        l1.setBounds(30,50,50,20);
        l2.setBounds(30,70,50,20);
        l3.setBounds(30,200,50,20);
        b1.setBounds(40,100,30,30);
        b2.setBounds(60,100,30,30);
        b3.setBounds(80,100,30,30);
        b4.setBounds(100,100,30,30);
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b3);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
        add(b4);
       setSize(600,600);
       setLayout(null);
       setVisible(true);
       }
      
        
   public static void main(String args[])
   {
       
        
        A2 a=new A2();
       
       
       
    }
    public void actionPerformed(ActionEvent e)
    {  
           try
           {
                   int a=Integer.parseInt(t1.getText());
                   int b=Integer.parseInt(t2.getText());
             
           int c=0;
           if(e.getSource()==b1)
               c=a+b;
           if(e.getSource()==b2)
               c=a-b;
           if(e.getSource()==b3)
               c=a*b;
           if(e.getSource()==b4)
               c=a/b;
           
           
             t3.setText(String.valueOf(c));
             }
             catch(ArithmeticException e1)
             {
                         System.out.println("cant divide by zero");
                  }
                  
                  catch(NumberFormatException e2)
                  {
                             System.out.println("please enter number");
                             
                          }
                          catch(InputMismatchException e3)
                          {
                                           System.out.println("input mismatch");
                                      }
                                      
                                      
       }
       
    
    
 }

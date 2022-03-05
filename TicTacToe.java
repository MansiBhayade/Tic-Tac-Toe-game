         
            import javax.swing.*;
            import java.awt.event.*;
            import java.awt.*;

        class A extends JFrame
        {
              JButton [] b = new JButton[9];
              JLabel l1 , l2;

              public A()
              {
                      super("Tic Tac Toe");   
                      setSize(300,300);
                      setLocation(500,150);
                      setResizable(false); 
                  setLayout(new GridLayout(3,3));
                  setDefaultCloseOperation(EXIT_ON_CLOSE);

                   for(int i=0 ; i<9 ; i++)
                   {
                        b[i] = new JButton();
                           add(b[i]);
                   }

                     b[0].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   

                                if(A.this.b[0].getText().equals(""))
                                {
                                      A.this.b[0].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                }
                         }
                    });

                     b[1].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[1].getText().equals(""))
                                {
                                      A.this.b[1].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                }
                         }  
                     });


                     b[2].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[2].getText().equals(""))
                                {
                                      A.this.b[2].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                 }                                
                         }  
                     });


                     b[3].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[3].getText().equals(""))
                                {
                                     A.this.b[3].setText("X");
                                      A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                 }                                
                         }  
                     });

                     b[4].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[4].getText().equals(""))
                                {
                                      A.this.b[4].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                 }                                
                         }  
                     });


                     b[5].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[5].getText().equals(""))
                                {
                                      A.this.b[5].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                 }                                
                         }  
                     });


                     b[6].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[6].getText().equals(""))
                                {
                                      A.this.b[6].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                }
                      }  
                     });

                     b[7].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[7].getText().equals(""))
                                {
                                      A.this.b[7].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                }
                         }  
                     });

                     b[8].addActionListener(new ActionListener()
                     {
                         public void actionPerformed(ActionEvent e)
                         {
                                   int i;
                                 boolean flag;   
                                if(A.this.b[8].getText().equals(""))
                                {
                                      A.this.b[8].setText("X");
                                        A.this.check('X');
                                        A.this.logic();
                                        A.this.check('O');
                                 }                                
                         }  
                     });

                      setVisible(true);
              }

  public void logic()
  {
      if(b[0].getText().equals(""))
      {
         if(b[1].getText().equals(b[2].getText()) && !b[1].getText().equals(""))
         {
             b[0].setText("O");return;      
         } 
         if(b[3].getText().equals(b[6].getText()) && !b[3].getText().equals(""))
         {
             b[0].setText("O");return;      
         }
         if(b[4].getText().equals(b[8].getText()) && !b[4].getText().equals(""))
         {
             b[0].setText("O");return;      
         }
      }

      if(b[1].getText().equals(""))
      {
         if(b[0].getText().equals(b[2].getText()) && !b[0].getText().equals(""))
         {
             b[1].setText("O");return;      
         } 
         if(b[4].getText().equals(b[7].getText()) && !b[4].getText().equals(""))
         {
             b[1].setText("O");return;      
         }
      }

      if(b[2].getText().equals(""))
      {
         if(b[0].getText().equals(b[1].getText()) && !b[0].getText().equals(""))
         {
             b[2].setText("O");return;      
         } 
         if(b[4].getText().equals(b[6].getText()) && !b[4].getText().equals(""))
         {
             b[2].setText("O");return;      
         }
         if(b[5].getText().equals(b[8].getText()) && !b[5].getText().equals(""))
         {
             b[2].setText("O");return;      
         }
      }

      if(b[3].getText().equals(""))
      {
         if(b[4].getText().equals(b[5].getText()) && !b[4].getText().equals(""))
         {
             b[3].setText("O");return;      
         } 
         if(b[0].getText().equals(b[6].getText()) && !b[0].getText().equals(""))
         {
             b[3].setText("O");return;      
         }
      }

      if(b[4].getText().equals(""))
      {
         if(b[3].getText().equals(b[5].getText()) && !b[3].getText().equals(""))
         {
             b[4].setText("O");return;      
         } 
         if(b[1].getText().equals(b[7].getText()) && !b[1].getText().equals(""))
         {
             b[4].setText("O");return;      
         }
         if(b[0].getText().equals(b[8].getText()) && !b[0].getText().equals(""))
         {
             b[4].setText("O");return;      
         }
      }

      if(b[5].getText().equals(""))
      {
         if(b[2].getText().equals(b[8].getText()) && !b[2].getText().equals(""))
         {
             b[5].setText("O");return;      
         } 
         if(b[3].getText().equals(b[4].getText()) && !b[3].getText().equals(""))
         {
             b[5].setText("O");return;      
         }
      }

      if(b[6].getText().equals(""))
      {
         if(b[3].getText().equals(b[0].getText()) && !b[3].getText().equals(""))
         {
             b[6].setText("O");return;      
         } 
         if(b[4].getText().equals(b[2].getText()) && !b[4].getText().equals(""))
         {
             b[6].setText("O");return;      
         }
         if(b[7].getText().equals(b[8].getText()) && !b[7].getText().equals(""))
         {
             b[6].setText("O");return;      
         }
      }

      if(b[7].getText().equals(""))
      {
         if(b[1].getText().equals(b[4].getText()) && !b[4].getText().equals(""))
         {
             b[7].setText("O");return;      
         } 
         if(b[6].getText().equals(b[8].getText()) && !b[6].getText().equals(""))
         {
             b[7].setText("O");return;      
         }
      }

      if(b[8].getText().equals(""))
      {
         if(b[2].getText().equals( b[5].getText()) && !b[2].getText().equals(""))
         {
             b[8].setText("O");return;      
         } 
         if(b[4].getText().equals(b[0].getText()) && !b[4].getText().equals(""))
         {
             b[8].setText("O");return;      
         }
         if(b[7].getText().equals(b[6].getText()) && !b[7].getText().equals(""))
         {
             b[8].setText("O");return;      
         }
      }

          if(b[6].getText().equals(""))
          {
             b[6].setText("O");return; 
          }
          if(b[8].getText().equals(""))
          {
             b[8].setText("O");return; 
          }
          if(b[0].getText().equals(""))
          {
             b[0].setText("O");return; 
          }
          if(b[2].getText().equals(""))
          {
             b[2].setText("O");return; 
          }
           if(b[4].getText().equals(""))
          {
             b[4].setText("O");return; 
          }
          if(b[3].getText().equals(""))
          {
             b[3].setText("O");return; 
          }
          if(b[5].getText().equals(""))
          {
             b[5].setText("O");return; 
          } 
          if(b[7].getText().equals(""))
          {
             b[7].setText("O");return; 
          }
 }                                            
                   public void check(char ch)
                   {
                        boolean flag=false;
                           int i,j;
                               
             if(!b[0].getText().equals("") && b[0].getText().equals(b[1].getText()) && b[0].getText().equals(b[2].getText()))
             {
                      flag = true;
             } 
             else if(b[0].getText()!="" && b[0].getText()==b[3].getText()&& b[0].getText()== b[6].getText())
             {
                      flag = true; 
             }
             else if(b[0].getText()!="" &&b[0].getText()==b[4].getText()&& b[0].getText()== b[8].getText())
             {
                      flag = true; 
             }

             else if(b[1].getText()!="" &&b[1].getText()==b[4].getText()&& b[1].getText()== b[7].getText())
             {
                      flag = true; 
             }

             else if(b[2].getText()!="" &&b[2].getText()==b[5].getText()&& b[2].getText()== b[8].getText())
             {
                      flag = true; 
             }
             else if(b[2].getText()!="" &&b[2].getText()==b[4].getText()&& b[2].getText()== b[6].getText())
             {
                      flag = true; 
             }
             

             else if(b[3].getText()!="" &&b[3].getText()==b[4].getText()&& b[3].getText()== b[5].getText())
             {
                      flag = true; 
             }
             else if(b[6].getText()!="" &&b[6].getText()==b[7].getText()&& b[6].getText()== b[8].getText())
             {
                      flag = true; 
             }

            if(flag)
            {                                           
                      if(ch=='X')
                      { 
    JOptionPane.showMessageDialog(A.this,"Congrats! You won","MESSAGE",JOptionPane.PLAIN_MESSAGE);
                      }
                      else if(ch=='O')
                      {  
  JOptionPane.showMessageDialog(A.this,"Computer won","MESSAGE",JOptionPane.PLAIN_MESSAGE);            
                      }
                           
                     System.exit(0);             
            }              

                   int count = 0;

                for(i=0 ; i<9 ; i++)
                {
                    if(b[i].getText().equals(""))
                    {
                       count++;
                    } 
                }     

                   if(count == 0)       
                   {
  JOptionPane.showMessageDialog(A.this,"GAME OVER!","MESSAGE",JOptionPane.PLAIN_MESSAGE);
                              System.exit(0);
                   }               
         }                  
        }
           
     public class TicTacToe
     {
         public static void main(String [] args)
         {	
                  new A();
         }
     }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbuyingprogram.troy;

/**
 *
 * @author troyd
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.Box;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CarBuyingProgramTroy extends JFrame implements ActionListener
{
  private JRadioButton lx, sport, Touring; 
  private JButton order;
  private JToggleButton useDealership;
  private JCheckBox cBlack, cblue, cRed;
  private ArrayList<String> top;
  private JTextField display;
    
    
  public CarBuyingProgramTroy()
  {
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(6, 6, 6, 6),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1)); // outside, 1 pixel thick

    
    lx = new JRadioButton("LX +$21,250");
    sport = new JRadioButton("Sport +$23,050");
    Touring = new JRadioButton("Touring +$28,300", true);

    ButtonGroup gr = new ButtonGroup();
    gr.add(lx);
    gr.add(sport);
    gr.add(Touring);
    
    
    
    
    

    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 10, 10));
    sizes.add(lx);
    sizes.add(sport);
    sizes.add(Touring);

    cBlack = new JCheckBox("Black");
    cblue = new JCheckBox("Blue");
    cRed = new JCheckBox("Molten Lava Pearl +$395");

    JPanel toppings  = new JPanel();
    toppings.setBorder(border);
    toppings.setLayout(new GridLayout(3, 1, 10, 10));
    toppings.add(cBlack);
    toppings.add(cblue);
    toppings.add(cRed);
    
    order = new JButton("Order");
    useDealership = new JToggleButton("buy at dealership", false);
    
    order.addActionListener(this);
    
    display = new JTextField(10);
    display.setBackground(Color.yellow);
    display.setEditable(false);
    
    JPanel disp = new JPanel();
    disp.setBorder(border);
    disp.setLayout(new GridLayout(1,2,10,10));
    disp.add(display);
    
    
    JPanel buttons = new JPanel();
    buttons.setBorder(border);
    buttons.setLayout(new GridLayout(3,1,10,10));
    buttons.add(useDealership);
    buttons.add(order);
    
    
   
    

    Box hbox = Box.createHorizontalBox();
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(sizes);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(toppings);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(buttons);
    hbox.add(Box.createHorizontalStrut(10));
   
    Box vbox = Box.createVerticalBox();
    vbox.add(Box.createVerticalStrut(5));
    vbox.add(disp);
    
  
    
    
    

    Container c = getContentPane();
    c.setLayout(new GridLayout(2,1, 10,10));
    c.add(hbox, BorderLayout.NORTH);
    c.add(vbox, BorderLayout.CENTER);
    
  }
  
   public void actionPerformed(ActionEvent e)
   {
       JButton click = (JButton)e.getSource();
       String size = "";
       int price = 0;
       top = new ArrayList<>();
       
       
       if(lx.isSelected())
       {
           size = "2021 Civic LX Sedan";
           price = 21250;
       }
       else if(sport.isSelected())
       {
           size= "2021 Civic Sport Sedan";
           price = 23050;
       }
       else 
       {
           size = "2021 Civic Touring Sedan";
           price = 28300;
       }
       
       if(cBlack.isSelected())
           top.add("Black");
       if(cblue.isSelected())
           top.add("Blue");
       if(cRed.isSelected())
       {
           top.add("Molten Lava Pearl");
           price = price+395;
       }
       
       String tops = "";
       
       for(String t : top)
           tops = tops + t + " ";
       
       String pizza = "You ordered a " + size + " in " + tops + "for: $" + price;       
       
       if(click == order)
       {
           display.setText("small");
           JOptionPane.showMessageDialog(CarBuyingProgramTroy.this, pizza);
       }
       
      
   }

  public static void main(String[] args)
  {
    CarBuyingProgramTroy window = new CarBuyingProgramTroy();
    window.setBounds(100, 100, 500, 300);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
    
  }
}
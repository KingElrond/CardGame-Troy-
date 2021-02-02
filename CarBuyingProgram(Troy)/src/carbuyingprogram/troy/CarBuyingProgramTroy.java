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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CarBuyingProgramTroy extends JFrame implements ActionListener
{
  private JRadioButton lx, sport, touring; 
  private JButton order, updateimg;
  private JToggleButton useDealership;
  private JRadioButton cBlack, cblue, cRed;
  private ArrayList<String> top;
  private JTextArea display;
  private JLabel img;
  private ImageIcon LXBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXBlue.jpeg");
  private ImageIcon LXWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXWhite.jpeg");
  private ImageIcon LXBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXBlack.jpeg");
  private ImageIcon SportBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportBlack.jpeg");
  private ImageIcon SportBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportBlue.jpeg");
  private ImageIcon SportWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportWhite.jpeg");
  private ImageIcon TBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\TBlue.jpeg");
  private ImageIcon TWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\Tpwp.jpeg");
  private ImageIcon TBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\TBlack.jpeg");
  
  public CarBuyingProgramTroy()
  {
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(6, 6, 6, 6),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1)); // outside, 1 pixel thick

    
    lx = new JRadioButton("LX +$21,250", true);
    sport = new JRadioButton("Sport +$23,050");
    touring = new JRadioButton("Touring +$28,300");

    ButtonGroup gr = new ButtonGroup();
    gr.add(lx);
    gr.add(sport);
    gr.add(touring);
    
    
    
    
    

    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 10, 10));
    sizes.add(lx);
    sizes.add(sport);
    sizes.add(touring);

    cBlack = new JRadioButton("Black");
    cblue = new JRadioButton("Blue", true);
    cRed = new JRadioButton("Platinum Pearl White +$395");

    ButtonGroup co = new ButtonGroup();
    co.add(cBlack);
    co.add(cblue);
    co.add(cRed);
    
    JPanel toppings  = new JPanel();
    toppings.setBorder(border);
    toppings.setLayout(new GridLayout(3, 1, 10, 10));
    toppings.add(cBlack);
    toppings.add(cblue);
    toppings.add(cRed);
    
    order = new JButton("Order");
    useDealership = new JToggleButton("buy at dealership", false);
    updateimg = new JButton("update img preview");
    
    order.addActionListener(this);
    updateimg.addActionListener(this);
    
    display = new JTextArea(10,10);
    display.setBackground(Color.yellow);
    display.setEditable(false);
    
    img = new JLabel();
    img.setIcon(LXBlue);
    img.setOpaque(true);
    
    JPanel disp = new JPanel();
    disp.setBorder(border);
    disp.setLayout(new GridLayout(1,2,10,10));
    disp.add(img);
    disp.add(display);
    
    JPanel buttons = new JPanel();
    buttons.setBorder(border);
    buttons.setLayout(new GridLayout(3,1,10,10));
    buttons.add(useDealership);
    buttons.add(order);
    buttons.add(updateimg);
    
    
   
    

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
       int sizeprice = 0;
       String tops = "";
       int price = 0;
       int topsprice = 0;
       top = new ArrayList<>();
       
       
       if(lx.isSelected())
       {
           size = "2021 Civic LX Sedan";
           price = 21250;
           sizeprice = 21250;
       }
       else if(sport.isSelected())
       {
           size= "2021 Civic Sport Sedan";
           price = 23050;
           sizeprice = 23050;
       }
       else 
       {
           size = "2021 Civic Touring Sedan";
           price = 28300;
           sizeprice = 28300;
       }
       
       if(cBlack.isSelected())
       {
           top.add("Black");
           if(lx.isSelected())
           {
           img.setIcon(LXBlack);
           }
           if(sport.isSelected())
           {
           img.setIcon(SportBlack);
           }
           if(touring.isSelected())
           {
               img.setIcon(TBlack);
           }
       }
       else if(cblue.isSelected())
       {
           top.add("Blue");
           if(lx.isSelected())
           {
           img.setIcon(LXBlue);
           }
           if(sport.isSelected())
           {
               img.setIcon(SportBlue);
           }
           if(touring.isSelected())
           {
               img.setIcon(TBlue);
           }
        }
       else if(cRed.isSelected())
       {
           if(lx.isSelected())
           {
           img.setIcon(LXWhite);
           }
           if(sport.isSelected())
           {
               img.setIcon(SportWhite);
           }
           if(touring.isSelected())
           {
               img.setIcon(TWhite);
           }
          top.add("Platinum Pearl White");
           price = price+395;
           topsprice = 395;
       }
       
       
       
       for(String t : top)
           tops = tops + t + " ";
       
       String pizza = "You ordered a " + size + " in " + tops + "for: $" + price;       
       
       if(click == order)
       {
           
           
           JOptionPane.showMessageDialog(CarBuyingProgramTroy.this, pizza);
       } else if(click == updateimg)
       {
           display.setText(size + " $" + sizeprice + "\n" + tops + " $" + topsprice + "\nTotal: $" + price);
           JOptionPane.showMessageDialog(CarBuyingProgramTroy.this, "Image preview Updated");
           
       }
       
      
   }

  public static void main(String[] args)
  {
    CarBuyingProgramTroy window = new CarBuyingProgramTroy();
    window.setBounds(100, 100, 550, 300);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(true);
    window.setVisible(true);
    
  }
}
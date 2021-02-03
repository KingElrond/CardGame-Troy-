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
  private JButton order, updateimg, stupidpreventerrorthing;
  private JToggleButton useDealership, Nopak;
  private JRadioButton cBlack, cblue, cRed;
  private JCheckBox RGBk, ASPPII, PP;
  private ArrayList<String> top;
  private JTextArea display;
  private JLabel img, pimg, pimg2, pimg3;
  private ImageIcon LXBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXBlue.jpeg");
  private ImageIcon LXWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXWhite.jpeg");
  private ImageIcon LXBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\LXBlack.jpeg");
  private ImageIcon SportBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportBlack.jpeg");
  private ImageIcon SportBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportBlue.jpeg");
  private ImageIcon SportWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\SportWhite.jpeg");
  private ImageIcon TBlue = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\TBlue.jpeg");
  private ImageIcon TWhite = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\Tpwp.jpeg");
  private ImageIcon TBlack = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\TBlack.jpeg");
  private ImageIcon RGBkit = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\RGB.jpeg");
  private ImageIcon ASPP = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\ASPP.jpeg");
  private ImageIcon PPimg = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\PP.jpeg");
  private ImageIcon Nopakimg = new ImageIcon("C:\\Users\\troyd\\OneDrive\\Documents\\NetBeansProjects\\CarBuyingProgramGUI-Troy-\\CarBuyingProgram(Troy)\\src\\Nopak.jpeg");
  
  
  public CarBuyingProgramTroy()
  {
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(6, 6, 6, 6),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1)); // outside, 1 pixel thick

    
    lx = new JRadioButton("LX +$21,250", true);
    sport = new JRadioButton("Sport +$23,050");
    touring = new JRadioButton("Touring +$28,300");

    lx.addActionListener(this);
    sport.addActionListener(this);
    touring.addActionListener(this);
    
    ButtonGroup gr = new ButtonGroup();
    gr.add(lx);
    gr.add(sport);
    gr.add(touring);
    
    RGBk = new JCheckBox("Red Interior Illumination Kit +$1,060");
    ASPPII = new JCheckBox("All-Season ProPack II +$344");
    PP = new JCheckBox("Protection Package +$287");
    Nopak = new JToggleButton("No packages +$0", true);
    stupidpreventerrorthing = new JButton();
    Nopak.addActionListener(this);
    RGBk.addActionListener(this);
    ASPPII.addActionListener(this);
    PP.addActionListener(this);
    stupidpreventerrorthing.addActionListener(this);

    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 10, 10));
    sizes.add(lx);
    sizes.add(sport);
    sizes.add(touring);

    cBlack = new JRadioButton("Black");
    cblue = new JRadioButton("Blue", true);
    cRed = new JRadioButton("Platinum Pearl White +$395");
    
    cBlack.addActionListener(this);
    cblue.addActionListener(this);
    cRed.addActionListener(this);

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
    
    pimg = new JLabel();
    pimg.setIcon(Nopakimg);
    pimg.setOpaque(true);
    
    pimg2 = new JLabel();
    pimg2.setIcon(Nopakimg);
    pimg2.setOpaque(true);
    
    pimg3 = new JLabel();
    pimg3.setIcon(Nopakimg);
    pimg3.setOpaque(true);
    
    JPanel disp = new JPanel();
    disp.setBorder(border);
    disp.setLayout(new GridLayout(1,2,10,10));
    disp.add(img);
    disp.add(pimg);
    disp.add(pimg2);
    disp.add(pimg3);
    disp.add(display);
    
    JPanel buttons = new JPanel();
    buttons.setBorder(border);
    buttons.setLayout(new GridLayout(3,1,10,10));
    buttons.add(useDealership);
    buttons.add(order);
    buttons.add(updateimg);
    
    JPanel packages  = new JPanel();
    packages.setBorder(border);
    packages.setLayout(new GridLayout(3, 1, 10, 10));
    packages.add(ASPPII);
    packages.add(RGBk);
    packages.add(PP);
    packages.add(Nopak);
    

    Box hbox = Box.createHorizontalBox();
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(sizes);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(toppings);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(packages);
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
       JButton click = stupidpreventerrorthing;
       boolean isc2 = true;
       try
       {
       click = (JButton)e.getSource();
       } catch(Exception ee)
            {
                try
                {
                  JToggleButton click2 = (JToggleButton)e.getSource();
                } catch(Exception eee)
                {
                    isc2 = false;
                    System.err.println("ignore this. also exception: " + eee + "occurred.");
                }
                System.err.println("ignore this. also exception: " + ee + "occurred.");
            }
       int counter = 0;
       String size = "";
       String FullOrder = "";
       int sizeprice = 0;
       String color = "";
       String tops = "";
       int price = 0;
       int topsprice = 0;
       int fprice1 = 0, fprice2 = 0, fprice3 = 0;
       boolean bnopak = false;
       top = new ArrayList<>();
       
       if(Nopak.isSelected())
        {
            RGBk.setSelected(false);
            ASPPII.setSelected(false);
            PP.setSelected(false);
            top.clear();
            bnopak = true;
        } else if(!Nopak.isSelected())
        {
            bnopak = false;
            isc2 = false;
        }
       
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
           color = "Black";
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
           color = "Blue";
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
          color = "Platinum Pearl White";
           price = price+395;
           topsprice = 395;
       }
      
        pimg.setIcon(Nopakimg);
        pimg2.setIcon(Nopakimg);
        pimg3.setIcon(Nopakimg);
       
       if(ASPPII.isSelected())
       {
           top.add("All-Season ProPack II");
           pimg.setIcon(ASPP);
           counter++;
           price = price+344;
           fprice1 = 344;
       }
       if(PP.isSelected())
       {
           top.add("Protection Package");
           price = price+287;
           if(counter == 0)
           {
               pimg.setIcon(PPimg);
               fprice1 = 287;
           } else
           {
               pimg2.setIcon(PPimg);
               fprice2 = 287;
           }
        counter++;
       }
       if(RGBk.isSelected())
       {
           top.add("Red Interior Illumination Kit");
           price = price+1060;
           switch (counter) {
               case 0:
                   pimg.setIcon(RGBkit);
                   fprice1 = 1060;
                   break;
               case 1:
                   pimg2.setIcon(RGBkit);
                   fprice2 = 1060;
                   break;
               case 2:
                   pimg3.setIcon(RGBkit);
                   fprice3 = 1060;
                   break;
               default:
                   break;
           }
       }
       
       for(String t : top)
           tops = tops + t + ", ";
       
       String OrderDialogBoxText = "You ordered a " + size + " in " + color + " with " + tops + "for: $" + price;       
       
       FullOrder= size + " $" + sizeprice + "\n" + color + " $" + topsprice + "\n";
    if(counter>0 || !Nopak.isSelected())   
    {   
       for(int r = 0; r <top.size(); r++)
       {
           String f = top.get(r);
           int currentpakprice = 0;
           switch (f) {
               case "All-Season ProPack II":
                   currentpakprice = fprice1;
                   break;
               case "Protection Package":
                   currentpakprice = 287;
                   break;
               case "Red Interior Illumination Kit":
                   currentpakprice = 1060;
                   break;
               default:
                   break;
           }
           FullOrder = FullOrder + f + " $" + currentpakprice + "\n";
       }
    } else
    {
        tops = "No Packages";
        OrderDialogBoxText = "You ordered a " + size + " in " + color + " with " + tops + " for: $" + price;
    }
       
       FullOrder = FullOrder + "Total: $" + price;
       
       
       if(click == order)
       {
           if(useDealership.isSelected())
           {
               OrderDialogBoxText = OrderDialogBoxText + "\nGo to dealership to pay for and recieve Vehicle.";
           }
           JOptionPane.showMessageDialog(CarBuyingProgramTroy.this, OrderDialogBoxText);
       } else if(click == updateimg)
       {
           display.setText(FullOrder);
           JOptionPane.showMessageDialog(CarBuyingProgramTroy.this, "Image preview Updated");
           
       } else if(click == stupidpreventerrorthing)
       {
           display.setText(FullOrder);
       }
       
      display.setText(FullOrder);
   }

  public static void main(String[] args)
  {
    CarBuyingProgramTroy window = new CarBuyingProgramTroy();
    window.setBounds(100, 100, 1050, 300);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(true);
    window.setVisible(true);
    
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author hp
 */
public class HomeView extends javax.swing.JFrame {
    public static ArrayList<Order>Order=new ArrayList<Order>();

    ArrayList<Dishe>dishee=new ArrayList<Dishe>();
      public static ArrayList<Dishe>dishe_Payment=new ArrayList<Dishe>();
                 JLabel[] menuLabels=new JLabel[5];
                 JLabel[] menuLabels2=new JLabel[3];
                 JLabel[] nameLabels=new JLabel[6];
                 JLabel[] priceLabels=new JLabel[6];
                 
                 JLabel[] pricetotal=new JLabel[6];


    JPanel[] panels =new JPanel[6];
JTextField[] jtext=new JTextField[6];
JSpinner[] jspinner=new JSpinner[6];

JLabel[] nameorder=new JLabel[6];
JLabel[] priceorder=new JLabel[6];
   JPanel[] panels_order =new JPanel[6];


 Border default_border =BorderFactory.createMatteBorder(0, 0, 1, 0, new Color (242,242,242));
    
Border yellow_border =BorderFactory.createMatteBorder(0, 0, 1, 0, new Color (255,153,51));
Border default_border2 =BorderFactory.createMatteBorder(1, 1, 1, 1, new Color (242,242,242));
    
Border yellow_border2 =BorderFactory.createMatteBorder(1, 1, 1, 1, new Color (255,153,51));

    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();

jtext[0]=jTextField3;  
jtext[1]=jTextField4;        
jtext[2]=jTextField5;        
jtext[3]=jTextField6;        
jtext[3]=jTextField8;        
jtext[3]=jTextField7;        

jspinner[0]=jSpinner2;
jspinner[1]=jSpinner3;
jspinner[2]=jSpinner4;
jspinner[3]=jSpinner5;
jspinner[4]=jSpinner7;
jspinner[5]=jSpinner6;

        
menuLabels[0]=l1; 
menuLabels[1]=l2; 
menuLabels[2]=l3; 
menuLabels[3]=l4; 
menuLabels[4]=l5;

menuLabels2[0]=i1; 
menuLabels2[1]=i2; 
menuLabels2[2]=i3;

priceLabels[0]=lprice1;
priceLabels[1]=lprice2;
priceLabels[2]=lprice3;
priceLabels[3]=lprice4;
priceLabels[4]=lprice6;
priceLabels[5]=lprice5;

pricetotal[0]=jLabel47;
pricetotal[1]=jLabel72;
pricetotal[2]=jLabel76;
pricetotal[3]=jLabel80;
pricetotal[4]=jLabel77;
pricetotal[5]=jLabel81;



nameLabels[0]=lname1;
nameLabels[1]=lname2;
nameLabels[2]=lname3;
nameLabels[3]=lname4;
nameLabels[4]=lname6;
nameLabels[5]=lname5;


//panel
panels[0]=jPanel11;
panels[1]=jPanel12;
panels[2]=jPanel13;
panels[3]=jPanel14;
panels[4]=jPanel16;
panels[5]=jPanel15;

nameorder[0]=dn1;
nameorder[1]=dn2;
nameorder[2]=dn3;
nameorder[3]=dn4;
nameorder[4]=dn5;
nameorder[5]=dn6;


priceorder[0]=dp1;
priceorder[1]=dp2;
priceorder[2]=dp3;
priceorder[3]=dp4;
priceorder[4]=dp5;
priceorder[5]=dp6;

panels_order[0]=p1;
panels_order[1]=p2;
panels_order[2]=p3;
panels_order[3]=p4;
panels_order[4]=p5;
panels_order[5]=p6;


addActionToMenuLabels();
addActionToMenuLabels2();
showPanel();
Order();
    }
    
    
    
     public void showPanel(){
        for(JPanel pnl:panels)
        {
            pnl.setVisible(false);
        }
        for(JPanel pnl:panels_order)
        {
            pnl.setVisible(false);
        }
             for(int i=0;i<dishe_Payment.size();i++){
                 dishee.remove(i);
                 dishe_Payment.remove(i);
             }
        
           }
     
        public void tott(){
            double t=0;
            for(int i=0;i<dishee.size();i++){
              double price1=Double.parseDouble(pricetotal[i].getText());
                   t+=price1;   
                totall.setText(""+t);

            }
            
        }
     
     public void setLabelBackround(JLabel label){
      for (JLabel menu : menuLabels){
          menu.setForeground(Color.WHITE);
      }  
          label.setForeground(new Color(255,153,51));
      }  
      public void setLabelBackround2(JLabel label){
      for (JLabel menu : menuLabels2){
          menu.setForeground(Color.WHITE);
      }  
          label.setForeground(new Color(255,153,51));
      }  
     public void addActionToMenuLabels(){
   Component[] components=jPanel7.getComponents();
           for(Component component:components){
               if(component instanceof JLabel ){
                   JLabel label=(JLabel) component;
                   
                   label.addMouseListener(new MouseListener() {
                       public void mouseClicked(MouseEvent e) {
                           setLabelBackround( label);
                          
                       }

                       @Override
                       public void mousePressed(MouseEvent e) {
                       }

                       @Override
                       public void mouseReleased(MouseEvent e) {
                       }

                       @Override
                       public void mouseEntered(MouseEvent e) {
                           label.setBorder(yellow_border);
                       }

                       @Override
                       public void mouseExited(MouseEvent e) {
                           label.setBorder(default_border);

                       }
                   });
                   
               }
                   }
    }
 public void addActionToMenuLabels2(){
   Component[] components=jPanel8.getComponents();
           for(Component component:components){
               if(component instanceof JLabel ){
                   JLabel label=(JLabel) component;
                   
                   label.addMouseListener(new MouseListener() {
                       public void mouseClicked(MouseEvent e) {
                           setLabelBackround2( label);
                          
                       }

                       @Override
                       public void mousePressed(MouseEvent e) {
                       }

                       @Override
                       public void mouseReleased(MouseEvent e) {
                       }

                       @Override
                       public void mouseEntered(MouseEvent e) {
                           label.setBorder(yellow_border2);
                       }

                       @Override
                       public void mouseExited(MouseEvent e) {
                           label.setBorder(default_border2);

                       }
                   });
                   
               }
                   }
    }
 public void Order(){
     
     for(int i=0;i<Order.size();i++){
         
         nameorder[i].setText(Order.get(i).getname());
         priceorder[i].setText(""+Order.get(i).getprice());
         panels_order[i].setVisible(true);
     }}
 
        
          
 
 public void Buy(){

     for(int i=0;i<dishee.size();i++){
         
         nameLabels[i].setText(dishee.get(i).getname());
         priceLabels[i].setText(""+dishee.get(i).getprice());
         pricetotal[i].setText(""+dishee.get(i).getprice());
         
         panels[i].setVisible(true);
         
        
       tott();
     }}
 
     public void Deleltd(String name){
     for(int i=0;i<dishee.size();i++){
         if(dishee.get(i).getname().equals(name)){
         dishee.remove(i);
     }}
 }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        dn1 = new javax.swing.JLabel();
        dp1 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        dn2 = new javax.swing.JLabel();
        dp2 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        dn3 = new javax.swing.JLabel();
        dp3 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        dn5 = new javax.swing.JLabel();
        dp5 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        dn6 = new javax.swing.JLabel();
        dp6 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        dn4 = new javax.swing.JLabel();
        dp4 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        totall = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lname1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        lprice1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lname2 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        lprice2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lname3 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSpinner4 = new javax.swing.JSpinner();
        lprice3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lname4 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSpinner5 = new javax.swing.JSpinner();
        lprice4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lname5 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSpinner6 = new javax.swing.JSpinner();
        lprice5 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lname6 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSpinner7 = new javax.swing.JSpinner();
        lprice6 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        i1 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(27, 34, 94));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(27, 34, 94));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("An-Najah Rest");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 220, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tuesday,23 May 2023");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 70, 160, 23);

        jTextField1.setBackground(new java.awt.Color(60, 65, 109));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(280, 30, 300, 40);
        jTextField1.getAccessibleContext().setAccessibleName("");

        jButton1.setBackground(new java.awt.Color(27, 34, 94));
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(600, 30, 50, 40);

        jComboBox1.setBackground(new java.awt.Color(27, 34, 94));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine In", "To go", "Delivery" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(500, 190, 150, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(600, 110, 50, 50);

        jPanel7.setBackground(new java.awt.Color(27, 34, 94));
        jPanel7.setLayout(null);

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("Grill");
        l3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(l3);
        l3.setBounds(230, 10, 110, 50);

        l4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("Cold Dishes");
        l4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(l4);
        l4.setBounds(340, 10, 103, 50);

        l5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("Soup");
        l5.setToolTipText("");
        l5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(l5);
        l5.setBounds(430, 10, 100, 50);

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Appetizer");
        l2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(l2);
        l2.setBounds(140, 10, 103, 50);

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 153, 51));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Hot Dishes ");
        l1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(l1);
        l1.setBounds(-50, 10, 190, 50);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(40, 100, 560, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Choose Dishes");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 180, 190, 40);

        p1.setBackground(new java.awt.Color(12, 18, 62));
        p1.setAutoscrolls(true);
        p1.setLayout(null);

        dn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn1.setForeground(new java.awt.Color(255, 255, 255));
        dn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn1.setText("Spicy seasoned");
        dn1.setToolTipText("");
        p1.add(dn1);
        dn1.setBounds(10, 110, 140, 17);

        dp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp1.setForeground(new java.awt.Color(255, 255, 255));
        dp1.setText("2.7");
        dp1.setToolTipText("");
        p1.add(dp1);
        dp1.setBounds(20, 180, 60, 30);

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("20 Bowls available");
        jLabel85.setToolTipText("");
        p1.add(jLabel85);
        jLabel85.setBounds(20, 150, 140, 17);

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel86.setFocusCycleRoot(true);
        p1.add(jLabel86);
        jLabel86.setBounds(20, 10, 120, 80);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        p1.add(jButton9);
        jButton9.setBounds(100, 180, 50, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("$");
        p1.add(jLabel3);
        jLabel3.setBounds(0, 180, 20, 30);

        jPanel1.add(p1);
        p1.setBounds(50, 240, 160, 220);

        p2.setBackground(new java.awt.Color(12, 18, 62));
        p2.setAutoscrolls(true);
        p2.setLayout(null);

        dn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn2.setForeground(new java.awt.Color(255, 255, 255));
        dn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn2.setText("Salted Pasta");
        dn2.setToolTipText("");
        p2.add(dn2);
        dn2.setBounds(10, 100, 140, 40);

        dp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp2.setForeground(new java.awt.Color(255, 255, 255));
        dp2.setText("1.5");
        dp2.setToolTipText("");
        p2.add(dp2);
        dp2.setBounds(20, 180, 60, 30);

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("20 Bowls available");
        jLabel89.setToolTipText("");
        p2.add(jLabel89);
        jLabel89.setBounds(20, 150, 140, 17);

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel90.setFocusCycleRoot(true);
        p2.add(jLabel90);
        jLabel90.setBounds(20, 10, 120, 80);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        p2.add(jButton10);
        jButton10.setBounds(100, 180, 50, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("$");
        p2.add(jLabel4);
        jLabel4.setBounds(0, 180, 20, 30);

        jPanel1.add(p2);
        p2.setBounds(250, 240, 160, 220);

        p3.setBackground(new java.awt.Color(12, 18, 62));
        p3.setAutoscrolls(true);
        p3.setLayout(null);

        dn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn3.setForeground(new java.awt.Color(255, 255, 255));
        dn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn3.setText("Healthy noodle");
        dn3.setToolTipText("");
        p3.add(dn3);
        dn3.setBounds(10, 110, 140, 17);

        dp3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp3.setForeground(new java.awt.Color(255, 255, 255));
        dp3.setText("4.5");
        dp3.setToolTipText("");
        p3.add(dp3);
        dp3.setBounds(30, 180, 40, 30);

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 204, 204));
        jLabel93.setText("20 Bowls available");
        jLabel93.setToolTipText("");
        p3.add(jLabel93);
        jLabel93.setBounds(20, 150, 140, 17);

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel94.setFocusCycleRoot(true);
        p3.add(jLabel94);
        jLabel94.setBounds(20, 10, 120, 80);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        p3.add(jButton11);
        jButton11.setBounds(100, 180, 50, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("$");
        p3.add(jLabel6);
        jLabel6.setBounds(10, 180, 20, 30);

        jPanel1.add(p3);
        p3.setBounds(460, 240, 160, 220);

        p5.setBackground(new java.awt.Color(12, 18, 62));
        p5.setAutoscrolls(true);
        p5.setLayout(null);

        dn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn5.setForeground(new java.awt.Color(255, 255, 255));
        dn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn5.setText("Hot Spicy fried");
        dn5.setToolTipText("");
        p5.add(dn5);
        dn5.setBounds(10, 110, 140, 17);

        dp5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp5.setForeground(new java.awt.Color(255, 255, 255));
        dp5.setText("3.5");
        dp5.setToolTipText("");
        p5.add(dp5);
        dp5.setBounds(30, 180, 40, 30);

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setText("20 Bowls available");
        jLabel63.setToolTipText("");
        p5.add(jLabel63);
        jLabel63.setBounds(20, 150, 140, 17);

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel64.setFocusCycleRoot(true);
        p5.add(jLabel64);
        jLabel64.setBounds(20, 10, 120, 80);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        p5.add(jButton12);
        jButton12.setBounds(100, 180, 50, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("$");
        p5.add(jLabel21);
        jLabel21.setBounds(0, 180, 30, 30);

        jPanel1.add(p5);
        p5.setBounds(260, 490, 160, 220);

        p6.setBackground(new java.awt.Color(12, 18, 62));
        p6.setAutoscrolls(true);
        p6.setLayout(null);

        dn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn6.setForeground(new java.awt.Color(255, 255, 255));
        dn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn6.setText("Hot Spicy fried");
        dn6.setToolTipText("");
        p6.add(dn6);
        dn6.setBounds(20, 110, 140, 17);

        dp6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp6.setForeground(new java.awt.Color(255, 255, 255));
        dp6.setText("3.5");
        dp6.setToolTipText("");
        p6.add(dp6);
        dp6.setBounds(30, 180, 40, 30);

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 204, 204));
        jLabel65.setText("20 Bowls available");
        jLabel65.setToolTipText("");
        p6.add(jLabel65);
        jLabel65.setBounds(20, 150, 140, 17);

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel66.setFocusCycleRoot(true);
        p6.add(jLabel66);
        jLabel66.setBounds(20, 10, 120, 80);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        p6.add(jButton13);
        jButton13.setBounds(100, 180, 50, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("$");
        p6.add(jLabel22);
        jLabel22.setBounds(0, 180, 30, 30);

        jPanel1.add(p6);
        p6.setBounds(460, 490, 160, 220);

        p4.setBackground(new java.awt.Color(12, 18, 62));
        p4.setAutoscrolls(true);
        p4.setLayout(null);

        dn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dn4.setForeground(new java.awt.Color(255, 255, 255));
        dn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dn4.setText("Hot Spicy fried");
        dn4.setToolTipText("");
        p4.add(dn4);
        dn4.setBounds(20, 110, 140, 17);

        dp4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dp4.setForeground(new java.awt.Color(255, 255, 255));
        dp4.setText("3.5");
        dp4.setToolTipText("");
        p4.add(dp4);
        dp4.setBounds(30, 180, 40, 30);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setText("20 Bowls available");
        jLabel61.setToolTipText("");
        p4.add(jLabel61);
        jLabel61.setBounds(20, 150, 140, 17);

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel62.setFocusCycleRoot(true);
        p4.add(jLabel62);
        jLabel62.setBounds(20, 10, 120, 80);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart (2).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p4.add(jButton3);
        jButton3.setBounds(100, 180, 50, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("$");
        p4.add(jLabel7);
        jLabel7.setBounds(0, 180, 30, 30);

        jPanel1.add(p4);
        p4.setBounds(50, 490, 160, 220);

        jPanel9.setBackground(new java.awt.Color(12, 18, 62));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Orders");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(10, 30, 80, 32);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("#34562");
        jPanel9.add(jLabel35);
        jLabel35.setBounds(97, 35, 70, 22);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Item");
        jLabel39.setToolTipText("");
        jLabel39.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel9.add(jLabel39);
        jLabel39.setBounds(10, 150, 350, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Price");
        jPanel9.add(jLabel40);
        jLabel40.setBounds(310, 160, 60, 40);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Qty");
        jPanel9.add(jLabel41);
        jLabel41.setBounds(250, 170, 28, 20);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Sub total");
        jPanel9.add(jLabel50);
        jLabel50.setBounds(10, 620, 100, 40);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Discount");
        jPanel9.add(jLabel51);
        jLabel51.setBounds(10, 590, 100, 30);

        totall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totall.setForeground(new java.awt.Color(204, 204, 204));
        totall.setText("0");
        totall.setToolTipText("");
        jPanel9.add(totall);
        totall.setBounds(290, 620, 70, 30);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("0");
        jLabel53.setToolTipText("");
        jPanel9.add(jLabel53);
        jLabel53.setBounds(290, 590, 70, 30);

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Continue to Payment");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);
        jButton2.setBounds(50, 673, 290, 40);

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel9.add(jLabel54);
        jLabel54.setBounds(20, 560, 340, 20);

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setAutoscrolls(true);

        jPanel10.setBackground(new java.awt.Color(12, 18, 62));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jPanel11.setBackground(new java.awt.Color(12, 18, 62));
        jPanel11.setLayout(null);

        lname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname1.setForeground(new java.awt.Color(255, 255, 255));
        lname1.setText("Spicy seasoned");
        lname1.setToolTipText("");
        jPanel11.add(lname1);
        lname1.setBounds(90, 0, 140, 50);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("0");
        jLabel47.setToolTipText("");
        jPanel11.add(jLabel47);
        jLabel47.setBounds(260, 10, 60, 40);

        jTextField3.setBackground(new java.awt.Color(74, 88, 146));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setToolTipText("");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setName(""); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField3);
        jTextField3.setBounds(20, 80, 220, 30);

        jSpinner2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        jSpinner2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner2MouseClicked(evt);
            }
        });
        jPanel11.add(jSpinner2);
        jSpinner2.setBounds(180, 40, 60, 30);

        lprice1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice1.setForeground(new java.awt.Color(204, 204, 204));
        lprice1.setText("$2.29");
        lprice1.setToolTipText("");
        jPanel11.add(lprice1);
        lprice1.setBounds(110, 30, 40, 40);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton4);
        jButton4.setBounds(260, 70, 50, 40);

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel49.setFocusCycleRoot(true);
        jPanel11.add(jLabel49);
        jLabel49.setBounds(10, 10, 60, 60);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("$");
        jPanel11.add(jLabel8);
        jLabel8.setBounds(0, 180, 20, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("$");
        jPanel11.add(jLabel9);
        jLabel9.setBounds(0, 180, 20, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("$");
        jPanel11.add(jLabel13);
        jLabel13.setBounds(300, 10, 30, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("$");
        jPanel11.add(jLabel15);
        jLabel15.setBounds(80, 30, 30, 40);

        jPanel12.setBackground(new java.awt.Color(12, 18, 62));
        jPanel12.setLayout(null);

        lname2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname2.setForeground(new java.awt.Color(255, 255, 255));
        lname2.setText("Spicy seasoned");
        lname2.setToolTipText("");
        jPanel12.add(lname2);
        lname2.setBounds(90, 0, 140, 50);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setText("0");
        jLabel72.setToolTipText("");
        jPanel12.add(jLabel72);
        jLabel72.setBounds(260, 10, 60, 40);

        jTextField4.setBackground(new java.awt.Color(74, 88, 146));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setToolTipText("");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setName(""); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField4);
        jTextField4.setBounds(20, 80, 220, 30);

        jSpinner3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        jPanel12.add(jSpinner3);
        jSpinner3.setBounds(180, 40, 60, 30);

        lprice2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice2.setForeground(new java.awt.Color(204, 204, 204));
        lprice2.setText("$2.29");
        lprice2.setToolTipText("");
        jPanel12.add(lprice2);
        lprice2.setBounds(110, 30, 60, 40);

        jButton6.setBackground(new java.awt.Color(153, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6);
        jButton6.setBounds(260, 70, 50, 40);

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel74.setFocusCycleRoot(true);
        jPanel12.add(jLabel74);
        jLabel74.setBounds(10, 10, 60, 60);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("$");
        jPanel12.add(jLabel12);
        jLabel12.setBounds(80, 30, 30, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("$");
        jPanel12.add(jLabel16);
        jLabel16.setBounds(300, 10, 30, 30);

        jPanel13.setBackground(new java.awt.Color(12, 18, 62));
        jPanel13.setLayout(null);

        lname3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname3.setForeground(new java.awt.Color(255, 255, 255));
        lname3.setText("Spicy seasoned");
        lname3.setToolTipText("");
        jPanel13.add(lname3);
        lname3.setBounds(90, 0, 140, 50);

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 204, 204));
        jLabel76.setText("0");
        jLabel76.setToolTipText("");
        jPanel13.add(jLabel76);
        jLabel76.setBounds(260, 10, 60, 40);

        jTextField5.setBackground(new java.awt.Color(74, 88, 146));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setToolTipText("");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField5.setName(""); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField5);
        jTextField5.setBounds(20, 80, 220, 30);

        jSpinner4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        jPanel13.add(jSpinner4);
        jSpinner4.setBounds(180, 40, 60, 30);

        lprice3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice3.setForeground(new java.awt.Color(204, 204, 204));
        lprice3.setText("$2.29");
        lprice3.setToolTipText("");
        jPanel13.add(lprice3);
        lprice3.setBounds(110, 30, 60, 40);

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7);
        jButton7.setBounds(260, 70, 50, 40);

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel78.setFocusCycleRoot(true);
        jPanel13.add(jLabel78);
        jLabel78.setBounds(10, 10, 60, 60);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("$");
        jPanel13.add(jLabel14);
        jLabel14.setBounds(80, 30, 30, 40);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("$");
        jPanel13.add(jLabel17);
        jLabel17.setBounds(300, 10, 30, 30);

        jPanel14.setBackground(new java.awt.Color(12, 18, 62));
        jPanel14.setLayout(null);

        lname4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname4.setForeground(new java.awt.Color(255, 255, 255));
        lname4.setText("Spicy seasoned");
        lname4.setToolTipText("");
        jPanel14.add(lname4);
        lname4.setBounds(90, 0, 140, 50);

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(204, 204, 204));
        jLabel80.setText("0");
        jLabel80.setToolTipText("");
        jPanel14.add(jLabel80);
        jLabel80.setBounds(260, 10, 50, 40);

        jTextField6.setBackground(new java.awt.Color(74, 88, 146));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setToolTipText("");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField6.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.setName(""); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField6);
        jTextField6.setBounds(20, 80, 220, 30);

        jSpinner5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });
        jPanel14.add(jSpinner5);
        jSpinner5.setBounds(180, 40, 60, 30);

        lprice4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice4.setForeground(new java.awt.Color(204, 204, 204));
        lprice4.setText("$2.29");
        lprice4.setToolTipText("");
        jPanel14.add(lprice4);
        lprice4.setBounds(110, 30, 60, 40);

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8);
        jButton8.setBounds(260, 70, 50, 40);

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel82.setFocusCycleRoot(true);
        jPanel14.add(jLabel82);
        jLabel82.setBounds(10, 10, 60, 60);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("$");
        jPanel14.add(jLabel10);
        jLabel10.setBounds(80, 30, 20, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("$");
        jPanel14.add(jLabel18);
        jLabel18.setBounds(300, 10, 30, 40);

        jPanel15.setBackground(new java.awt.Color(12, 18, 62));
        jPanel15.setLayout(null);

        lname5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname5.setForeground(new java.awt.Color(255, 255, 255));
        lname5.setText("Spicy seasoned");
        lname5.setToolTipText("");
        jPanel15.add(lname5);
        lname5.setBounds(90, 0, 140, 50);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 204, 204));
        jLabel81.setText("0");
        jLabel81.setToolTipText("");
        jPanel15.add(jLabel81);
        jLabel81.setBounds(260, 10, 50, 40);

        jTextField7.setBackground(new java.awt.Color(74, 88, 146));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setToolTipText("");
        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField7.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.setName(""); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField7);
        jTextField7.setBounds(20, 80, 220, 30);

        jSpinner6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });
        jPanel15.add(jSpinner6);
        jSpinner6.setBounds(180, 40, 60, 30);

        lprice5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice5.setForeground(new java.awt.Color(204, 204, 204));
        lprice5.setText("$2.29");
        lprice5.setToolTipText("");
        jPanel15.add(lprice5);
        lprice5.setBounds(110, 30, 60, 40);

        jButton14.setBackground(new java.awt.Color(153, 0, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14);
        jButton14.setBounds(260, 70, 50, 40);

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel83.setFocusCycleRoot(true);
        jPanel15.add(jLabel83);
        jLabel83.setBounds(10, 10, 60, 60);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("$");
        jPanel15.add(jLabel23);
        jLabel23.setBounds(80, 30, 20, 40);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("$");
        jPanel15.add(jLabel24);
        jLabel24.setBounds(300, 10, 30, 40);

        jPanel16.setBackground(new java.awt.Color(12, 18, 62));
        jPanel16.setLayout(null);

        lname6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname6.setForeground(new java.awt.Color(255, 255, 255));
        lname6.setText("Spicy seasoned");
        lname6.setToolTipText("");
        jPanel16.add(lname6);
        lname6.setBounds(90, 0, 140, 50);

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(204, 204, 204));
        jLabel77.setText("0");
        jLabel77.setToolTipText("");
        jPanel16.add(jLabel77);
        jLabel77.setBounds(260, 10, 60, 40);

        jTextField8.setBackground(new java.awt.Color(74, 88, 146));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setToolTipText("");
        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField8.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.setName(""); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel16.add(jTextField8);
        jTextField8.setBounds(20, 80, 220, 30);

        jSpinner7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jSpinner7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });
        jPanel16.add(jSpinner7);
        jSpinner7.setBounds(180, 40, 60, 30);

        lprice6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lprice6.setForeground(new java.awt.Color(204, 204, 204));
        lprice6.setText("$2.29");
        lprice6.setToolTipText("");
        jPanel16.add(lprice6);
        lprice6.setBounds(110, 30, 60, 40);

        jButton15.setBackground(new java.awt.Color(153, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton15);
        jButton15.setBounds(260, 70, 50, 40);

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food3.jpg"))); // NOI18N
        jLabel79.setFocusCycleRoot(true);
        jPanel16.add(jLabel79);
        jLabel79.setBounds(10, 10, 60, 60);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("$");
        jPanel16.add(jLabel25);
        jLabel25.setBounds(80, 30, 30, 40);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("$");
        jPanel16.add(jLabel26);
        jLabel26.setBounds(300, 10, 30, 30);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel10);

        jPanel9.add(jScrollPane2);
        jScrollPane2.setBounds(10, 210, 360, 370);

        jPanel8.setBackground(new java.awt.Color(12, 18, 62));
        jPanel8.setLayout(null);

        i1.setBackground(new java.awt.Color(255, 102, 51));
        i1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i1.setForeground(new java.awt.Color(255, 153, 51));
        i1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i1.setText("Dine In");
        i1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        i1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel8.add(i1);
        i1.setBounds(0, 10, 90, 40);

        i3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i3.setForeground(new java.awt.Color(255, 255, 255));
        i3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i3.setText("Delivery");
        i3.setToolTipText("");
        i3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.add(i3);
        i3.setBounds(230, 10, 80, 40);

        i2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i2.setForeground(new java.awt.Color(255, 255, 255));
        i2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        i2.setText("To Go");
        i2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.add(i2);
        i2.setBounds(110, 10, 90, 40);

        jPanel9.add(jPanel8);
        jPanel8.setBounds(20, 80, 340, 50);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("$");
        jPanel9.add(jLabel19);
        jLabel19.setBounds(260, 580, 40, 50);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("$");
        jPanel9.add(jLabel20);
        jLabel20.setBounds(260, 610, 40, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int flg=0;
        
         for(int i=0;i<dishee.size();i++){
        if(dishee.get(i).getname().equals(dn1.getText())){
            flg=1;
        }}
         if(flg==0){
             double price1=Double.parseDouble(dp1.getText());
        Dishe di=new Dishe( 1,dn1.getText(), price1 );
        
         dishee.add(di);
         Buy();
         }
         else{
        String message = "You have purchased this Deshe  !";
        JOptionPane.showMessageDialog(null, message);
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int flg=0;
        
         for(int i=0;i<dishee.size();i++){
        if(dishee.get(i).getname().equals(dn2.getText())){
            flg=1;
        }}
         if(flg==0){   
                          double price1=Double.parseDouble(dp2.getText());

        Dishe di=new Dishe( 2,dn2.getText(),  price1);
         dishee.add(di);  // TODO add your handling code here:
                  Buy();
}
          else{
        String message = "You have purchased this Deshe  !";
        JOptionPane.showMessageDialog(null, message);
         }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  int flg=0;
        
         for(int i=0;i<dishee.size();i++){
        if(dishee.get(i).getname().equals(dn4.getText())){
            flg=1;
        }}
         if(flg==0){             
        double price1=Double.parseDouble(dp4.getText());

        Dishe di=new Dishe( 2,dn4.getText(),  price1);
         dishee.add(di);  // TODO add your handling code here:
                  Buy();
}
          else{
        String message = "You have purchased this Deshe  !";
        JOptionPane.showMessageDialog(null, message);
         }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Deleltd(lname1.getText());
       showPanel();
                  Buy();



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         Deleltd(lname2.getText());
       showPanel();
                  Buy();



    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 Deleltd(lname3.getText());
       showPanel();
                  Buy();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 Deleltd(lname4.getText());
       showPanel();
                  Buy();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     for(int i=0;i<dishee.size();i++){
         int q=(int)jspinner[i].getValue();
         double pricet=Double.parseDouble(pricetotal[i].getText());
         String note=jtext[i].getText();

        Dishe di=new Dishe( dishee.get(i).getname(), dishee.get(i).getprice(),q,note,pricet);

         dishe_Payment.add(di); 
     }
        new Confirmation().setVisible(true);
                    setVisible(false);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
         int q=(int) jSpinner2.getValue();
         double price1=Double.parseDouble(lprice1.getText());

         jLabel47.setText(""+q*price1);
         tott();
         
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner2MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jSpinner2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new Management().setVisible(true);
                    setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int flg=0;

        for(int i=0;i<dishee.size();i++){
            if(dishee.get(i).getname().equals(dn3.getText())){
                flg=1;
            }}
            if(flg==0){
                double price1=Double.parseDouble(dp3.getText());

                Dishe di=new Dishe( 2,dn3.getText(),  price1);
                dishee.add(di);  // TODO add your handling code here:
                Buy();
            }
            else{
                String message = "You have purchased this Deshe  !";
                JOptionPane.showMessageDialog(null, message);
            }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
int flg=0;
        
         for(int i=0;i<dishee.size();i++){
        if(dishee.get(i).getname().equals(dn5.getText())){
            flg=1;
        }}
         if(flg==0){
             double price1=Double.parseDouble(dp5.getText());
        Dishe di=new Dishe( 5,dn5.getText(), price1 );
        
         dishee.add(di);
         Buy();
         }
         else{
        String message = "You have purchased this Deshe  !";
        JOptionPane.showMessageDialog(null, message);
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
int flg=0;
        
         for(int i=0;i<dishee.size();i++){
        if(dishee.get(i).getname().equals(dn6.getText())){
            flg=1;
        }}
         if(flg==0){
             double price1=Double.parseDouble(dp6.getText());
        Dishe di=new Dishe( 6,dn6.getText(), price1 );
        
         dishee.add(di);
         Buy();
         }
         else{
        String message = "You have purchased this Deshe  !";
        JOptionPane.showMessageDialog(null, message);
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
Deleltd(lname4.getText());
       showPanel();
                  Buy();
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
Deleltd(lname4.getText());
       showPanel();
                  Buy();
                // TODO add your handling code here:
                
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // TODO add your handling code here:
 int q=(int) jSpinner3.getValue();
         double price1=Double.parseDouble(lprice2.getText());

         jLabel72.setText(""+q*price1);
         tott();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
 int q=(int) jSpinner4.getValue();
         double price1=Double.parseDouble(lprice3.getText());

         jLabel76.setText(""+q*price1);   
         tott();// TODO add your handling code here:
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
 int q=(int) jSpinner5.getValue();
         double price1=Double.parseDouble(lprice4.getText());

         jLabel80.setText(""+q*price1);  
         tott();// TODO add your handling code here:
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
 int q=(int) jSpinner7.getValue();
         double price1=Double.parseDouble(lprice6.getText());

         jLabel77.setText(""+q*price1); 
         tott();// TODO add your handling code here:
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
 int q=(int) jSpinner6.getValue();
         double price1=Double.parseDouble(lprice5.getText());

         jLabel81.setText(""+q*price1);  
         tott();// TODO add your handling code here:
    }//GEN-LAST:event_jSpinner6StateChanged
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
if(Order.size()==0){
    Order di=new Order( "Spicy seasoned", 2 );
        
         Order.add(di);
         Order di2=new Order( "Salted Pasta", 3.5 );
        
         Order.add(di2);
         Order di3=new Order( "Healthy noodle", 1.5 );
        
         Order.add(di3);
         Order di4=new Order( "Hot Spicy fried", 5 );
        
         Order.add(di4);
}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dn1;
    private javax.swing.JLabel dn2;
    private javax.swing.JLabel dn3;
    private javax.swing.JLabel dn4;
    private javax.swing.JLabel dn5;
    private javax.swing.JLabel dn6;
    private javax.swing.JLabel dp1;
    private javax.swing.JLabel dp2;
    private javax.swing.JLabel dp3;
    private javax.swing.JLabel dp4;
    private javax.swing.JLabel dp5;
    private javax.swing.JLabel dp6;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel lname1;
    private javax.swing.JLabel lname2;
    private javax.swing.JLabel lname3;
    private javax.swing.JLabel lname4;
    private javax.swing.JLabel lname5;
    private javax.swing.JLabel lname6;
    private javax.swing.JLabel lprice1;
    private javax.swing.JLabel lprice2;
    private javax.swing.JLabel lprice3;
    private javax.swing.JLabel lprice4;
    private javax.swing.JLabel lprice5;
    private javax.swing.JLabel lprice6;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JLabel totall;
    // End of variables declaration//GEN-END:variables
}

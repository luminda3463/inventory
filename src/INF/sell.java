/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INF;

import dbclass.dbconnect;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LUMINDA-PC
 */
public class sell extends javax.swing.JPanel {
Connection conn;
PreparedStatement pst=null;
ResultSet rs = null;
    /**
     * Creates new form add_item
     */
    public sell() {
        initComponents();
        conn = dbconnect.connect();
        bilheader();
    }
    

    //-------------------------------------------------------------------------------------------------
    String id;
    String name;
    String price;
    String serial;
    String items;
    String tprice;
    String discount;
    String payble;
    String cash;
    String balance;
    String date;
    
    public  ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
//-------------------------------------------------------------------------------------------------
public void getdata(){
    id = idtxt.getText();
    name = nametxt.getText();
    price = pricetxt.getText();
    serial = serialtxt.getText();
    items = itemstxt.getText();  
    tprice = tpricetxt.getText();
    discount = discounttxt.getText();
    payble=paybletxt.getText();
    cash=cashtxt.getText();
    balance=balancetxt.getText();
    LocalDate ndate = LocalDate.now();
    date = ndate+"";
    }

//-------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------
public void insert(){
       getdata();
        try {
        String sql = "INSERT INTO sells (id,name,serial,price,items,tprice,discount,payble,cash,balance,date)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id);
        pst.setString(2,name);
        pst.setString(3,serial);
        pst.setString(4,price);
        pst.setString(5,items);
        pst.setString(6,tprice);
        pst.setString(7,discount);
        pst.setString(8, payble);
        pst.setString(9,cash);
        pst.setString(10,balance);
        pst.setString(11,date);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Insert Success!!!");
        } catch (Exception e) {
        }       
}
//-------------------------------------------------------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        discounttxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        serialtxt = new javax.swing.JTextField();
        itemstxt = new javax.swing.JTextField();
        tpricetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        balancetxt = new javax.swing.JTextField();
        paybletxt = new javax.swing.JTextField();
        cashtxt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imagelbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        printtxt = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1098, 825));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel2.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 250, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search-2-24.png"))); // NOI18N
        jLabel2.setText("Search -");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Item Name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Unit Price");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Serial No");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("No Of Items");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Total Price");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Discount");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 140, -1));

        discounttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discounttxtKeyReleased(evt);
            }
        });
        jPanel1.add(discounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 440, 30));

        idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idtxtKeyReleased(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 440, 30));
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 440, 30));
        jPanel1.add(serialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 440, 30));

        itemstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemstxtKeyReleased(evt);
            }
        });
        jPanel1.add(itemstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 440, 30));
        jPanel1.add(tpricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 440, 30));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 440, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Payble");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Cash");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 140, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText("Balance");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, -1));
        jPanel1.add(balancetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 440, 30));
        jPanel1.add(paybletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 440, 30));

        cashtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashtxtKeyReleased(evt);
            }
        });
        jPanel1.add(cashtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 440, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText("Item Id");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 630, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 190));

        printtxt.setColumns(20);
        printtxt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        printtxt.setRows(5);
        jScrollPane2.setViewportView(printtxt);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, 430));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("SID");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 40, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 440, 670));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/printer-24_2.png"))); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 220, 60));

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel_1.png"))); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 220, 60));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/mony_1.png"))); // NOI18N
        jButton7.setText("Sell");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 220, 60));
    }// </editor-fold>//GEN-END:initComponents
//-------------------------------------------------------------------------------------------------              
public void autocomplete(){       
        String search = idtxt.getText();     
        try {
            String sql = "SELECT name,sprice,serial,image FROM items WHERE id LIKE'%"+search+"%'";
            pst = (com.mysql.jdbc.PreparedStatement)conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
            
            nametxt.setText(rs.getString("name"));
            pricetxt.setText(rs.getString("sprice"));
            serialtxt.setText(rs.getString("serial"));
            
            byte[] imagedata=rs.getBytes("image");
            format=new ImageIcon(imagedata);
            Image mm=format.getImage();
            Image img=mm.getScaledInstance(imagelbl.getHeight(),imagelbl.getWidth(), Image.SCALE_SMOOTH);
            ImageIcon image=new ImageIcon(img);
            imagelbl.setIcon(image);
            
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                     } }
    


//-------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------                            
public void clear1(){
    idtxt.setText("");
    nametxt.setText("");
    serialtxt.setText("");
    pricetxt.setText("");
    imagelbl.setIcon(null);
    }
//------------------------------------------------------------------------------------------------- 
//-------------------------------------------------------------------------------------------------                            
public void clear(){
    idtxt.setText("");
    nametxt.setText("");
    serialtxt.setText("");
    pricetxt.setText("");
    itemstxt.setText("");
    tpricetxt.setText("");
    discounttxt.setText("");
    paybletxt.setText("");
    cashtxt.setText("");
    balancetxt.setText("");
    imagelbl.setIcon(null);
    printtxt.setText("");
    }
//-------------------------------------------------------------------------------------------------        
    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased

    }//GEN-LAST:event_searchtxtKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            printtxt.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       insert();
       print();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void idtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxtKeyReleased
    if(idtxt.getText().length()>=1){
        autocomplete();
    }//GEN-LAST:event_idtxtKeyReleased
    if(idtxt.getText().length()==0){
        clear1();
    } }
    private void itemstxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemstxtKeyReleased
       double price = Double.parseDouble(pricetxt.getText());
       double item = Double.parseDouble(itemstxt.getText());
       double tprice = price*item;
       tpricetxt.setText(tprice+"");
    }//GEN-LAST:event_itemstxtKeyReleased

    private void discounttxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discounttxtKeyReleased
        double discount = Double.parseDouble(discounttxt.getText());
        double tprice = Double.parseDouble(tpricetxt.getText());
        double payble = tprice-discount;
        paybletxt.setText(payble+"");
    }//GEN-LAST:event_discounttxtKeyReleased

    private void cashtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashtxtKeyReleased
        double cash = Double.parseDouble(cashtxt.getText());
        double payble = Double.parseDouble(paybletxt.getText());
        double balance = cash-payble;
        balancetxt.setText(balance+"");
    }//GEN-LAST:event_cashtxtKeyReleased

//-------print print print print print print print print print----------------------------------------------------------
    
public void bilheader(){
printtxt.setText("Enventory Management System\nSri Lanka Software Developers\n=======================\n");
}
public void print(){
printtxt.setText(printtxt.getText()+"Item Name\t"+nametxt.getText()+"\nUnit Price\t"+pricetxt.getText()+"\nSerial No\t"+serialtxt.getText()+
        "\nNo OF Items\t"+itemstxt.getText()+"\nTotal Price\t"+tpricetxt.getText()+"\n-------------------------------"+"\nDiscount\t"+discounttxt.getText()+
        "\nPayble]t"+paybletxt.getText()+"\nCash\t"+cashtxt.getText()+"\n-------------------------------"+"\nBalance\t"+balancetxt.getText()+"\nThanks For Visit...!!!");}    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balancetxt;
    private javax.swing.JTextField cashtxt;
    private javax.swing.JTextField discounttxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JTextField itemstxt;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField paybletxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextArea printtxt;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTextField serialtxt;
    private javax.swing.JTextField tpricetxt;
    // End of variables declaration//GEN-END:variables
}


package INF;

import dbclass.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


public class report extends javax.swing.JPanel {
Connection conn;
PreparedStatement pst=null;
ResultSet rs = null;
    public report() {
        initComponents();
        conn = dbconnect.connect();
        sellsload();
        stoklord();
    }


    @SuppressWarnings("unchecked")
            public void sellsload(){  
        try {          
           
            String sql = "SELECT sin,id,name,serial,price,items,tprice,discount,payble,cash,balance,date FROM sells";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
            public void stoklord(){  
        try {          
           
            String sql = "SELECT id,name,category,serial,bprice,sprice,items FROM items ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categorytxt = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        tdate = new com.toedter.calendar.JDateChooser();
        fdate = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1098, 711));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel3.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 250, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search-2-24_2.png"))); // NOI18N
        jLabel2.setText("Search -");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Id", "Item Name", "Category", "Serial No", "Buying Price", "Selling Price", "No Of Items"
            }
        ));
        jScrollPane1.setViewportView(table2);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 160));

        jScrollPane3.setViewportView(jPanel5);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1060, 180));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Category");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Stock");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        categorytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorytxtKeyReleased(evt);
            }
        });
        jPanel1.add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 300, 30));

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 120, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1080, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SIN", "Item Id", "Item Name", "Serial No", "Unit Price", "No Of Items", "Total Price", "Discount", "Payble", "Cash", "Balance", "Date"
            }
        ));
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(9).setResizable(false);
            table1.getColumnModel().getColumn(11).setResizable(false);
        }

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 160));

        jScrollPane4.setViewportView(jPanel6);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1060, 180));

        tdate.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, 30));

        fdate.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(fdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("To");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("From");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Sells");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/update.png"))); // NOI18N
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 120, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 120, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1080, 320));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased

    }//GEN-LAST:event_searchtxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String sfdate = ((JTextField)fdate.getDateEditor().getUiComponent()).getText();
        String stdate = ((JTextField)tdate.getDateEditor().getUiComponent()).getText();
        
        if (sfdate.length()>0 && stdate.isEmpty()) {
            try {
            String sql = "SELECT sin,id,name,serial,price,items,tprice,discount,payble,cash,balance,date FROM sells where date = '"+sfdate+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
            }
        }
        else if 
                (sfdate.length()>0 && stdate.length()>0) 
        {
            try {
            String sql = "SELECT sin,id,name,serial,price,items,tprice,discount,payble,cash,balance,date FROM sells where date between '"+sfdate+"' and '"+stdate+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
            }
        }
        else{
        JOptionPane.showMessageDialog(jButton1,"Select Date!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//-------------------------------------------------------------------------------------------------
         public void search(){
        String search = categorytxt.getText();
        try {
            String sql = "SELECT * FROM items WHERE name LIKE'%"+search+"%'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fdate.setDate(null);
        tdate.setDate(null);
        sellsload();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        categorytxt.setText("");
        stoklord();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void categorytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorytxtKeyReleased
        search();
    }//GEN-LAST:event_categorytxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categorytxt;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private com.toedter.calendar.JDateChooser tdate;
    // End of variables declaration//GEN-END:variables
}

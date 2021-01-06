
package INF;

import dbclass.dbconnect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class home extends javax.swing.JPanel {
    Timer updatetimer;
    int DELAY = 100;
Connection conn;
PreparedStatement pst=null;
ResultSet rs = null;
    public home() {
        initComponents();
        conn = dbconnect.connect();
        count1();
        count2();
        count3();
        clock();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lable3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lable1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lable2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1098, 743));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        timelbl.setFont(new java.awt.Font("Rockwell Condensed", 1, 34)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 0, 0));
        timelbl.setText("00:00:00 AA");
        jPanel3.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 170, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 102, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Number Of Sales");
        jPanel12.add(jLabel4);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/bar-chart-7-24.png"))); // NOI18N
        jPanel12.add(jLabel7);

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 40));

        lable3.setFont(new java.awt.Font("Tahoma", 1, 88)); // NOI18N
        lable3.setForeground(new java.awt.Color(255, 255, 255));
        lable3.setText("0");
        jPanel1.add(lable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 110));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/sell-128.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, 150));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 310, 190));

        jPanel5.setBackground(new java.awt.Color(0, 204, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 153, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Number Of Users");
        jPanel10.add(jLabel2);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/bar-chart-7-24.png"))); // NOI18N
        jPanel10.add(jLabel5);

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 40));

        lable1.setFont(new java.awt.Font("Tahoma", 1, 88)); // NOI18N
        lable1.setForeground(new java.awt.Color(255, 255, 255));
        lable1.setText("0");
        jPanel5.add(lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/add-user-3-128 (1).png"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, 150));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 190));

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Number Of Items");
        jPanel11.add(jLabel3);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/bar-chart-7-24.png"))); // NOI18N
        jPanel11.add(jLabel6);

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 40));

        lable2.setFont(new java.awt.Font("Tahoma", 1, 88)); // NOI18N
        lable2.setForeground(new java.awt.Color(255, 255, 255));
        lable2.setText("0");
        jPanel6.add(lable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 110));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/buy-128_2.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, 150));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 310, 190));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1070, 670));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    public void count(){
        try {
            String sql = "select count(id) from items";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
            String sum =  rs.getString("count(id)");
            lable1.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void count1(){
        try {
            String sql = "select count(id) from register";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
            String sum =  rs.getString("count(id)");
            lable1.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void count2(){
        try {
            String sql = "select count(id) from items";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
            String sum =  rs.getString("count(id)");
            lable2.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public void count3(){
        try {
            String sql = "select count(id) from sells";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
            String sum =  rs.getString("count(id)");
            lable3.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void clock(){
            updatetimer = new Timer(DELAY, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          Date curreTime = new Date();
          String format = "hh:mm:ss a";
          DateFormat formatTime = new SimpleDateFormat(format);
          String formatedTime = formatTime.format(curreTime);
          
          timelbl.setText(formatedTime);
        }
    });
        updatetimer.start();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lable3;
    private javax.swing.JLabel timelbl;
    // End of variables declaration//GEN-END:variables
}

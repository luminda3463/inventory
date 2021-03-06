
package INF;

import dbclass.dbconnect;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LUMINDA-PC
 */
public class stock extends javax.swing.JPanel {

Connection conn;
PreparedStatement pst=null;
ResultSet rs = null;
    public stock() {
        initComponents();
        conn = dbconnect.connect();
        tableload();
    }
    public  ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        serialtxt = new javax.swing.JTextField();
        spricetxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        imagelbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1098, 743));
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search-2-24_1.png"))); // NOI18N
        jLabel2.setText("Search -");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Item Id");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Item Name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Category");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Serial No");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Price");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 440, 30));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 440, 30));
        jPanel1.add(serialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 440, 30));
        jPanel1.add(spricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 440, 30));

        categorytxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "Book", "Pencil", "Pen", "Bottle", "Bag", "Other" }));
        jPanel1.add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 440, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 630, 370));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 220, 40));

        imagelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 220, 250));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 440, 370));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 270));

        jScrollPane3.setViewportView(jPanel5);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1080, 300));
    }// </editor-fold>//GEN-END:initComponents
//-------------------------------------------------------------------------------------------------           
public void tabledata(){       
             String id;
             DefaultTableModel tmodel = (DefaultTableModel)table1.getModel();
             int selectrowindex=table1.getSelectedRow();
             id=(tmodel.getValueAt(selectrowindex, 0).toString()); 
        try {
            String sql = "SELECT id,name,category,serial,bprice,sprice,items,image FROM items WHERE id='"+id+"'";
            pst = (com.mysql.jdbc.PreparedStatement)conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
            idtxt.setText(rs.getString("id"));
            nametxt.setText(rs.getString("name"));
            categorytxt.setSelectedItem(rs.getString("category"));
            serialtxt.setText(rs.getString("serial")); 
            
            spricetxt.setText(rs.getString("sprice"));
            
            
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
        public void tableload(){  
        try {          
           
            String sql = "SELECT id,name,category,serial,bprice,sprice,items,image FROM items";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
//-------------------------------------------------------------------------------------------------
         public void search(){
        String search = searchtxt.getText();
        try {
            String sql = "SELECT * FROM items WHERE name LIKE'%"+search+"%'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
//-------------------------------------------------------------------------------------------------                            
public void clear(){
    searchtxt.setText("");
    idtxt.setText("");
    nametxt.setText("");
    categorytxt.setSelectedIndex(-1);
    serialtxt.setText("");
    spricetxt.setText("");
    spricetxt.setText("");
    imagelbl.setIcon(null);
    }
//-------------------------------------------------------------------------------------------------            
        
    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        search();
    }//GEN-LAST:event_searchtxtKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tabledata();

    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox categorytxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTextField serialtxt;
    private javax.swing.JTextField spricetxt;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}

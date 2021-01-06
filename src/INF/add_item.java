
package INF;

import dbclass.dbconnect;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class add_item extends javax.swing.JPanel {
Connection conn;
PreparedStatement pst=null;
ResultSet rs = null;

    public add_item() {
        initComponents();
        conn = dbconnect.connect();
        tableload();
        
    }
//-------------------------------------------------------------------------------------------------
    String id;
    String name;
    String category;
    String serial;
    String bprice;
    String sprice;
    String items;
    
    public  ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
//-------------------------------------------------------------------------------------------------
public void getdata(){
    id = idtxt.getText();
    name = nametxt.getText();
    category = categorytxt.getSelectedItem().toString();
    serial = serialtxt.getText();
    bprice = bpricetxt.getText();
    sprice = spricetxt.getText();
    items = itemstxt.getText();  
    }
//-------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------
   ImageIcon resizeImage(String imagePath, byte [] pic){
        ImageIcon myImage=null;
        if(imagePath !=null)
        {
        myImage = new ImageIcon(imagePath);
        }
        else{
        myImage = new ImageIcon(pic);
        }
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(imagelbl.getHeight(),imagelbl.getWidth(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
       return image;
        
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        itemstxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        serialtxt = new javax.swing.JTextField();
        bpricetxt = new javax.swing.JTextField();
        spricetxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        jLabel19.setText("Buying Price");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Selling Price");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("No Of Items");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 140, -1));
        jPanel1.add(itemstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 440, 30));

        idtxt.setText("1001");
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 440, 30));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 440, 30));
        jPanel1.add(serialtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 440, 30));
        jPanel1.add(bpricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 440, 30));
        jPanel1.add(spricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 440, 30));

        categorytxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "Book", "Pencil", "Pen", "Bottle", "Bag", "Other" }));
        jPanel1.add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 440, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 630, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/add-user-3-24_2.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 120, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/update.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 120, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/delete-24_2.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 120, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 120, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/photo-24.png"))); // NOI18N
        jButton5.setText("Brows");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 220, 40));

        imagelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 220, 250));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 440, 460));

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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 200));

        jScrollPane3.setViewportView(jPanel5);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 1080, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       getdata();
        try {
        String sql = "INSERT INTO items (id,name,category,serial,bprice,sprice,items,image)VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id);
        pst.setString(2,name);
        pst.setString(3,category);
        pst.setString(4,serial);
        pst.setString(5,bprice);
        pst.setString(6,sprice);
        pst.setString(7,items);
        pst.setBytes(8, pimage);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Insert Success!!!");
        } catch (Exception e) {
        }
        tableload();
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed
//-------------------------------------------------------------------------------------------------                            
public void clear(){
    idtxt.setText("");
    nametxt.setText("");
    categorytxt.setSelectedIndex(-1);
    serialtxt.setText("");
    bpricetxt.setText("");
    spricetxt.setText("");
    itemstxt.setText("");
    }
//-------------------------------------------------------------------------------------------------            
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fchoser = new JFileChooser();
        fchoser.showOpenDialog(null);
        File f = fchoser.getSelectedFile();
        fname= f.getAbsolutePath();
        ImageIcon micon = new ImageIcon(fname);
        try {
        File image =new File(fname);
        FileInputStream fis = new FileInputStream(image);
        ByteArrayOutputStream boas = new  ByteArrayOutputStream();
        byte[] buf=new byte[1024];
        for(int readnum;(readnum = fis.read(buf))!=-1;)
        {
        boas.write(buf,0,readnum);
        }
        pimage=boas.toByteArray();
        imagelbl.setIcon(resizeImage(fname,buf));
                    
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata();
    }//GEN-LAST:event_table1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Do you want to delete");

        if(check ==0){
            String id = idtxt.getText();
            try {
                String sql = "DELETE FROM items WHERE id='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "deleted..!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "delete error..!");
            }
        }
        tableload();
        clear();       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            bpricetxt.setText (rs.getString("bprice"));
            spricetxt.setText(rs.getString("sprice"));
            itemstxt.setText(rs.getString("items"));
            
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
public void update(){
        getdata();
        try {
        String squpdate = "UPDATE items SET  id=?,name=?,category=?,serial=?,bprice=?,sprice=?,items=? WHERE id='"+idtxt.getText()+"'";
        pst = (PreparedStatement) conn.prepareStatement(squpdate);
        pst.setString(1,id);
        pst.setString (2,name);
        pst.setString (3,category);
        pst.setString (4,serial);
        pst.setString (5,bprice);
        pst.setString (6,sprice);
        pst.setString (7,items);     
        pst.execute();
        JOptionPane.showMessageDialog(null,"Update success..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
//-------------Image update---------------------------------------------------------------------------  
        String value1 = idtxt.getText();
        try {
        File file = new File(fname);
        FileInputStream fis = new FileInputStream(file);
        byte[] image = new byte[(int)file.length()];
        fis.read(image);
        
        String sql = "update items set image = ? where id='"+value1+"'";
        pst=conn.prepareStatement(sql);
        pst.setBytes(1, image);
        pst.executeUpdate();
        pst.close();;
        } catch (Exception e) {
        }
        tableload();
}
//-------------------------------------------------------------------------------------------------


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpricetxt;
    private javax.swing.JComboBox categorytxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JTextField itemstxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField serialtxt;
    private javax.swing.JTextField spricetxt;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}

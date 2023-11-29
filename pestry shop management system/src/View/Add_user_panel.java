/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.Add_user_Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Madhavi
 */
public class Add_user_panel extends javax.swing.JPanel {

    /**
     * Creates new form Add_user_panel
     */
    public Add_user_panel() {
        initComponents();
    }
private void Fetch(){
     try {
          int q;
      Connection con=DataLayer.DBconnection.getConnection(); 
  String sql="select *from tbl_adduser";
          PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            q=rss.getColumnCount();
            DefaultTableModel df=(DefaultTableModel)tbl_adduser.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
            Vector v2=new Vector();
                for (int i = 0; i < 10; i++) {
                    v2.add(rs.getString("user_id"));
                    v2.add(rs.getString("user_name"));
                    v2.add(rs.getString("password"));
                    v2.add(rs.getString("role"));
                }
            df.addRow(v2);
            }
     } catch (Exception e) {
     }
    
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_username_add = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_password_add = new javax.swing.JTextField();
        cmb_role = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_add_user = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_userid = new javax.swing.JTextField();
        btn_delete_user = new javax.swing.JButton();
        btn_update_user = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_adduser = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setText("Password");

        jLabel2.setText("User Name");

        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashior" }));

        jLabel3.setText("Role");

        btn_add_user.setText("ADD");
        btn_add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_userMouseClicked(evt);
            }
        });
        btn_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_username_add, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password_add, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username_add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("User Id");

        txt_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_useridActionPerformed(evt);
            }
        });

        btn_delete_user.setText("DELETE");
        btn_delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_userActionPerformed(evt);
            }
        });

        btn_update_user.setText("UPDATE");
        btn_update_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(txt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btn_update_user, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tbl_adduser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User Id", "User Name", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_adduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_adduserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_adduser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_userMouseClicked

    private void btn_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_userActionPerformed
        // TODO add your handling code here:
        // int userid=Integer.valueOf(txt_userid.getText());userid,
        String username=txt_username_add.getText();
        String password=txt_password_add.getText();
        String role=(String)cmb_role.getSelectedItem();
        try {
            Add_user_Controller c1=new Add_user_Controller();
            c1.adduserinput( username, password, role);
            System.out.println("1 veiw complete");
            Fetch();
            //             JOptionPane.showMessageDialog(null,"succesful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }//GEN-LAST:event_btn_add_userActionPerformed

    private void txt_useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_useridActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_useridActionPerformed

    private void btn_delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_userActionPerformed
        // TODO add your handling code here:
        //     String userid=txt_userid.getText();
        try {Connection con=DataLayer.DBconnection.getConnection();
            String q="Delete from tbl_adduser where user_id = '"+ txt_userid.getText() +"'";
            PreparedStatement pst=con.prepareStatement(q);
            pst.execute();
            Fetch();
        } catch (Exception e) {JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }//GEN-LAST:event_btn_delete_userActionPerformed

    private void btn_update_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_userActionPerformed
        // TODO add your handling code here:
        //       int userid=Integer.valueOf(txt_userid.getText());
        //   String username=txt_username_add.getText();
        //   String password=txt_password_add.getText();
        //   String role=(String)cmb_role.getSelectedItem();
        //        try {
            //             Add_user_Controller c1=new Add_user_Controller();
            //             c1.adduserupdate( userid,username, password, role);
            //             System.out.println("1 veiw complete");
            //             Fetch();
            ////             JOptionPane.showMessageDialog(null,"succesful");
            //        } catch (Exception e) {
            //                         JOptionPane.showMessageDialog(null,e.getMessage());
            //
            //        }
        try {
            Connection con=DataLayer.DBconnection.getConnection();
            PreparedStatement pst;
            String q="Update tbl_adduser set  user_name= '"+ txt_username_add.getText()+"', password = '"+txt_password_add.getText() +"', role = '"+cmb_role.getSelectedItem() +"' where user_id = '"+ txt_userid.getText() +"'";
            pst=con.prepareStatement(q);
            pst.execute();
            Fetch();
        } catch (Exception e) {   JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btn_update_userActionPerformed

    private void tbl_adduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_adduserMouseClicked
        // TODO add your handling code here:
        try {       Connection con=DataLayer.DBconnection.getConnection();
            //            int row =tbl_adduser.getSelectedRow();
            //            String tblclick=(tbl_adduser.getModel().getValueAt(row, 0).toString());
            //            String sql="select *from tbl_adduser where user_id='"+tblclick+"'";
            //          PreparedStatement pst=con.prepareStatement(sql);
            //            if (rs.next()) {
                //
                //                txt_userid.setText(rs.getString("user_id").toString());
                //
                //                txt_username_add.setText(rs.getString("user_name"));
                //
                //                txt_password_add.setText(rs.getString("password"));
                //
                //                cmb_role.setSelectedItem(rs.getString("role"));
                //            }
            // get the model from the jtable
            DefaultTableModel model = (DefaultTableModel)tbl_adduser.getModel();

            // get the selected row index
            int selectedRowIndex =tbl_adduser.getSelectedRow();

            // set the selected row data into jtextfields
            txt_userid.setText(model.getValueAt(selectedRowIndex, 0).toString());
            txt_username_add.setText(model.getValueAt(selectedRowIndex, 1).toString());
            txt_password_add.setText(model.getValueAt(selectedRowIndex, 2).toString());
            cmb_role.setSelectedItem(model.getValueAt(selectedRowIndex, 3).toString());
            //        DefaultTableModel tblmodel=(DefaultTableModel)tbl_adduser.getModel();
            //        int userid=(int) tblmodel.getValueAt(tbl_adduser.getSelectedRow(),0);
            //        String username=tblmodel.getValueAt(tbl_adduser.getSelectedRow(),1).toString();
            //          String password=tblmodel.getValueAt(tbl_adduser.getSelectedRow(),2).toString();
            //            String role=tblmodel.getValueAt(tbl_adduser.getSelectedRow(),3).toString();
            //
            //         txt_username_add.setText(username);
            //         txt_password_add.setText(password);
            //         cmb_role.setSelectedItem(role);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tbl_adduserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_delete_user;
    private javax.swing.JButton btn_update_user;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_adduser;
    private javax.swing.JTextField txt_password_add;
    private javax.swing.JTextField txt_userid;
    private javax.swing.JTextField txt_username_add;
    // End of variables declaration//GEN-END:variables
}

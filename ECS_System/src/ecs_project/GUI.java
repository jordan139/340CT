package ecs_project;

import javax.swing.DefaultListModel;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GUI extends javax.swing.JFrame {

    DefaultListModel<Coursework> model;
    List<Coursework> courseworks;
    double coursemark;
    int coursenumber;
    int modulecode;
    int counter;
    String moduletitle;
    String coursetitle;
    String moduletutor;
    String courseissue;
    String coursetype;
    String coursedue;
    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "henry";
    String uPass = "123";

    public GUI() {
        initComponents();
        TextArea.setEnabled(false);
        //disableTextfields();

        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connect to database...");

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    TextArea.append(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\n");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Modulecodetxt = new javax.swing.JTextField();
        Moduletutortxt = new javax.swing.JTextField();
        Coursenumbertxt = new javax.swing.JTextField();
        Coursetitletxt = new javax.swing.JTextField();
        Courseissuetxt = new javax.swing.JTextField();
        Courseduetxt = new javax.swing.JTextField();
        Coursetypetxt = new javax.swing.JTextField();
        Coursemarktxt = new javax.swing.JTextField();
        Moduletitletxt = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Module Code:");

        jLabel2.setText("Module Title:");

        jLabel3.setText("Module Tutor:");

        jLabel4.setText("Coursework No.");

        jLabel5.setText("Coursework Title:");

        jLabel6.setText("Issue Date:");

        jLabel7.setText("Date & Time:");

        jLabel8.setText("Assessment Type:");

        jLabel9.setText("Module Mark (%): ");

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setText("Remove");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(24, 24, 24)
                                .addComponent(Coursemarktxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(25, 25, 25)
                                .addComponent(Coursetypetxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(51, 51, 51)
                                .addComponent(Courseduetxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(57, 57, 57)
                                .addComponent(Courseissuetxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(Coursetitletxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(Coursenumbertxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(Moduletutortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Moduletitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Modulecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modulecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Moduletitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Moduletutortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coursenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coursetitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Courseissuetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Courseduetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coursetypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coursemarktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(RemoveBtn)
                    .addComponent(UpdateBtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void emptyTextfields() {
        Coursemarktxt.setText("");
        Coursenumbertxt.setText("");
        Moduletitletxt.setText("");
        Coursetitletxt.setText("");
        Moduletutortxt.setText("");
        Courseissuetxt.setText("");
        Modulecodetxt.setText("");
        Coursetypetxt.setText("");
        Courseduetxt.setText("");
    }
    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                coursemark = Double.parseDouble(Coursemarktxt.getText());
                coursenumber = Integer.parseInt(Coursenumbertxt.getText());
                moduletitle = Moduletitletxt.getText();
                coursetitle = Coursetitletxt.getText();
                moduletutor = Moduletutortxt.getText();
                courseissue = Courseissuetxt.getText();
                modulecode = Integer.parseInt(Modulecodetxt.getText());
                coursetype = Coursetypetxt.getText();
                coursedue = Courseduetxt.getText();
                String sql = "UPDATE COURSEWORK SET MODULE_TITLE = '" + moduletitle + "', MODULE_TUTOR = '" + moduletutor + "', COURSE_NO = " + coursenumber + ", COURSE_TITLE = '" + coursetitle + "', COURSE_ISSUE = '" + courseissue + "', COURSE_DUE = '" + coursedue + "', COURSE_TYPE = '" + coursetype + "', COURSE_MARK = " + coursemark + " WHERE MODULE_CODE = " + modulecode;
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);

                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                TextArea.setText("");
                while (rs.next()) {
                    TextArea.append(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\n");
                }
                emptyTextfields();
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                modulecode = Integer.parseInt(Modulecodetxt.getText());
                String sql = "DELETE FROM COURSEWORK WHERE MODULE_CODE = " + modulecode;
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);

                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                TextArea.setText("");
                while (rs.next()) {
                    TextArea.append(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\n");
                }
                emptyTextfields();
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty field of Module Code.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            try {
                coursemark = Double.parseDouble(Coursemarktxt.getText());
                coursenumber = Integer.parseInt(Coursenumbertxt.getText());
                moduletitle = Moduletitletxt.getText();
                coursetitle = Coursetitletxt.getText();
                moduletutor = Moduletutortxt.getText();
                courseissue = Courseissuetxt.getText();
                modulecode = Integer.parseInt(Modulecodetxt.getText());
                coursetype = Coursetypetxt.getText();
                coursedue = Courseduetxt.getText();
                String sql = "INSERT INTO COURSEWORK VALUES (" + modulecode + ", '" + moduletitle + "', '" + moduletutor + "', " + coursenumber + ", '" + coursetitle + "', '" + courseissue + "', '" + courseissue + "', '" + coursetype + "', " + coursemark + ")";
                Statement st = conn.createStatement();
                ResultSet rs = null;
                st.executeUpdate(sql);

                sql = "SELECT * FROM COURSEWORK";
                rs = st.executeQuery(sql);
                TextArea.setText("");
                while (rs.next()) {
                    TextArea.append(rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t" + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t" + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t" + rs.getDouble("COURSE_MARK") + "\n");
                }
                emptyTextfields();
            } catch (NumberFormatException | IndexOutOfBoundsException exception) {
                System.out.println("Error! Check format type or empty fields.");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_AddBtnActionPerformed
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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Courseduetxt;
    private javax.swing.JTextField Courseissuetxt;
    private javax.swing.JTextField Coursemarktxt;
    private javax.swing.JTextField Coursenumbertxt;
    private javax.swing.JTextField Coursetitletxt;
    private javax.swing.JTextField Coursetypetxt;
    private javax.swing.JTextField Modulecodetxt;
    private javax.swing.JTextField Moduletitletxt;
    private javax.swing.JTextField Moduletutortxt;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

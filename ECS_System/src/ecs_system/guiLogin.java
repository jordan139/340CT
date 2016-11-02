/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class guiLogin extends javax.swing.JFrame {

    String commandline;
    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "henry";
    String uPass = "123";

    //Creates new form login
    public guiLogin() {
        initComponents();
        //when connecting to DB try for an error 
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connected to database...");
            //if error has been thrown catch it 
        } catch (SQLException ex) {
            //print out the error name 
            System.out.println(ex);
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametextField = new javax.swing.JTextField();
        passwordtextField = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        newUser = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("LOGIN");

        jLabel2.setText("Enter Username");

        jLabel3.setText("Enter Password ");

        passwordtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextFieldActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        enterButton.setText("Enter ");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        newUser.setText("New User");
        newUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(27, 27, 27)
                        .addComponent(enterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametextField, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(passwordtextField)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(remove)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernametextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(enterButton)
                    .addComponent(newUser)
                    .addComponent(remove))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //varible used to monitor the amount of times a user trys to log in 
    int wrongInput = 4;

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed

        String password = passwordtextField.getText();
        String username = usernametextField.getText();
        //empty string 
        String tempuser = "";
        String temppass = "";

        boolean status = false;
        try {
            //try for an error 
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //if DB connects run the following code
            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;
                if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username Required");
                } else if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Required");
                } else {
                    String sql = "SELECT USERNAME, PASSWORD FROM LOGIN WHERE USERNAME = '" + username + "'";
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        tempuser = rs.getString("USERNAME");
                        System.out.println("Username correct.");
                        if (tempuser.equals(username)) {
                            temppass = rs.getString("PASSWORD");

                            // CHECK THIS !!!!!!!!!!!!!!!
                            if (username != tempuser) {
                                JOptionPane.showMessageDialog(null, "The username" + tempuser + " does not exist!");
                            }

                            if (temppass != password) {
                                wrongInput--;
                                JOptionPane.showMessageDialog(null, "Incorrect login password for user: " + username + "\n" + wrongInput + " Attempt(s) Left");

                                System.out.println(wrongInput);
                            }
                            if (wrongInput == 1) {

                                JOptionPane.showMessageDialog(null, "Final Attempt ", "Warning", JOptionPane.ERROR_MESSAGE);

                            }

                            if (wrongInput == 0) {
                                JOptionPane.showMessageDialog(null, "To many incorrect logins\nClosing down system ", "Warning", JOptionPane.ERROR_MESSAGE);
                                close();
                            }

                            if (temppass.equals(password)) {
                                new welcomeTemp().setVisible(true);
                                System.out.println("Password correct.");
                                close();

                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
//
//        if (password.contains("admin") && username.contains("jordan")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//
//        } else if (password.contains("admin") && username.contains("henry")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else if (password.contains("admin") && username.contains("jey")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else if (password.contains("admin") && username.contains("yusuf")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else if (password.contains("admin") && username.contains("george")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else if (password.contains("admin") && username.contains("fems")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else if (password.contains("admin") && username.contains("kyle")) {
//            usernametextField.setText("");
//            passwordtextField.setText("");
//            // close window 
//            close();
//            welcomeTemp w = new welcomeTemp();
//            w.setVisible(true);
//        } else {
//            //show message 
//
//            JOptionPane.showMessageDialog(null, "This password or username is incorrect\n" + "Warning " + wrongInput + " attempt(s) left\n" + "Click OK and try again", "Warning", JOptionPane.ERROR_MESSAGE);
//
//            passwordtextField.setText("");
//            usernametextField.setText("");
//
//            if (wrongInput == 1) {
//                JOptionPane.showMessageDialog(null, "WARNING: Final Attempt ");
//
//            }
//
//            if (wrongInput == 0) {
//                JOptionPane.showMessageDialog(null, "To many incorrect attempts\nExiting System");
//                close();
//            }
//
//            wrongInput--;
//        }

    }//GEN-LAST:event_enterButtonActionPerformed

    private void passwordtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        close();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void newUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserActionPerformed
        String uName;
        String uPass;

        uName = "henry";
        uPass = "123";

        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connecting to database...");

            if (conn != null) {
                new newUsr().setVisible(true);

            }

        } catch (SQLException ex) {
            //print out the error name 
            System.out.println(ex);

        }
    }//GEN-LAST:event_newUserActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                setVisible(false);
                new removeUser().setVisible(true);
            }
        } catch (Exception ex) {
            System.out.println("nsdbjdfke");
        }
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton newUser;
    private javax.swing.JPasswordField passwordtextField;
    private javax.swing.JButton remove;
    private javax.swing.JTextField usernametextField;
    // End of variables declaration//GEN-END:variables
    private void close() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.riderclient.view;

import com.mycompany.providerclient.view.*;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.common.components.JTextFieldPlaceholder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Marco
 */
public class RiderLoginView extends javax.swing.JFrame {

    /**
     * Creates new form ProviderLogIn
     */
    public RiderLoginView() {
        try {
            //   UIManager.
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(com.mycompany.riderclient.view.RiderLoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pack();
this.setLocationRelativeTo(null);
        initComponents();
          setResizable(false);
    }

    public JButton getLogInBtn() {
        return logInBtn;
    }

    public JTextFieldPlaceholder getPasswordTextField() {
        return passwordTextField;
    }

    public JButton getSignUpBtn() {
        return signUpBtn;
    }

    public JTextFieldPlaceholder getUsernameTextField() {
        return usernameTextField;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newLogin = new javax.swing.JPanel();
        logInBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameTextField = new JTextFieldPlaceholder("Username");
        passwordTextField = new JTextFieldPlaceholder("Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logInBtn.setBackground(new java.awt.Color(44, 73, 129));
        logInBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        signUpBtn.setText("Sign Up");

        titleLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("WELCOME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Don't have an account?");

        usernameTextField.setText("Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setText("Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newLoginLayout = new javax.swing.GroupLayout(newLogin);
        newLogin.setLayout(newLoginLayout);
        newLoginLayout.setHorizontalGroup(
            newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newLoginLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newLoginLayout.createSequentialGroup()
                        .addGroup(newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newLoginLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newLoginLayout.createSequentialGroup()
                        .addGroup(newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))))
        );
        newLoginLayout.setVerticalGroup(
            newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newLoginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(newLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn)
                    .addComponent(jLabel4))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(newLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(newLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel newLogin;
    private com.mycompany.common.components.JTextFieldPlaceholder passwordTextField;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel titleLabel;
    private com.mycompany.common.components.JTextFieldPlaceholder usernameTextField;
    // End of variables declaration//GEN-END:variables
}

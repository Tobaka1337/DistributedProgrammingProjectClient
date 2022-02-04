/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customerclient.view;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.mycompany.common.components.JButtonEditor;
import com.mycompany.common.components.JButtonRenderer;
import com.mycompany.common.components.NoEditableTableModel;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * This class represents the view with which the user interacts to select provider where to place the order
 * @author CATELLO
 */
public class ProviderSelection extends javax.swing.JFrame {

    /**
     * Creates new form ProviderSelection
     */
    public ProviderSelection() {
        try {
            //   UIManager.
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ProviderSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getLogoutBtn() {
        return logOutBtn;
    }

    public JTable getProviderTable() {
        return providerTable;
    }

    public JButton getAccountBtn() {
        return accountBtn;
    }

    public JButton getBalanceBtn() {
        return balanceBtn;
    }

    public JButton getHistoryBtn() {
        return historyBtn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        providerView = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        providerTable = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            /*@Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }*/
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return Boolean.class;
                    case 3:
                    return Boolean.class;
                    case 4:
                    return String.class;
                    case 5:
                    return String.class;
                    case 6:
                    return JButton.class;
                    default:
                    return String.class;
                }
            }
        };
        navBar = new javax.swing.JPanel();
        balanceBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("CHOOSE WHERE YOU WANNA EAT");

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Vector providerTableHeader = new Vector();
        providerTableHeader.addElement("Provider Name");
        providerTableHeader.addElement("Cuisine");
        providerTableHeader.addElement("Home Delivery");
        providerTableHeader.addElement("Take Away");
        providerTableHeader.addElement("Address");
        providerTableHeader.addElement("Telephone");
        providerTableHeader.addElement("");
        providerTable.setModel(new NoEditableTableModel(
            providerTableHeader,
            6
        ));
        providerTable.setDefaultRenderer(JButton.class,new JButtonRenderer(6, "Menù"));
        providerTable.setDefaultEditor(JButton.class,new JButtonEditor());
        jScrollPane1.setViewportView(providerTable);

        javax.swing.GroupLayout providerViewLayout = new javax.swing.GroupLayout(providerView);
        providerView.setLayout(providerViewLayout);
        providerViewLayout.setHorizontalGroup(
            providerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, providerViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(providerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        providerViewLayout.setVerticalGroup(
            providerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, providerViewLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        navBar.setBackground(new java.awt.Color(146, 43, 32));

        balanceBtn.setBackground(new java.awt.Color(255, 255, 255));
        balanceBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balanceBtn.setForeground(new java.awt.Color(5, 5, 5));
        balanceBtn.setText("Update Balance");
        balanceBtn.setBorderPainted(false);
        balanceBtn.setMaximumSize(new java.awt.Dimension(145, 29));
        balanceBtn.setMinimumSize(new java.awt.Dimension(145, 29));
        balanceBtn.setPreferredSize(new java.awt.Dimension(145, 29));
        balanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceBtnActionPerformed(evt);
            }
        });

        accountBtn.setBackground(new java.awt.Color(255, 255, 255));
        accountBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(5, 5, 5));
        accountBtn.setText("Update Account");
        accountBtn.setBorderPainted(false);
        accountBtn.setPreferredSize(new java.awt.Dimension(145, 29));
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(5, 5, 5));
        logOutBtn.setText("Log out");
        logOutBtn.setBorderPainted(false);
        logOutBtn.setPreferredSize(new java.awt.Dimension(145, 29));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        historyBtn.setBackground(new java.awt.Color(255, 255, 255));
        historyBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(5, 5, 5));
        historyBtn.setText("Order history");
        historyBtn.setBorderPainted(false);
        historyBtn.setPreferredSize(new java.awt.Dimension(145, 29));
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(balanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(accountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(providerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(providerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceBtnActionPerformed

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton balanceBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JPanel navBar;
    private javax.swing.JTable providerTable;
    private javax.swing.JPanel providerView;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

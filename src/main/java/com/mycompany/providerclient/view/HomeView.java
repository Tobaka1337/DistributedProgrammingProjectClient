/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.providerclient.view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.common.components.NoEditableTableModel;
import java.util.Vector;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author aferr
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form AllOrderViewer
     */
    public HomeView() {
        try {
            //   UIManager.
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
    }

    public JButton getAcceptBtn() {
        return acceptBtn;
    }

    public JTable getAllOrdersTable() {
        return allOrdersTable;
    }

    public JScrollPane getAllOrdersTableScroll() {
        return allOrdersTableScroll;
    }

    public JButton getCompleteBtn() {
        return completeBtn;
    }

    public JLabel getHomeLabel() {
        return homeLabel;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JButton getLogOutBtn() {
        return logOutBtn;
    }

    public JButton getRefreshBtn() {
        return refreshBtn;
    }

    public JButton getRefuseBtn() {
        return refuseBtn;
    }

    public JLabel getSelectedOrderLabel() {
        return selectedOrderLabel;
    }

    public JTable getSelectedOrderTable() {
        return selectedOrderTable;
    }

    public JButton getShipBtn() {
        return shipBtn;
    }

    public JButton getAvailableBtn() {
        return availableBtn;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        allOrdersTableScroll = new javax.swing.JScrollPane();
        allOrdersTable = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    case 3:
                    return String.class;
                    case 4:
                    return String.class;
                    default:
                    return String.class;
                }
            }
        };
        selectedOrderLabel = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        shipBtn = new javax.swing.JButton();
        refuseBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        completeBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        homeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedOrderTable = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return Integer.class;
                    default:
                    return String.class;
                }
            }
        };
        availableBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(802, 802));

        Vector allOrdersTableHeader = new Vector();
        allOrdersTableHeader.addElement("Customer Name");
        allOrdersTableHeader.addElement("Rider Name");
        allOrdersTableHeader.addElement("Order Type");
        allOrdersTableHeader.addElement("Order State");
        allOrdersTableHeader.addElement("Delivery Time");
        allOrdersTable.setModel(new NoEditableTableModel(
            allOrdersTableHeader,
            -1
        ));
        allOrdersTableScroll.setViewportView(allOrdersTable);

        selectedOrderLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        selectedOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedOrderLabel.setText("selected order");

        acceptBtn.setBackground(new java.awt.Color(44, 73, 129));
        acceptBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        acceptBtn.setText("ACCEPT");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        shipBtn.setBackground(new java.awt.Color(44, 73, 129));
        shipBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shipBtn.setText("SHIP");
        shipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipBtnActionPerformed(evt);
            }
        });

        refuseBtn.setBackground(new java.awt.Color(146, 43, 32));
        refuseBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refuseBtn.setText("REFUSE");
        refuseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refuseBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(44, 73, 129));
        refreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        completeBtn.setBackground(new java.awt.Color(44, 73, 129));
        completeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        completeBtn.setText("COMPLETE");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(44, 73, 129));
        logOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        homeLabel.setText("home");

        Vector selectedOrderTableHeader = new Vector();
        selectedOrderTableHeader.addElement("Dish");
        selectedOrderTableHeader.addElement("Quantity");
        selectedOrderTable.setModel(new NoEditableTableModel(
            selectedOrderTableHeader,
            -1
        ));
        jScrollPane2.setViewportView(selectedOrderTable);

        availableBtn.setBackground(new java.awt.Color(146, 43, 32));
        availableBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        availableBtn.setText("NOT AVAILABLE");
        availableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allOrdersTableScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(selectedOrderLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(refuseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(shipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(homeLabel)
                                .addGap(247, 247, 247)
                                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(availableBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeLabel)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(allOrdersTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(refuseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(222, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void shipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completeBtnActionPerformed

    private void refuseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refuseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refuseBtnActionPerformed

    private void availableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JTable allOrdersTable;
    private javax.swing.JScrollPane allOrdersTableScroll;
    private javax.swing.JButton availableBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refuseBtn;
    private javax.swing.JLabel selectedOrderLabel;
    private javax.swing.JTable selectedOrderTable;
    private javax.swing.JButton shipBtn;
    // End of variables declaration//GEN-END:variables
}

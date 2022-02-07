/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riderclient.view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.common.components.JButtonEditor;
import com.mycompany.common.components.JButtonRenderer;
import com.mycompany.common.components.NoEditableTableModel;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author CATELLO
 */
public class RiderHomeView extends javax.swing.JFrame {

    /**
     * Creates new form RiderOrderSelection
     */
    public RiderHomeView() {
        try {
            //   UIManager.
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(com.mycompany.riderclient.view.RiderHomeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pack();
this.setLocationRelativeTo(null);
        initComponents();
          setResizable(false);
    }

    public JButton getViewOrderBtn() {
        return viewOrderBtn;
    }

    public JMenuItem getLogoutItem() {
        return logoutItem;
    }
    
    

    public JButton getAcceptBtn() {
        return acceptBtn;
    }

    public JRadioButton getRadioSemiAcc() {
        return radioSemiAcc;
    }

    public JTable getRiderTable() {
        return riderTable;
    }

    public JRadioButton getRadioAccepted() {
        return radioAccepted;
    }

    public ButtonGroup getBtnRadioGroup() {
        return btnRadioGroup;
    }

    public JMenuItem getMyInfoItem() {
        return myInfoItem;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        radioSemiAcc = new javax.swing.JRadioButton();
        radioAccepted = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        riderTable = new javax.swing.JTable(){

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
                    case 5:
                    return String.class;
                    default:
                    return String.class;
                }
            }
        };
        acceptBtn = new javax.swing.JButton();
        viewOrderBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        profileMenu = new javax.swing.JMenu();
        myInfoItem = new javax.swing.JMenuItem();
        logoutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        titleLabel.setText("orders");

        btnRadioGroup.add(radioSemiAcc);
        radioSemiAcc.setText("Acceptable Orders");
        radioSemiAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSemiAccActionPerformed(evt);
            }
        });

        btnRadioGroup.add(radioAccepted);
        radioAccepted.setText("Accepted Orders");

        riderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Provider", "Provider address", "Customer", "Customer Address", "Delivery Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Vector orderHeader = new Vector();
        orderHeader.addElement("Order ID");
        orderHeader.addElement("Provider");
        orderHeader.addElement("Provider Address");
        orderHeader.addElement("Customer Name");
        orderHeader.addElement("Customer Address");
        orderHeader.addElement("Delivery time");
        jScrollPane1.setViewportView(riderTable);

        acceptBtn.setText("Accept Order");

        viewOrderBtn.setText("Show Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioSemiAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAccepted, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptBtn)
                .addGap(18, 18, 18)
                .addComponent(viewOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSemiAcc)
                    .addComponent(radioAccepted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(viewOrderBtn))
                .addGap(35, 35, 35))
        );

        profileMenu.setBackground(new java.awt.Color(153, 0, 0));
        profileMenu.setText("Profile");

        myInfoItem.setText("My Info");
        myInfoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInfoItemActionPerformed(evt);
            }
        });
        profileMenu.add(myInfoItem);

        logoutItem.setBackground(new java.awt.Color(153, 0, 0));
        logoutItem.setText("Logout");
        profileMenu.add(logoutItem);

        jMenuBar1.add(profileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioSemiAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSemiAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSemiAccActionPerformed

    private void myInfoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInfoItemActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_myInfoItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.ButtonGroup btnRadioGroup;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutItem;
    private javax.swing.JMenuItem myInfoItem;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JRadioButton radioAccepted;
    private javax.swing.JRadioButton radioSemiAcc;
    private javax.swing.JTable riderTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewOrderBtn;
    // End of variables declaration//GEN-END:variables
}

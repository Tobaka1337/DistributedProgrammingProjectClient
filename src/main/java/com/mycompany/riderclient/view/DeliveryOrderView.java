/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riderclient.view;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.common.components.NoEditableTableModel;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author CATELLO
 */
public class DeliveryOrderView extends javax.swing.JFrame {

    /**
     * Creates new form CurrentDeliveryOrder
     */
    public DeliveryOrderView() {
        try {
            //   UIManager.
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(com.mycompany.riderclient.view.DeliveryOrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pack();
this.setLocationRelativeTo(null);
        initComponents();
        setResizable(false);
    }

    public JButton getCompleteBtn() {
        return completeBtn;
    }

    public JButton getShippedBtn() {
        return shippedBtn;
    }

    public JLabel getTableLabel() {
        return tableLabel;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    
    
    public JLabel getCustomerAddressLabel() {
        return customerAddressLabel;
    }


    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }


    public JLabel getCustomerTelephoneLabel() {
        return customerTelephoneLabel;
    }
    public JLabel getDeliveryTimeLabel() {
        return deliveryTimeLabel;
    }

    public JTable getDishTable() {
        return dishTable;
    }

    public JLabel getProviderAddressLabel() {
        return providerAddressLabel;
    }

    public JLabel getProviderNameLabel() {
        return providerNameLabel;
    }


    public JLabel getProviderTelephoneLabel() {
        return providerTelephoneLabel;
    }

    public JLabel getStateLabel() {
        return stateLabel;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        completeBtn = new javax.swing.JButton();
        shippedBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dishTable = new javax.swing.JTable(){

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    default:
                    return String.class;
                }
            }
        };
        customerTelephoneLabel = new javax.swing.JLabel();
        deliveryTimeLabel = new javax.swing.JLabel();
        tableLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        customerAddressLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        providerAddressLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        providerNameLabel = new javax.swing.JLabel();
        providerTelephoneLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        providerNameLabel1 = new javax.swing.JLabel();
        providerNameLabel2 = new javax.swing.JLabel();
        providerNameLabel3 = new javax.swing.JLabel();
        providerNameLabel4 = new javax.swing.JLabel();
        providerNameLabel5 = new javax.swing.JLabel();
        providerNameLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        completeBtn.setBackground(new java.awt.Color(153, 0, 51));
        completeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        completeBtn.setText("Change state in COMPLETED");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        shippedBtn.setBackground(new java.awt.Color(44, 73, 129));
        shippedBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shippedBtn.setText("Change state in SHIPPED");
        shippedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippedBtnActionPerformed(evt);
            }
        });

        dishTable.setModel(new NoEditableTableModel(
            new Object [][] {
                {null, null },
                {null, null },
                {null, null },
                {null, null }
            },
            new String [] {
                "<html><div style = 'text-align: center'>Dish Name</div></html>\"",
                "<html><div style = 'text-align: center'>Quantity</div></html>\""
            },
            10)
    );
    Vector dishHeader = new Vector();
    dishHeader.addElement("Dish name");
    dishHeader.addElement("Quantity ");
    jScrollPane3.setViewportView(dishTable);

    customerTelephoneLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    customerTelephoneLabel.setText("Customer number");

    deliveryTimeLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 24));
    deliveryTimeLabel.setText("Delivery time:  HH:mm GG/MM/AAAA");

    tableLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tableLabel.setText("Your order to deliver");

    stateLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 24));
    stateLabel.setText("Order State:  Stato dell'ordine");

    customerAddressLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    customerAddressLabel.setText("indirizzo customer");

    customerNameLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    customerNameLabel.setText("Nome customer");

    providerAddressLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    providerAddressLabel.setText("indirizzo provider");

    titleLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
    titleLabel1.setText("ORDER INFORMATION");

    providerNameLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    providerNameLabel.setText("Nome Provider");

    providerTelephoneLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12));
    providerTelephoneLabel.setText("Provider number");
    providerTelephoneLabel.setToolTipText("");

    backBtn.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
    backBtn.setText("Back to orders");
    backBtn.setToolTipText("");

    providerNameLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel1.setText("Customer");

    providerNameLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel2.setText("Customer address");

    providerNameLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel3.setText("Provider number");

    providerNameLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel4.setText("Provider address");

    providerNameLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel5.setText("Customer number");

    providerNameLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 12));
    providerNameLabel6.setText("Provider");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(providerNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(providerNameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(providerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(providerNameLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(customerAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(providerNameLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(providerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(providerNameLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(providerNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customerTelephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(providerTelephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(tableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deliveryTimeLabel)
                    .addGap(164, 164, 164))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(235, 235, 235)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shippedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(completeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titleLabel1)
                .addComponent(backBtn))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(providerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerTelephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(25, 25, 25)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(customerTelephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(providerNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(deliveryTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(17, 17, 17)
            .addComponent(tableLabel)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(shippedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shippedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shippedBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shippedBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completeBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JLabel customerAddressLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerTelephoneLabel;
    private javax.swing.JLabel deliveryTimeLabel;
    private javax.swing.JTable dishTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel providerAddressLabel;
    private javax.swing.JLabel providerNameLabel;
    private javax.swing.JLabel providerNameLabel1;
    private javax.swing.JLabel providerNameLabel2;
    private javax.swing.JLabel providerNameLabel3;
    private javax.swing.JLabel providerNameLabel4;
    private javax.swing.JLabel providerNameLabel5;
    private javax.swing.JLabel providerNameLabel6;
    private javax.swing.JLabel providerTelephoneLabel;
    private javax.swing.JButton shippedBtn;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel tableLabel;
    private javax.swing.JLabel titleLabel1;
    // End of variables declaration//GEN-END:variables
}

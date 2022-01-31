/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customerclient.controller;

import com.mycompany.common.api.RetrofitBuilder;
import com.mycompany.common.model.dto.order.OrderDto;
import com.mycompany.customerclient.api.ServiceApi;
import com.mycompany.customerclient.model.CustomerEntity;
import com.mycompany.customerclient.navigator.Navigator;
import com.mycompany.customerclient.view.UpdateBalance;
import com.mycompany.customerclient.view.customerUpdate;
import com.sun.tools.javac.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author CATELLO
 */
public class CustomerBalanceController {

    private UpdateBalance balanceView;

    private JTextField ibanField;
    private JTextField currentBalanceField;
    private JTextField incrementField;

    private JButton accountButton;
    private JButton homeButton;
    private JButton confirmButton;
    private JButton logOutButton;

    private Long customerId;
    private Double currentBalance;

    private Navigator nav;

    private RetrofitBuilder retroBuild;
    private ServiceApi apiService;

    public CustomerBalanceController(Long customerId) {
        this.customerId = customerId;

        //View creation
        balanceView = new UpdateBalance();
        //Component getter
        ibanField = balanceView.getIbanTextField();
        incrementField = balanceView.getIncrementTextField();
        currentBalanceField = balanceView.getCurrentBalanceTextField();
        confirmButton = balanceView.getConfirmBtn();
        homeButton = balanceView.getHomeBtn();
        logOutButton = balanceView.getLogOutBtn();
        accountButton = balanceView.getAccountBtn();
        

        //View navigator creation
        nav = Navigator.getInstance();

        // initialize retrofitBuilder and serviceApi
        retroBuild = new RetrofitBuilder();
        apiService = retroBuild.getRetrofit().create(ServiceApi.class);

        //Fill fields with customer actual information saved on server
        Call<CustomerEntity> call = apiService.getCustomer(this.customerId);
        call.enqueue(new Callback<CustomerEntity>() {
            @Override
            public void onResponse(Call<CustomerEntity> call, Response<CustomerEntity> response) {
                if (response.isSuccessful()) { // status code tra 200-299
                    CustomerEntity customer = response.body();
                    currentBalance = customer.getBalance();
                    currentBalanceField.setText(currentBalance.toString());
                    ibanField.setText(customer.getIban());
                } else { // if server error occurs
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        JOptionPane.showMessageDialog(balanceView, jObjError.get("message"), "Server error", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void onFailure(Call<CustomerEntity> call, Throwable t) {
                // Log error here since request failed
                JOptionPane.showMessageDialog(balanceView,
                        "Contact you system administrator",
                        "CRITICAL ERROR",
                        JOptionPane.ERROR_MESSAGE);

            }
        });
        
        //ActionPerfomed when confirm balance button is pressed:
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double increment = Double.parseDouble(incrementField.getText());
                if (increment < 0) {
                    fieldErrorPane("Increment balance cannot be negative");
                    return;
                }
                Call<Object> updateBalanceCall = apiService.increaseBalance(customerId, increment);
                updateBalanceCall.enqueue(new Callback<Object>() {
                    @Override
                    public void onResponse(Call<Object> call, Response<Object> response) {
                        if (response.isSuccessful()) { // status code tra 200-299

                            Double newCurrentBalance = increment + currentBalance;
                            JOptionPane.showMessageDialog(balanceView, "Now your balance is: " + newCurrentBalance, "Update balance success", JOptionPane.INFORMATION_MESSAGE);

                            currentBalanceField.setText(newCurrentBalance.toString());
                            incrementField.setText("");
                        } else { // if server error occurs
                            try {
                                JSONObject jObjError = new JSONObject(response.errorBody().string());
                                JOptionPane.showMessageDialog(balanceView, jObjError.get("message"), "Server error", JOptionPane.ERROR_MESSAGE);
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Object> call, Throwable t) {
                        // Log error here since request failed
                        JOptionPane.showMessageDialog(balanceView,
                                "Contact you system administrator",
                                "CRITICAL ERROR",
                                JOptionPane.ERROR_MESSAGE);

                    }
                });
            }

        });
        
        // When logout button is pressed display logIn view
        logOutButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                nav.fromBalancetoLogOut(CustomerBalanceController.this);
            }
            
        });
        // When logout account button is pressed display customer update view
        accountButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                nav.fromBalancetoUpdate(CustomerBalanceController.this);
            }
            
        });
        //Set home button text and his action listener based on the presence of current order
        Call<OrderDto> currentOrderCall = apiService.getCurrentOrderDTO(this.customerId);
        currentOrderCall.enqueue(new Callback<OrderDto>(){
            @Override
            public void onResponse(Call<OrderDto> call, Response<OrderDto> response) {
                if (response.isSuccessful()){
                    homeButton.setText("Current Order");
                    
                }
                else
                    homeButton.setText("Create Order");
                    homeButton.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            nav.fromBalancetoProviderSelection(CustomerBalanceController.this);
                        }
                        
                    });
            }

            @Override
            public void onFailure(Call<OrderDto> call, Throwable thrwbl) {
                JOptionPane.showMessageDialog(balanceView,
                                "Contact you system administrator",
                                "CRITICAL ERROR",
                                JOptionPane.ERROR_MESSAGE);
            }
            
        });
        
        balanceView.setVisible(true);

    }

    private void fieldErrorPane(String errorMessage) {
        JOptionPane.showMessageDialog(balanceView, errorMessage, "Field error", JOptionPane.ERROR_MESSAGE);
    }

    public void disposeView() {
        balanceView.dispose();
    }

    public Long getCustomerId() {
        return customerId;
    }

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
            java.util.logging.Logger.getLogger(customerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBalanceController(5L);
            }

        });
    }
}
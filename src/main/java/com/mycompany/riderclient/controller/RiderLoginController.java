/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.riderclient.controller;

import com.mycompany.common.api.RetrofitBuilder;
import com.mycompany.common.components.JTextFieldPlaceholder;
import com.mycompany.common.model.Credentials;


import com.mycompany.providerclient.view.LogInView;
import com.mycompany.riderclient.api.ServiceApi;
import com.mycompany.riderclient.navigator.Navigator;
import com.mycompany.riderclient.view.RiderLoginView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author Amos
 */
public class RiderLoginController {
    
    private RiderLoginView loginView;
    private JTextFieldPlaceholder usernameTextField;
    private JTextFieldPlaceholder  passwordTextField;
    private JButton logInBtn;
    private JButton signUpBtn;
    
    private RetrofitBuilder retroBuild;
    private ServiceApi serviceApi;
    private Long riderId;
    private Navigator navigator;
    
    
    public RiderLoginController(){
        loginView = new RiderLoginView();
        loginView.setVisible(true);
        
        
        usernameTextField = loginView.getUsernameTextField();
        passwordTextField = loginView.getPasswordTextField();
        logInBtn = loginView.getLogInBtn();
        signUpBtn = loginView.getSignUpBtn();
        
        
        retroBuild = new RetrofitBuilder();
        serviceApi = retroBuild.getRetrofit().create(ServiceApi.class);
        navigator = Navigator.getInstance();
        
        
        logInBtn.addMouseListener(loginInAction);
        signUpBtn.addMouseListener(signUpAction);
        
        
    }
    
    private MouseAdapter loginInAction = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            
            System.out.println(usernameTextField.getText()+passwordTextField.getText());
            
            String username = usernameTextField.getText(true).trim();
            String password = passwordTextField.getText(true).trim();
            
            if(username.isBlank()){
                JOptionPane.showMessageDialog(loginView,
                                "Username cannot be blank.",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(password.isBlank()){
                JOptionPane.showMessageDialog(loginView,
                                "Password cannot be blank.",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                return;
            }
            Credentials credentials = new Credentials(username, password);
            
            // send call to API
            Call<Long> loginCall = serviceApi.login(credentials);
            
            
            super.mouseClicked(mouseEvent);
            
            
            loginCall.enqueue(new Callback<Long>(){
                
                @Override
                public void onResponse(Call<Long> call, Response<Long> response) {

                    if(response.isSuccessful()){ // status code tra 200-299
                        riderId = response.body();
                        //GESTIRE NAVIGATOR
                        System.out.println("Login effettuato correttamente, id: "+riderId);
                       navigator.fromLogInToHome(RiderLoginController.this);
                        //navigator per andare all'home
                     
                    }
                    else{ // in caso di errori
                        try {
                            JSONObject jObjError = new JSONObject(response.errorBody().string());
                            JOptionPane.showMessageDialog(loginView,
                                jObjError.get("message"),
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        } catch (IOException ex) {
                            Logger.getLogger(RiderLoginController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                @Override
                public void onFailure(Call<Long> call, Throwable t) {
                    // Log error here since request failed
                      JOptionPane.showMessageDialog(loginView,
                                "Something went wrong...",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                }
            });            
        }
    };
    
    private MouseAdapter signUpAction = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            
            navigator.fromLogInToSignUp(RiderLoginController.this);
        }
            
         
    };
    
    
      public void disposeView(){
        loginView.dispose();
    }

    public Long getRiderId() {
        return riderId;
    }
    
      
      
    
    
    
     public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RiderLoginController c = new RiderLoginController();
            }
        });
    }
    
}

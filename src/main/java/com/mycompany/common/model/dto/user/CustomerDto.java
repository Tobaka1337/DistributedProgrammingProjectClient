/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.common.model.dto.user;

/**
 *
 * @author aferr
 */
public class CustomerDto {
    
    private Long id;
    private String address;
    private String name;
    private String surname;
    private String telephoneNumber;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    
    
}

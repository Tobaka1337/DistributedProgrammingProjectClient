/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.common.model.dao.order;

import java.util.List;

/**
 *
 * @author aferr
 */
public class DishEntity {
    
    private Long id;
    private String name;
    private String description;
    private List<String> ingredients;
    private double price;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.common.model.dto.order;

import com.mycompany.common.model.dao.order.DishOrderAssociation;
import com.mycompany.common.model.dto.user.CustomerDto;
import com.mycompany.common.model.dto.user.ProviderDto;
import com.mycompany.common.model.dto.user.RiderDto;
import com.mycompany.common.model.enumerations.OrderState;
import com.mycompany.common.model.enumerations.OrderType;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author aferr
 */
public class OrderDto {
    
    private Long id;
    private List<DishOrderAssociation> dishOrderAssociations;
    private CustomerDto customer;
    private ProviderDto provider;
    private RiderDto rider;
    private OrderType orderType;
    private OrderState orderState;
    private LocalDateTime deliveryTime;
    private double price;
    
    
    
}
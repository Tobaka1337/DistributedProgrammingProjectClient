/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.providerclient.api;

import com.mycompany.common.model.Credentials;
import com.mycompany.common.model.dao.order.DishEntity;
import com.mycompany.common.model.dao.order.MenuEntity;
import com.mycompany.common.model.dto.order.OrderDto;
import com.mycompany.providerclient.model.ProviderEntity;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

/**
 *
 * @author aferr
 */
public interface ServiceApi {
    
    @POST("provider/login")
    Call<Long> login(@Body Credentials credentials);
        
    @POST("provider/postProvider")
    Call<ProviderEntity> createNewProvider(@Body ProviderEntity provider);
    
    @GET("provider/{provider-id}/getPendingOrders")
    Call<List<OrderDto>> getPendingOrders(@Path("provider-id") Long providerId);
    
    @GET("provider/{provider-id}/getAcceptedOrders")
    Call<List<OrderDto>> getAcceptedOrders(@Path("provider-id") Long providerId);
    
    @GET("provider/{provider-id}/getSemiAcceptedOrders")
    Call<List<OrderDto>> getSemiAcceptedOrders(@Path("provider-id") Long providerId);
    
    @GET("provider/{provider-id}/getShippedOrders")
    Call<List<OrderDto>> getShippedOrders(@Path("provider-id") Long providerId);
    
    @GET("provider/{provider-id}/getCompletedOrders")
    Call<List<OrderDto>> getCompletedOrders(@Path("provider-id") Long providerId);
    
    @GET("provider/{provider-id}/getMenu")
    Call<MenuEntity> getMenu(@Path("provider-id") Long providerId);
    
    @POST("provider/{provider-id}/addDish")
    Call<DishEntity> addDish(@Path("provider-id") Long providerId, @Body DishEntity dish);
}

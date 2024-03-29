package com.example.petshop.data.network;

import com.example.petshop.data.model.Item;
import com.example.petshop.data.network.response.ItemResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ItemsService {

    @GET("/dev/api/item")
    Call<ItemResponse> getItems();
}

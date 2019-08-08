package com.example.myapplication;

import java.util.List;

import com.example.myapplication.RetroBook;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/books")
    Call<List<RetroBook>> getAllBooks();
}
package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class RetroBook {

    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("isbn")
    private Integer isbn;
    @SerializedName("price")
    private Float price;
    @SerializedName("currencyCode")
    private String currencyCode;
    @SerializedName("author")
    private String author;

    public RetroBook(Integer id, String title, Integer isbn, Float price, String currencyCode, String author) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.currencyCode = currencyCode;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getISO() {
        return currencyCode;
    }

    public void setISO(String ISO) {
        this.currencyCode = currencyCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
package com.example.adminapp;

public class Upload {
    private String mName,mPrice,mDesc,mQua;
    private String mImageUrl;
    public Upload(){}


    public Upload(String name, String price, String desc, String quantity, String imageUrl) {

        if (name.trim().equals("")){
            name = "No Name";
        }

        if(price.trim().equals("")){
            price = "no price";
        }

        if(desc.trim().equals("")){
            desc = "no desc";
        }

        if(quantity.trim().equals("")){
            quantity = "no qua";
        }

        mName = name;
        mPrice = price;
        mDesc = desc;
        mQua = quantity;
        mImageUrl = imageUrl;


    }

    public String getmName(){return mName;}
    public void setmName(String name){mName=name;}

    public  String getmPrice(){return mPrice;}
    public void setmPrice(String price){mPrice=price;}

    public  String getmDesc(){return mDesc;}
    public void setmDesc(String desc){mDesc=desc;}

    public  String getmQua(){return mQua;}
    public void setmQua(String quantity){mQua = quantity;}



    public String getmImageUrl(){return mImageUrl;}
    public void setmImageUrl(String imageUrl){mImageUrl=imageUrl;}







}

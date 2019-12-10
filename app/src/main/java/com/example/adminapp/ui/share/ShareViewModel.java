package com.example.adminapp.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Krishiraj provide all vegetables and fruits." +
                "We promise our customers best quality at best price" +
                "on delivery(COD). Our dream is to provide our customer best Quality");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
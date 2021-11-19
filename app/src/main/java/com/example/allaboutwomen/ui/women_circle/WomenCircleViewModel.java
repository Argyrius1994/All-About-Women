package com.example.allaboutwomen.ui.women_circle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WomenCircleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WomenCircleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Women_Circle fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
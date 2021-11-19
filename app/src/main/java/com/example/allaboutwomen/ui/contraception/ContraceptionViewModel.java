package com.example.allaboutwomen.ui.contraception;


import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.allaboutwomen.R;


public class ContraceptionViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    Button ccButton;

    public ContraceptionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contraception fragment " +
                "\n and it contains everything you need to know about this matter");

    }

    public LiveData<String> getText() {
        return mText;
    }


}

package com.example.allaboutwomen.ui.women_circle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.allaboutwomen.databinding.FragmentWomenCircleBinding;

public class WomenCircleFragment extends Fragment {

    private WomenCircleViewModel womenCircleViewModel;
    private FragmentWomenCircleBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        womenCircleViewModel =
                new ViewModelProvider(this).get(WomenCircleViewModel.class);

        binding = FragmentWomenCircleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWomenCircle;
        womenCircleViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
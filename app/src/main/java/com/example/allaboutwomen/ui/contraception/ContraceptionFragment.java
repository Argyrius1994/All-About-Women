package com.example.allaboutwomen.ui.contraception;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.allaboutwomen.databinding.FragmentContraceptionBinding;

public class ContraceptionFragment extends Fragment  {

    private ContraceptionViewModel contraceptionViewModel;
    private FragmentContraceptionBinding binding;
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contraceptionViewModel =
                new ViewModelProvider(this).get(ContraceptionViewModel.class);

        binding = FragmentContraceptionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContraception;
        contraceptionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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
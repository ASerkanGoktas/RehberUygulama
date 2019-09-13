package com.example.rehberuygulama.Signin.TYTRenk;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rehberuygulama.R;

public class TYTRenkFrag extends Fragment {

    private TytrenkViewModel mViewModel;

    public static TYTRenkFrag newInstance() {
        return new TYTRenkFrag();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tytrenk_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TytrenkViewModel.class);
        // TODO: Use the ViewModel
    }

}

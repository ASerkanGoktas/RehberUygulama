package com.example.rehberuygulama.Signin.AYTEkle.AYTekleKonu;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rehberuygulama.R;

public class AYTekleKonuFrag extends Fragment {

    private AytekleKonuViewModel mViewModel;

    public static AYTekleKonuFrag newInstance() {
        return new AYTekleKonuFrag();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aytekle_konu_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AytekleKonuViewModel.class);
        // TODO: Use the ViewModel
    }

}

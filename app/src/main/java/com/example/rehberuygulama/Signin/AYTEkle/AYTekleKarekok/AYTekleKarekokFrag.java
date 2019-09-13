package com.example.rehberuygulama.Signin.AYTEkle.AYTekleKarekok;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rehberuygulama.R;

public class AYTekleKarekokFrag extends Fragment {

    private AytekleKarekokViewModel mViewModel;

    public static AYTekleKarekokFrag newInstance() {
        return new AYTekleKarekokFrag();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aytekle_karekok_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AytekleKarekokViewModel.class);
        // TODO: Use the ViewModel
    }

}

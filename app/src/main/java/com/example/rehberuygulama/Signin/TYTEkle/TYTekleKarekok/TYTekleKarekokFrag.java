package com.example.rehberuygulama.Signin.TYTEkle.TYTekleKarekok;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rehberuygulama.R;

public class TYTekleKarekokFrag extends Fragment {

    private TytekleKarekokViewModel mViewModel;

    public static TYTekleKarekokFrag newInstance() {
        return new TYTekleKarekokFrag();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tytekle_karekok_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TytekleKarekokViewModel.class);
        // TODO: Use the ViewModel
    }

}

package com.example.mouhamed.dicowolofjapanese.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mouhamed.dicowolofjapanese.R;

public class OptionFragment extends Fragment {


    public static OptionFragment newInstance() {
      OptionFragment optionFragment = new OptionFragment();
      return optionFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option, container, false);
    }

}

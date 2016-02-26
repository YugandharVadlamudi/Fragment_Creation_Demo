package com.example.kiran.fragment_creation_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kiran on 12-11-2015.
 */
public class Fragment_extends_Class extends Fragment
{
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        inflate=fill
//        inflate(  resource ID of the layout,ViewGroup to be the parent of the inflated layout.,boolean indicating whether the inflated layout should be attached to the ViewGroup true makes redundent layout)
//        calling first fragment layout
        return inflater.inflate(R.layout.first_fragment_layout,container,false);
    }//onCreateview end
}//Fragment_extends_Class end

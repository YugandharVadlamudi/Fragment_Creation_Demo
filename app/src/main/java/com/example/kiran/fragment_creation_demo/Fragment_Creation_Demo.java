package com.example.kiran.fragment_creation_demo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Kiran on 12-11-2015.
 */
public class Fragment_Creation_Demo extends Activity {
    Fragment Fragment_load;
    FragmentManager FM;
    FragmentTransaction FT;
    View view_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_creation);
       /* *//*
        Android provides the FragmentManager class. Each Activity has an
        instance of Android.App.FragmentManager that will find or dynamically change its Fragments.
         *//*
        FragmentManager FM_Fragment_class=getFragmentManager();
        *//*
        With transaction we mean a sequence of steps to add, replace or remove fragments
         *//*
        FragmentTransaction FT_Fragment_class=FM_Fragment_class.beginTransaction();
        //User defined class
        Fragment_extends_Class FEC=new Fragment_extends_Class();
*//*
* add(viewGroupid,fragment to add);
* *//*
        FT_Fragment_class.add(R.layout.fragment_creation,FEC);
        *//*commit() changes should be placed*//*
        FT_Fragment_class.commit();*/
    }//OnCreate end
    /*
    Farg call function
    */
    public void Frage_call(View view)
    {
        if(view==findViewById(R.id.Button_one))
            Fragment_load=new Fragment_extends_Class();
        else
            Fragment_load=new Secound_Fragment_call();
        FM=getFragmentManager();
        FT=FM.beginTransaction();
        FT.replace(R.id.Fragment_1,Fragment_load);
        FT.commit();
    }//Frage_call end
}//Fragment_Creation_Demo end

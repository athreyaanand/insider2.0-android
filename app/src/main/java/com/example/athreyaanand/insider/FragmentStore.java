package com.example.athreyaanand.insider;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentStore extends Fragment{


    public static StoreItem [] itemList = {new StoreItem(R.drawable.ic_launcher, "Horror Pack", "This is a description! WOah woah woah wooooo"), new StoreItem(R.drawable.ic_launcher, "School Pack", "This is a description! WOah woah woah wooooo"), new StoreItem(R.drawable.ic_launcher, "Halloween Pack", "This is a description! WOah woah woah wooooo"), new StoreItem(R.drawable.ic_launcher, "Christmas Pack", "This is a description! WOah woah woah wooooo"), new StoreItem(R.drawable.ic_launcher, "Superhero Pack", "This is a description! WOah woah woah wooooo"), new StoreItem(R.drawable.ic_launcher, "Cool Kids Pack", "This is a description! WOah woah woah wooooo")};

    public FragmentStore() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = getActivity().findViewById(R.id.lv);
        lv.setAdapter(new StoreAdapter(getActivity(), itemList));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store , container, false);
    }
}

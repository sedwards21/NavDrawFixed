package com.javatechig.drawer;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class BlankFragment extends Fragment  {

    private Button next;
    LinearLayout theLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final LayoutInflater inf = inflater;
         next = (Button) getView().findViewById(R.id.continueButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // theLayout = (LinearLayout)inf.inflate(R.layout.edit_settings, container, false);
            }
        });


        // Retrieving the currently selected item number
        int position = getArguments().getInt("position");

        String url = getArguments().getString("url");

        // List of rivers
        String[] menus = getResources().getStringArray(R.array.menus);

        // Creating view corresponding to the fragment
        View v = inflater.inflate(R.layout.fragment_gender, container, false);

        // Updating the action bar title
        getActivity().getActionBar().setTitle(menus[position]);

        //Initializing and loading url in webview
        //WebView webView = (WebView)v.findViewById(R.id.webView);
//		webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(url);

        return v;
    }


}

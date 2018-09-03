package com.example.gadnuuk.automobileperekrestok;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PerekrestokFragment extends Fragment {
    private View mSceneView;
    private ImageView mRedView;
    private ImageView mYellowView;
    private ImageView mGreenView;

    private int mRedColor;
    private int mYellowColor;
    private int mGreenColor;
    private int mGrayColor;

    public static PerekrestokFragment newInstance() {

        return new PerekrestokFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perekrestok, container, false);

        mSceneView = view;
        mRedView = view.findViewById(R.id.red);
        mRedView.setBackgroundResource(R.drawable.animaciya_red);
        mYellowView = view.findViewById(R.id.yellow);
        mYellowView.setBackgroundResource(R.drawable.animaciya_yellow);
        mGreenView = view.findViewById(R.id.green);
        mGreenView.setBackgroundResource(R.drawable.animaciya_green);

        Resources resources = getResources();

        mRedColor = resources.getColor(R.color.redLight);
        mYellowColor = resources.getColor(R.color.yellowLight);
        mGreenColor = resources.getColor(R.color.greenLight);
        mGrayColor = resources.getColor(R.color.grayLight);

        mSceneView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startAnimation();
            }
        });

        return view;
    }

    private void startAnimation(){

            AnimationDrawable redAnimation = (AnimationDrawable) mRedView.getBackground();
            AnimationDrawable yellowAnimation = (AnimationDrawable) mYellowView.getBackground();
            AnimationDrawable greenAnimation = (AnimationDrawable) mGreenView.getBackground();

            redAnimation.start();
            yellowAnimation.start();
            greenAnimation.start();

    }
}

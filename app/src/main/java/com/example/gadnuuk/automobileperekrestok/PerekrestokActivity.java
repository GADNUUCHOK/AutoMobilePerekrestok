package com.example.gadnuuk.automobileperekrestok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class PerekrestokActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return PerekrestokFragment.newInstance();
    }
}

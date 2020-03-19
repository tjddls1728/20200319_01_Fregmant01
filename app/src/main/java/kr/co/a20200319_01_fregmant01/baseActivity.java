package kr.co.a20200319_01_fregmant01;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class baseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setupValues();
}

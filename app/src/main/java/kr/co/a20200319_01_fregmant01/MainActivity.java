package kr.co.a20200319_01_fregmant01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;

import kr.co.a20200319_01_fregmant01.databinding.ActivityMainBinding;

public class MainActivity extends baseActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {

        binding.firstfragCallBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프래그먼트 호출 버튼이 눌리면?
//                firstfrag보이게 => firstfrag자체는 기능이 별로 없음 <linear>붙여줌 아이디= +layout.
                binding.firstfraglayout.setVisibility(View.VISIBLE);
//                secondfrag 숨김.
                binding.secondfraglayout.setVisibility(View.GONE);

            }
        });

        binding.secondfragCallBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.secondfraglayout.setVisibility(View.VISIBLE);
                binding.firstfraglayout.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void setupValues() {

    }
}

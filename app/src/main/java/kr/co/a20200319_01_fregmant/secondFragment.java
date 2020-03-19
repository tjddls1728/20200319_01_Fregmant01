package kr.co.a20200319_01_fregmant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import kr.co.a20200319_01_fregmant01.R;
import kr.co.a20200319_01_fregmant01.databinding.FragmentSecondBinding;

public class secondFragment extends Fragment {

    FragmentSecondBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        return binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ID = binding.idEdt1.getText().toString();
                String PW = binding.pwEdt2.getText().toString();

                if (ID.equals("admin") && PW.equals("asdf1234")) {
                    Toast.makeText(getActivity(), "관리자입니다", Toast.LENGTH_SHORT).show();
                }else if (ID.equals("admin") && PW !="asdf1234") {
                    Toast.makeText(getActivity(), "비번이 틀렸습니다", Toast.LENGTH_SHORT).show();
                }else if (ID != "admin" && PW.equals("asdf1234")){
                    Toast.makeText(getActivity(),"ID가 틀렸습니다",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "잘못된 계정입니다", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
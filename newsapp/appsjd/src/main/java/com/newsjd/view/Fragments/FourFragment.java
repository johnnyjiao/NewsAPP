package com.newsjd.view.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.newsjd.R;
import com.utils.HttpUtils;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public class FourFragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "sjd secfrag";
    View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.activity_second, container, false);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = mView.findViewById(R.id.button2);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Log.e(TAG, "onClick: button2");
                HttpUtils.login("tes", "test").filter(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String s) {
                        Log.e(TAG, "call: " + s );
                        return null;
                    }
                });
                break;
            default:
                Log.e(TAG, "onClick: " + v.getId());
        }
    }
}
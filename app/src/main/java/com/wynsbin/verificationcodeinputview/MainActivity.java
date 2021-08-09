package com.wynsbin.verificationcodeinputview;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wynsbin.vciv.VerificationCodeInputView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements VerificationCodeInputView.OnInputListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        VerificationCodeInputView verificationCodeInputView1 = findViewById(R.id.vciv_code1);
//        VerificationCodeInputView verificationCodeInputView2 = findViewById(R.id.vciv_code2);
        VerificationCodeInputView verificationCodeInputView3 = findViewById(R.id.vciv_code3);
//        verificationCodeInputView1.setOnInputListener(this);
//        verificationCodeInputView2.setOnInputListener(this);
        verificationCodeInputView3.setOnInputListener(this);
        findViewById(R.id.btn_clear).setOnClickListener(view -> {
//            verificationCodeInputView1.clearCode();
//            verificationCodeInputView2.clearCode();
            verificationCodeInputView3.clearCode();
        });


        verificationCodeInputView3.setEtCursorColor("#ffc000");
    }

    @Override
    public void onComplete(String code) {
        Toast.makeText(MainActivity.this, code, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInput() {

    }

    @Override
    public void onInputPlus(int codesSize, View[] mUnderLineViews) {
        for (int i = 0; i < codesSize; i++) {
            mUnderLineViews[i].setBackgroundColor(Color.parseColor("#1E1F20"));
        }
    }
}

package com.noadam.pushlearn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void onButton(View view) {
        EditText a = (EditText)findViewById(R.id.editText);
        String password = a.getText().toString();
        if (password.length() > 8) {
            TextView texter = (TextView)findViewById(R.id.toster);
            texter.setText("Ваш пароль длинный");
        }
        else if (password.length() < 8){
            TextView hui = (TextView)findViewById(R.id.toster);
            hui.setText(R.string.go);
        }
        else if (password == "Пошел на хуй") {
            Button odinhui = (Button)findViewById(R.id.button);
            odinhui.setText("Сам пошел на хуй");
        }
        else {
            TextView hui = (TextView)findViewById(R.id.toster);
            hui.setText("Это else");
        }
    }
}

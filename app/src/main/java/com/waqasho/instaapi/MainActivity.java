package com.waqasho.instaapi;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    EditText urlInput;
    TextView resultView;
    Button fetchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlInput = findViewById(R.id.url_input);
        resultView = findViewById(R.id.result_view);
        fetchButton = findViewById(R.id.fetch_button);

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        fetchButton.setOnClickListener(v -> {
            String url = urlInput.getText().toString();
            Python py = Python.getInstance();
            PyObject pyObj = py.getModule("main");  // main.py
            String result = pyObj.callAttr("fetch_url", url).toString();
            resultView.setText(result);
        });
    }
              }

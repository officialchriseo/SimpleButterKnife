package com.blogspot.officialceo.simplebutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.email_title)
    TextView emailTitle;

    @BindView(R.id.email_edttxt)
    TextView emailEdttxt;

    @BindView(R.id.password_edttxt)
    TextView passEdittxt;

    @BindView(R.id.submit_button)
    Button submitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


    }

    @OnClick(R.id.submit_button)
    public void onButtonClick(View view){
        Toast.makeText(this, emailEdttxt.getText().toString() + " " + passEdittxt.getText().toString(), Toast.LENGTH_SHORT).show();
    }



}

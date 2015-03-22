package com.github.berkedel.almatsurat_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class MainMenuActivity extends Activity {
    private BootstrapButton btnShughra;
    private BootstrapButton btnKubra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);

        // init buttons
        btnShughra = (BootstrapButton) findViewById(R.id.btn_shughra);
        btnKubra = (BootstrapButton) findViewById(R.id.btn_kubra);

        btnShughra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, ShughraActivity.class);
                startActivity(intent);
            }
        });

        btnKubra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(MainMenuActivity.class.getSimpleName(), "btnKubra");
            }
        });
    }
}
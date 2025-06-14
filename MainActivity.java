package com.example.nhom6btlon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load fragment mặc định
        loadFragment(new HomeFragment());

        // Ánh xạ các Button menu
        Button btnHome = findViewById(R.id.btnHome);
        Button btnService = findViewById(R.id.btnService);
        Button btnRescue = findViewById(R.id.btnRescue);
        Button btnParts = findViewById(R.id.btnParts);

        // Gắn sự kiện click
        btnHome.setOnClickListener(v -> loadFragment(new HomeFragment()));


        btnService.setOnClickListener(v -> loadFragment(new ServiceFragment()));

        btnRescue.setOnClickListener(v -> loadFragment(new RescueFragment()));

        btnParts.setOnClickListener(v -> loadFragment(new PartsFragment()));
    }

    // Hàm riêng để load fragment
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SendMessageActivity.class);
            startActivity(intent);
        }
    });
}
}

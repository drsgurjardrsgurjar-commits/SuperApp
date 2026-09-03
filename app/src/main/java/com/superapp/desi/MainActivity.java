package com.superapp.desi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 reelsViewPager;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reelsViewPager = findViewById(R.id.reelsViewPager);
        bottomNavigation = findViewById(R.id.bottomNavigation);

        // सैंपल यूट्यूब रील्स/शॉर्ट्स वीडियो IDs
        List<String> videoIds = new ArrayList<>();
        videoIds.add("dQw4w9WgXcQ");
        videoIds.add("9bZkp7q19f0");
        videoIds.add("kJQP7kiw5Fk");

        // रील्स एडॉप्टर सेट करना
        ReelsAdapter adapter = new ReelsAdapter(videoIds, getLifecycle());
        reelsViewPager.setAdapter(adapter);

        // बॉटम नेविगेशन क्लिक लिसनर
        bottomNavigation.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_reels) {
                return true;
            } else if (id == R.id.nav_movies) {
                // Movies सेक्शन
                return true;
            } else if (id == R.id.nav_ai) {
                // AI Guru सेक्शन
                return true;
            } else if (id == R.id.nav_tools) {
                // Tools सेक्शन
                return true;
            }
            return false;
        });
    }
}


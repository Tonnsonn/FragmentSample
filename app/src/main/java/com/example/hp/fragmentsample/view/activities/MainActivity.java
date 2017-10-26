package com.example.hp.fragmentsample.view.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.hp.fragmentsample.R;
import com.example.hp.fragmentsample.view.fragments.DashbordFragment;
import com.example.hp.fragmentsample.view.fragments.HomeFragment;
import com.example.hp.fragmentsample.view.fragments.NotificationFragment;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    addFragment(new HomeFragment());
                    break;
                   case R.id.navigation_dashboard:
                       addFragment(new DashbordFragment());
                       break;
                case R.id.navigation_notifications:
                    addFragment(new NotificationFragment());
                    break;
            }

            return true;
        }


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void addFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.content,fragment,fragment.getClass().getName()).addToBackStack(fragment.getClass().getName());
        transaction.commit();
    }

}

package com.example.mouhamed.dicowolofjapanese.Action;

import android.app.FragmentTransaction;
import android.os.TransactionTooLargeException;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.MenuItem;

import com.example.mouhamed.dicowolofjapanese.R;
import com.example.mouhamed.dicowolofjapanese.fragment.FavoritesFragment;
import com.example.mouhamed.dicowolofjapanese.fragment.OptionFragment;
import com.example.mouhamed.dicowolofjapanese.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(SearchFragment.newInstance());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_search:
                    setFragment(SearchFragment.newInstance());
                    return true;
                case R.id.nav_favorite:
                    setFragment(FavoritesFragment.newInstance());
                    return true;
                case R.id.nav_menus:
                    setFragment(OptionFragment.newInstance());
                    return true;
            }
            return false;
        }
    };

        private void setFragment(android.app.Fragment fragment) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.content, fragment);
            transaction.commit();
        }
    }



package com.newsjd.view.Activity;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.MenuItem;

import pub.cpp.news.R;

import com.newsjd.config.Contants;
import com.newsjd.view.Adapter.AdapterMainVP;

import java.lang.reflect.Field;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "MainActivity";

    private ViewPager mViewPager;
    private AdapterMainVP mAdapterMainVP;
    private BottomNavigationView bottomNavigationView;
    private MenuItem menuItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.main_view_pager);

        mAdapterMainVP = new AdapterMainVP(getSupportFragmentManager(), Contants.FourPart, Contants.FourPart_Name);
        mViewPager.setAdapter(mAdapterMainVP);
        bottomNavigationView = findViewById(R.id.main_bottom_navigation_view);
        initView();
    }

    private void initView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        //设置左右单侧保存的 item数量
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                bottomNavigationView.setSelectedIndex(position);
                bottomNavigationView.setSelectedItemId(position);
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                menuItem = bottomNavigationView.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.e(TAG, "onMenuItemSelected: ");
        menuItem = item;
        switch (item.getItemId()) {
            case R.id.bottom_start:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.bottom_epg:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.bottom_series_list:
                mViewPager.setCurrentItem(2);
                break;
            case R.id.bottom_discover:
                mViewPager.setCurrentItem(3);
                break;
            default:
        }
//        mViewPager.setCurrentItem();
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

   /* public static final String CURRENT_FRAGMENT = "current_fragment";

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.slide_in_bottom, R.anim.fade_out)
                .replace(R.id.container, fragment, CURRENT_FRAGMENT)
                .commit();
    }
    */
}

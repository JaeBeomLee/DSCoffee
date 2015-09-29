package com.lee.dscoffee;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lee.dscoffee.cafe.Americano;
import com.lee.dscoffee.cafe.CafeLatte;
import com.lee.dscoffee.cafe.CafeMocha;
import com.lee.dscoffee.cafe.Cappuccino;
import com.lee.dscoffee.cafe.Caramel_Macchiato;
import com.lee.dscoffee.cafe.Chocolate;
import com.lee.dscoffee.cafe.White_Chocolate;
import com.lee.dscoffee.cafe.White_Chocolate_Mocha;

public class MainActivity extends FragmentActivity {


    AppSectionsPagerAdapter mAppSectionsPagerAdapter;

    ViewPager mViewPager;
    ImageView imageView;
    Button menu1;
    Button menu2;
    public static int btn = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAppSectionsPagerAdapter = new AppSectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAppSectionsPagerAdapter);
        imageView = (ImageView)findViewById(R.id.imageView);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
            }
        });

        for (int i = 0; i < mAppSectionsPagerAdapter.getCount(); i++) {
        }
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_1:
                btn = 0;
                mAppSectionsPagerAdapter.notifyDataSetChanged();
                break;
            case R.id.btn_2 :
                btn = 1;
                mAppSectionsPagerAdapter.notifyDataSetChanged();
                break;
        }
    }

    public static class AppSectionsPagerAdapter extends FragmentPagerAdapter {

        Americano americano = new Americano();
        CafeLatte cafeLatte = new CafeLatte();
        CafeMocha cafeMocha = new CafeMocha();
        Cappuccino cappuccino = new Cappuccino();
        Caramel_Macchiato caramel_Macciato = new Caramel_Macchiato();
        Chocolate chocolate = new Chocolate();
        White_Chocolate white_Chocolate = new White_Chocolate();
        White_Chocolate_Mocha white_Chocolate_Mocha = new White_Chocolate_Mocha();

        public AppSectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

               switch (i) {
                   case 0:
                       return americano;
                   case 1:
                       return cafeLatte;
                   case 2:
                       return cafeMocha;
                   case 3:
                       return cappuccino;
                   case 4:
                       return caramel_Macciato;
                   case 5:
                       return chocolate;
                   case 6:
                       return white_Chocolate;
                   case 7:
                       return white_Chocolate_Mocha;
                   default:
                       return null;
               }
        }

        @Override
        public int getItemPosition(Object item) {
                // after this, onCreateView() of Fragment is called.
                return POSITION_NONE;   // notifyDataSetChanged


        }
        @Override
        public int getCount() {
            //view number
            return 8;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Section " + (position + 1);
        }
    }
}






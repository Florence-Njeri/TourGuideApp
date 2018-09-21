package com.example.admin.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public ScreenSlidePagerAdapter(FragmentManager fm,Context context) {
        super(fm) ;
        this.context=context;
    }



    /*
        supply instances of ScreenSlidePageFragment as new pages.
        and returns a fragment assocoated with each position
         */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new ExploreFragment();

            case 2:
                return new ToDoFragment();

            case 3 :
               return new HotelsFragment();

            default:
                return null;
        }


    }
    /*
    Returns the number of pages the adapter will create
     */

    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.home);
            case 1:
                return context.getString(R.string.to_do);
            case 2:
                return context.getString(R.string.explore);
            case 3:
                return context.getString(R.string.hotels);
            default:
                return null;

        }
    }
}

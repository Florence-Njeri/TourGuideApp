package com.example.admin.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /*
    supply instances of ScreenSlidePageFragment as new pages.
    and returns a fragment assocoated with each position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new IslandsFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new ToDoFragment();
            default:
                return null;
        }


    }
    /*
    REturns the number of pages the adapter will create
     */

    @Override
    public int getCount() {
        return 3;
    }
}

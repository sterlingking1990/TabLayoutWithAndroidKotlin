package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, lifeCycle : Lifecycle):FragmentStateAdapter(fragmentManager, lifeCycle) {

    private val PAGECOUNT=3
    override fun getItemCount()=PAGECOUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FragmentOne()
            1->FragmentTwo()
            2->FragmentThree()
            else->FragmentOne()
        }
    }


}
package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //initialize the viewPager layout which will be the page for our view(fragments)
        var viewPager = vpFragmentPages
        var tabLayout:TabLayout=tbFragmentTab

        val fragmentPageAdp = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = fragmentPageAdp

        TabLayoutMediator(tabLayout, viewPager){each_tab,viewPosition->
            when(viewPosition){
                0->{
                    each_tab.text="HOME"
                    each_tab.setIcon(R.drawable.ic_baseline_home_24)
                }
                1->{
                    each_tab.text="PROFILE"
                    each_tab.setIcon(R.drawable.ic_baseline_profile)
                }
                else->{
                    each_tab.text="CASH OUT"
                    each_tab.setIcon(R.drawable.ic_cashout)
                }
            }
        }.attach()



    }
}

package com.kim.pizzachickenstore2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzachickenstore2.fragments.ChickenStoreListFragment
import com.kim.pizzachickenstore2.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            1 -> ChickenStoreListFragment()
            else -> PizzaStoreListFragment()

        }


    }
}
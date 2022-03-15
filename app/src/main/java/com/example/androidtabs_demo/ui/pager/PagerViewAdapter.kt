package com.example.androidtabs_demo.ui.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class PagerViewAdapter(fa: FragmentActivity, private val fragmentsList: List<Fragment>, val tabsList: List<String>): FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsList[position]
    }

}
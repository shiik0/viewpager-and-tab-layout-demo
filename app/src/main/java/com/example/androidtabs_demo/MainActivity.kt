package com.example.androidtabs_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidtabs_demo.databinding.ActivityMainBinding
import com.example.androidtabs_demo.ui.pager.PagerViewAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.pager_view.viewPager
import kotlinx.android.synthetic.main.tabs_view.tabLayout


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupViews()

    }

    private fun setupViews() {
        val tabLayout = binding.tabsContainer
        val viewPager = binding.pagerContainer
        val adapter = PagerViewAdapter(this, listOf(RandomFragment(), RandomFragment()), listOf("Tab 1", "Tab 2"))
        viewPager.viewPager.adapter = adapter

        TabLayoutMediator(tabLayout.tabLayout, viewPager.viewPager) { tab, position ->
            tab.text = adapter.tabsList[position]
        }.attach()
    }
}



class RandomFragment: Fragment() {}
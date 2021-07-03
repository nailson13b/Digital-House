package com.github.cesar1287.turma1dh

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    private val fragmentList: List<Fragment>,
    private val fragmentTitleList: List<String>,
    fragmentManager: FragmentManager
): FragmentPagerAdapter(
    fragmentManager
) {

    override fun getCount() = fragmentList.size

    override fun getItem(position: Int) = fragmentList[position]

    override fun getPageTitle(position: Int) = fragmentTitleList[position]
}
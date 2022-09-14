package com.github.appintro.internal.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

internal class PagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val fragments: MutableList<Fragment>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    fun getItem(position: Int): Fragment = TODO()

    override fun getItemCount() = this.fragments.size

    override fun createFragment(position: Int): Fragment {
        TODO()
    }
}

package kr.co.hgney.pizzachickenstore_20200610.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.hgney.pizzachickenstore_20200610.fragments.ChickenFragments
import kr.co.hgney.pizzachickenstore_20200610.fragments.PizzaFragments

class StoreFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"피자가게"
            else->"치킨집"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaFragments()
            else -> ChickenFragments()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}
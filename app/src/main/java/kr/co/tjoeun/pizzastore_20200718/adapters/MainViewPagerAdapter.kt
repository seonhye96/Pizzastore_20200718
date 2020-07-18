package kr.co.tjoeun.pizzastore_20200718.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizzastore_20200718.fragments.MyProfileFragment
import kr.co.tjoeun.pizzastore_20200718.fragments.PizzaStoreListFragment

class MainViewPagerAdapter (fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자주문"
            else -> "내 정보 설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}
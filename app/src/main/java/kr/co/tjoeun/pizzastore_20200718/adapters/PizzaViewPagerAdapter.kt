package kr.co.tjoeun.pizzastore_20200718.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.pizzastore_20200718.datas.PizzaStore

class PizzaViewPagerAdapter(val mContext:Context, val resId:Int, val mList : List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}
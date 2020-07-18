package kr.co.tjoeun.pizzastore_20200718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.tjoeun.pizzastore_20200718.datas.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {

//    들고온 피자가게 데이터를 저장할 멤버 변수
    lateinit var mPizzaStroe : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        setupEvents()
        setupValues()
    }

    override fun setupEvents() {

    }

    override fun setupValues() {

//        가져온 피자가게를 멤버변수에 저장. (캐스팅 활용)
        mPizzaStroe = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(mPizzaStroe.logoUrl).into(logoImg)

        storeNameTxt.text = mPizzaStroe.name
        storePhoneNumTxt.text = mPizzaStroe.phoneNum

    }


}
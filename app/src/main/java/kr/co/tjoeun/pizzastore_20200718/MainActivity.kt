package kr.co.tjoeun.pizzastore_20200718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzastore_20200718.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setupValues()
    }

    override fun setupEvents() {

    }

    override fun setupValues() {

//        어댑터 생성 => 뷰페이저와 연결
        mvpa = MainViewPagerAdapter(supportFragmentManager)

        mainViewPager.adapter = mvpa

//        뷰페이저와 / 탭레이아웃 연결

        myTabLayout.setupWithViewPager(mainViewPager)
    }
}
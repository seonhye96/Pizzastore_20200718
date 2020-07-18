package kr.co.tjoeun.pizzastore_20200718

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.tjoeun.pizzastore_20200718.datas.PizzaStore
import java.util.jar.Manifest

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

        callBtn.setOnClickListener {

//            실제로 권한 확인하고 전화걸도록
            val pizzaStoreCall = object : PermissionListener{


                    override fun onPermissionGranted() {
                        val phoneNumUri = Uri.parse("tel:${mPizzaStroe.phoneNum}")
                        val phoneIntent = Intent(Intent.ACTION_CALL, phoneNumUri)
                        startActivity(phoneIntent)
                    }

                    override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                        Toast.makeText(mContext, "권한 거절로 연결이 불가능합니다.", Toast.LENGTH_SHORT).show()
                    }

            }
            TedPermission.with(mContext)
                .setPermissions(android.Manifest.permission.CALL_PHONE)
                .setDeniedMessage("허용안하면 전화 못겁니다.")
                .setPermissionListener(pizzaStoreCall)
                .check()

        }

    }

    override fun setupValues() {

//        가져온 피자가게를 멤버변수에 저장. (캐스팅 활용)
        mPizzaStroe = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(mPizzaStroe.logoUrl).into(logoImg)

        storeNameTxt.text = mPizzaStroe.name
        storePhoneNumTxt.text = mPizzaStroe.phoneNum

    }


}
package kr.co.tjoeun.pizzastore_20200718

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_Nick_Name.*

class EditNickNameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_Nick_Name)


    }

    override fun setupEvents() {

    }

    override fun setupValues() {

//        입력한 닉네임 저장
        val inputNickName = newNickNameEdt.text.toString()

//        intent에 담아서 복귀
        val resultIntent = Intent()
        resultIntent.putExtra("nickName", inputNickName)
        setResult(Activity.RESULT_OK, resultIntent)

    }


}
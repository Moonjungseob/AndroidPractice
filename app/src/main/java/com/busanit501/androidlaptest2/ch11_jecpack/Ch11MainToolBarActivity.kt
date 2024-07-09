package com.busanit501.androidlaptest2.ch11_jecpack

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlaptest2.R
import com.busanit501.androidlaptest2.databinding.ActivityCh11Main2Binding
import com.busanit501.androidlaptest2.miniProject.lsy1205_mini.Lsy1205JoinActivity
import com.busanit501.androidlaptest2.miniProject.lsy1205_mini.Lsy1205LoginActivity
import com.busanit501.androidlaptest2.miniProject.lsy1205_mini.Lsy1205MainActivity

class Ch11MainToolBarActivity : AppCompatActivity() {
    lateinit var binding: ActivityCh11Main2Binding
    lateinit var TAG : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCh11Main2Binding.inflate(layoutInflater)
        TAG = "Ch11MainToolBarActivity"
        setContentView(binding.root)
//        setContentView(R.layout.activity_ch11_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //툴바 붙이기 작업.
        // 순서3
        setSupportActionBar(binding.ch11toolbarSample)


        //일반 텍스트 뷰와, 호환성을 고려한 뷰의 차이점 확인.
//        binding.ch11normalTextView.lineHeight = 100

        binding.ch11CompatTextView.lineHeight = 100




    } //onCreate

    //액션바에서, 메뉴 아이템 붙이는 작업과, 이벤트 핸들러도 거의 비슷 재사용.
    // 액션바의 업버튼(뒤로가기 버튼)이벤트 처리기 붙이기.
    override fun onSupportNavigateUp(): Boolean {
        Toast.makeText(this@Ch11MainToolBarActivity,"백버튼 동작여부", Toast.LENGTH_LONG).show()
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    // 툴바 붙이기 순서4
    // 액션바에 메인 메뉴 뷰 넣기.
    // 검색 뷰에 관한 이벤트 추가하기.

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //메뉴 아이템 붙이기.
        // 액션바의 메뉴 아이템
//        menuInflater.inflate(R.menu.ch11_menu_main,menu)

        // 툴바 메뉴 아이템으로 변경.
        menuInflater.inflate(R.menu.ch11_toolbar_menu_main,menu)

        // 검색 뷰 이벤트 추가하기.
        val menuItem = menu?.findItem(R.id.ch11MenuItemToolBarSearch)
        // 메뉴 아이템 우리가 작업할 타입으로 형변환
        //SearchView : 타입은 androidx.appcompat.widget.SearchView 이용하기. 주의사항
        val searchView = menuItem?.actionView as SearchView
        // object : SearchView.OnQueryTextListener
        // 익명 클래스 , 상속 또는 인터페이스 구현을 의미.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d(TAG,"검색 텍스트 이벤트 확인: ${query}")
                Toast.makeText(this@Ch11MainToolBarActivity,"검색 내용: ${query}", Toast.LENGTH_LONG).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Log.d(TAG,"변경된 텍스트 이벤트 확인: ${newText}")
                return true
            }


        })

        return super.onCreateOptionsMenu(menu)
    }

    // 툴바 순서 5, 아이템 요소 클릭시 이벤트 처리기 붙이기.
    // 액션바의 오버 플로우 안의 메뉴 클릭시 이벤트 처리 하기.
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){

        R.id.ch11MenuItemToolBarLogin -> {
            val intent = Intent(this@Ch11MainToolBarActivity, Lsy1205LoginActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.ch11MenuItemToolBarJoin -> {
            val intent = Intent(this@Ch11MainToolBarActivity, Lsy1205JoinActivity::class.java)
            startActivity(intent)
            true
        }

        R.id.ch11MenuItemToolBarBoard -> {
            val intent = Intent(this@Ch11MainToolBarActivity, Lsy1205MainActivity::class.java)
            startActivity(intent)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }

    }




} //Ch11MainToolBarActivity
package kr.co.hgney.pizzachickenstore_20200610

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.hgney.pizzachickenstore_20200610.adapters.StoreFragmentPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var  storePagerAdapter : StoreFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        storePagerAdapter = StoreFragmentPagerAdapter(supportFragmentManager)
        storeViewPager.adapter = storePagerAdapter

        myTabLayout.setupWithViewPager(storeViewPager)
    }

}

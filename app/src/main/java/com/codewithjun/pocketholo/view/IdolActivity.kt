package com.codewithjun.pocketholo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.codewithjun.pocketholo.R
import com.codewithjun.pocketholo.databinding.ActivityIdolBinding
import com.google.android.material.tabs.TabLayout

class IdolActivity : AppCompatActivity() {

    //viewbinding
    private lateinit var viewBinding:ActivityIdolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityIdolBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.menuTabs.addTab(viewBinding.menuTabs.newTab().setText("decription"))

        Glide.with(this).load("https://static.wikia.nocookie.net/virtualyoutuber/images/4/4e/Houshou_Marine_-_Portrait.png/revision/latest/scale-to-width-down/720?cb=20190821035347").into(viewBinding.idolImage)
    }
}
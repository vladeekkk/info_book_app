package com.xp.autobookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xp.autobookapp.databinding.ActivityMainBinding

internal class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicks()
    }

    private fun initClicks() {
        binding.fab.setOnClickListener {
            startActivityForResult(
                Intent(this, AddCarActivity::class.java),
                ADD_CAR_REQUEST_CODE
            )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data == null) return
        val carMark = data.getStringExtra(CAR_MARK_KEY) ?: ""
        updateView(carMark)
    }

    private fun updateView(newTitle: String) {
        binding.markTextView.text = newTitle
        binding.showInfoBtn.visibility = View.VISIBLE
    }
}

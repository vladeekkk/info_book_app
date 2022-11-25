package com.xp.autobookapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.xp.autobookapp.databinding.AddCarInfoActivityBinding

internal class AddCarActivity : AppCompatActivity() {

    companion object {

        fun createIntent(context: Context): Intent {
            return Intent(context, AddCarActivity::class.java)
        }
    }

    private lateinit var binding: AddCarInfoActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = AddCarInfoActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicks()
        binding.markEdt.visibility = View.VISIBLE
    }

    private fun initClicks() {
        binding.saveBtn.setOnClickListener {
            val intent = Intent().apply {
                putExtra(CAR_MARK_KEY, binding.markEdt.text)
            }
            setResult(RESULT_OK, intent);
        }
    }
}

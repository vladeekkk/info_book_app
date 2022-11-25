package com.xp.autobookapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.xp.autobookapp.databinding.AddCarInfoActivityBinding

class AddCarActivity : AppCompatActivity() {

    companion object {

        fun createIntent(context: Context): Intent {
            return Intent(context, AddCarActivity::class.java)
        }
    }

    private lateinit var binding: AddCarInfoActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.i("kekw", "onCreate")
        binding = AddCarInfoActivityBinding.inflate(layoutInflater)
        Log.i("kekw", "$binding")
        setContentView(binding.root)
        initClicks()
        binding.markEdt.visibility = View.VISIBLE
    }

    private fun initClicks() {
        binding.saveBtn.setOnClickListener {
            val intent = Intent().apply {
                putExtra("CarMark", binding.markEdt.text)
            }
            setResult(RESULT_OK, intent);
        }
    }
}

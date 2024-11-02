package com.example.geolab5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.geolab5.databinding.ActivityOrderBinding


class OrderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        var currentCount = 0

        binding.countTextView.text = currentCount.toString()

        binding.increaseButton.setOnClickListener {
            currentCount++
            binding.countTextView.text = currentCount.toString()
        }

        binding.decreaseButton.setOnClickListener {
            if (currentCount > 0) {
                currentCount--
            }

            binding.countTextView.text = currentCount.toString()
        }

        binding.backArrow.setOnClickListener {
            finish()
        }
    }
}

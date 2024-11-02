package com.example.geolab5
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.geolab5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()

    }

    private fun initListeners(){
        binding.continueButton.setOnClickListener{
            if(
                binding.editText.text.toString().isEmpty()||
                binding.editText2.text.toString().isEmpty()
            ){
                Toast.makeText(
                    this,
                    "Empty fields are not allowed",
                    Toast.LENGTH_SHORT).show()
            return@setOnClickListener
            }
            else if (
                binding.editText2.text.toString().length < 8
            ) {
                Toast.makeText(
                    this,
                    "password must be at least 8 characters!",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,OrderActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"logged in succesfully",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
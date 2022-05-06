package com.example.crosscountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crosscountry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var ite : Int = 1
        var j1 : Int = 1
        var a : Int = 0

        binding.team1.setOnClickListener(){

            if ( j1 == 1)
            {
                a += ite
                binding.team1a.text = ite.toString()
                binding.team1e.text = a.toString()
                j1++
                ite++

            }
            else if (j1 == 2)
            {
                a += ite
                binding.team1b.text = ite.toString()
                binding.team1e.text = a.toString()
                j1++
                ite++
            }
            else if (j1 == 3)
            {
                a += ite
                binding.team1c.text = ite.toString()
                binding.team1e.text = a.toString()
                ite++
                j1++
            }
            else if (j1 == 4)
            {
                a += ite
                binding.team1d.text = ite.toString()
                binding.team1e.text = a.toString()
                j1++
                ite++

            }
            else if (j1 == 5)
            {
                a += ite
                binding.team1e.text = ite.toString()
                j1++
                ite++
                binding.team1e.text = a.toString()
            }
            else if (j1 > 5)
            {
                binding.team1e.text = a.toString()
            }
        }

    }
}
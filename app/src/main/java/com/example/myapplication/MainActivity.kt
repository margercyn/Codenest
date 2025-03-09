package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Используем Handler для задержки на 3 секунды (3000 миллисекунд)
        Handler().postDelayed({
            // Переход на SecondActivity после 3 секунд
            val intent = Intent(this, Regictreshon::class.java)
            startActivity(intent)

            // Закрываем текущую активность (MainActivity)
            finish()
        }, 5000) // 5000 миллисекунд = 5 секунды
    }
}

package br.org.fittecnologia.fakenews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.org.fittecnologia.fakenews.databinding.ActivityNewsListBinding

class NewsListActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnNavigationTest.setOnClickListener {
            val navigateToMainActivity = Intent(this, MainActivity::class.java)
            startActivity(navigateToMainActivity)
        }

    }
}
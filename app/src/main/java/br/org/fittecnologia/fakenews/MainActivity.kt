package br.org.fittecnologia.fakenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView>(R.id.imagem_principal)

        Glide
            .with(this)
            .load("https://ibcdn.canaltech.com.br/8V8CJ88HfAZgQvC9G8eKJPkYpXY=/368x25:1392x602/512x288/smart/i404557.png")
            .placeholder(R.drawable.ic_noimage)
            .into(imageView)

    }
}
package br.org.fittecnologia.fakenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import br.org.fittecnologia.fakenews.databinding.ActivityMainBinding

import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var news: News


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        news = News(
                "Elon Musk tweets about ‘new drug called Regretamine’, triggering wave of memes and Dogecoin references",
                "‘New drug coming out called Regretamine. Pop one & all regrets are gone’",
                "https://static.independent.co.uk/2021/03/03/10/2021-02-15T135548Z_2064936280_RC21TL9X2BL9_RTRMADP_3_RUSSIA-PUTIN-CLUBHOUSE.JPG?width=1200&auto=webp&quality=75",
                "Tesla and SpaceX chief Elon Musk on Tuesday posted about a new drug called Regretamine, baffling some users and triggering a wave of memes and references to his power as a market tipster.\r\nNew drug c… [+2380 chars]",
                "Namita Singh",
                "Independent",
                "2021-03-03T12:24:07Z",
                "https://www.independent.co.uk/news/world/americas/elon-musk-regretamine-twitter-b1811623.html"
        )

        binding.newsTitle.text = news.title
        binding.description.text = news.description
        binding.textopadrao.text = news.content
        binding.source.text = getString(R.string.full_source, news.author, news.source)
        binding.lastUpdate.text = getString(R.string.last_updated, news.lastUpdate)

        Glide
            .with(this)
            .load(news.imageUrl)
            .placeholder(R.drawable.ic_noimage)
            .into(binding.imagemPrincipal)

        Log.i("LifeCycleTest", "onCreate")

    }


    override fun onStart() {
        super.onStart()

        Log.i("LifeCycleTest", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycleTest", "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycleTest", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycleTest", "onDestroy")
    }
}
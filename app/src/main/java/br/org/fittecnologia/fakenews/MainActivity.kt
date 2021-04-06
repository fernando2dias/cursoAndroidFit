package br.org.fittecnologia.fakenews

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.org.fittecnologia.fakenews.databinding.ActivityMainBinding
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    companion object{
        const val NEWS_KEY = "NEWS_KEY"
    }
    private lateinit var binding: ActivityMainBinding
    private lateinit var news: News

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        news = savedInstanceState?.getParcelable<News>(NEWS_KEY)
                ?: News(
                        "GS Acquisition Holdings Corp II: Rumors Create An Opportunity",
                        "There are rumors swirling around involving BlockFi and Flipkart. The excitement does create opportunity to position in GSAH that was valued at $15 pre-deal just weeks ago.",
                        "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                        "Yesterday there was a lot of price action in Goldman Sachs Acquisition Company II (NYSE:GSAH). This is a SPAC with a sponsor controlled by an affiliate of Goldman Sachs (NYSE:GS) through its Permanen… [+6435 chars] Yesterday there was a lot of price action in Goldman Sachs Acquisition Company II (NYSE:GSAH). This is a SPAC with a sponsor controlled by an affiliate of Goldman Sachs (NYSE:GS) through its Permanen… [+6435 chars]",
                        "Bram de Haas",
                        "Seeking Alpha",
                        "2021-03-12T11:38:12Z",
                        "https://arstechnica.com/tech-policy/2021/03/i-was-a-teenage-twitter-hacker-graham-ivan-clark-gets-3-year-sentence/"
                )


        //if(savedInstanceState?.getParcelable<News>("NEWS") != null)

        binding.newsTitle.text = news.title
        binding.newsDescription.text = news.description
        binding.newsContent.text = news.content
        binding.source.text = getString(R.string.full_source, news.author, news.source)
        binding.lastUpdate.text = getString(R.string.last_updated, news.lastUpdate)

        Glide
                .with(this)
                .load(news.imageUrl)
                .placeholder(R.drawable.ic_noimage)
                .into(binding.newsImage)

        Log.i("LifeCycleTest", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycleTest", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycleTest", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycleTest", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycleTest", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycleTest", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycleTest", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(NEWS_KEY, news)
        Log.i("LifeCycleTest", "onSaveInstanceState")
    }

}
package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageUrl: ImageView
    private lateinit var headline: TextView
    private lateinit var byline: TextView
    private lateinit var abstract: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageUrl = findViewById(R.id.mediaImage)
        headline = findViewById(R.id.mediaTitle)
        byline = findViewById(R.id.mediaByline)
        abstract = findViewById(R.id.mediaAbstract)
        // TODO: Get the extra from the Intent
        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as DisplayArticle

        // TODO: Set the title, byline, and abstract information from the article
        headline.text = article.headline
        byline.text = article.byline
        abstract.text = article.abstract


        // TODO: Load the media image
        Glide.with(this)
            .load(article.mediaImageUrl)
            .into(mediaImageUrl)
    }
}
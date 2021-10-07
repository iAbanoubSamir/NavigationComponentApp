package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_sport.*

class CategorySport : Fragment(R.layout.category_sport) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D8%AE%D8%A8%D8%A7%D8%B1%20%D8%A7%D9%84%D8%B1%D9%8A%D8%A7%D8%B6%D8%A9"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sport_wv.loadUrl(CATEGORY_URL)
        sport_wv.webViewClient = WebViewClient()
        sport_wv.settings.allowContentAccess = true
        sport_wv.settings.displayZoomControls = true
        sport_wv.settings.javaScriptEnabled = true
        sport_wv.settings.useWideViewPort = true
        sport_wv.settings.setSupportMultipleWindows(true)
        sport_wv.settings.setSupportZoom(true)
    }
}
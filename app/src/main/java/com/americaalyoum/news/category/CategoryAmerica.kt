package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_america.*

class CategoryAmerica : Fragment(R.layout.category_america) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D8%AE%D8%A8%D8%A7%D8%B1%20%D8%A7%D9%85%D8%B1%D9%8A%D9%83%D8%A7?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        america_wv.loadUrl(CATEGORY_URL)
        america_wv.webViewClient = WebViewClient()
        america_wv.settings.allowContentAccess = true
        america_wv.settings.displayZoomControls = true
        america_wv.settings.javaScriptEnabled = true
        america_wv.settings.useWideViewPort = true
        america_wv.settings.setSupportMultipleWindows(true)
        america_wv.settings.setSupportZoom(true)
    }
}
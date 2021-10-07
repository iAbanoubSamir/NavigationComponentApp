package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_arab_america.*

class CategoryArabAmerica : Fragment(R.layout.category_arab_america) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%AF%D9%84%D9%8A%D9%84%20%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%20%D9%81%D9%8A%20%D8%A7%D9%85%D8%B1%D9%8A%D9%83%D8%A7?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arab_america_wv.loadUrl(CATEGORY_URL)
        arab_america_wv.webViewClient = WebViewClient()
        arab_america_wv.settings.allowContentAccess = true
        arab_america_wv.settings.displayZoomControls = true
        arab_america_wv.settings.javaScriptEnabled = true
        arab_america_wv.settings.useWideViewPort = true
        arab_america_wv.settings.setSupportMultipleWindows(true)
        arab_america_wv.settings.setSupportZoom(true)
    }
}
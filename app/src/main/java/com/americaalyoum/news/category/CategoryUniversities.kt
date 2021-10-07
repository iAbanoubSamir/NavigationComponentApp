package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_universities.*

class CategoryUniversities : Fragment(R.layout.category_universities) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%AC%D8%A7%D9%85%D8%B9%D8%A7%D8%AA%20%D8%A7%D9%85%D8%B1%D9%8A%D9%83%D9%8A%D8%A9?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        universities_wv.loadUrl(CATEGORY_URL)
        universities_wv.webViewClient = WebViewClient()
        universities_wv.settings.allowContentAccess = true
        universities_wv.settings.displayZoomControls = true
        universities_wv.settings.javaScriptEnabled = true
        universities_wv.settings.useWideViewPort = true
        universities_wv.settings.setSupportMultipleWindows(true)
        universities_wv.settings.setSupportZoom(true)
    }
}
package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_health.*

class CategoryHealth : Fragment(R.layout.category_health) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%B5%D8%AD%D8%A9?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        health_wv.loadUrl(CATEGORY_URL)
        health_wv.webViewClient = WebViewClient()
        health_wv.settings.allowContentAccess = true
        health_wv.settings.displayZoomControls = true
        health_wv.settings.javaScriptEnabled = true
        health_wv.settings.useWideViewPort = true
        health_wv.settings.setSupportMultipleWindows(true)
        health_wv.settings.setSupportZoom(true)
    }
}
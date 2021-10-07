package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_inamerica.*

class CategoryInAmerica : Fragment(R.layout.category_inamerica) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D9%81%D9%8A%20%D8%A7%D9%85%D8%B1%D9%8A%D9%83%D8%A7?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        inamerica_wv.loadUrl(CATEGORY_URL)
        inamerica_wv.webViewClient = WebViewClient()
        inamerica_wv.settings.allowContentAccess = true
        inamerica_wv.settings.displayZoomControls = true
        inamerica_wv.settings.javaScriptEnabled = true
        inamerica_wv.settings.useWideViewPort = true
        inamerica_wv.settings.setSupportMultipleWindows(true)
        inamerica_wv.settings.setSupportZoom(true)
    }
}
package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_egypt.*

class CategoryEgypt : Fragment(R.layout.category_egypt) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D8%AE%D8%A8%D8%A7%D8%B1%20%D9%85%D8%B5%D8%B1?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        egypt_wv.loadUrl(CATEGORY_URL)
        egypt_wv.webViewClient = WebViewClient()
        egypt_wv.settings.allowContentAccess = true
        egypt_wv.settings.displayZoomControls = true
        egypt_wv.settings.javaScriptEnabled = true
        egypt_wv.settings.useWideViewPort = true
        egypt_wv.settings.setSupportMultipleWindows(true)
        egypt_wv.settings.setSupportZoom(true)
    }
}
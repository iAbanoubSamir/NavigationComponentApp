package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_immigration.*

class CategoryImmigration : Fragment(R.layout.category_immigration) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D9%84%D9%87%D8%AC%D8%B1%D8%A9?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        immigration_wv.loadUrl(CATEGORY_URL)
        immigration_wv.webViewClient = WebViewClient()
        immigration_wv.settings.allowContentAccess = true
        immigration_wv.settings.displayZoomControls = true
        immigration_wv.settings.javaScriptEnabled = true
        immigration_wv.settings.useWideViewPort = true
        immigration_wv.settings.setSupportMultipleWindows(true)
        immigration_wv.settings.setSupportZoom(true)
    }
}
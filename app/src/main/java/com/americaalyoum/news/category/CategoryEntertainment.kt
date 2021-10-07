package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_entertainment.*

class CategoryEntertainment : Fragment(R.layout.category_entertainment) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%AA%D8%B1%D9%81%D9%8A%D9%87?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        entertainment_wv.loadUrl(CATEGORY_URL)
        entertainment_wv.webViewClient = WebViewClient()
        entertainment_wv.settings.allowContentAccess = true
        entertainment_wv.settings.displayZoomControls = true
        entertainment_wv.settings.javaScriptEnabled = true
        entertainment_wv.settings.useWideViewPort = true
        entertainment_wv.settings.setSupportMultipleWindows(true)
        entertainment_wv.settings.setSupportZoom(true)
    }
}
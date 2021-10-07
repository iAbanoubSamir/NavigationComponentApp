package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_technology.*

class CategoryTechnology : Fragment(R.layout.category_technology) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%AA%D9%83%D9%86%D9%88%D9%84%D9%88%D8%AC%D9%8A%D8%A7?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        technology_wv.loadUrl(CATEGORY_URL)
        technology_wv.webViewClient = WebViewClient()
        technology_wv.settings.allowContentAccess = true
        technology_wv.settings.displayZoomControls = true
        technology_wv.settings.javaScriptEnabled = true
        technology_wv.settings.useWideViewPort = true
        technology_wv.settings.setSupportMultipleWindows(true)
        technology_wv.settings.setSupportZoom(true)
    }
}
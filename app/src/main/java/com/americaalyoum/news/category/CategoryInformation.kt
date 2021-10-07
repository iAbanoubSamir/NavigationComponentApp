package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_information.*

class CategoryInformation : Fragment(R.layout.category_information) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D9%85%D8%B9%D9%84%D9%88%D9%85%D8%A7%D8%AA?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        information_wv.loadUrl(CATEGORY_URL)
        information_wv.webViewClient = WebViewClient()
        information_wv.settings.allowContentAccess = true
        information_wv.settings.displayZoomControls = true
        information_wv.settings.javaScriptEnabled = true
        information_wv.settings.useWideViewPort = true
        information_wv.settings.setSupportMultipleWindows(true)
        information_wv.settings.setSupportZoom(true)
    }
}
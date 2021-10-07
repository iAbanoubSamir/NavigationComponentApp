package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_finance.*

class CategoryFinance : Fragment(R.layout.category_finance) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D9%82%D8%AA%D8%B5%D8%A7%D8%AF?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        finance_wv.loadUrl(CATEGORY_URL)
        finance_wv.webViewClient = WebViewClient()
        finance_wv.settings.allowContentAccess = true
        finance_wv.settings.displayZoomControls = true
        finance_wv.settings.javaScriptEnabled = true
        finance_wv.settings.useWideViewPort = true
        finance_wv.settings.setSupportMultipleWindows(true)
        finance_wv.settings.setSupportZoom(true)
    }
}
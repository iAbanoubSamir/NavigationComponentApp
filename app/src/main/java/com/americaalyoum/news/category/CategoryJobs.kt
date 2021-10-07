package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_jobs.*

class CategoryJobs : Fragment(R.layout.category_jobs) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D9%88%D8%B8%D8%A7%D8%A6%D9%81%20%D8%AE%D8%A7%D9%84%D9%8A%D8%A9?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        jobs_wv.loadUrl(CATEGORY_URL)
        jobs_wv.webViewClient = WebViewClient()
        jobs_wv.settings.allowContentAccess = true
        jobs_wv.settings.displayZoomControls = true
        jobs_wv.settings.javaScriptEnabled = true
        jobs_wv.settings.useWideViewPort = true
        jobs_wv.settings.setSupportMultipleWindows(true)
        jobs_wv.settings.setSupportZoom(true)
    }
}
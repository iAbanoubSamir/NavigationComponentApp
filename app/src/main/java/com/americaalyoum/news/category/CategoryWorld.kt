package com.americaalyoum.news.category

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.americaalyoum.news.R
import kotlinx.android.synthetic.main.category_world.*

class CategoryWorld : Fragment(R.layout.category_world) {
    val CATEGORY_URL = "https://www.americaalyoum.com/search/label/%D8%A7%D8%AE%D8%A8%D8%A7%D8%B1%20%D8%A7%D9%84%D8%B9%D8%A7%D9%84%D9%85?m=1"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        world_wv.loadUrl(CATEGORY_URL)
        world_wv.webViewClient = WebViewClient()
        world_wv.settings.allowContentAccess = true
        world_wv.settings.displayZoomControls = true
        world_wv.settings.javaScriptEnabled = true
        world_wv.settings.useWideViewPort = true
        world_wv.settings.setSupportMultipleWindows(true)
        world_wv.settings.setSupportZoom(true)
    }
}
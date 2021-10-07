package com.americaalyoum.news

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_store.*

class StoreFragment: Fragment(R.layout.fragment_store) {

    private val SITE_URL = "https://store.americaalyoum.com"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        store_webview.loadUrl(SITE_URL)
        store_webview.webViewClient = WebViewClient()
        store_webview.settings.allowContentAccess = true
        store_webview.settings.displayZoomControls = true
        store_webview.settings.javaScriptEnabled = true
        store_webview.settings.useWideViewPort = true
        store_webview.settings.setSupportMultipleWindows(true)
        store_webview.settings.setSupportZoom(true)
    }

    fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Check if the key event was the Back button and if there's history
        if (keyCode == KeyEvent.KEYCODE_BACK && store_webview.canGoBack()) {
            store_webview.goBack()
            return true
        }
        return onKeyDown(keyCode, event)
    }
}
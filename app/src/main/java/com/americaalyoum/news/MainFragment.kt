package com.americaalyoum.news

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    private val URL = "https://www.americaalyoum.com"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        main_webview.loadUrl(URL)
        main_webview.webViewClient = WebViewClient()
        main_webview.settings.allowContentAccess = true
        main_webview.settings.displayZoomControls = true
        main_webview.settings.javaScriptEnabled = true
        main_webview.settings.setSupportMultipleWindows(true)
        main_webview.settings.useWideViewPort = true
        main_webview.settings.setSupportZoom(true)

    }

    /* override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Check if the key event was the Back button and if there's history
        if (keyCode == KeyEvent.KEYCODE_BACK && main_webview.canGoBack()) {
            main_webview.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
     */


}
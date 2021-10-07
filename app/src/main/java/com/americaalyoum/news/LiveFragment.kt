package com.americaalyoum.news

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_live.*

class LiveFragment : Fragment(R.layout.fragment_live) {
    val LIVE_URL = "https://player.aflamzaman.com/2021/01/americaalyoum-livestream.html?m=1"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        live_webview.loadUrl(LIVE_URL)
        live_webview.webViewClient = WebViewClient()
        live_webview.settings.allowContentAccess = true
        live_webview.settings.displayZoomControls = true
        live_webview.settings.javaScriptEnabled = true
        live_webview.settings.useWideViewPort = true
        live_webview.settings.setSupportMultipleWindows(true)
        live_webview.settings.setSupportZoom(true)
    }

    fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Check if the key event was the Back button and if there's history
        if (keyCode == KeyEvent.KEYCODE_BACK && live_webview.canGoBack()) {
            live_webview.goBack()
            return true
        }
        return onKeyDown(keyCode, event)
    }
}

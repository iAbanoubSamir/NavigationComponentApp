package com.americaalyoum.news

import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment : Fragment(R.layout.fragment_about) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cairo: Typeface = Typeface.createFromAsset(requireContext().assets, "cairo.ttf")
        about_info_tv.typeface = cairo


        ic_facebook.setOnClickListener {
            val facebook = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/americaalyoum"))
            startActivity(facebook)
        }

        ic_instagram.setOnClickListener {
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/americaalyoumtv"))
            startActivity(instagram)
        }

        ic_twitter.setOnClickListener {
            val twitter = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/americaalyoumtv"))
            startActivity(twitter)
        }

        ic_youtube.setOnClickListener {
            val youtube = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCBB9V3amwMDddKF7KhA-6Iw"))
            startActivity(youtube)
        }
    }
}

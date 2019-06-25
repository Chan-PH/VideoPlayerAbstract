package com.chanph.videoplayer.ui.activity

// android
import android.net.Uri
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.Toast
import android.widget.VideoView

// androidx
import androidx.appcompat.app.AppCompatActivity

// chanph
import com.chanph.videoplayer.R

/* Creator  : Chan Poh Hong
 * Date     : 23 June 2019
 * Version  : 1.0.0
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        val width = displayMetrics.widthPixels

        val playVideo:VideoView = findViewById(R.id.vidContainer)
        configureVideoOnClick(playVideo);
    }

    fun configureVideoOnClick(videoView: VideoView): Unit {
        //val videoURI:Uri = Uri.parse("https://www.youtube.com/watch?v=1rZYPx-wfo8.mp4")
        val videoURI:Uri = Uri.parse("https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4")
        videoView.setVideoURI(videoURI)
        videoView.start()
        videoView.setOnClickListener({
            Toast.makeText(this@MainActivity, "Video tapped!", Toast.LENGTH_SHORT).show()
        })
    }
}

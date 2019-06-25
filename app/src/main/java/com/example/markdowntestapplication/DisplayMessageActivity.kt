package com.example.markdowntestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import studio.untold.MarkdownTextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val view = findViewById<MarkdownTextView>(R.id.markdowntextview)
        view.setMarkdownText(message)
//        view.setMarkdownTextAsy

//        val textView = findViewById<TextView>(R.id.textView).apply {
//            text = message
//        }
    }
}

package mx.edu.utng.apppass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_tips_web_view.*

class TipsWebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_web_view)

        //WEBVIEW
        webView.loadUrl("https://www.vix.com/es/imj/gourmet/7832/6-tips-para-hacer-las-compras")
    }
}

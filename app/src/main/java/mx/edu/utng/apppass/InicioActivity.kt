package mx.edu.utng.apppass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*

class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        btnVJ.setOnClickListener{
            val intent: Intent = Intent(this, VideoGamesActivity::class.java)
            startActivity(intent)
        }

        btnTips.setOnClickListener{
            val intent:Intent = Intent(this, TipsWebViewActivity::class.java)
            startActivity(intent)
        }

        btnAcerca.setOnClickListener{
            val intent:Intent = Intent(this, AcercaActivity::class.java)
            startActivity(intent)
        }
    }
}

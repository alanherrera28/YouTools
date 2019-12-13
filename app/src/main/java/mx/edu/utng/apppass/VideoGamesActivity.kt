package mx.edu.utng.apppass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_video_games.*

class VideoGamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_games)

        btnCal.setOnClickListener{
            val intent: Intent = Intent(this, Propinas::class.java)
            startActivity(intent)
        }

        btnClim.setOnClickListener {
            val intent: Intent = Intent(this, ClimaWeb::class.java)
            startActivity(intent)
        }
    }
}

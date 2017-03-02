package blacroix.lottie

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stopCta.setOnClickListener {
            animation.cancelAnimation()
        }

        playCta.setOnClickListener {
            animation.loop(false)
            animation.playAnimation()
        }

        loopCta.setOnClickListener {
            animation.loop(true)
            animation.playAnimation()
        }

        listCta.setOnClickListener {
            startActivity(Intent(MainActivity@ this, ListActivity::class.java))
        }
    }
}

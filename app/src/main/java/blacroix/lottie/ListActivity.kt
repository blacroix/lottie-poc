package blacroix.lottie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        recycler.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        recycler.layoutManager = layoutManager
        recycler.adapter = AnimationAdapter(LayoutInflater.from(this), generateData())
    }

    private fun generateData(): MutableCollection<AnimationItem> {
        var x: Int = 0
        val list: MutableCollection<AnimationItem> = mutableListOf()
        while (x < 10000) {
            list.add(AnimationItem(x))
            x++
        }
        return list
    }
}


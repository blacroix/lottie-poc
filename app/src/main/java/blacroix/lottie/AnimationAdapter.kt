package blacroix.lottie

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AnimationAdapter(val layoutInflater: LayoutInflater, val animations: MutableCollection<AnimationItem>) : RecyclerView.Adapter<AnimationAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.itemView as AnimationView).bind(animations.elementAt(position))
    }

    override fun getItemCount(): Int {
        return animations.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(layoutInflater.inflate(R.layout.view_animation, parent, false))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}
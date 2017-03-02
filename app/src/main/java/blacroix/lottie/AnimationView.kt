package blacroix.lottie

import android.content.Context
import android.support.v7.widget.CardView
import android.util.AttributeSet
import kotlinx.android.synthetic.main.view_animation.view.*

class AnimationView : CardView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun bind(item: AnimationItem) {
        animation_view.setAnimation("twitter-heart.json")
        animation_view.loop(true)
    }

}